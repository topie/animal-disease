package com.topie.database.core.template.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "b_wnewcastle")
public class Wnewcastle {
    @Id
    @Column(name = "nc_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String ncId;

    @Column(name = "nc_reportId")
    private String ncReportid;

    @Column(name = "nc_date")
    private Date ncDate;

    @Column(name = "nc_regionCode")
    private String ncRegioncode;

    @Column(name = "nc_regionName")
    private String ncRegionname;

    @Column(name = "nc_inactivatedVaccine")
    private BigDecimal ncInactivatedvaccine;

    @Column(name = "nc_inactivatedImmuneAmount")
    private BigDecimal ncInactivatedimmuneamount;

    @Column(name = "nc_inactivatedShouldAmount")
    private BigDecimal ncInactivatedshouldamount;

    @Column(name = "nc_jointImmuneAmount")
    private BigDecimal ncJointimmuneamount;

    @Column(name = "nc_jointShouldAmount")
    private BigDecimal ncJointshouldamount;

    @Column(name = "nc_jointVaccine")
    private BigDecimal ncJointvaccine;

    /**
     * @return nc_id
     */
    public String getNcId() {
        return ncId;
    }

    /**
     * @param ncId
     */
    public void setNcId(String ncId) {
        this.ncId = ncId;
    }

    /**
     * @return nc_reportId
     */
    public String getNcReportid() {
        return ncReportid;
    }

    /**
     * @param ncReportid
     */
    public void setNcReportid(String ncReportid) {
        this.ncReportid = ncReportid;
    }

    /**
     * @return nc_date
     */
    public Date getNcDate() {
        return ncDate;
    }

    /**
     * @param ncDate
     */
    public void setNcDate(Date ncDate) {
        this.ncDate = ncDate;
    }

    /**
     * @return nc_regionCode
     */
    public String getNcRegioncode() {
        return ncRegioncode;
    }

    /**
     * @param ncRegioncode
     */
    public void setNcRegioncode(String ncRegioncode) {
        this.ncRegioncode = ncRegioncode;
    }

    /**
     * @return nc_regionName
     */
    public String getNcRegionname() {
        return ncRegionname;
    }

    /**
     * @param ncRegionname
     */
    public void setNcRegionname(String ncRegionname) {
        this.ncRegionname = ncRegionname;
    }

    /**
     * @return nc_inactivatedVaccine
     */
    public BigDecimal getNcInactivatedvaccine() {
        return ncInactivatedvaccine;
    }

    /**
     * @param ncInactivatedvaccine
     */
    public void setNcInactivatedvaccine(BigDecimal ncInactivatedvaccine) {
        this.ncInactivatedvaccine = ncInactivatedvaccine;
    }

    /**
     * @return nc_inactivatedImmuneAmount
     */
    public BigDecimal getNcInactivatedimmuneamount() {
        return ncInactivatedimmuneamount;
    }

    /**
     * @param ncInactivatedimmuneamount
     */
    public void setNcInactivatedimmuneamount(BigDecimal ncInactivatedimmuneamount) {
        this.ncInactivatedimmuneamount = ncInactivatedimmuneamount;
    }

    /**
     * @return nc_inactivatedShouldAmount
     */
    public BigDecimal getNcInactivatedshouldamount() {
        return ncInactivatedshouldamount;
    }

    /**
     * @param ncInactivatedshouldamount
     */
    public void setNcInactivatedshouldamount(BigDecimal ncInactivatedshouldamount) {
        this.ncInactivatedshouldamount = ncInactivatedshouldamount;
    }

    /**
     * @return nc_jointImmuneAmount
     */
    public BigDecimal getNcJointimmuneamount() {
        return ncJointimmuneamount;
    }

    /**
     * @param ncJointimmuneamount
     */
    public void setNcJointimmuneamount(BigDecimal ncJointimmuneamount) {
        this.ncJointimmuneamount = ncJointimmuneamount;
    }

    /**
     * @return nc_jointShouldAmount
     */
    public BigDecimal getNcJointshouldamount() {
        return ncJointshouldamount;
    }

    /**
     * @param ncJointshouldamount
     */
    public void setNcJointshouldamount(BigDecimal ncJointshouldamount) {
        this.ncJointshouldamount = ncJointshouldamount;
    }

    /**
     * @return nc_jointVaccine
     */
    public BigDecimal getNcJointvaccine() {
        return ncJointvaccine;
    }

    /**
     * @param ncJointvaccine
     */
    public void setNcJointvaccine(BigDecimal ncJointvaccine) {
        this.ncJointvaccine = ncJointvaccine;
    }
}