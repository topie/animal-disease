package com.topie.system.api;

import com.topie.common.utils.ResponseUtil;
import com.topie.common.utils.Result;
import com.topie.security.constant.SecurityConstant;
import com.topie.security.exception.AuBzConstant;
import com.topie.security.exception.AuthBusinessException;
import com.topie.security.security.OrangeSideUserCache;
import com.topie.security.service.FunctionService;
import com.topie.security.service.UserService;
import com.topie.security.utils.SecurityUtil;
import com.topie.security.vo.FunctionVO;
import com.topie.common.tools.cache.RedisCache;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by chenguojun on 8/23/16.
 */
@Controller
@RequestMapping("/api")
public class IndexController {

    @Autowired
    UserService userService;

    @Autowired
    FunctionService functionService;

    @Autowired
    RedisCache redisCache;

    @Autowired
    OrangeSideUserCache orangeSideUserCache;

    @RequestMapping(value = "/index/current", method = RequestMethod.GET)
    @ResponseBody
    public Result myFunction() {
        String currentLoginName = SecurityUtil.getCurrentUserName();
        if (StringUtils.isEmpty(currentLoginName)) {
            throw new AuthBusinessException(AuBzConstant.IS_NOT_LOGIN);
        }
        List<FunctionVO> function = (List<FunctionVO>) redisCache
                .get(SecurityConstant.FUNCTION_CACHE_PREFIX + currentLoginName);
        if (function == null) {
            function = userService.findUserFunctionByLoginName(currentLoginName);
            redisCache.set(SecurityConstant.FUNCTION_CACHE_PREFIX + currentLoginName, function);
        }
        return ResponseUtil.success(function);
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    @ResponseBody
    public Result authenticationRequest() {
        Integer userId = SecurityUtil.getCurrentUserId();
        orangeSideUserCache.removeUserFromCacheByUserId(userId);
        return ResponseUtil.success();
    }
}
