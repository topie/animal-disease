package com.topie.database.core.template.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "b_bluevaccine")
public class Bluevaccine {
    @Id
    @Column(name = "bv_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String bvId;

    @Column(name = "bv_reportId")
    private String bvReportid;

    @Column(name = "bv_regionCode")
    private String bvRegioncode;

    @Column(name = "bv_regionName")
    private String bvRegionname;

    @Column(name = "bv_date")
    private Date bvDate;

    @Column(name = "bv_inactivatedUseCount")
    private BigDecimal bvInactivatedusecount;

    @Column(name = "bv_livingUseCount")
    private BigDecimal bvLivingusecount;

    @Column(name = "bv_inactivatedStoreCount")
    private BigDecimal bvInactivatedstorecount;

    @Column(name = "bv_livingStoreCount")
    private BigDecimal bvLivingstorecount;

    @Column(name = "bv_inactivatedYearCount")
    private BigDecimal bvInactivatedyearcount;

    @Column(name = "bv_livingYearCount")
    private BigDecimal bvLivingyearcount;

    /**
     * @return bv_id
     */
    public String getBvId() {
        return bvId;
    }

    /**
     * @param bvId
     */
    public void setBvId(String bvId) {
        this.bvId = bvId;
    }

    /**
     * @return bv_reportId
     */
    public String getBvReportid() {
        return bvReportid;
    }

    /**
     * @param bvReportid
     */
    public void setBvReportid(String bvReportid) {
        this.bvReportid = bvReportid;
    }

    /**
     * @return bv_regionCode
     */
    public String getBvRegioncode() {
        return bvRegioncode;
    }

    /**
     * @param bvRegioncode
     */
    public void setBvRegioncode(String bvRegioncode) {
        this.bvRegioncode = bvRegioncode;
    }

    /**
     * @return bv_regionName
     */
    public String getBvRegionname() {
        return bvRegionname;
    }

    /**
     * @param bvRegionname
     */
    public void setBvRegionname(String bvRegionname) {
        this.bvRegionname = bvRegionname;
    }

    /**
     * @return bv_date
     */
    public Date getBvDate() {
        return bvDate;
    }

    /**
     * @param bvDate
     */
    public void setBvDate(Date bvDate) {
        this.bvDate = bvDate;
    }

    /**
     * @return bv_inactivatedUseCount
     */
    public BigDecimal getBvInactivatedusecount() {
        return bvInactivatedusecount;
    }

    /**
     * @param bvInactivatedusecount
     */
    public void setBvInactivatedusecount(BigDecimal bvInactivatedusecount) {
        this.bvInactivatedusecount = bvInactivatedusecount;
    }

    /**
     * @return bv_livingUseCount
     */
    public BigDecimal getBvLivingusecount() {
        return bvLivingusecount;
    }

    /**
     * @param bvLivingusecount
     */
    public void setBvLivingusecount(BigDecimal bvLivingusecount) {
        this.bvLivingusecount = bvLivingusecount;
    }

    /**
     * @return bv_inactivatedStoreCount
     */
    public BigDecimal getBvInactivatedstorecount() {
        return bvInactivatedstorecount;
    }

    /**
     * @param bvInactivatedstorecount
     */
    public void setBvInactivatedstorecount(BigDecimal bvInactivatedstorecount) {
        this.bvInactivatedstorecount = bvInactivatedstorecount;
    }

    /**
     * @return bv_livingStoreCount
     */
    public BigDecimal getBvLivingstorecount() {
        return bvLivingstorecount;
    }

    /**
     * @param bvLivingstorecount
     */
    public void setBvLivingstorecount(BigDecimal bvLivingstorecount) {
        this.bvLivingstorecount = bvLivingstorecount;
    }

    /**
     * @return bv_inactivatedYearCount
     */
    public BigDecimal getBvInactivatedyearcount() {
        return bvInactivatedyearcount;
    }

    /**
     * @param bvInactivatedyearcount
     */
    public void setBvInactivatedyearcount(BigDecimal bvInactivatedyearcount) {
        this.bvInactivatedyearcount = bvInactivatedyearcount;
    }

    /**
     * @return bv_livingYearCount
     */
    public BigDecimal getBvLivingyearcount() {
        return bvLivingyearcount;
    }

    /**
     * @param bvLivingyearcount
     */
    public void setBvLivingyearcount(BigDecimal bvLivingyearcount) {
        this.bvLivingyearcount = bvLivingyearcount;
    }
}