package com.topie.database.core.animald.model;

import javax.persistence.*;

@Table(name = "d_org_info")
public class OrgInfo {
    /**
     * ID
     */
    @Id
    @Column(name = "org_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orgId;

    /**
     * 机构名称
     */
    @Column(name = "org_name")
    private String orgName;

    /**
     * 区划编码
     */
    @Column(name = "org_code")
    private String orgCode;

    /**
     * 机构标识
     */
    @Column(name = "token_code")
    private String tokenCode;

    /**
     * 获取ID
     *
     * @return org_id - ID
     */
    public Integer getOrgId() {
        return orgId;
    }

    /**
     * 设置ID
     *
     * @param orgId ID
     */
    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    /**
     * 获取机构名称
     *
     * @return org_name - 机构名称
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * 设置机构名称
     *
     * @param orgName 机构名称
     */
    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    /**
     * 获取区划编码
     *
     * @return org_code - 区划编码
     */
    public String getOrgCode() {
        return orgCode;
    }

    /**
     * 设置区划编码
     *
     * @param orgCode 区划编码
     */
    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    /**
     * 获取机构标识
     *
     * @return token_code - 机构标识
     */
    public String getTokenCode() {
        return tokenCode;
    }

    /**
     * 设置机构标识
     *
     * @param tokenCode 机构标识
     */
    public void setTokenCode(String tokenCode) {
        this.tokenCode = tokenCode;
    }
}
