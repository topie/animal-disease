package com.topie.animal.dto;

import com.topie.database.core.animal.model.UserInfo;

import java.util.List;

/**
 * Created by chenguojun on 2017/2/22.
 */
public class UserInfoConfig {

    private Integer platformId;

    private String loginName;

    private String password;

    private List<Integer> roles;

    public UserInfoConfig() {
    }

    public UserInfoConfig(UserInfo userInfo) {
        this.platformId = userInfo.getPlatformId();
        this.loginName = userInfo.getLoginName();
        this.password = userInfo.getPassword();
    }

    public Integer getPlatformId() {
        return platformId;
    }

    public void setPlatformId(Integer platformId) {
        this.platformId = platformId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Integer> getRoles() {
        return roles;
    }

    public void setRoles(List<Integer> roles) {
        this.roles = roles;
    }
}
