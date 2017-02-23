package com.topie.database.core.animal.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import javax.persistence.*;

@Table(name = "a_report")
public class Report {
    /**
     * 报表ID
     */
    @Id
    @Column(name = "report_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String reportId;

    /**
     * 模板ID
     */
    @Column(name = "template_id")
    private String templateId;

    /**
     * 报表类型
     */
    @Column(name = "report_type")
    private Integer reportType;

    /**
     * 报表用户ID
     */
    @Column(name = "report_user_id")
    private String reportUserId;

    /**
     * 上报时间
     */
    @Column(name = "report_time")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date reportTime;

    /**
     * 填报状态 0：未填写 1：起草中 2：已上报
     */
    private Integer status;

    /**
     * 开始时间
     */
    @Column(name = "begin_time")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date beginTime;

    /**
     * 结束时间
     */
    @Column(name = "end_time")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date endTime;

    /**
     * 获取报表ID
     *
     * @return report_id - 报表ID
     */
    public String getReportId() {
        return reportId;
    }

    /**
     * 设置报表ID
     *
     * @param reportId 报表ID
     */
    public void setReportId(String reportId) {
        this.reportId = reportId;
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
     * 获取报表类型
     *
     * @return report_type - 报表类型
     */
    public Integer getReportType() {
        return reportType;
    }

    /**
     * 设置报表类型
     *
     * @param reportType 报表类型
     */
    public void setReportType(Integer reportType) {
        this.reportType = reportType;
    }

    /**
     * 获取报表用户ID
     *
     * @return report_user_id - 报表用户ID
     */
    public String getReportUserId() {
        return reportUserId;
    }

    /**
     * 设置报表用户ID
     *
     * @param reportUserId 报表用户ID
     */
    public void setReportUserId(String reportUserId) {
        this.reportUserId = reportUserId;
    }

    /**
     * 获取上报时间
     *
     * @return report_time - 上报时间
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="Asia/Shanghai")
    public Date getReportTime() {
        return reportTime;
    }

    /**
     * 设置上报时间
     *
     * @param reportTime 上报时间
     */
    public void setReportTime(Date reportTime) {
        this.reportTime = reportTime;
    }

    /**
     * 获取填报状态 0：未填写 1：起草中 2：已上报
     *
     * @return status - 填报状态 0：未填写 1：起草中 2：已上报
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置填报状态 0：未填写 1：起草中 2：已上报
     *
     * @param status 填报状态 0：未填写 1：起草中 2：已上报
     */
    public void setStatus(Integer status) {
        this.status = status;
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
     * 获取结束时间
     *
     * @return end_time - 结束时间
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="Asia/Shanghai")
    public Date getEndTime() {
        return endTime;
    }

    /**
     * 设置结束时间
     *
     * @param endTime 结束时间
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
