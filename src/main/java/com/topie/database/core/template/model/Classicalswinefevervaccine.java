package com.topie.database.core.template.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "b_classicalswinefevervaccine")
public class Classicalswinefevervaccine {
    @Id
    @Column(name = "cv_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String cvId;

    @Column(name = "cv_reportId")
    private String cvReportid;

    @Column(name = "cv_date")
    private Date cvDate;

    @Column(name = "cv_regionCode")
    private String cvRegioncode;

    @Column(name = "cv_regionName")
    private String cvRegionname;

    @Column(name = "cv_livingUseCount")
    private BigDecimal cvLivingusecount;

    @Column(name = "cv_cellUserCount")
    private BigDecimal cvCellusercount;

    @Column(name = "cv_livingStoreCount")
    private BigDecimal cvLivingstorecount;

    @Column(name = "cv_cellStoreCount")
    private BigDecimal cvCellstorecount;

    @Column(name = "cv_livingYearCount")
    private BigDecimal cvLivingyearcount;

    @Column(name = "cv_cellYearCount")
    private BigDecimal cvCellyearcount;

    /**
     * @return cv_id
     */
    public String getCvId() {
        return cvId;
    }

    /**
     * @param cvId
     */
    public void setCvId(String cvId) {
        this.cvId = cvId;
    }

    /**
     * @return cv_reportId
     */
    public String getCvReportid() {
        return cvReportid;
    }

    /**
     * @param cvReportid
     */
    public void setCvReportid(String cvReportid) {
        this.cvReportid = cvReportid;
    }

    /**
     * @return cv_date
     */
    public Date getCvDate() {
        return cvDate;
    }

    /**
     * @param cvDate
     */
    public void setCvDate(Date cvDate) {
        this.cvDate = cvDate;
    }

    /**
     * @return cv_regionCode
     */
    public String getCvRegioncode() {
        return cvRegioncode;
    }

    /**
     * @param cvRegioncode
     */
    public void setCvRegioncode(String cvRegioncode) {
        this.cvRegioncode = cvRegioncode;
    }

    /**
     * @return cv_regionName
     */
    public String getCvRegionname() {
        return cvRegionname;
    }

    /**
     * @param cvRegionname
     */
    public void setCvRegionname(String cvRegionname) {
        this.cvRegionname = cvRegionname;
    }

    /**
     * @return cv_livingUseCount
     */
    public BigDecimal getCvLivingusecount() {
        return cvLivingusecount;
    }

    /**
     * @param cvLivingusecount
     */
    public void setCvLivingusecount(BigDecimal cvLivingusecount) {
        this.cvLivingusecount = cvLivingusecount;
    }

    /**
     * @return cv_cellUserCount
     */
    public BigDecimal getCvCellusercount() {
        return cvCellusercount;
    }

    /**
     * @param cvCellusercount
     */
    public void setCvCellusercount(BigDecimal cvCellusercount) {
        this.cvCellusercount = cvCellusercount;
    }

    /**
     * @return cv_livingStoreCount
     */
    public BigDecimal getCvLivingstorecount() {
        return cvLivingstorecount;
    }

    /**
     * @param cvLivingstorecount
     */
    public void setCvLivingstorecount(BigDecimal cvLivingstorecount) {
        this.cvLivingstorecount = cvLivingstorecount;
    }

    /**
     * @return cv_cellStoreCount
     */
    public BigDecimal getCvCellstorecount() {
        return cvCellstorecount;
    }

    /**
     * @param cvCellstorecount
     */
    public void setCvCellstorecount(BigDecimal cvCellstorecount) {
        this.cvCellstorecount = cvCellstorecount;
    }

    /**
     * @return cv_livingYearCount
     */
    public BigDecimal getCvLivingyearcount() {
        return cvLivingyearcount;
    }

    /**
     * @param cvLivingyearcount
     */
    public void setCvLivingyearcount(BigDecimal cvLivingyearcount) {
        this.cvLivingyearcount = cvLivingyearcount;
    }

    /**
     * @return cv_cellYearCount
     */
    public BigDecimal getCvCellyearcount() {
        return cvCellyearcount;
    }

    /**
     * @param cvCellyearcount
     */
    public void setCvCellyearcount(BigDecimal cvCellyearcount) {
        this.cvCellyearcount = cvCellyearcount;
    }
}