package com.topie.database.core.animal.model;

import javax.persistence.*;

@Table(name = "a_region")
public class Region {
    /**
     * 区域编码
     */
    @Id
    @Column(name = "region_code")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String regionCode;

    /**
     * 区域名
     */
    @Column(name = "region_name")
    private String regionName;

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

    /**
     * 获取区域名
     *
     * @return region_name - 区域名
     */
    public String getRegionName() {
        return regionName;
    }

    /**
     * 设置区域名
     *
     * @param regionName 区域名
     */
    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }
}