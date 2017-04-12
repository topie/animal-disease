package com.topie.database.core.template.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "b_brucellosisvaccine")
public class BrucellosisVaccine {
    @Id
    @Column(name = "bru_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String bruId;

    @Column(name = "bru_reportId")
    private String bruReportid;

    @Column(name = "bru_regionCode")
    private String bruRegioncode;

    @Column(name = "bru_regionName")
    private String bruRegionname;

    @Column(name = "bru_date")
    private Date bruDate;

    @Column(name = "bru_s2UseCount")
    private BigDecimal bruS2usecount;

    @Column(name = "bru_s2StoreCount")
    private BigDecimal bruS2storecount;

    @Column(name = "bru_s2YearCount")
    private BigDecimal bruS2yearcount;

    @Column(name = "bru_m5UseCount")
    private BigDecimal bruM5usecount;

    @Column(name = "bru_m5StoreCount")
    private BigDecimal bruM5storecount;

    @Column(name = "bru_m5YearCount")
    private BigDecimal bruM5yearcount;

    @Column(name = "bru_a19UseCount")
    private BigDecimal bruA19usecount;

    @Column(name = "bru_a19StoreCount")
    private BigDecimal bruA19storecount;

    @Column(name = "bru_a19YearCount")
    private BigDecimal bruA19yearcount;

    /**
     * @return bru_id
     */
    public String getBruId() {
        return bruId;
    }

    /**
     * @param bruId
     */
    public void setBruId(String bruId) {
        this.bruId = bruId;
    }

    /**
     * @return bru_reportId
     */
    public String getBruReportid() {
        return bruReportid;
    }

    /**
     * @param bruReportid
     */
    public void setBruReportid(String bruReportid) {
        this.bruReportid = bruReportid;
    }

    /**
     * @return bru_regionCode
     */
    public String getBruRegioncode() {
        return bruRegioncode;
    }

    /**
     * @param bruRegioncode
     */
    public void setBruRegioncode(String bruRegioncode) {
        this.bruRegioncode = bruRegioncode;
    }

    /**
     * @return bru_regionName
     */
    public String getBruRegionname() {
        return bruRegionname;
    }

    /**
     * @param bruRegionname
     */
    public void setBruRegionname(String bruRegionname) {
        this.bruRegionname = bruRegionname;
    }

    /**
     * @return bru_date
     */
    public Date getBruDate() {
        return bruDate;
    }

    /**
     * @param bruDate
     */
    public void setBruDate(Date bruDate) {
        this.bruDate = bruDate;
    }

    /**
     * @return bru_s2UseCount
     */
    public BigDecimal getBruS2usecount() {
        return bruS2usecount;
    }

    /**
     * @param bruS2usecount
     */
    public void setBruS2usecount(BigDecimal bruS2usecount) {
        this.bruS2usecount = bruS2usecount;
    }

    /**
     * @return bru_s2StoreCount
     */
    public BigDecimal getBruS2storecount() {
        return bruS2storecount;
    }

    /**
     * @param bruS2storecount
     */
    public void setBruS2storecount(BigDecimal bruS2storecount) {
        this.bruS2storecount = bruS2storecount;
    }

    /**
     * @return bru_s2YearCount
     */
    public BigDecimal getBruS2yearcount() {
        return bruS2yearcount;
    }

    /**
     * @param bruS2yearcount
     */
    public void setBruS2yearcount(BigDecimal bruS2yearcount) {
        this.bruS2yearcount = bruS2yearcount;
    }

    /**
     * @return bru_m5UseCount
     */
    public BigDecimal getBruM5usecount() {
        return bruM5usecount;
    }

    /**
     * @param bruM5usecount
     */
    public void setBruM5usecount(BigDecimal bruM5usecount) {
        this.bruM5usecount = bruM5usecount;
    }

    /**
     * @return bru_m5StoreCount
     */
    public BigDecimal getBruM5storecount() {
        return bruM5storecount;
    }

    /**
     * @param bruM5storecount
     */
    public void setBruM5storecount(BigDecimal bruM5storecount) {
        this.bruM5storecount = bruM5storecount;
    }

    /**
     * @return bru_m5YearCount
     */
    public BigDecimal getBruM5yearcount() {
        return bruM5yearcount;
    }

    /**
     * @param bruM5yearcount
     */
    public void setBruM5yearcount(BigDecimal bruM5yearcount) {
        this.bruM5yearcount = bruM5yearcount;
    }

    /**
     * @return bru_a19UseCount
     */
    public BigDecimal getBruA19usecount() {
        return bruA19usecount;
    }

    /**
     * @param bruA19usecount
     */
    public void setBruA19usecount(BigDecimal bruA19usecount) {
        this.bruA19usecount = bruA19usecount;
    }

    /**
     * @return bru_a19StoreCount
     */
    public BigDecimal getBruA19storecount() {
        return bruA19storecount;
    }

    /**
     * @param bruA19storecount
     */
    public void setBruA19storecount(BigDecimal bruA19storecount) {
        this.bruA19storecount = bruA19storecount;
    }

    /**
     * @return bru_a19YearCount
     */
    public BigDecimal getBruA19yearcount() {
        return bruA19yearcount;
    }

    /**
     * @param bruA19yearcount
     */
    public void setBruA19yearcount(BigDecimal bruA19yearcount) {
        this.bruA19yearcount = bruA19yearcount;
    }
}