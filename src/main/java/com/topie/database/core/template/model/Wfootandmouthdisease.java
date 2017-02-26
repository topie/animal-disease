package com.topie.database.core.template.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "b_wfootandmouthdisease")
public class Wfootandmouthdisease {
    @Id
    @Column(name = "fmd_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String fmdId;

    @Column(name = "fmd_reportId")
    private String fmdReportid;

    @Column(name = "fmd_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fmdDate;

    @Column(name = "fmd_regionCode")
    private String fmdRegioncode;

    @Column(name = "fmd_regionName")
    private String fmdRegionname;

    @Column(name = "fmd_inactivatedVaccine")
    private BigDecimal fmdInactivatedvaccine;

    @Column(name = "fmd_inactivatedImmuneAmountPig")
    private BigDecimal fmdInactivatedimmuneamountpig;

    @Column(name = "fmd_inactivatedImmuneAmountNiu")
    private BigDecimal fmdInactivatedimmuneamountniu;

    @Column(name = "fmd_inactivatedImmuneAmountSheep")
    private BigDecimal fmdInactivatedimmuneamountsheep;

    @Column(name = "fmd_inactivatedImmuneAmountOther")
    private BigDecimal fmdInactivatedimmuneamountother;

    @Column(name = "fmd_inactivatedShouldAmountPig")
    private BigDecimal fmdInactivatedshouldamountpig;

    @Column(name = "fmd_inactivatedShouldAmountNiu")
    private BigDecimal fmdInactivatedshouldamountniu;

    @Column(name = "fmd_inactivatedShouldAmountSheep")
    private BigDecimal fmdInactivatedshouldamountsheep;

    @Column(name = "fmd_inactivatedShouldAmountOther")
    private BigDecimal fmdInactivatedshouldamountother;

    @Column(name = "fmd_syntheticVaccine")
    private BigDecimal fmdSyntheticvaccine;

    @Column(name = "fmd_syntheticImmuneAmountPig")
    private BigDecimal fmdSyntheticimmuneamountpig;

    @Column(name = "fmd_syntheticImmuneAmountNiu")
    private BigDecimal fmdSyntheticimmuneamountniu;

    @Column(name = "fmd_syntheticImmuneAmountSheep")
    private BigDecimal fmdSyntheticimmuneamountsheep;

    @Column(name = "fmd_syntheticImmuneAmountOther")
    private BigDecimal fmdSyntheticimmuneamountother;

    @Column(name = "fmd_O2Vaccine")
    private BigDecimal fmdO2vaccine;

    @Column(name = "fmd_O2ImmuneAmountPig")
    private BigDecimal fmdO2immuneamountpig;

    @Column(name = "fmd_O2ImmuneAmountNiu")
    private BigDecimal fmdO2immuneamountniu;

    @Column(name = "fmd_O2ImmuneAmountSheep")
    private BigDecimal fmdO2immuneamountsheep;

    @Column(name = "fmd_O2ImmuneAmountOther")
    private BigDecimal fmdO2immuneamountother;

    @Column(name = "fmd_OAVaccine")
    private BigDecimal fmdOavaccine;

    @Column(name = "fmd_OAImmuneAmountNiu")
    private BigDecimal fmdOaimmuneamountniu;

    @Column(name = "fmd_OAImmuneAmountSheep")
    private BigDecimal fmdOaimmuneamountsheep;

    @Column(name = "fmd_OAAShudeImmuneAmountNiu")
    private BigDecimal fmdOaashudeimmuneamountniu;

    @Column(name = "fmd_OAAShudeImmuneAmountSheep")
    private BigDecimal fmdOaashudeimmuneamountsheep;

    @Column(name = "fmd_AVaccine")
    private BigDecimal fmdAvaccine;

    @Column(name = "fmd_AImmuneAmountNiu")
    private BigDecimal fmdAimmuneamountniu;

    @Column(name = "fmd_AImmuneAmountSheep")
    private BigDecimal fmdAimmuneamountsheep;

    @Column(name = "fmd_O3Vaccine")
    private BigDecimal fmdO3vaccine;

    @Column(name = "fmd_O3ImmuneAmountPig")
    private BigDecimal fmdO3immuneamountpig;

    @Column(name = "fmd_O3ImmuneAmountNiu")
    private BigDecimal fmdO3immuneamountniu;

    @Column(name = "fmd_O3ImmuneAmountSheep")
    private BigDecimal fmdO3immuneamountsheep;

    @Column(name = "fmd_O3ImmuneAmountOther")
    private BigDecimal fmdO3immuneamountother;

    /**
     * @return fmd_id
     */
    public String getFmdId() {
        return fmdId;
    }

    /**
     * @param fmdId
     */
    public void setFmdId(String fmdId) {
        this.fmdId = fmdId;
    }

    /**
     * @return fmd_reportId
     */
    public String getFmdReportid() {
        return fmdReportid;
    }

    /**
     * @param fmdReportid
     */
    public void setFmdReportid(String fmdReportid) {
        this.fmdReportid = fmdReportid;
    }

    /**
     * @return fmd_date
     */
    @JsonFormat(pattern = "yyyy-MM-dd", timezone = "Asia/Shanghai")
    public Date getFmdDate() {
        return fmdDate;
    }

    /**
     * @param fmdDate
     */
    public void setFmdDate(Date fmdDate) {
        this.fmdDate = fmdDate;
    }

    /**
     * @return fmd_regionCode
     */
    public String getFmdRegioncode() {
        return fmdRegioncode;
    }

    /**
     * @param fmdRegioncode
     */
    public void setFmdRegioncode(String fmdRegioncode) {
        this.fmdRegioncode = fmdRegioncode;
    }

    /**
     * @return fmd_regionName
     */
    public String getFmdRegionname() {
        return fmdRegionname;
    }

    /**
     * @param fmdRegionname
     */
    public void setFmdRegionname(String fmdRegionname) {
        this.fmdRegionname = fmdRegionname;
    }

    /**
     * @return fmd_inactivatedVaccine
     */
    public BigDecimal getFmdInactivatedvaccine() {
        return fmdInactivatedvaccine;
    }

    /**
     * @param fmdInactivatedvaccine
     */
    public void setFmdInactivatedvaccine(BigDecimal fmdInactivatedvaccine) {
        this.fmdInactivatedvaccine = fmdInactivatedvaccine;
    }

    /**
     * @return fmd_inactivatedImmuneAmountPig
     */
    public BigDecimal getFmdInactivatedimmuneamountpig() {
        return fmdInactivatedimmuneamountpig;
    }

    /**
     * @param fmdInactivatedimmuneamountpig
     */
    public void setFmdInactivatedimmuneamountpig(BigDecimal fmdInactivatedimmuneamountpig) {
        this.fmdInactivatedimmuneamountpig = fmdInactivatedimmuneamountpig;
    }

    /**
     * @return fmd_inactivatedImmuneAmountNiu
     */
    public BigDecimal getFmdInactivatedimmuneamountniu() {
        return fmdInactivatedimmuneamountniu;
    }

    /**
     * @param fmdInactivatedimmuneamountniu
     */
    public void setFmdInactivatedimmuneamountniu(BigDecimal fmdInactivatedimmuneamountniu) {
        this.fmdInactivatedimmuneamountniu = fmdInactivatedimmuneamountniu;
    }

    /**
     * @return fmd_inactivatedImmuneAmountSheep
     */
    public BigDecimal getFmdInactivatedimmuneamountsheep() {
        return fmdInactivatedimmuneamountsheep;
    }

    /**
     * @param fmdInactivatedimmuneamountsheep
     */
    public void setFmdInactivatedimmuneamountsheep(BigDecimal fmdInactivatedimmuneamountsheep) {
        this.fmdInactivatedimmuneamountsheep = fmdInactivatedimmuneamountsheep;
    }

    /**
     * @return fmd_inactivatedImmuneAmountOther
     */
    public BigDecimal getFmdInactivatedimmuneamountother() {
        return fmdInactivatedimmuneamountother;
    }

    /**
     * @param fmdInactivatedimmuneamountother
     */
    public void setFmdInactivatedimmuneamountother(BigDecimal fmdInactivatedimmuneamountother) {
        this.fmdInactivatedimmuneamountother = fmdInactivatedimmuneamountother;
    }

    /**
     * @return fmd_inactivatedShouldAmountPig
     */
    public BigDecimal getFmdInactivatedshouldamountpig() {
        return fmdInactivatedshouldamountpig;
    }

    /**
     * @param fmdInactivatedshouldamountpig
     */
    public void setFmdInactivatedshouldamountpig(BigDecimal fmdInactivatedshouldamountpig) {
        this.fmdInactivatedshouldamountpig = fmdInactivatedshouldamountpig;
    }

    /**
     * @return fmd_inactivatedShouldAmountNiu
     */
    public BigDecimal getFmdInactivatedshouldamountniu() {
        return fmdInactivatedshouldamountniu;
    }

    /**
     * @param fmdInactivatedshouldamountniu
     */
    public void setFmdInactivatedshouldamountniu(BigDecimal fmdInactivatedshouldamountniu) {
        this.fmdInactivatedshouldamountniu = fmdInactivatedshouldamountniu;
    }

    /**
     * @return fmd_inactivatedShouldAmountSheep
     */
    public BigDecimal getFmdInactivatedshouldamountsheep() {
        return fmdInactivatedshouldamountsheep;
    }

    /**
     * @param fmdInactivatedshouldamountsheep
     */
    public void setFmdInactivatedshouldamountsheep(BigDecimal fmdInactivatedshouldamountsheep) {
        this.fmdInactivatedshouldamountsheep = fmdInactivatedshouldamountsheep;
    }

    /**
     * @return fmd_inactivatedShouldAmountOther
     */
    public BigDecimal getFmdInactivatedshouldamountother() {
        return fmdInactivatedshouldamountother;
    }

    /**
     * @param fmdInactivatedshouldamountother
     */
    public void setFmdInactivatedshouldamountother(BigDecimal fmdInactivatedshouldamountother) {
        this.fmdInactivatedshouldamountother = fmdInactivatedshouldamountother;
    }

    /**
     * @return fmd_syntheticVaccine
     */
    public BigDecimal getFmdSyntheticvaccine() {
        return fmdSyntheticvaccine;
    }

    /**
     * @param fmdSyntheticvaccine
     */
    public void setFmdSyntheticvaccine(BigDecimal fmdSyntheticvaccine) {
        this.fmdSyntheticvaccine = fmdSyntheticvaccine;
    }

    /**
     * @return fmd_syntheticImmuneAmountPig
     */
    public BigDecimal getFmdSyntheticimmuneamountpig() {
        return fmdSyntheticimmuneamountpig;
    }

    /**
     * @param fmdSyntheticimmuneamountpig
     */
    public void setFmdSyntheticimmuneamountpig(BigDecimal fmdSyntheticimmuneamountpig) {
        this.fmdSyntheticimmuneamountpig = fmdSyntheticimmuneamountpig;
    }

    /**
     * @return fmd_syntheticImmuneAmountNiu
     */
    public BigDecimal getFmdSyntheticimmuneamountniu() {
        return fmdSyntheticimmuneamountniu;
    }

    /**
     * @param fmdSyntheticimmuneamountniu
     */
    public void setFmdSyntheticimmuneamountniu(BigDecimal fmdSyntheticimmuneamountniu) {
        this.fmdSyntheticimmuneamountniu = fmdSyntheticimmuneamountniu;
    }

    /**
     * @return fmd_syntheticImmuneAmountSheep
     */
    public BigDecimal getFmdSyntheticimmuneamountsheep() {
        return fmdSyntheticimmuneamountsheep;
    }

    /**
     * @param fmdSyntheticimmuneamountsheep
     */
    public void setFmdSyntheticimmuneamountsheep(BigDecimal fmdSyntheticimmuneamountsheep) {
        this.fmdSyntheticimmuneamountsheep = fmdSyntheticimmuneamountsheep;
    }

    /**
     * @return fmd_syntheticImmuneAmountOther
     */
    public BigDecimal getFmdSyntheticimmuneamountother() {
        return fmdSyntheticimmuneamountother;
    }

    /**
     * @param fmdSyntheticimmuneamountother
     */
    public void setFmdSyntheticimmuneamountother(BigDecimal fmdSyntheticimmuneamountother) {
        this.fmdSyntheticimmuneamountother = fmdSyntheticimmuneamountother;
    }

    /**
     * @return fmd_O2Vaccine
     */
    public BigDecimal getFmdO2vaccine() {
        return fmdO2vaccine;
    }

    /**
     * @param fmdO2vaccine
     */
    public void setFmdO2vaccine(BigDecimal fmdO2vaccine) {
        this.fmdO2vaccine = fmdO2vaccine;
    }

    /**
     * @return fmd_O2ImmuneAmountPig
     */
    public BigDecimal getFmdO2immuneamountpig() {
        return fmdO2immuneamountpig;
    }

    /**
     * @param fmdO2immuneamountpig
     */
    public void setFmdO2immuneamountpig(BigDecimal fmdO2immuneamountpig) {
        this.fmdO2immuneamountpig = fmdO2immuneamountpig;
    }

    /**
     * @return fmd_O2ImmuneAmountNiu
     */
    public BigDecimal getFmdO2immuneamountniu() {
        return fmdO2immuneamountniu;
    }

    /**
     * @param fmdO2immuneamountniu
     */
    public void setFmdO2immuneamountniu(BigDecimal fmdO2immuneamountniu) {
        this.fmdO2immuneamountniu = fmdO2immuneamountniu;
    }

    /**
     * @return fmd_O2ImmuneAmountSheep
     */
    public BigDecimal getFmdO2immuneamountsheep() {
        return fmdO2immuneamountsheep;
    }

    /**
     * @param fmdO2immuneamountsheep
     */
    public void setFmdO2immuneamountsheep(BigDecimal fmdO2immuneamountsheep) {
        this.fmdO2immuneamountsheep = fmdO2immuneamountsheep;
    }

    /**
     * @return fmd_O2ImmuneAmountOther
     */
    public BigDecimal getFmdO2immuneamountother() {
        return fmdO2immuneamountother;
    }

    /**
     * @param fmdO2immuneamountother
     */
    public void setFmdO2immuneamountother(BigDecimal fmdO2immuneamountother) {
        this.fmdO2immuneamountother = fmdO2immuneamountother;
    }

    /**
     * @return fmd_OAVaccine
     */
    public BigDecimal getFmdOavaccine() {
        return fmdOavaccine;
    }

    /**
     * @param fmdOavaccine
     */
    public void setFmdOavaccine(BigDecimal fmdOavaccine) {
        this.fmdOavaccine = fmdOavaccine;
    }

    /**
     * @return fmd_OAImmuneAmountNiu
     */
    public BigDecimal getFmdOaimmuneamountniu() {
        return fmdOaimmuneamountniu;
    }

    /**
     * @param fmdOaimmuneamountniu
     */
    public void setFmdOaimmuneamountniu(BigDecimal fmdOaimmuneamountniu) {
        this.fmdOaimmuneamountniu = fmdOaimmuneamountniu;
    }

    /**
     * @return fmd_OAImmuneAmountSheep
     */
    public BigDecimal getFmdOaimmuneamountsheep() {
        return fmdOaimmuneamountsheep;
    }

    /**
     * @param fmdOaimmuneamountsheep
     */
    public void setFmdOaimmuneamountsheep(BigDecimal fmdOaimmuneamountsheep) {
        this.fmdOaimmuneamountsheep = fmdOaimmuneamountsheep;
    }

    /**
     * @return fmd_OAAShudeImmuneAmountNiu
     */
    public BigDecimal getFmdOaashudeimmuneamountniu() {
        return fmdOaashudeimmuneamountniu;
    }

    /**
     * @param fmdOaashudeimmuneamountniu
     */
    public void setFmdOaashudeimmuneamountniu(BigDecimal fmdOaashudeimmuneamountniu) {
        this.fmdOaashudeimmuneamountniu = fmdOaashudeimmuneamountniu;
    }

    /**
     * @return fmd_OAAShudeImmuneAmountSheep
     */
    public BigDecimal getFmdOaashudeimmuneamountsheep() {
        return fmdOaashudeimmuneamountsheep;
    }

    /**
     * @param fmdOaashudeimmuneamountsheep
     */
    public void setFmdOaashudeimmuneamountsheep(BigDecimal fmdOaashudeimmuneamountsheep) {
        this.fmdOaashudeimmuneamountsheep = fmdOaashudeimmuneamountsheep;
    }

    /**
     * @return fmd_AVaccine
     */
    public BigDecimal getFmdAvaccine() {
        return fmdAvaccine;
    }

    /**
     * @param fmdAvaccine
     */
    public void setFmdAvaccine(BigDecimal fmdAvaccine) {
        this.fmdAvaccine = fmdAvaccine;
    }

    /**
     * @return fmd_AImmuneAmountNiu
     */
    public BigDecimal getFmdAimmuneamountniu() {
        return fmdAimmuneamountniu;
    }

    /**
     * @param fmdAimmuneamountniu
     */
    public void setFmdAimmuneamountniu(BigDecimal fmdAimmuneamountniu) {
        this.fmdAimmuneamountniu = fmdAimmuneamountniu;
    }

    /**
     * @return fmd_AImmuneAmountSheep
     */
    public BigDecimal getFmdAimmuneamountsheep() {
        return fmdAimmuneamountsheep;
    }

    /**
     * @param fmdAimmuneamountsheep
     */
    public void setFmdAimmuneamountsheep(BigDecimal fmdAimmuneamountsheep) {
        this.fmdAimmuneamountsheep = fmdAimmuneamountsheep;
    }

    /**
     * @return fmd_O3Vaccine
     */
    public BigDecimal getFmdO3vaccine() {
        return fmdO3vaccine;
    }

    /**
     * @param fmdO3vaccine
     */
    public void setFmdO3vaccine(BigDecimal fmdO3vaccine) {
        this.fmdO3vaccine = fmdO3vaccine;
    }

    /**
     * @return fmd_O3ImmuneAmountPig
     */
    public BigDecimal getFmdO3immuneamountpig() {
        return fmdO3immuneamountpig;
    }

    /**
     * @param fmdO3immuneamountpig
     */
    public void setFmdO3immuneamountpig(BigDecimal fmdO3immuneamountpig) {
        this.fmdO3immuneamountpig = fmdO3immuneamountpig;
    }

    /**
     * @return fmd_O3ImmuneAmountNiu
     */
    public BigDecimal getFmdO3immuneamountniu() {
        return fmdO3immuneamountniu;
    }

    /**
     * @param fmdO3immuneamountniu
     */
    public void setFmdO3immuneamountniu(BigDecimal fmdO3immuneamountniu) {
        this.fmdO3immuneamountniu = fmdO3immuneamountniu;
    }

    /**
     * @return fmd_O3ImmuneAmountSheep
     */
    public BigDecimal getFmdO3immuneamountsheep() {
        return fmdO3immuneamountsheep;
    }

    /**
     * @param fmdO3immuneamountsheep
     */
    public void setFmdO3immuneamountsheep(BigDecimal fmdO3immuneamountsheep) {
        this.fmdO3immuneamountsheep = fmdO3immuneamountsheep;
    }

    /**
     * @return fmd_O3ImmuneAmountOther
     */
    public BigDecimal getFmdO3immuneamountother() {
        return fmdO3immuneamountother;
    }

    /**
     * @param fmdO3immuneamountother
     */
    public void setFmdO3immuneamountother(BigDecimal fmdO3immuneamountother) {
        this.fmdO3immuneamountother = fmdO3immuneamountother;
    }
}
