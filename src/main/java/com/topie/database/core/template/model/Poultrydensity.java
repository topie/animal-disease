package com.topie.database.core.template.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "b_poultrydensity")
public class Poultrydensity {

    @Id
    @Column(name = "pd_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String pdId;

    @Column(name = "pd_reportId")
    private String pdReportid;

    @Column(name = "pd_regionCode")
    private String pdRegioncode;

    @Column(name = "pd_regionName")
    private String pdRegionname;

    @Column(name = "pd_date")
    private Date pdDate;

    @Column(name = "pd_chickenHerdsCount")
    private BigDecimal pdChickenherdscount;

    @Column(name = "pd_chickenAShuldCount")
    private BigDecimal pdChickenashuldcount;

    @Column(name = "pd_chickenAActualCount")
    private BigDecimal pdChickenaactualcount;

    @Column(name = "pd_chickenNShuldCount")
    private BigDecimal pdChickennshuldcount;

    @Column(name = "pd_chickenNActualCount")
    private BigDecimal pdChickennactualcount;

    @Column(name = "pd_duckHerdsCount")
    private BigDecimal pdDuckherdscount;

    @Column(name = "pd_duckShuldCount")
    private BigDecimal pdDuckshuldcount;

    @Column(name = "pd_duckActualCount")
    private BigDecimal pdDuckactualcount;

    @Column(name = "pd_gooseHerdsCount")
    private BigDecimal pdGooseherdscount;

    @Column(name = "pd_gooseShuldCount")
    private BigDecimal pdGooseshuldcount;

    @Column(name = "pd_gooseActualCount")
    private BigDecimal pdGooseactualcount;

    @Column(name = "pd_otherHerdsCount")
    private BigDecimal pdOtherherdscount;

    @Column(name = "pd_otherAShuldCount")
    private BigDecimal pdOtherashuldcount;

    @Column(name = "pd_otherAActualCount")
    private BigDecimal pdOtheraactualcount;

    @Column(name = "pd_otherNIAShuldCount")
    private BigDecimal pdOtherniashuldcount;

    @Column(name = "pd_otherNIActualCount")
    private BigDecimal pdOtherniactualcount;

    /**
     * @return pd_id
     */
    public String getPdId() {
        return pdId;
    }

    /**
     * @param pdId
     */
    public void setPdId(String pdId) {
        this.pdId = pdId;
    }

    /**
     * @return pd_reportId
     */
    public String getPdReportid() {
        return pdReportid;
    }

    /**
     * @param pdReportid
     */
    public void setPdReportid(String pdReportid) {
        this.pdReportid = pdReportid;
    }

    /**
     * @return pd_regionCode
     */
    public String getPdRegioncode() {
        return pdRegioncode;
    }

    /**
     * @param pdRegioncode
     */
    public void setPdRegioncode(String pdRegioncode) {
        this.pdRegioncode = pdRegioncode;
    }

    /**
     * @return pd_regionName
     */
    public String getPdRegionname() {
        return pdRegionname;
    }

    /**
     * @param pdRegionname
     */
    public void setPdRegionname(String pdRegionname) {
        this.pdRegionname = pdRegionname;
    }

    /**
     * @return pd_date
     */
    public Date getPdDate() {
        return pdDate;
    }

    /**
     * @param pdDate
     */
    public void setPdDate(Date pdDate) {
        this.pdDate = pdDate;
    }

    /**
     * @return pd_chickenHerdsCount
     */
    public BigDecimal getPdChickenherdscount() {
        return pdChickenherdscount;
    }

    /**
     * @param pdChickenherdscount
     */
    public void setPdChickenherdscount(BigDecimal pdChickenherdscount) {
        this.pdChickenherdscount = pdChickenherdscount;
    }

    /**
     * @return pd_chickenAShuldCount
     */
    public BigDecimal getPdChickenashuldcount() {
        return pdChickenashuldcount;
    }

    /**
     * @param pdChickenashuldcount
     */
    public void setPdChickenashuldcount(BigDecimal pdChickenashuldcount) {
        this.pdChickenashuldcount = pdChickenashuldcount;
    }

    /**
     * @return pd_chickenAActualCount
     */
    public BigDecimal getPdChickenaactualcount() {
        return pdChickenaactualcount;
    }

    /**
     * @param pdChickenaactualcount
     */
    public void setPdChickenaactualcount(BigDecimal pdChickenaactualcount) {
        this.pdChickenaactualcount = pdChickenaactualcount;
    }

    /**
     * @return pd_chickenNShuldCount
     */
    public BigDecimal getPdChickennshuldcount() {
        return pdChickennshuldcount;
    }

    /**
     * @param pdChickennshuldcount
     */
    public void setPdChickennshuldcount(BigDecimal pdChickennshuldcount) {
        this.pdChickennshuldcount = pdChickennshuldcount;
    }

    /**
     * @return pd_chickenNActualCount
     */
    public BigDecimal getPdChickennactualcount() {
        return pdChickennactualcount;
    }

    /**
     * @param pdChickennactualcount
     */
    public void setPdChickennactualcount(BigDecimal pdChickennactualcount) {
        this.pdChickennactualcount = pdChickennactualcount;
    }

    /**
     * @return pd_duckHerdsCount
     */
    public BigDecimal getPdDuckherdscount() {
        return pdDuckherdscount;
    }

    /**
     * @param pdDuckherdscount
     */
    public void setPdDuckherdscount(BigDecimal pdDuckherdscount) {
        this.pdDuckherdscount = pdDuckherdscount;
    }

    /**
     * @return pd_duckShuldCount
     */
    public BigDecimal getPdDuckshuldcount() {
        return pdDuckshuldcount;
    }

    /**
     * @param pdDuckshuldcount
     */
    public void setPdDuckshuldcount(BigDecimal pdDuckshuldcount) {
        this.pdDuckshuldcount = pdDuckshuldcount;
    }

    /**
     * @return pd_duckActualCount
     */
    public BigDecimal getPdDuckactualcount() {
        return pdDuckactualcount;
    }

    /**
     * @param pdDuckactualcount
     */
    public void setPdDuckactualcount(BigDecimal pdDuckactualcount) {
        this.pdDuckactualcount = pdDuckactualcount;
    }

    /**
     * @return pd_gooseHerdsCount
     */
    public BigDecimal getPdGooseherdscount() {
        return pdGooseherdscount;
    }

    /**
     * @param pdGooseherdscount
     */
    public void setPdGooseherdscount(BigDecimal pdGooseherdscount) {
        this.pdGooseherdscount = pdGooseherdscount;
    }

    /**
     * @return pd_gooseShuldCount
     */
    public BigDecimal getPdGooseshuldcount() {
        return pdGooseshuldcount;
    }

    /**
     * @param pdGooseshuldcount
     */
    public void setPdGooseshuldcount(BigDecimal pdGooseshuldcount) {
        this.pdGooseshuldcount = pdGooseshuldcount;
    }

    /**
     * @return pd_gooseActualCount
     */
    public BigDecimal getPdGooseactualcount() {
        return pdGooseactualcount;
    }

    /**
     * @param pdGooseactualcount
     */
    public void setPdGooseactualcount(BigDecimal pdGooseactualcount) {
        this.pdGooseactualcount = pdGooseactualcount;
    }

    /**
     * @return pd_otherHerdsCount
     */
    public BigDecimal getPdOtherherdscount() {
        return pdOtherherdscount;
    }

    /**
     * @param pdOtherherdscount
     */
    public void setPdOtherherdscount(BigDecimal pdOtherherdscount) {
        this.pdOtherherdscount = pdOtherherdscount;
    }

    /**
     * @return pd_otherAShuldCount
     */
    public BigDecimal getPdOtherashuldcount() {
        return pdOtherashuldcount;
    }

    /**
     * @param pdOtherashuldcount
     */
    public void setPdOtherashuldcount(BigDecimal pdOtherashuldcount) {
        this.pdOtherashuldcount = pdOtherashuldcount;
    }

    /**
     * @return pd_otherAActualCount
     */
    public BigDecimal getPdOtheraactualcount() {
        return pdOtheraactualcount;
    }

    /**
     * @param pdOtheraactualcount
     */
    public void setPdOtheraactualcount(BigDecimal pdOtheraactualcount) {
        this.pdOtheraactualcount = pdOtheraactualcount;
    }

    /**
     * @return pd_otherNIAShuldCount
     */
    public BigDecimal getPdOtherniashuldcount() {
        return pdOtherniashuldcount;
    }

    /**
     * @param pdOtherniashuldcount
     */
    public void setPdOtherniashuldcount(BigDecimal pdOtherniashuldcount) {
        this.pdOtherniashuldcount = pdOtherniashuldcount;
    }

    /**
     * @return pd_otherNIActualCount
     */
    public BigDecimal getPdOtherniactualcount() {
        return pdOtherniactualcount;
    }

    /**
     * @param pdOtherniactualcount
     */
    public void setPdOtherniactualcount(BigDecimal pdOtherniactualcount) {
        this.pdOtherniactualcount = pdOtherniactualcount;
    }
}