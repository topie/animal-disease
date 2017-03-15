package com.topie.database.core.animal.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import javax.persistence.*;

@Table(name = "a_spec_fill")
public class SpecFill {
    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 类型
     */
    private Integer type;

    /**
     * 组织id
     */
    @Column(name = "org_id")
    private String orgId;

    /**
     * 组织名称
     */
    @Column(name = "org_name")
    private String orgName;

    /**
     * 修改时间
     */
    @Column(name = "u_time")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date uTime;

    /**
     * 表格内容
     */
    @Column(name = "table_content")
    private String tableContent;

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
     * 获取类型
     *
     * @return type - 类型
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置类型
     *
     * @param type 类型
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取组织id
     *
     * @return org_id - 组织id
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置组织id
     *
     * @param orgId 组织id
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    /**
     * 获取组织名称
     *
     * @return org_name - 组织名称
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * 设置组织名称
     *
     * @param orgName 组织名称
     */
    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    /**
     * 获取修改时间
     *
     * @return u_time - 修改时间
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="Asia/Shanghai")
    public Date getuTime() {
        return uTime;
    }

    /**
     * 设置修改时间
     *
     * @param uTime 修改时间
     */
    public void setuTime(Date uTime) {
        this.uTime = uTime;
    }

    /**
     * 获取表格内容
     *
     * @return table_content - 表格内容
     */
    public String getTableContent() {
        return tableContent;
    }

    /**
     * 设置表格内容
     *
     * @param tableContent 表格内容
     */
    public void setTableContent(String tableContent) {
        this.tableContent = tableContent;
    }
}
