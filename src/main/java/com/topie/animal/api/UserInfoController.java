package com.topie.animal.api;

import com.github.pagehelper.PageInfo;
import com.topie.animal.dto.UserInfoConfig;
import com.topie.animal.service.IUserInfoService;
import com.topie.common.utils.PageConvertUtil;
import com.topie.common.utils.ResponseUtil;
import com.topie.common.utils.Result;
import com.topie.common.utils.UUIDUtil;
import com.topie.database.core.animal.model.UserInfo;
import com.topie.database.core.system.model.User;
import com.topie.security.security.OrangeSideUserCache;
import com.topie.security.service.UserService;
import com.topie.security.utils.SecurityUtil;
import com.topie.system.service.ILogService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by chenguojun on 2017/2/21.
 */
@Controller
@RequestMapping("/api/animal/userInfo")
public class UserInfoController {

    @Autowired
    OrangeSideUserCache orangeSideUserCache;

    @Autowired
    private IUserInfoService iUserInfoService;

    @Autowired
    private UserService userService;

    @Autowired
    private ILogService iLogService;

    @RequestMapping(value = "/pageList", method = RequestMethod.GET)
    @ResponseBody
    public Result pageList(UserInfo userInfo,
            @RequestParam(value = "pageNum", required = false, defaultValue = "1") int pageNum,
            @RequestParam(value = "pageSize", required = false, defaultValue = "15") int pageSize) {
        PageInfo<UserInfo> pageInfo = iUserInfoService.selectByPage(userInfo, pageNum, pageSize);
        return ResponseUtil.success(PageConvertUtil.grid(pageInfo));
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ResponseBody
    public Result insert(UserInfo userInfo) {
        User user = new User();
        user.setLoginName(userInfo.getLoginName());
        user.setPassword(userInfo.getPassword());
        user.setDisplayName(userInfo.getRealName());
        user.setContactPhone(userInfo.getMobile());
        user.setAccountNonExpired(true);
        user.setAccountNonLocked(true);
        user.setCredentialsNonExpired(true);
        user.setEnabled(true);
        userService.insertUser(user);
        userInfo.setUserId(UUIDUtil.getUUID());
        userInfo.setPlatformId(user.getId());
        int result = iUserInfoService.saveNotNull(userInfo);
        return result > 0 ? ResponseUtil.success() : ResponseUtil.error();
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public Result update(UserInfo userInfo) {
        iUserInfoService.updateNotNull(userInfo);
        return ResponseUtil.success();
    }

    @RequestMapping(value = "/load/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result load(@PathVariable(value = "id") String id) {
        UserInfo userInfo = iUserInfoService.selectByKey(id);
        return ResponseUtil.success(userInfo);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public Result delete(@RequestParam(value = "id") String id) {
        iUserInfoService.delete(id);
        return ResponseUtil.success();
    }

    @RequestMapping(value = "/bindAllUser", method = RequestMethod.GET)
    @ResponseBody
    public Result bindAllUser() {
        List<UserInfo> list = iUserInfoService.selectAll();
        for (UserInfo userInfo : list) {
            iUserInfoService.insertOrUpdatePlatformUser(userInfo);
            orangeSideUserCache.removeUserFromCacheByUserId(userInfo.getPlatformId());
        }
        return ResponseUtil.success();
    }

    @RequestMapping(value = "/bind/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result bind(@PathVariable(value = "id") String id) {
        UserInfo userInfo = iUserInfoService.selectByKey(id);
        iUserInfoService.insertOrUpdatePlatformUser(userInfo);
        orangeSideUserCache.removeUserFromCacheByUserId(userInfo.getPlatformId());
        return ResponseUtil.success();
    }

    @RequestMapping(value = "/loadConfig/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result loadConfig(@PathVariable(value = "id") String id) {
        UserInfo userInfo = iUserInfoService.selectByKey(id);
        if (userInfo.getPlatformId() == null || userInfo.getPlatformId() == 0) {
            User user = new User();
            user.setLoginName(userInfo.getLoginName());
            user.setPassword(userInfo.getPassword());
            user.setDisplayName(userInfo.getRealName());
            user.setContactPhone(userInfo.getMobile());
            user.setAccountNonExpired(true);
            user.setAccountNonLocked(true);
            user.setCredentialsNonExpired(true);
            user.setEnabled(true);
            userService.insertUser(user);
            userInfo.setPlatformId(user.getId());
            iUserInfoService.updateNotNull(userInfo);
        }
        UserInfoConfig userInfoConfig = new UserInfoConfig(userInfo);
        List roles = userService.findUserRoleByUserId(userInfo.getPlatformId());
        if (roles != null) userInfoConfig.setRoles(roles);
        return ResponseUtil.success(userInfoConfig);
    }

    @RequestMapping(value = "/updateConfig", method = RequestMethod.POST)
    @ResponseBody
    public Result update(UserInfoConfig userInfoConfig) {
        iUserInfoService.updateByConfig(userInfoConfig);
        return ResponseUtil.success();
    }

    @RequestMapping(value = "/loadCurrent", method = RequestMethod.GET)
    @ResponseBody
    public Result load() {
        Integer platformId = SecurityUtil.getCurrentUserId();
        if (platformId == null) {
            return ResponseUtil.error("未登录");
        }
        UserInfo userInfo = iUserInfoService.selectByPlatformId(platformId);
        if (userInfo == null) {
            return ResponseUtil.error("未绑定防控用户");
        }
        return ResponseUtil.success(userInfo);
    }

    @RequestMapping(value = "/updateCurrent", method = RequestMethod.POST)
    @ResponseBody
    public Result updateCurrent(UserInfo userInfo) {
        iUserInfoService.updateNotNull(userInfo);
        if (StringUtils.isNotEmpty(userInfo.getPassword()))
            userService.updatePassword(userInfo.getPlatformId(), userInfo.getPassword());
        iLogService.insertLog("更新资料。");
        return ResponseUtil.success();
    }
}
