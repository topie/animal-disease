package com.topie.database.core.animald.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import javax.persistence.*;

@Table(name = "d_report_re_fill")
public class ReFill {
    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 规则ID
     */
    @Column(name = "fill_id")
    private Integer fillId;

    /**
     * 填报标题
     */
    @Column(name = "display_title")
    private String displayTitle;

    @Column(name = "start_time")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date startTime;

    @Column(name = "end_time")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date endTime;

    /**
     * 机构ID
     */
    @Column(name = "org_id")
    private Integer orgId;

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
     * 获取规则ID
     *
     * @return fill_id - 规则ID
     */
    public Integer getFillId() {
        return fillId;
    }

    /**
     * 设置规则ID
     *
     * @param fillId 规则ID
     */
    public void setFillId(Integer fillId) {
        this.fillId = fillId;
    }

    /**
     * 获取填报标题
     *
     * @return display_title - 填报标题
     */
    public String getDisplayTitle() {
        return displayTitle;
    }

    /**
     * 设置填报标题
     *
     * @param displayTitle 填报标题
     */
    public void setDisplayTitle(String displayTitle) {
        this.displayTitle = displayTitle;
    }

    /**
     * @return start_time
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="Asia/Shanghai")
    public Date getStartTime() {
        return startTime;
    }

    /**
     * @param startTime
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * @return end_time
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="Asia/Shanghai")
    public Date getEndTime() {
        return endTime;
    }

    /**
     * @param endTime
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * 获取机构ID
     *
     * @return org_id - 机构ID
     */
    public Integer getOrgId() {
        return orgId;
    }

    /**
     * 设置机构ID
     *
     * @param orgId 机构ID
     */
    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }
}
