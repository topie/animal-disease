package com.topie.system.api.sys;

import com.github.pagehelper.PageInfo;
import com.topie.animal.service.IUserInfoService;
import com.topie.common.tools.encrypt.SimpleCrypto;
import com.topie.common.utils.PageConvertUtil;
import com.topie.common.utils.ResponseUtil;
import com.topie.common.utils.Result;
import com.topie.database.core.animal.model.UserInfo;
import com.topie.database.core.system.model.User;
import com.topie.security.exception.AuBzConstant;
import com.topie.security.exception.AuthBusinessException;
import com.topie.security.service.UserService;
import com.topie.security.utils.SecurityUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by cgj on 2016/4/9.
 */
@Controller
@RequestMapping("/api/sys/user")
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @Autowired
    private IUserInfoService iUserInfoService;

    @RequestMapping(value = "/pageList", method = RequestMethod.GET)
    @ResponseBody
    public Result users(User user, @RequestParam(value = "pageNum", required = false, defaultValue = "1") int pageNum,
            @RequestParam(value = "pageSize", required = false, defaultValue = "15") int pageSize) {
        PageInfo<User> pageInfo = userService.findUserList(pageNum, pageSize, user);
        return ResponseUtil.success(PageConvertUtil.grid(pageInfo));
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ResponseBody
    public Result insertUser(@Valid User user, BindingResult result) {
        if (result.hasErrors()) {
            logger.debug(result.toString());
            return ResponseUtil.error(result);
        }
        if (userService.findExistUser(user) > 0) {
            throw new AuthBusinessException(AuBzConstant.LOGIN_NAME_EXIST);
        }
        userService.insertUser(user);
        return ResponseUtil.success();
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public Result updateUser(User user) {
        if (userService.findExistUser(user) > 0) {
            throw new AuthBusinessException(AuBzConstant.LOGIN_NAME_EXIST);
        }
        userService.updateUser(user);
        return ResponseUtil.success();
    }

    @RequestMapping(value = "/load/{userId}", method = RequestMethod.GET)
    @ResponseBody
    public Result loadUser(@PathVariable(value = "userId") int userId) {
        User user = userService.findUserById(userId);
        List roles = userService.findUserRoleByUserId(userId);
        if (roles != null) user.setRoles(roles);
        return ResponseUtil.success(user);
    }

    @RequestMapping(value = "/loadUser/{userId}", method = RequestMethod.GET)
    @ResponseBody
    public Result loadUser(@PathVariable(value = "userId") String userId) throws Exception {
        userId = SimpleCrypto.decrypt("zcpt@123456", userId);
        UserInfo u = iUserInfoService.selectByTokenCode(userId);
        if (u == null) return ResponseUtil.error("用户不存在");
        Integer platformUserId = u.getPlatformId();
        User user = userService.findUserById(platformUserId);
        if (user == null) {
            return ResponseUtil.error("用户未绑定");
        }
        List roles = userService.findUserRoleByUserId(platformUserId);
        if (roles != null) user.setRoles(roles);
        return ResponseUtil.success(user);
    }

    @RequestMapping(value = "/lock/{userId}", method = RequestMethod.GET)
    @ResponseBody
    public Result lock(@PathVariable(value = "userId") int userId) {
        if (SecurityUtil.getCurrentUserId() == userId) {
            throw new AuthBusinessException(AuBzConstant.CANNOT_CHANGE_CURRENT_USER);
        }
        int result = userService.updateLockStatusByUserId(userId, false);
        if (result > 0) {
            return ResponseUtil.success();
        } else {
            return ResponseUtil.error("操作未成功。");
        }
    }

    @RequestMapping(value = "/unLock/{userId}", method = RequestMethod.GET)
    @ResponseBody
    public Result unLock(@PathVariable(value = "userId") int userId) {
        if (SecurityUtil.getCurrentUserId() == userId) {
            throw new AuthBusinessException(AuBzConstant.CANNOT_CHANGE_CURRENT_USER);
        }
        int result = userService.updateLockStatusByUserId(userId, true);
        if (result > 0) {
            return ResponseUtil.success();
        } else {
            return ResponseUtil.error("操作未成功。");
        }
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public Result delUser(@RequestParam(value = "userId") int userId) {
        if (SecurityUtil.getCurrentUserId() == userId) {
            throw new AuthBusinessException(AuBzConstant.CANNOT_CHANGE_CURRENT_USER);
        }
        userService.deleteUser(userId);
        return ResponseUtil.success();
    }

    @RequestMapping(value = "/roles/{userId}", method = RequestMethod.GET)
    @ResponseBody
    public Result userRoles(@PathVariable(value = "userId") int userId) {
        List roles = userService.findUserRoleByUserId(userId);
        return ResponseUtil.success(roles);
    }

    @RequestMapping("/unique")
    @ResponseBody
    public Object unique(@RequestParam(value = "loginName", required = false) String loginName) {
        int count = userService.countByLoginName(loginName);
        return count > 0 ? false : true;
    }
}
