package com.topie.database.core.animal.model;

import javax.persistence.*;

@Table(name = "a_week_config")
public class WeekConfig {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 年份
     */
    private Integer year;

    /**
     * 类别 0：春防 1：秋防
     */
    private Integer type;

    /**
     * 日期字符
     */
    private String time;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取年份
     *
     * @return year - 年份
     */
    public Integer getYear() {
        return year;
    }

    /**
     * 设置年份
     *
     * @param year 年份
     */
    public void setYear(Integer year) {
        this.year = year;
    }

    /**
     * 获取类别 0：春防 1：秋防
     *
     * @return type - 类别 0：春防 1：秋防
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置类别 0：春防 1：秋防
     *
     * @param type 类别 0：春防 1：秋防
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取日期字符
     *
     * @return time - 日期字符
     */
    public String getTime() {
        return time;
    }

    /**
     * 设置日期字符
     *
     * @param time 日期字符
     */
    public void setTime(String time) {
        this.time = time;
    }
}