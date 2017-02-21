package com.topie.database.core.animal.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Table(name = "a_user_info")
public class UserInfo {

    /**
     * 用户ID
     */
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String userId;

    /**
     * 机构ID
     */
    @Column(name = "org_id")
    private String orgId;

    /**
     * 平台用户
     */
    @Column(name = "platform_id")
    private Integer platformId;

    /**
     * 登录名
     */
    @Column(name = "login_name")
    private String loginName;

    /**
     * 密码
     */
    @JsonIgnore
    private String password;

    /**
     * 性别
     */
    private String gender;

    /**
     * 电话
     */
    private String phone;

    /**
     * 传真
     */
    private String fax;

    /**
     * 手机
     */
    private String mobile;

    /**
     * 职称
     */
    @Column(name = "job_title")
    private String jobTitle;

    /**
     * 真是姓名
     */
    @Column(name = "real_name")
    private String realName;

    /**
     * 主管领导姓名
     */
    @Column(name = "leader_name")
    private String leaderName;

    /**
     * token
     */
    @Column(name = "token_code")
    private String tokenCode;

    /**
     * 获取用户ID
     *
     * @return user_id - 用户ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置用户ID
     *
     * @param userId 用户ID
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取机构ID
     *
     * @return org_id - 机构ID
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置机构ID
     *
     * @param orgId 机构ID
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    /**
     * 获取平台用户
     *
     * @return platform_id - 平台用户
     */
    public Integer getPlatformId() {
        return platformId;
    }

    /**
     * 设置平台用户
     *
     * @param platformId 平台用户
     */
    public void setPlatformId(Integer platformId) {
        this.platformId = platformId;
    }

    /**
     * 获取登录名
     *
     * @return login_name - 登录名
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * 设置登录名
     *
     * @param loginName 登录名
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取性别
     *
     * @return gender - 性别
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置性别
     *
     * @param gender 性别
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * 获取电话
     *
     * @return phone - 电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置电话
     *
     * @param phone 电话
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取传真
     *
     * @return fax - 传真
     */
    public String getFax() {
        return fax;
    }

    /**
     * 设置传真
     *
     * @param fax 传真
     */
    public void setFax(String fax) {
        this.fax = fax;
    }

    /**
     * 获取手机
     *
     * @return mobile - 手机
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置手机
     *
     * @param mobile 手机
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取职称
     *
     * @return job_title - 职称
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * 设置职称
     *
     * @param jobTitle 职称
     */
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    /**
     * 获取真是姓名
     *
     * @return real_name - 真是姓名
     */
    public String getRealName() {
        return realName;
    }

    /**
     * 设置真是姓名
     *
     * @param realName 真是姓名
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     * 获取主管领导姓名
     *
     * @return leader_name - 主管领导姓名
     */
    public String getLeaderName() {
        return leaderName;
    }

    /**
     * 设置主管领导姓名
     *
     * @param leaderName 主管领导姓名
     */
    public void setLeaderName(String leaderName) {
        this.leaderName = leaderName;
    }

    /**
     * 获取token
     *
     * @return token_code - token
     */
    public String getTokenCode() {
        return tokenCode;
    }

    /**
     * 设置token
     *
     * @param tokenCode token
     */
    public void setTokenCode(String tokenCode) {
        this.tokenCode = tokenCode;
    }
}
