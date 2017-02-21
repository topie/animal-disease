package com.topie.database.core.animal.model;

import javax.persistence.*;

@Table(name = "a_org_info")
public class OrgInfo {
    /**
     * org_id
     */
    @Id
    @Column(name = "org_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String orgId;

    /**
     * 机构名称
     */
    @Column(name = "org_name")
    private String orgName;

    /**
     * 区域编码
     */
    @Column(name = "region_code")
    private String regionCode;

    /**
     * 获取org_id
     *
     * @return org_id - org_id
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * 设置org_id
     *
     * @param orgId org_id
     */
    public void setOrgId(String orgId) {
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
     * 获取区域编码
     *
     * @return region_code - 区域编码
     */
    public String getRegionCode() {
        return regionCode;
    }

    /**
     * 设置区域编码
     *
     * @param regionCode 区域编码
     */
    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }
}