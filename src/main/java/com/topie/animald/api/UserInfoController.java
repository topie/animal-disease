package com.topie.animald.api;

import com.github.pagehelper.PageInfo;
import com.topie.animald.service.IUserInfoService;
import com.topie.common.utils.PageConvertUtil;
import com.topie.common.utils.ResponseUtil;
import com.topie.common.utils.Result;
import com.topie.database.core.system.model.User;
import com.topie.database.core.animald.model.UserInfo;
import com.topie.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by chenguojun on 2017/2/16.
 */
@Controller
@RequestMapping("/api/animalDisease/userInfo")
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
    public Result insert(UserInfo userInfo, @RequestParam("loginName") String loginName,
            @RequestParam("password") String password) {
        User user = new User();
        user.setLoginName(loginName);
        user.setPassword(password);
        user.setDisplayName(userInfo.getRealName());
        user.setAccountNonExpired(true);
        user.setAccountNonLocked(true);
        user.setCredentialsNonExpired(true);
        user.setEnabled(true);
        user.setPassword(password);
        userService.insertUser(user);
        userInfo.setUserId(user.getId());
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
    public Result load(@PathVariable(value = "id") Integer id) {
        UserInfo userInfo = iUserInfoService.selectByKey(id);
        return ResponseUtil.success(userInfo);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public Result delete(@RequestParam(value = "id") Integer id) {
        iUserInfoService.delete(id);
        return ResponseUtil.success();
    }
}
