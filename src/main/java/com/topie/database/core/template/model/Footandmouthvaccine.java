package com.topie.database.core.template.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "b_footandmouthvaccine")
public class Footandmouthvaccine {
    @Id
    @Column(name = "fv_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String fvId;

    @Column(name = "fv_reportId")
    private String fvReportid;

    @Column(name = "fv_regionCode")
    private String fvRegioncode;

    @Column(name = "fv_regionName")
    private String fvRegionname;

    @Column(name = "fv_date")
    private Date fvDate;

    @Column(name = "fv_OInactivatedUseCount")
    private BigDecimal fvOinactivatedusecount;

    @Column(name = "fv_syntheticUseCount")
    private BigDecimal fvSyntheticusecount;

    @Column(name = "fv_O2InactivatedUseCount")
    private BigDecimal fvO2inactivatedusecount;

    @Column(name = "fv_OAInactivatedUseCount")
    private BigDecimal fvOainactivatedusecount;

    @Column(name = "fv_AInactivatedUseCount")
    private BigDecimal fvAinactivatedusecount;

    @Column(name = "fv_OInactivatedStoreCount")
    private BigDecimal fvOinactivatedstorecount;

    @Column(name = "fv_syntheticStoreCount")
    private BigDecimal fvSyntheticstorecount;

    @Column(name = "fv_O2InactivatedStoreCount")
    private BigDecimal fvO2inactivatedstorecount;

    @Column(name = "fv_OAInactivatedStoreCount")
    private BigDecimal fvOainactivatedstorecount;

    @Column(name = "fv_AInactivatedStoreCount")
    private BigDecimal fvAinactivatedstorecount;

    @Column(name = "fv_OInactivatedYearCount")
    private BigDecimal fvOinactivatedyearcount;

    @Column(name = "fv_syntheticYearCount")
    private BigDecimal fvSyntheticyearcount;

    @Column(name = "fv_O2InactivatedSYearCount")
    private BigDecimal fvO2inactivatedsyearcount;

    @Column(name = "fv_OAInactivatedYearCount")
    private BigDecimal fvOainactivatedyearcount;

    @Column(name = "fv_AInactivatedSYearCount")
    private BigDecimal fvAinactivatedsyearcount;

    @Column(name = "fv_O3InactivatedUseCount")
    private BigDecimal fvO3inactivatedusecount;

    @Column(name = "fv_O3InactivatedStoreCount")
    private BigDecimal fvO3inactivatedstorecount;

    @Column(name = "fv_O3InactivatedSYearCount")
    private BigDecimal fvO3inactivatedsyearcount;

    /**
     * @return fv_id
     */
    public String getFvId() {
        return fvId;
    }

    /**
     * @param fvId
     */
    public void setFvId(String fvId) {
        this.fvId = fvId;
    }

    /**
     * @return fv_reportId
     */
    public String getFvReportid() {
        return fvReportid;
    }

    /**
     * @param fvReportid
     */
    public void setFvReportid(String fvReportid) {
        this.fvReportid = fvReportid;
    }

    /**
     * @return fv_regionCode
     */
    public String getFvRegioncode() {
        return fvRegioncode;
    }

    /**
     * @param fvRegioncode
     */
    public void setFvRegioncode(String fvRegioncode) {
        this.fvRegioncode = fvRegioncode;
    }

    /**
     * @return fv_regionName
     */
    public String getFvRegionname() {
        return fvRegionname;
    }

    /**
     * @param fvRegionname
     */
    public void setFvRegionname(String fvRegionname) {
        this.fvRegionname = fvRegionname;
    }

    /**
     * @return fv_date
     */
    public Date getFvDate() {
        return fvDate;
    }

    /**
     * @param fvDate
     */
    public void setFvDate(Date fvDate) {
        this.fvDate = fvDate;
    }

    /**
     * @return fv_OInactivatedUseCount
     */
    public BigDecimal getFvOinactivatedusecount() {
        return fvOinactivatedusecount;
    }

    /**
     * @param fvOinactivatedusecount
     */
    public void setFvOinactivatedusecount(BigDecimal fvOinactivatedusecount) {
        this.fvOinactivatedusecount = fvOinactivatedusecount;
    }

    /**
     * @return fv_syntheticUseCount
     */
    public BigDecimal getFvSyntheticusecount() {
        return fvSyntheticusecount;
    }

    /**
     * @param fvSyntheticusecount
     */
    public void setFvSyntheticusecount(BigDecimal fvSyntheticusecount) {
        this.fvSyntheticusecount = fvSyntheticusecount;
    }

    /**
     * @return fv_O2InactivatedUseCount
     */
    public BigDecimal getFvO2inactivatedusecount() {
        return fvO2inactivatedusecount;
    }

    /**
     * @param fvO2inactivatedusecount
     */
    public void setFvO2inactivatedusecount(BigDecimal fvO2inactivatedusecount) {
        this.fvO2inactivatedusecount = fvO2inactivatedusecount;
    }

    /**
     * @return fv_OAInactivatedUseCount
     */
    public BigDecimal getFvOainactivatedusecount() {
        return fvOainactivatedusecount;
    }

    /**
     * @param fvOainactivatedusecount
     */
    public void setFvOainactivatedusecount(BigDecimal fvOainactivatedusecount) {
        this.fvOainactivatedusecount = fvOainactivatedusecount;
    }

    /**
     * @return fv_AInactivatedUseCount
     */
    public BigDecimal getFvAinactivatedusecount() {
        return fvAinactivatedusecount;
    }

    /**
     * @param fvAinactivatedusecount
     */
    public void setFvAinactivatedusecount(BigDecimal fvAinactivatedusecount) {
        this.fvAinactivatedusecount = fvAinactivatedusecount;
    }

    /**
     * @return fv_OInactivatedStoreCount
     */
    public BigDecimal getFvOinactivatedstorecount() {
        return fvOinactivatedstorecount;
    }

    /**
     * @param fvOinactivatedstorecount
     */
    public void setFvOinactivatedstorecount(BigDecimal fvOinactivatedstorecount) {
        this.fvOinactivatedstorecount = fvOinactivatedstorecount;
    }

    /**
     * @return fv_syntheticStoreCount
     */
    public BigDecimal getFvSyntheticstorecount() {
        return fvSyntheticstorecount;
    }

    /**
     * @param fvSyntheticstorecount
     */
    public void setFvSyntheticstorecount(BigDecimal fvSyntheticstorecount) {
        this.fvSyntheticstorecount = fvSyntheticstorecount;
    }

    /**
     * @return fv_O2InactivatedStoreCount
     */
    public BigDecimal getFvO2inactivatedstorecount() {
        return fvO2inactivatedstorecount;
    }

    /**
     * @param fvO2inactivatedstorecount
     */
    public void setFvO2inactivatedstorecount(BigDecimal fvO2inactivatedstorecount) {
        this.fvO2inactivatedstorecount = fvO2inactivatedstorecount;
    }

    /**
     * @return fv_OAInactivatedStoreCount
     */
    public BigDecimal getFvOainactivatedstorecount() {
        return fvOainactivatedstorecount;
    }

    /**
     * @param fvOainactivatedstorecount
     */
    public void setFvOainactivatedstorecount(BigDecimal fvOainactivatedstorecount) {
        this.fvOainactivatedstorecount = fvOainactivatedstorecount;
    }

    /**
     * @return fv_AInactivatedStoreCount
     */
    public BigDecimal getFvAinactivatedstorecount() {
        return fvAinactivatedstorecount;
    }

    /**
     * @param fvAinactivatedstorecount
     */
    public void setFvAinactivatedstorecount(BigDecimal fvAinactivatedstorecount) {
        this.fvAinactivatedstorecount = fvAinactivatedstorecount;
    }

    /**
     * @return fv_OInactivatedYearCount
     */
    public BigDecimal getFvOinactivatedyearcount() {
        return fvOinactivatedyearcount;
    }

    /**
     * @param fvOinactivatedyearcount
     */
    public void setFvOinactivatedyearcount(BigDecimal fvOinactivatedyearcount) {
        this.fvOinactivatedyearcount = fvOinactivatedyearcount;
    }

    /**
     * @return fv_syntheticYearCount
     */
    public BigDecimal getFvSyntheticyearcount() {
        return fvSyntheticyearcount;
    }

    /**
     * @param fvSyntheticyearcount
     */
    public void setFvSyntheticyearcount(BigDecimal fvSyntheticyearcount) {
        this.fvSyntheticyearcount = fvSyntheticyearcount;
    }

    /**
     * @return fv_O2InactivatedSYearCount
     */
    public BigDecimal getFvO2inactivatedsyearcount() {
        return fvO2inactivatedsyearcount;
    }

    /**
     * @param fvO2inactivatedsyearcount
     */
    public void setFvO2inactivatedsyearcount(BigDecimal fvO2inactivatedsyearcount) {
        this.fvO2inactivatedsyearcount = fvO2inactivatedsyearcount;
    }

    /**
     * @return fv_OAInactivatedYearCount
     */
    public BigDecimal getFvOainactivatedyearcount() {
        return fvOainactivatedyearcount;
    }

    /**
     * @param fvOainactivatedyearcount
     */
    public void setFvOainactivatedyearcount(BigDecimal fvOainactivatedyearcount) {
        this.fvOainactivatedyearcount = fvOainactivatedyearcount;
    }

    /**
     * @return fv_AInactivatedSYearCount
     */
    public BigDecimal getFvAinactivatedsyearcount() {
        return fvAinactivatedsyearcount;
    }

    /**
     * @param fvAinactivatedsyearcount
     */
    public void setFvAinactivatedsyearcount(BigDecimal fvAinactivatedsyearcount) {
        this.fvAinactivatedsyearcount = fvAinactivatedsyearcount;
    }

    /**
     * @return fv_O3InactivatedUseCount
     */
    public BigDecimal getFvO3inactivatedusecount() {
        return fvO3inactivatedusecount;
    }

    /**
     * @param fvO3inactivatedusecount
     */
    public void setFvO3inactivatedusecount(BigDecimal fvO3inactivatedusecount) {
        this.fvO3inactivatedusecount = fvO3inactivatedusecount;
    }

    /**
     * @return fv_O3InactivatedStoreCount
     */
    public BigDecimal getFvO3inactivatedstorecount() {
        return fvO3inactivatedstorecount;
    }

    /**
     * @param fvO3inactivatedstorecount
     */
    public void setFvO3inactivatedstorecount(BigDecimal fvO3inactivatedstorecount) {
        this.fvO3inactivatedstorecount = fvO3inactivatedstorecount;
    }

    /**
     * @return fv_O3InactivatedSYearCount
     */
    public BigDecimal getFvO3inactivatedsyearcount() {
        return fvO3inactivatedsyearcount;
    }

    /**
     * @param fvO3inactivatedsyearcount
     */
    public void setFvO3inactivatedsyearcount(BigDecimal fvO3inactivatedsyearcount) {
        this.fvO3inactivatedsyearcount = fvO3inactivatedsyearcount;
    }
}