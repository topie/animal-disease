package com.topie.animal.api;

import com.github.pagehelper.PageInfo;
import com.topie.animal.service.IUserInfoService;
import com.topie.common.utils.PageConvertUtil;
import com.topie.common.utils.ResponseUtil;
import com.topie.common.utils.Result;
import com.topie.common.utils.UUIDUtil;
import com.topie.database.core.animal.model.UserInfo;
import com.topie.database.core.system.model.User;
import com.topie.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by chenguojun on 2017/2/21.
 */
@Controller
@RequestMapping("/api/animal/userInfo")
public class UserInfoController {

    @Autowired
    private IUserInfoService iUserInfoService;

    @Autowired
    private UserService userService;

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

    @RequestMapping(value = "/bind/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result bind(@PathVariable(value = "id") String id) {
        UserInfo userInfo = iUserInfoService.selectByKey(id);
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
        return ResponseUtil.success();
    }
}
