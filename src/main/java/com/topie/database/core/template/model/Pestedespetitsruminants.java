package com.topie.database.core.template.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "b_pestedespetitsruminants")
public class Pestedespetitsruminants {
    @Id
    @Column(name = "pdpr_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String pdprId;

    @Column(name = "pdpr_reportId")
    private String pdprReportid;

    @Column(name = "pdpr_date")
    private Date pdprDate;

    @Column(name = "pdpr_regionCode")
    private String pdprRegioncode;

    @Column(name = "pdpr_regionName")
    private String pdprRegionname;

    @Column(name = "pdpr_LiveVaccine")
    private BigDecimal pdprLivevaccine;

    @Column(name = "pdpr_LiveBreedingSheep")
    private BigDecimal pdprLivebreedingsheep;

    @Column(name = "pdpr_LiveGoat")
    private BigDecimal pdprLivegoat;

    @Column(name = "pdpr_LiveSheep")
    private BigDecimal pdprLivesheep;

    @Column(name = "pdpr_Live")
    private BigDecimal pdprLive;

    /**
     * @return pdpr_id
     */
    public String getPdprId() {
        return pdprId;
    }

    /**
     * @param pdprId
     */
    public void setPdprId(String pdprId) {
        this.pdprId = pdprId;
    }

    /**
     * @return pdpr_reportId
     */
    public String getPdprReportid() {
        return pdprReportid;
    }

    /**
     * @param pdprReportid
     */
    public void setPdprReportid(String pdprReportid) {
        this.pdprReportid = pdprReportid;
    }

    /**
     * @return pdpr_date
     */
    public Date getPdprDate() {
        return pdprDate;
    }

    /**
     * @param pdprDate
     */
    public void setPdprDate(Date pdprDate) {
        this.pdprDate = pdprDate;
    }

    /**
     * @return pdpr_regionCode
     */
    public String getPdprRegioncode() {
        return pdprRegioncode;
    }

    /**
     * @param pdprRegioncode
     */
    public void setPdprRegioncode(String pdprRegioncode) {
        this.pdprRegioncode = pdprRegioncode;
    }

    /**
     * @return pdpr_regionName
     */
    public String getPdprRegionname() {
        return pdprRegionname;
    }

    /**
     * @param pdprRegionname
     */
    public void setPdprRegionname(String pdprRegionname) {
        this.pdprRegionname = pdprRegionname;
    }

    /**
     * @return pdpr_LiveVaccine
     */
    public BigDecimal getPdprLivevaccine() {
        return pdprLivevaccine;
    }

    /**
     * @param pdprLivevaccine
     */
    public void setPdprLivevaccine(BigDecimal pdprLivevaccine) {
        this.pdprLivevaccine = pdprLivevaccine;
    }

    /**
     * @return pdpr_LiveBreedingSheep
     */
    public BigDecimal getPdprLivebreedingsheep() {
        return pdprLivebreedingsheep;
    }

    /**
     * @param pdprLivebreedingsheep
     */
    public void setPdprLivebreedingsheep(BigDecimal pdprLivebreedingsheep) {
        this.pdprLivebreedingsheep = pdprLivebreedingsheep;
    }

    /**
     * @return pdpr_LiveGoat
     */
    public BigDecimal getPdprLivegoat() {
        return pdprLivegoat;
    }

    /**
     * @param pdprLivegoat
     */
    public void setPdprLivegoat(BigDecimal pdprLivegoat) {
        this.pdprLivegoat = pdprLivegoat;
    }

    /**
     * @return pdpr_LiveSheep
     */
    public BigDecimal getPdprLivesheep() {
        return pdprLivesheep;
    }

    /**
     * @param pdprLivesheep
     */
    public void setPdprLivesheep(BigDecimal pdprLivesheep) {
        this.pdprLivesheep = pdprLivesheep;
    }

    /**
     * @return pdpr_Live
     */
    public BigDecimal getPdprLive() {
        return pdprLive;
    }

    /**
     * @param pdprLive
     */
    public void setPdprLive(BigDecimal pdprLive) {
        this.pdprLive = pdprLive;
    }
}