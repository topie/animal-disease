package com.topie.database.core.template.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "b_wechinococciasis")
public class Wechinococciasis {
    @Id
    @Column(name = "ech_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String echId;

    @Column(name = "ech_reportId")
    private String echReportid;

    @Column(name = "ech_date")
    private Date echDate;

    @Column(name = "ech_regionCode")
    private String echRegioncode;

    @Column(name = "ech_regionName")
    private String echRegionname;

    @Column(name = "ech_inactivatedVaccine")
    private BigDecimal echInactivatedvaccine;

    @Column(name = "ech_inactivatedImmuneAmount")
    private BigDecimal echInactivatedimmuneamount;

    @Column(name = "ech_inactivatedShouldAmount")
    private BigDecimal echInactivatedshouldamount;


    /**
     * @return ech_id
     */
    public String getEchId() {
        return echId;
    }

    /**
     * @param echId
     */
    public void setEchId(String echId) {
        this.echId = echId;
    }

    /**
     * @return ech_reportId
     */
    public String getEchReportid() {
        return echReportid;
    }

    /**
     * @param echReportid
     */
    public void setEchReportid(String echReportid) {
        this.echReportid = echReportid;
    }

    /**
     * @return ech_date
     */
    public Date getEchDate() {
        return echDate;
    }

    /**
     * @param echDate
     */
    public void setEchDate(Date echDate) {
        this.echDate = echDate;
    }

    /**
     * @return ech_regionCode
     */
    public String getEchRegioncode() {
        return echRegioncode;
    }

    /**
     * @param echRegioncode
     */
    public void setEchRegioncode(String echRegioncode) {
        this.echRegioncode = echRegioncode;
    }

    /**
     * @return ech_regionName
     */
    public String getEchRegionname() {
        return echRegionname;
    }

    /**
     * @param echRegionname
     */
    public void setEchRegionname(String echRegionname) {
        this.echRegionname = echRegionname;
    }

    /**
     * @return ech_inactivatedVaccine
     */
    public BigDecimal getEchInactivatedvaccine() {
        return echInactivatedvaccine;
    }

    /**
     * @param echInactivatedvaccine
     */
    public void setEchInactivatedvaccine(BigDecimal echInactivatedvaccine) {
        this.echInactivatedvaccine = echInactivatedvaccine;
    }

    /**
     * @return ech_inactivatedImmuneAmount
     */
    public BigDecimal getEchInactivatedimmuneamount() {
        return echInactivatedimmuneamount;
    }

    /**
     * @param echInactivatedimmuneamount
     */
    public void setEchInactivatedimmuneamount(BigDecimal echInactivatedimmuneamount) {
        this.echInactivatedimmuneamount = echInactivatedimmuneamount;
    }

    /**
     * @return ech_inactivatedShouldAmount
     */
    public BigDecimal getEchInactivatedshouldamount() {
        return echInactivatedshouldamount;
    }

    /**
     * @param echInactivatedshouldamount
     */
    public void setEchInactivatedshouldamount(BigDecimal echInactivatedshouldamount) {
        this.echInactivatedshouldamount = echInactivatedshouldamount;
    }


}