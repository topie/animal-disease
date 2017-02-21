package com.topie.database.core.animal.model;

import javax.persistence.*;

@Table(name = "a_template")
public class Template {
    /**
     * 模板ID
     */
    @Id
    @Column(name = "template_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String templateId;

    /**
     * 模板名称
     */
    @Column(name = "template_name")
    private String templateName;

    /**
     * 数据库表名
     */
    @Column(name = "table_name")
    private String tableName;

    /**
     * 填报模板
     */
    @Column(name = "normal_template")
    private String normalTemplate;

    /**
     * 汇总模板
     */
    @Column(name = "summary_template")
    private String summaryTemplate;

    /**
     * 填报周期
     */
    @Column(name = "report_cycle")
    private Short reportCycle;

    /**
     * 填报类型
     */
    @Column(name = "report_type")
    private Short reportType;

    /**
     * 排序
     */
    private Integer sort;

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
     * 获取模板名称
     *
     * @return template_name - 模板名称
     */
    public String getTemplateName() {
        return templateName;
    }

    /**
     * 设置模板名称
     *
     * @param templateName 模板名称
     */
    public void setTemplateName(String templateName) {
        this.templateName = templateName;
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
     * 获取填报模板
     *
     * @return normal_template - 填报模板
     */
    public String getNormalTemplate() {
        return normalTemplate;
    }

    /**
     * 设置填报模板
     *
     * @param normalTemplate 填报模板
     */
    public void setNormalTemplate(String normalTemplate) {
        this.normalTemplate = normalTemplate;
    }

    /**
     * 获取汇总模板
     *
     * @return summary_template - 汇总模板
     */
    public String getSummaryTemplate() {
        return summaryTemplate;
    }

    /**
     * 设置汇总模板
     *
     * @param summaryTemplate 汇总模板
     */
    public void setSummaryTemplate(String summaryTemplate) {
        this.summaryTemplate = summaryTemplate;
    }

    /**
     * 获取填报周期
     *
     * @return report_cycle - 填报周期
     */
    public Short getReportCycle() {
        return reportCycle;
    }

    /**
     * 设置填报周期
     *
     * @param reportCycle 填报周期
     */
    public void setReportCycle(Short reportCycle) {
        this.reportCycle = reportCycle;
    }

    /**
     * 获取填报类型
     *
     * @return report_type - 填报类型
     */
    public Short getReportType() {
        return reportType;
    }

    /**
     * 设置填报类型
     *
     * @param reportType 填报类型
     */
    public void setReportType(Short reportType) {
        this.reportType = reportType;
    }

    /**
     * 获取排序
     *
     * @return sort - 排序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置排序
     *
     * @param sort 排序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }
}