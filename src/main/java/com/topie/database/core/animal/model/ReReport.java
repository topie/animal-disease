package com.topie.database.core.animal.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import javax.persistence.*;

@Table(name = "a_re_report")
public class ReReport {
    /**
     * 补填报ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 组织ID
     */
    @Column(name = "org_id")
    private String orgId;

    /**
     * 开始时间
     */
    @Column(name = "begin_time")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date beginTime;

    /**
     * 模板ID
     */
    @Column(name = "template_id")
    private String templateId;

    /**
     * 填报类型
     */
    @Column(name = "report_type")
    private Integer reportType;

    /**
     * 是否开放 0：关闭 1：开放
     */
    @Column(name = "re_is_open")
    private Integer reIsOpen;

    /**
     * 获取补填报ID
     *
     * @return id - 补填报ID
     */
    public String getId() {
        return id;
    }

    /**
     * 设置补填报ID
     *
     * @param id 补填报ID
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取组织ID
     *
     * @return org_id - 组织ID
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置组织ID
     *
     * @param orgId 组织ID
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    /**
     * 获取开始时间
     *
     * @return begin_time - 开始时间
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="Asia/Shanghai")
    public Date getBeginTime() {
        return beginTime;
    }

    /**
     * 设置开始时间
     *
     * @param beginTime 开始时间
     */
    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    /**
     * 获取模板ID
     *
     * @return template_id - 模板ID
     */
    public String getTemplateId() {
        return templateId;
    }

    /**
     * 设置模板ID
     *
     * @param templateId 模板ID
     */
    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    /**
     * 获取填报类型
     *
     * @return report_type - 填报类型
     */
    public Integer getReportType() {
        return reportType;
    }

    /**
     * 设置填报类型
     *
     * @param reportType 填报类型
     */
    public void setReportType(Integer reportType) {
        this.reportType = reportType;
    }

    /**
     * 获取是否开放 0：关闭 1：开放
     *
     * @return re_is_open - 是否开放 0：关闭 1：开放
     */
    public Integer getReIsOpen() {
        return reIsOpen;
    }

    /**
     * 设置是否开放 0：关闭 1：开放
     *
     * @param reIsOpen 是否开放 0：关闭 1：开放
     */
    public void setReIsOpen(Integer reIsOpen) {
        this.reIsOpen = reIsOpen;
    }
}
