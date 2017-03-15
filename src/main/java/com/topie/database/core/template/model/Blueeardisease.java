package com.topie.database.core.template.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "b_blueeardisease")
public class Blueeardisease {
    @Id
    @Column(name = "bed_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String bedId;

    @Column(name = "bed_reportId")
    private String bedReportid;

    @Column(name = "bed_date")
    private Date bedDate;

    @Column(name = "bed_regionCode")
    private String bedRegioncode;

    @Column(name = "bed_regionName")
    private String bedRegionname;

    @Column(name = "bed_inactivatedVaccine")
    private BigDecimal bedInactivatedvaccine;

    @Column(name = "bed_inactivatedImmuneAmount")
    private BigDecimal bedInactivatedimmuneamount;

    @Column(name = "bed_inactivatedShouldAmount")
    private BigDecimal bedInactivatedshouldamount;

    @Column(name = "bed_weakVaccine")
    private BigDecimal bedWeakvaccine;

    @Column(name = "bed_weakImmuneAmount")
    private BigDecimal bedWeakimmuneamount;

    @Column(name = "bed_weakShouldAmount")
    private BigDecimal bedWeakshouldamount;

    /**
     * @return bed_id
     */
    public String getBedId() {
        return bedId;
    }

    /**
     * @param bedId
     */
    public void setBedId(String bedId) {
        this.bedId = bedId;
    }

    /**
     * @return bed_reportId
     */
    public String getBedReportid() {
        return bedReportid;
    }

    /**
     * @param bedReportid
     */
    public void setBedReportid(String bedReportid) {
        this.bedReportid = bedReportid;
    }

    /**
     * @return bed_date
     */
    public Date getBedDate() {
        return bedDate;
    }

    /**
     * @param bedDate
     */
    public void setBedDate(Date bedDate) {
        this.bedDate = bedDate;
    }

    /**
     * @return bed_regionCode
     */
    public String getBedRegioncode() {
        return bedRegioncode;
    }

    /**
     * @param bedRegioncode
     */
    public void setBedRegioncode(String bedRegioncode) {
        this.bedRegioncode = bedRegioncode;
    }

    /**
     * @return bed_regionName
     */
    public String getBedRegionname() {
        return bedRegionname;
    }

    /**
     * @param bedRegionname
     */
    public void setBedRegionname(String bedRegionname) {
        this.bedRegionname = bedRegionname;
    }

    /**
     * @return bed_inactivatedVaccine
     */
    public BigDecimal getBedInactivatedvaccine() {
        return bedInactivatedvaccine;
    }

    /**
     * @param bedInactivatedvaccine
     */
    public void setBedInactivatedvaccine(BigDecimal bedInactivatedvaccine) {
        this.bedInactivatedvaccine = bedInactivatedvaccine;
    }

    /**
     * @return bed_inactivatedImmuneAmount
     */
    public BigDecimal getBedInactivatedimmuneamount() {
        return bedInactivatedimmuneamount;
    }

    /**
     * @param bedInactivatedimmuneamount
     */
    public void setBedInactivatedimmuneamount(BigDecimal bedInactivatedimmuneamount) {
        this.bedInactivatedimmuneamount = bedInactivatedimmuneamount;
    }

    /**
     * @return bed_inactivatedShouldAmount
     */
    public BigDecimal getBedInactivatedshouldamount() {
        return bedInactivatedshouldamount;
    }

    /**
     * @param bedInactivatedshouldamount
     */
    public void setBedInactivatedshouldamount(BigDecimal bedInactivatedshouldamount) {
        this.bedInactivatedshouldamount = bedInactivatedshouldamount;
    }

    /**
     * @return bed_weakVaccine
     */
    public BigDecimal getBedWeakvaccine() {
        return bedWeakvaccine;
    }

    /**
     * @param bedWeakvaccine
     */
    public void setBedWeakvaccine(BigDecimal bedWeakvaccine) {
        this.bedWeakvaccine = bedWeakvaccine;
    }

    /**
     * @return bed_weakImmuneAmount
     */
    public BigDecimal getBedWeakimmuneamount() {
        return bedWeakimmuneamount;
    }

    /**
     * @param bedWeakimmuneamount
     */
    public void setBedWeakimmuneamount(BigDecimal bedWeakimmuneamount) {
        this.bedWeakimmuneamount = bedWeakimmuneamount;
    }

    /**
     * @return bed_weakShouldAmount
     */
    public BigDecimal getBedWeakshouldamount() {
        return bedWeakshouldamount;
    }

    /**
     * @param bedWeakshouldamount
     */
    public void setBedWeakshouldamount(BigDecimal bedWeakshouldamount) {
        this.bedWeakshouldamount = bedWeakshouldamount;
    }
}