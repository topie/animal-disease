package com.topie.security.security;

import com.topie.common.tools.cache.IBasicCache;
import com.topie.security.constant.SecurityConstant;
import com.topie.security.service.UserService;
import com.topie.security.vo.FunctionVO;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.security.core.userdetails.UserCache;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.util.Assert;

import java.util.List;

/**
 * Created by cgj on 2016/4/13.
 */
public class OrangeSideUserCache implements UserCache, InitializingBean {

    private IBasicCache<String, Object> cache = null;

    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void setCache(IBasicCache<String, Object> cache) {
        this.cache = cache;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        if (this.cache == null) this.cache = new OrangeSideNullCache<String, Object>();
        Assert.notNull(this.cache);
    }

    @Override
    public UserDetails getUserFromCache(String username) {
        UserDetails userDetails = null;
        try {
            userDetails = (UserDetails) cache.get(SecurityConstant.USER_CACHE_PREFIX + username);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return userDetails == null ? null : userDetails;
        }

    }

    @Override
    public void putUserInCache(UserDetails user) {
        cache.set(SecurityConstant.USER_CACHE_PREFIX + user.getUsername(), user);
        List<FunctionVO> functionList = userService.findUserFunctionByLoginName(user.getUsername());
        cache.set(SecurityConstant.FUNCTION_CACHE_PREFIX + user.getUsername(), functionList);
    }

    @Override
    public void removeUserFromCache(String username) {
        cache.del(SecurityConstant.USER_CACHE_PREFIX + username);
        cache.del(SecurityConstant.FUNCTION_CACHE_PREFIX + username);
    }

    public void removeUserFromCacheByUserId(Integer userId) {
        String loginName = userService.findLoginNameByUserId(userId);
        if (loginName != null) {
            removeUserFromCache(loginName);
        }
    }
}
