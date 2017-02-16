package com.topie.database.core.model;

import javax.persistence.*;

@Table(name = "d_report")
public class Report {
    /**
     * ID
     */
    @Id
    @Column(name = "report_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer reportId;

    /**
     * 报表名称
     */
    @Column(name = "report_name")
    private String reportName;

    /**
     * 数据库表名
     */
    @Column(name = "table_name")
    private String tableName;

    /**
     * 填报模板名称
     */
    @Column(name = "reprot_template_name")
    private String reprotTemplateName;

    /**
     * 汇总模板名称
     */
    @Column(name = "summary_template_name")
    private String summaryTemplateName;

    /**
     * 报表类型：1：月报 2：周报 3：统计 4：其他
     */
    @Column(name = "report_type")
    private Short reportType;

    /**
     * 栏目 1：月度免疫 2：春秋防周报 3：春秋防数据汇总 4：物资储备
     */
    @Column(name = "report_categery")
    private Short reportCategery;

    /**
     * 填报频率 1：月度 2：周报 3：半年 4：季度 5：实时
     */
    @Column(name = "report_period")
    private Short reportPeriod;

    /**
     * 获取ID
     *
     * @return report_id - ID
     */
    public Integer getReportId() {
        return reportId;
    }

    /**
     * 设置ID
     *
     * @param reportId ID
     */
    public void setReportId(Integer reportId) {
        this.reportId = reportId;
    }

    /**
     * 获取报表名称
     *
     * @return report_name - 报表名称
     */
    public String getReportName() {
        return reportName;
    }

    /**
     * 设置报表名称
     *
     * @param reportName 报表名称
     */
    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    /**
     * 获取数据库表名
     *
     * @return table_name - 数据库表名
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * 设置数据库表名
     *
     * @param tableName 数据库表名
     */
    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * 获取填报模板名称
     *
     * @return reprot_template_name - 填报模板名称
     */
    public String getReprotTemplateName() {
        return reprotTemplateName;
    }

    /**
     * 设置填报模板名称
     *
     * @param reprotTemplateName 填报模板名称
     */
    public void setReprotTemplateName(String reprotTemplateName) {
        this.reprotTemplateName = reprotTemplateName;
    }

    /**
     * 获取汇总模板名称
     *
     * @return summary_template_name - 汇总模板名称
     */
    public String getSummaryTemplateName() {
        return summaryTemplateName;
    }

    /**
     * 设置汇总模板名称
     *
     * @param summaryTemplateName 汇总模板名称
     */
    public void setSummaryTemplateName(String summaryTemplateName) {
        this.summaryTemplateName = summaryTemplateName;
    }

    /**
     * 获取报表类型：1：月报 2：周报 3：统计 4：其他
     *
     * @return report_type - 报表类型：1：月报 2：周报 3：统计 4：其他
     */
    public Short getReportType() {
        return reportType;
    }

    /**
     * 设置报表类型：1：月报 2：周报 3：统计 4：其他
     *
     * @param reportType 报表类型：1：月报 2：周报 3：统计 4：其他
     */
    public void setReportType(Short reportType) {
        this.reportType = reportType;
    }

    /**
     * 获取栏目 1：月度免疫 2：春秋防周报 3：春秋防数据汇总 4：物资储备
     *
     * @return report_categery - 栏目 1：月度免疫 2：春秋防周报 3：春秋防数据汇总 4：物资储备
     */
    public Short getReportCategery() {
        return reportCategery;
    }

    /**
     * 设置栏目 1：月度免疫 2：春秋防周报 3：春秋防数据汇总 4：物资储备
     *
     * @param reportCategery 栏目 1：月度免疫 2：春秋防周报 3：春秋防数据汇总 4：物资储备
     */
    public void setReportCategery(Short reportCategery) {
        this.reportCategery = reportCategery;
    }

    /**
     * 获取填报频率 1：月度 2：周报 3：半年 4：季度 5：实时
     *
     * @return report_period - 填报频率 1：月度 2：周报 3：半年 4：季度 5：实时
     */
    public Short getReportPeriod() {
        return reportPeriod;
    }

    /**
     * 设置填报频率 1：月度 2：周报 3：半年 4：季度 5：实时
     *
     * @param reportPeriod 填报频率 1：月度 2：周报 3：半年 4：季度 5：实时
     */
    public void setReportPeriod(Short reportPeriod) {
        this.reportPeriod = reportPeriod;
    }
}