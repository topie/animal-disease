package com.topie.database.core.template.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "b_wbrucellosis")
public class Wbrucellosis {
    @Id
    @Column(name = "bru_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String bruId;

    @Column(name = "bru_reportId")
    private String bruReportid;

    @Column(name = "bru_date")
    private Date bruDate;

    @Column(name = "bru_regionCode")
    private String bruRegioncode;

    @Column(name = "bru_regionName")
    private String bruRegionname;

    @Column(name = "bru_s2VaccineUse")
    private BigDecimal bruS2vaccineuse;

    @Column(name = "bru_s2NiuImmuneAmount")
    private BigDecimal bruS2niuimmuneamount;

    @Column(name = "bru_s2NiuShouldAmount")
    private BigDecimal bruS2niushouldamount;

    @Column(name = "bru_m5VaccineUse")
    private BigDecimal bruM5vaccineuse;

    @Column(name = "bru_m5NiuImmuneAmount")
    private BigDecimal bruM5niuimmuneamount;

    @Column(name = "bru_m5NiuShouldAmount")
    private BigDecimal bruM5niushouldamount;

    @Column(name = "bru_a19VaccineUse")
    private BigDecimal bruA19vaccineuse;

    @Column(name = "bru_a19NiuImmuneAmount")
    private BigDecimal bruA19niuimmuneamount;

    @Column(name = "bru_a19NiuShouldAmount")
    private BigDecimal bruA19niushouldamount;

    @Column(name = "bru_s2SheepImmuneAmount")
    private BigDecimal bruS2sheepimmuneamount;

    @Column(name = "bru_s2SheepShouldAmount")
    private BigDecimal bruS2sheepshouldamount;

    @Column(name = "bru_m5SheepImmuneAmount")
    private BigDecimal bruM5sheepimmuneamount;

    @Column(name = "bru_m5SheepShouldAmount")
    private BigDecimal bruM5sheepshouldamount;

    @Column(name = "bru_a19SheepImmuneAmount")
    private BigDecimal bruA19sheepimmuneamount;

    @Column(name = "bru_a19SheepShouldAmount")
    private BigDecimal bruA19sheepshouldamount;

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
     * @return bru_s2VaccineUse
     */
    public BigDecimal getBruS2vaccineuse() {
        return bruS2vaccineuse;
    }

    /**
     * @param bruS2vaccineuse
     */
    public void setBruS2vaccineuse(BigDecimal bruS2vaccineuse) {
        this.bruS2vaccineuse = bruS2vaccineuse;
    }

    /**
     * @return bru_s2NiuImmuneAmount
     */
    public BigDecimal getBruS2niuimmuneamount() {
        return bruS2niuimmuneamount;
    }

    /**
     * @param bruS2niuimmuneamount
     */
    public void setBruS2niuimmuneamount(BigDecimal bruS2niuimmuneamount) {
        this.bruS2niuimmuneamount = bruS2niuimmuneamount;
    }

    /**
     * @return bru_s2NiuShouldAmount
     */
    public BigDecimal getBruS2niushouldamount() {
        return bruS2niushouldamount;
    }

    /**
     * @param bruS2niushouldamount
     */
    public void setBruS2niushouldamount(BigDecimal bruS2niushouldamount) {
        this.bruS2niushouldamount = bruS2niushouldamount;
    }

    /**
     * @return bru_m5VaccineUse
     */
    public BigDecimal getBruM5vaccineuse() {
        return bruM5vaccineuse;
    }

    /**
     * @param bruM5vaccineuse
     */
    public void setBruM5vaccineuse(BigDecimal bruM5vaccineuse) {
        this.bruM5vaccineuse = bruM5vaccineuse;
    }

    /**
     * @return bru_m5NiuImmuneAmount
     */
    public BigDecimal getBruM5niuimmuneamount() {
        return bruM5niuimmuneamount;
    }

    /**
     * @param bruM5niuimmuneamount
     */
    public void setBruM5niuimmuneamount(BigDecimal bruM5niuimmuneamount) {
        this.bruM5niuimmuneamount = bruM5niuimmuneamount;
    }

    /**
     * @return bru_m5NiuShouldAmount
     */
    public BigDecimal getBruM5niushouldamount() {
        return bruM5niushouldamount;
    }

    /**
     * @param bruM5niushouldamount
     */
    public void setBruM5niushouldamount(BigDecimal bruM5niushouldamount) {
        this.bruM5niushouldamount = bruM5niushouldamount;
    }

    /**
     * @return bru_a19VaccineUse
     */
    public BigDecimal getBruA19vaccineuse() {
        return bruA19vaccineuse;
    }

    /**
     * @param bruA19vaccineuse
     */
    public void setBruA19vaccineuse(BigDecimal bruA19vaccineuse) {
        this.bruA19vaccineuse = bruA19vaccineuse;
    }

    /**
     * @return bru_a19NiuImmuneAmount
     */
    public BigDecimal getBruA19niuimmuneamount() {
        return bruA19niuimmuneamount;
    }

    /**
     * @param bruA19niuimmuneamount
     */
    public void setBruA19niuimmuneamount(BigDecimal bruA19niuimmuneamount) {
        this.bruA19niuimmuneamount = bruA19niuimmuneamount;
    }

    /**
     * @return bru_a19NiuShouldAmount
     */
    public BigDecimal getBruA19niushouldamount() {
        return bruA19niushouldamount;
    }

    /**
     * @param bruA19niushouldamount
     */
    public void setBruA19niushouldamount(BigDecimal bruA19niushouldamount) {
        this.bruA19niushouldamount = bruA19niushouldamount;
    }

    /**
     * @return bru_s2SheepImmuneAmount
     */
    public BigDecimal getBruS2sheepimmuneamount() {
        return bruS2sheepimmuneamount;
    }

    /**
     * @param bruS2sheepimmuneamount
     */
    public void setBruS2sheepimmuneamount(BigDecimal bruS2sheepimmuneamount) {
        this.bruS2sheepimmuneamount = bruS2sheepimmuneamount;
    }

    /**
     * @return bru_s2SheepShouldAmount
     */
    public BigDecimal getBruS2sheepshouldamount() {
        return bruS2sheepshouldamount;
    }

    /**
     * @param bruS2sheepshouldamount
     */
    public void setBruS2sheepshouldamount(BigDecimal bruS2sheepshouldamount) {
        this.bruS2sheepshouldamount = bruS2sheepshouldamount;
    }

    /**
     * @return bru_m5SheepImmuneAmount
     */
    public BigDecimal getBruM5sheepimmuneamount() {
        return bruM5sheepimmuneamount;
    }

    /**
     * @param bruM5sheepimmuneamount
     */
    public void setBruM5sheepimmuneamount(BigDecimal bruM5sheepimmuneamount) {
        this.bruM5sheepimmuneamount = bruM5sheepimmuneamount;
    }

    /**
     * @return bru_m5SheepShouldAmount
     */
    public BigDecimal getBruM5sheepshouldamount() {
        return bruM5sheepshouldamount;
    }

    /**
     * @param bruM5sheepshouldamount
     */
    public void setBruM5sheepshouldamount(BigDecimal bruM5sheepshouldamount) {
        this.bruM5sheepshouldamount = bruM5sheepshouldamount;
    }

    /**
     * @return bru_a19SheepImmuneAmount
     */
    public BigDecimal getBruA19sheepimmuneamount() {
        return bruA19sheepimmuneamount;
    }

    /**
     * @param bruA19sheepimmuneamount
     */
    public void setBruA19sheepimmuneamount(BigDecimal bruA19sheepimmuneamount) {
        this.bruA19sheepimmuneamount = bruA19sheepimmuneamount;
    }

    /**
     * @return bru_a19SheepShouldAmount
     */
    public BigDecimal getBruA19sheepshouldamount() {
        return bruA19sheepshouldamount;
    }

    /**
     * @param bruA19sheepshouldamount
     */
    public void setBruA19sheepshouldamount(BigDecimal bruA19sheepshouldamount) {
        this.bruA19sheepshouldamount = bruA19sheepshouldamount;
    }
}