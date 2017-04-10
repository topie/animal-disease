package com.topie.database.core.template.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "b_kingfisher")
public class Kingfisher {

    @Id
    @Column(name = "kf_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String kfId;

    @Column(name = "kf_reportId")
    private String kfReportid;

    @Column(name = "kf_regionCode")
    private String kfRegioncode;

    @Column(name = "kf_regionName")
    private String kfRegionname;

    @Column(name = "kf_date")
    private Date kfDate;

    @Column(name = "kf_FMKingfisher")
    private BigDecimal kfFmkingfisher;

    @Column(name = "kf_AIKingfisher")
    private BigDecimal kfAikingfisher;

    @Column(name = "kf_BKingfisher")
    private BigDecimal kfBkingfisher;

    @Column(name = "kf_CSKingfisher")
    private BigDecimal kfCskingfisher;

    @Column(name = "kf_otherKingfisher")
    private BigDecimal kfOtherkingfisher;

    @Column(name = "kf_Culling")
    private BigDecimal kfCulling;

    @Column(name = "kf_yearMonitoring")
    private BigDecimal kfYearmonitoring;

    @Column(name = "kf_yearMaterials")
    private BigDecimal kfYearmaterials;

    @Column(name = "kf_yearQuarantine")
    private BigDecimal kfYearquarantine;

    @Column(name = "kf_yearOther")
    private BigDecimal kfYearother;

    @Column(name = "kf_ProvinceVaccine")
    private BigDecimal kfProvincevaccine;

    @Column(name = "kf_ProvinceMonitoring")
    private BigDecimal kfProvincemonitoring;

    @Column(name = "kf_ProvincelQuarantine")
    private BigDecimal kfProvincelquarantine;

    @Column(name = "kf_ProvinceOther")
    private BigDecimal kfProvinceother;

    @Column(name = "kf_levelVaccine")
    private BigDecimal kfLevelvaccine;

    @Column(name = "kf_levelMonitoring")
    private BigDecimal kfLevelmonitoring;

    @Column(name = "kf_levelQuarantine")
    private BigDecimal kfLevelquarantine;

    @Column(name = "kf_levelOther")
    private BigDecimal kfLevelother;

    @Column(name = "kf_PprKingfisher")
    private BigDecimal kfPprKingfisher;

    @Column(name = "kf_BurKingfisher")
    private BigDecimal kfBurKingfisher;

    @Column(name = "kf_EchKingfisher")
    private BigDecimal kfEchKingfisher;

    /**
     * @return kf_id
     */
    public String getKfId() {
        return kfId;
    }

    /**
     * @param kfId
     */
    public void setKfId(String kfId) {
        this.kfId = kfId;
    }

    /**
     * @return kf_reportId
     */
    public String getKfReportid() {
        return kfReportid;
    }

    /**
     * @param kfReportid
     */
    public void setKfReportid(String kfReportid) {
        this.kfReportid = kfReportid;
    }

    /**
     * @return kf_regionCode
     */
    public String getKfRegioncode() {
        return kfRegioncode;
    }

    /**
     * @param kfRegioncode
     */
    public void setKfRegioncode(String kfRegioncode) {
        this.kfRegioncode = kfRegioncode;
    }

    /**
     * @return kf_regionName
     */
    public String getKfRegionname() {
        return kfRegionname;
    }

    /**
     * @param kfRegionname
     */
    public void setKfRegionname(String kfRegionname) {
        this.kfRegionname = kfRegionname;
    }

    /**
     * @return kf_date
     */
    public Date getKfDate() {
        return kfDate;
    }

    /**
     * @param kfDate
     */
    public void setKfDate(Date kfDate) {
        this.kfDate = kfDate;
    }

    /**
     * @return kf_FMKingfisher
     */
    public BigDecimal getKfFmkingfisher() {
        return kfFmkingfisher;
    }

    /**
     * @param kfFmkingfisher
     */
    public void setKfFmkingfisher(BigDecimal kfFmkingfisher) {
        this.kfFmkingfisher = kfFmkingfisher;
    }

    /**
     * @return kf_AIKingfisher
     */
    public BigDecimal getKfAikingfisher() {
        return kfAikingfisher;
    }

    /**
     * @param kfAikingfisher
     */
    public void setKfAikingfisher(BigDecimal kfAikingfisher) {
        this.kfAikingfisher = kfAikingfisher;
    }

    /**
     * @return kf_BKingfisher
     */
    public BigDecimal getKfBkingfisher() {
        return kfBkingfisher;
    }

    /**
     * @param kfBkingfisher
     */
    public void setKfBkingfisher(BigDecimal kfBkingfisher) {
        this.kfBkingfisher = kfBkingfisher;
    }

    /**
     * @return kf_CSKingfisher
     */
    public BigDecimal getKfCskingfisher() {
        return kfCskingfisher;
    }

    /**
     * @param kfCskingfisher
     */
    public void setKfCskingfisher(BigDecimal kfCskingfisher) {
        this.kfCskingfisher = kfCskingfisher;
    }

    /**
     * @return kf_otherKingfisher
     */
    public BigDecimal getKfOtherkingfisher() {
        return kfOtherkingfisher;
    }

    /**
     * @param kfOtherkingfisher
     */
    public void setKfOtherkingfisher(BigDecimal kfOtherkingfisher) {
        this.kfOtherkingfisher = kfOtherkingfisher;
    }

    /**
     * @return kf_Culling
     */
    public BigDecimal getKfCulling() {
        return kfCulling;
    }

    /**
     * @param kfCulling
     */
    public void setKfCulling(BigDecimal kfCulling) {
        this.kfCulling = kfCulling;
    }

    /**
     * @return kf_yearMonitoring
     */
    public BigDecimal getKfYearmonitoring() {
        return kfYearmonitoring;
    }

    /**
     * @param kfYearmonitoring
     */
    public void setKfYearmonitoring(BigDecimal kfYearmonitoring) {
        this.kfYearmonitoring = kfYearmonitoring;
    }

    /**
     * @return kf_yearMaterials
     */
    public BigDecimal getKfYearmaterials() {
        return kfYearmaterials;
    }

    /**
     * @param kfYearmaterials
     */
    public void setKfYearmaterials(BigDecimal kfYearmaterials) {
        this.kfYearmaterials = kfYearmaterials;
    }

    /**
     * @return kf_yearQuarantine
     */
    public BigDecimal getKfYearquarantine() {
        return kfYearquarantine;
    }

    /**
     * @param kfYearquarantine
     */
    public void setKfYearquarantine(BigDecimal kfYearquarantine) {
        this.kfYearquarantine = kfYearquarantine;
    }

    /**
     * @return kf_yearOther
     */
    public BigDecimal getKfYearother() {
        return kfYearother;
    }

    /**
     * @param kfYearother
     */
    public void setKfYearother(BigDecimal kfYearother) {
        this.kfYearother = kfYearother;
    }

    /**
     * @return kf_ProvinceVaccine
     */
    public BigDecimal getKfProvincevaccine() {
        return kfProvincevaccine;
    }

    /**
     * @param kfProvincevaccine
     */
    public void setKfProvincevaccine(BigDecimal kfProvincevaccine) {
        this.kfProvincevaccine = kfProvincevaccine;
    }

    /**
     * @return kf_ProvinceMonitoring
     */
    public BigDecimal getKfProvincemonitoring() {
        return kfProvincemonitoring;
    }

    /**
     * @param kfProvincemonitoring
     */
    public void setKfProvincemonitoring(BigDecimal kfProvincemonitoring) {
        this.kfProvincemonitoring = kfProvincemonitoring;
    }

    /**
     * @return kf_ProvincelQuarantine
     */
    public BigDecimal getKfProvincelquarantine() {
        return kfProvincelquarantine;
    }

    /**
     * @param kfProvincelquarantine
     */
    public void setKfProvincelquarantine(BigDecimal kfProvincelquarantine) {
        this.kfProvincelquarantine = kfProvincelquarantine;
    }

    /**
     * @return kf_ProvinceOther
     */
    public BigDecimal getKfProvinceother() {
        return kfProvinceother;
    }

    /**
     * @param kfProvinceother
     */
    public void setKfProvinceother(BigDecimal kfProvinceother) {
        this.kfProvinceother = kfProvinceother;
    }

    /**
     * @return kf_levelVaccine
     */
    public BigDecimal getKfLevelvaccine() {
        return kfLevelvaccine;
    }

    /**
     * @param kfLevelvaccine
     */
    public void setKfLevelvaccine(BigDecimal kfLevelvaccine) {
        this.kfLevelvaccine = kfLevelvaccine;
    }

    /**
     * @return kf_levelMonitoring
     */
    public BigDecimal getKfLevelmonitoring() {
        return kfLevelmonitoring;
    }

    /**
     * @param kfLevelmonitoring
     */
    public void setKfLevelmonitoring(BigDecimal kfLevelmonitoring) {
        this.kfLevelmonitoring = kfLevelmonitoring;
    }

    /**
     * @return kf_levelQuarantine
     */
    public BigDecimal getKfLevelquarantine() {
        return kfLevelquarantine;
    }

    /**
     * @param kfLevelquarantine
     */
    public void setKfLevelquarantine(BigDecimal kfLevelquarantine) {
        this.kfLevelquarantine = kfLevelquarantine;
    }

    /**
     * @return kf_levelOther
     */
    public BigDecimal getKfLevelother() {
        return kfLevelother;
    }

    /**
     * @param kfLevelother
     */
    public void setKfLevelother(BigDecimal kfLevelother) {
        this.kfLevelother = kfLevelother;
    }

    public BigDecimal getKfPprKingfisher() {
        return kfPprKingfisher;
    }

    public BigDecimal getKfBurKingfisher() {
        return kfBurKingfisher;
    }

    public BigDecimal getKfEchKingfisher() {
        return kfEchKingfisher;
    }

    public void setKfPprKingfisher(BigDecimal kfPprKingfisher) {
        this.kfPprKingfisher = kfPprKingfisher;
    }

    public void setKfBurKingfisher(BigDecimal kfBurKingfisher) {
        this.kfBurKingfisher = kfBurKingfisher;
    }

    public void setKfEchKingfisher(BigDecimal kfEchKingfisher) {
        this.kfEchKingfisher = kfEchKingfisher;
    }
}