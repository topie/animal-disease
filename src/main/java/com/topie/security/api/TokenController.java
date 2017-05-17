package com.topie.security.api;

import com.topie.animal.service.IUserInfoService;
import com.topie.common.tools.cache.RedisCache;
import com.topie.common.utils.HttpResponseUtil;
import com.topie.database.core.animal.model.UserInfo;
import com.topie.database.core.system.model.User;
import com.topie.security.constant.SecurityConstant;
import com.topie.security.security.AdminAuthenticationManager;
import com.topie.security.security.OrangeAuthenticationRequest;
import com.topie.security.security.OrangeHttpAuthenticationDetails;
import com.topie.security.service.UserService;
import com.topie.security.utils.TokenUtils;
import com.topie.system.service.ILogService;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.InternalAuthenticationServiceException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/token")
public class TokenController {

    private final Logger logger = Logger.getLogger(this.getClass());

    @Value("${security.token.header}")
    private String tokenHeader;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private AdminAuthenticationManager adminAuthenticationManager;

    @Autowired
    private TokenUtils tokenUtils;

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private UserService userService;

    @Autowired
    private IUserInfoService iUserInfoService;

    @Autowired
    private RedisCache redisCache;

    @Autowired
    private ILogService iLogService;

    @RequestMapping(value = "/generate", method = RequestMethod.POST)
    public ResponseEntity<?> authenticationRequest(@RequestBody OrangeAuthenticationRequest authenticationRequest)
            throws AuthenticationException {
        if (StringUtils.isEmpty(authenticationRequest.getVcode()) || StringUtils
                .isEmpty(authenticationRequest.getVkey())) {
            return ResponseEntity.ok(HttpResponseUtil.error("请输入验证码"));
        }
        if (StringUtils.isNotEmpty((String) redisCache.get("animal_vkey_" + authenticationRequest.getVkey()))) {
            if (!((String) redisCache.get("animal_vkey_" + authenticationRequest.getVkey()))
                    .equals(authenticationRequest.getVcode())) {
                return ResponseEntity.ok(HttpResponseUtil.error("验证码不正确"));
            }
        } else {
            return ResponseEntity.ok(HttpResponseUtil.error("验证码不存在或已过期"));
        }
        redisCache.del("animal_vkey_" + authenticationRequest.getVkey());
        UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(
                authenticationRequest.getUsername(), authenticationRequest.getPassword());
        usernamePasswordAuthenticationToken.setDetails(new OrangeHttpAuthenticationDetails());

        Authentication authentication = null;
        try {
            authentication = this.authenticationManager.authenticate(usernamePasswordAuthenticationToken);
            if (authentication == null) {
                return ResponseEntity.ok(HttpResponseUtil.error("未检测到验证信息"));
            }
        } catch (InternalAuthenticationServiceException failed) {
            logger.error("An internal error occurred while trying to authenticate the user.", failed);
            return ResponseEntity.ok(HttpResponseUtil.error(failed.getMessage()));
        } catch (AuthenticationException failed) {
            return ResponseEntity.ok(HttpResponseUtil.error(failed.getMessage()));
        }

        SecurityContextHolder.getContext().setAuthentication(authentication);
        UserDetails userDetails = (UserDetails) redisCache
                .get(SecurityConstant.USER_CACHE_PREFIX + authenticationRequest.getUsername());
        if (userDetails == null) {
            userDetails = this.userDetailsService.loadUserByUsername(authenticationRequest.getUsername());
            redisCache.set(SecurityConstant.USER_CACHE_PREFIX + authenticationRequest.getUsername(), userDetails);
        }
        String token = this.tokenUtils.generateToken(userDetails);
        iLogService.insertLog("登录系统。");
        return ResponseEntity.ok(HttpResponseUtil.success(token));
    }

    @RequestMapping(value = "/oss", method = RequestMethod.POST)
    public ResponseEntity<?> oss(@RequestParam("ticket") String ticket) throws AuthenticationException {
        if (StringUtils.isEmpty(ticket)) {
            return ResponseEntity.ok(HttpResponseUtil.error("AUTH_TICKET未提供"));
        }
        UserInfo userInfo = iUserInfoService.selectByKey(ticket);
        if (userInfo == null) return ResponseEntity.ok(HttpResponseUtil.error("用户不存在"));
        User user = userService.selectByKey(userInfo.getPlatformId());
        if (user == null) return ResponseEntity.ok(HttpResponseUtil.error("用户不存在"));

        Authentication authentication = null;
        try {
            authentication = this.adminAuthenticationManager.authenticate(user.getLoginName());
            if (authentication == null) {
                return ResponseEntity.ok(HttpResponseUtil.error("未检测到验证信息"));
            }
        } catch (InternalAuthenticationServiceException failed) {
            logger.error("An internal error occurred while trying to authenticate the user.", failed);
            return ResponseEntity.ok(HttpResponseUtil.error(failed.getMessage()));
        } catch (AuthenticationException failed) {
            return ResponseEntity.ok(HttpResponseUtil.error(failed.getMessage()));
        }

        SecurityContextHolder.getContext().setAuthentication(authentication);
        UserDetails userDetails = (UserDetails) redisCache
                .get(SecurityConstant.USER_CACHE_PREFIX + user.getLoginName());
        if (userDetails == null) {
            userDetails = this.userDetailsService.loadUserByUsername(user.getLoginName());
            redisCache.set(SecurityConstant.USER_CACHE_PREFIX + user.getLoginName(), userDetails);
        }
        String token = this.tokenUtils.generateToken(userDetails);
        iLogService.insertLog("登录系统。");
        return ResponseEntity.ok(HttpResponseUtil.success(token));
    }

}
