package com.topie.database.core.template.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "b_newcastlevaccine")
public class Newcastlevaccine {
    @Id
    @Column(name = "nv_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nvId;

    @Column(name = "nv_reportId")
    private String nvReportid;

    @Column(name = "nv_regionCode")
    private String nvRegioncode;

    @Column(name = "nv_regionName")
    private String nvRegionname;

    @Column(name = "nv_date")
    private Date nvDate;

    @Column(name = "nv_inactivatedUseCount")
    private BigDecimal nvInactivatedusecount;

    @Column(name = "nv_poisonUseCount")
    private BigDecimal nvPoisonusecount;

    @Column(name = "nv_inactivatedStoreCount")
    private BigDecimal nvInactivatedstorecount;

    @Column(name = "nv_poisonStoreCount")
    private BigDecimal nvPoisonstorecount;

    @Column(name = "nv_inactivatedYearCount")
    private BigDecimal nvInactivatedyearcount;

    @Column(name = "nv_poisonYearCount")
    private BigDecimal nvPoisonyearcount;

    /**
     * @return nv_id
     */
    public String getNvId() {
        return nvId;
    }

    /**
     * @param nvId
     */
    public void setNvId(String nvId) {
        this.nvId = nvId;
    }

    /**
     * @return nv_reportId
     */
    public String getNvReportid() {
        return nvReportid;
    }

    /**
     * @param nvReportid
     */
    public void setNvReportid(String nvReportid) {
        this.nvReportid = nvReportid;
    }

    /**
     * @return nv_regionCode
     */
    public String getNvRegioncode() {
        return nvRegioncode;
    }

    /**
     * @param nvRegioncode
     */
    public void setNvRegioncode(String nvRegioncode) {
        this.nvRegioncode = nvRegioncode;
    }

    /**
     * @return nv_regionName
     */
    public String getNvRegionname() {
        return nvRegionname;
    }

    /**
     * @param nvRegionname
     */
    public void setNvRegionname(String nvRegionname) {
        this.nvRegionname = nvRegionname;
    }

    /**
     * @return nv_date
     */
    public Date getNvDate() {
        return nvDate;
    }

    /**
     * @param nvDate
     */
    public void setNvDate(Date nvDate) {
        this.nvDate = nvDate;
    }

    /**
     * @return nv_inactivatedUseCount
     */
    public BigDecimal getNvInactivatedusecount() {
        return nvInactivatedusecount;
    }

    /**
     * @param nvInactivatedusecount
     */
    public void setNvInactivatedusecount(BigDecimal nvInactivatedusecount) {
        this.nvInactivatedusecount = nvInactivatedusecount;
    }

    /**
     * @return nv_poisonUseCount
     */
    public BigDecimal getNvPoisonusecount() {
        return nvPoisonusecount;
    }

    /**
     * @param nvPoisonusecount
     */
    public void setNvPoisonusecount(BigDecimal nvPoisonusecount) {
        this.nvPoisonusecount = nvPoisonusecount;
    }

    /**
     * @return nv_inactivatedStoreCount
     */
    public BigDecimal getNvInactivatedstorecount() {
        return nvInactivatedstorecount;
    }

    /**
     * @param nvInactivatedstorecount
     */
    public void setNvInactivatedstorecount(BigDecimal nvInactivatedstorecount) {
        this.nvInactivatedstorecount = nvInactivatedstorecount;
    }

    /**
     * @return nv_poisonStoreCount
     */
    public BigDecimal getNvPoisonstorecount() {
        return nvPoisonstorecount;
    }

    /**
     * @param nvPoisonstorecount
     */
    public void setNvPoisonstorecount(BigDecimal nvPoisonstorecount) {
        this.nvPoisonstorecount = nvPoisonstorecount;
    }

    /**
     * @return nv_inactivatedYearCount
     */
    public BigDecimal getNvInactivatedyearcount() {
        return nvInactivatedyearcount;
    }

    /**
     * @param nvInactivatedyearcount
     */
    public void setNvInactivatedyearcount(BigDecimal nvInactivatedyearcount) {
        this.nvInactivatedyearcount = nvInactivatedyearcount;
    }

    /**
     * @return nv_poisonYearCount
     */
    public BigDecimal getNvPoisonyearcount() {
        return nvPoisonyearcount;
    }

    /**
     * @param nvPoisonyearcount
     */
    public void setNvPoisonyearcount(BigDecimal nvPoisonyearcount) {
        this.nvPoisonyearcount = nvPoisonyearcount;
    }
}