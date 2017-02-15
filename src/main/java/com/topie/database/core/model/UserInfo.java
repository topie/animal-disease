package com.topie.database.core.model;

import javax.persistence.*;

@Table(name = "d_user_info")
public class UserInfo {
    /**
     * 用户ID
     */
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    /**
     * 性别 1：男 2：女
     */
    private Byte gender;

    /**
     * 真是姓名
     */
    @Column(name = "real_name")
    private String realName;

    /**
     * 职称
     */
    @Column(name = "job_title")
    private String jobTitle;

    /**
     * 主管领导
     */
    private String leader;

    /**
     * 获取用户ID
     *
     * @return user_id - 用户ID
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户ID
     *
     * @param userId 用户ID
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取性别 1：男 2：女
     *
     * @return gender - 性别 1：男 2：女
     */
    public Byte getGender() {
        return gender;
    }

    /**
     * 设置性别 1：男 2：女
     *
     * @param gender 性别 1：男 2：女
     */
    public void setGender(Byte gender) {
        this.gender = gender;
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
     * 获取主管领导
     *
     * @return leader - 主管领导
     */
    public String getLeader() {
        return leader;
    }

    /**
     * 设置主管领导
     *
     * @param leader 主管领导
     */
    public void setLeader(String leader) {
        this.leader = leader;
    }
}