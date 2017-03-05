package com.topie.database.core.system.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Table(name = "d_log")
public class Log {

    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 登录名
     */
    @Column(name = "login_name")
    private String loginName;

    /**
     * 日志信息
     */
    @Column(name = "log_info")
    private String logInfo;

    /**
     * 日志时间
     */
    @Column(name = "log_time")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date logTime;

    /**
     * 获取id
     *
     * @return id - id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户
     *
     * @return user_name - 用户
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户
     *
     * @param userName 用户
     */
    public void setUserName(String userName) {
        this.userName = userName;
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
     * 获取日志信息
     *
     * @return log_info - 日志信息
     */
    public String getLogInfo() {
        return logInfo;
    }

    /**
     * 设置日志信息
     *
     * @param logInfo 日志信息
     */
    public void setLogInfo(String logInfo) {
        this.logInfo = logInfo;
    }

    /**
     * 获取日志时间
     *
     * @return log_time - 日志时间
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="Asia/Shanghai")
    public Date getLogTime() {
        return logTime;
    }

    /**
     * 设置日志时间
     *
     * @param logTime 日志时间
     */
    public void setLogTime(Date logTime) {
        this.logTime = logTime;
    }
}
