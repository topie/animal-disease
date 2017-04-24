package com.topie.database.core.template.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "b_echinococciasisvaccine")
public class EchinococciasisVaccine {
    /**
     * ID
     */
    @Id
    @Column(name = "ech_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String echId;

    /**
     * 上报ID
     */
    @Column(name = "ech_reportId")
    private String echReportid;

    /**
     * 机构编码
     */
    @Column(name = "ech_regionCode")
    private String echRegioncode;

    /**
     * 机构名称
     */
    @Column(name = "ech_regionName")
    private String echRegionname;

    /**
     * 填表日期
     */
    @Column(name = "ech_date")
    private Date echDate;

    /**
     * 驱虫药使用数量
     */
    @Column(name = "ech_anthelminticUseCount")
    private BigDecimal echAnthelminticusecount;

    /**
     * 疫苗使用数量
     */
    @Column(name = "ech_vaccineUseCount")
    private BigDecimal echVaccineusecount;

    /**
     * 驱虫药库存数量
     */
    @Column(name = "ech_anthelminticStoreCount")
    private BigDecimal echAnthelminticstorecount;

    /**
     * 疫苗库存数量
     */
    @Column(name = "ech_vaccineStoreCount")
    private BigDecimal echVaccinestorecount;

    /**
     * 驱虫药年使用数量
     */
    @Column(name = "ech_anthelminticYearCount")
    private BigDecimal echAnthelminticyearcount;

    /**
     * 疫苗年使用数量
     */
    @Column(name = "ech_vaccineYearCount")
    private BigDecimal echVaccineyearcount;

    /**
     * 驱虫药其他使用数量
     */
    @Column(name = "ech_anthelminticOtherUseCount")
    private BigDecimal echAnthelminticotherusecount;

    /**
     * 驱虫药其他库存数量
     */
    @Column(name = "ech_anthelminticOtheStoreCount")
    private BigDecimal echAnthelminticothestorecount;

    /**
     * 驱虫药其他年使用数量
     */
    @Column(name = "ech_anthelminticOtheYearCount")
    private BigDecimal echAnthelminticotheyearcount;

    /**
     * 驱虫犬只数量
     */
    @Column(name = "ech_immuneDogCount")
    private BigDecimal echImmunedogcount;

    /**
     * 获取ID
     *
     * @return ech_id - ID
     */
    public String getEchId() {
        return echId;
    }

    /**
     * 设置ID
     *
     * @param echId ID
     */
    public void setEchId(String echId) {
        this.echId = echId;
    }

    /**
     * 获取上报ID
     *
     * @return ech_reportId - 上报ID
     */
    public String getEchReportid() {
        return echReportid;
    }

    /**
     * 设置上报ID
     *
     * @param echReportid 上报ID
     */
    public void setEchReportid(String echReportid) {
        this.echReportid = echReportid;
    }

    /**
     * 获取机构编码
     *
     * @return ech_regionCode - 机构编码
     */
    public String getEchRegioncode() {
        return echRegioncode;
    }

    /**
     * 设置机构编码
     *
     * @param echRegioncode 机构编码
     */
    public void setEchRegioncode(String echRegioncode) {
        this.echRegioncode = echRegioncode;
    }

    /**
     * 获取机构名称
     *
     * @return ech_regionName - 机构名称
     */
    public String getEchRegionname() {
        return echRegionname;
    }

    /**
     * 设置机构名称
     *
     * @param echRegionname 机构名称
     */
    public void setEchRegionname(String echRegionname) {
        this.echRegionname = echRegionname;
    }

    /**
     * 获取填表日期
     *
     * @return ech_date - 填表日期
     */
    public Date getEchDate() {
        return echDate;
    }

    /**
     * 设置填表日期
     *
     * @param echDate 填表日期
     */
    public void setEchDate(Date echDate) {
        this.echDate = echDate;
    }

    /**
     * 获取驱虫药使用数量
     *
     * @return ech_anthelminticUseCount - 驱虫药使用数量
     */
    public BigDecimal getEchAnthelminticusecount() {
        return echAnthelminticusecount;
    }

    /**
     * 设置驱虫药使用数量
     *
     * @param echAnthelminticusecount 驱虫药使用数量
     */
    public void setEchAnthelminticusecount(BigDecimal echAnthelminticusecount) {
        this.echAnthelminticusecount = echAnthelminticusecount;
    }

    /**
     * 获取疫苗使用数量
     *
     * @return ech_vaccineUseCount - 疫苗使用数量
     */
    public BigDecimal getEchVaccineusecount() {
        return echVaccineusecount;
    }

    /**
     * 设置疫苗使用数量
     *
     * @param echVaccineusecount 疫苗使用数量
     */
    public void setEchVaccineusecount(BigDecimal echVaccineusecount) {
        this.echVaccineusecount = echVaccineusecount;
    }

    /**
     * 获取驱虫药库存数量
     *
     * @return ech_anthelminticStoreCount - 驱虫药库存数量
     */
    public BigDecimal getEchAnthelminticstorecount() {
        return echAnthelminticstorecount;
    }

    /**
     * 设置驱虫药库存数量
     *
     * @param echAnthelminticstorecount 驱虫药库存数量
     */
    public void setEchAnthelminticstorecount(BigDecimal echAnthelminticstorecount) {
        this.echAnthelminticstorecount = echAnthelminticstorecount;
    }

    /**
     * 获取疫苗库存数量
     *
     * @return ech_vaccineStoreCount - 疫苗库存数量
     */
    public BigDecimal getEchVaccinestorecount() {
        return echVaccinestorecount;
    }

    /**
     * 设置疫苗库存数量
     *
     * @param echVaccinestorecount 疫苗库存数量
     */
    public void setEchVaccinestorecount(BigDecimal echVaccinestorecount) {
        this.echVaccinestorecount = echVaccinestorecount;
    }

    /**
     * 获取驱虫药年使用数量
     *
     * @return ech_anthelminticYearCount - 驱虫药年使用数量
     */
    public BigDecimal getEchAnthelminticyearcount() {
        return echAnthelminticyearcount;
    }

    /**
     * 设置驱虫药年使用数量
     *
     * @param echAnthelminticyearcount 驱虫药年使用数量
     */
    public void setEchAnthelminticyearcount(BigDecimal echAnthelminticyearcount) {
        this.echAnthelminticyearcount = echAnthelminticyearcount;
    }

    /**
     * 获取疫苗年使用数量
     *
     * @return ech_vaccineYearCount - 疫苗年使用数量
     */
    public BigDecimal getEchVaccineyearcount() {
        return echVaccineyearcount;
    }

    /**
     * 设置疫苗年使用数量
     *
     * @param echVaccineyearcount 疫苗年使用数量
     */
    public void setEchVaccineyearcount(BigDecimal echVaccineyearcount) {
        this.echVaccineyearcount = echVaccineyearcount;
    }

    /**
     * 获取驱虫药其他使用数量
     *
     * @return ech_anthelminticOtherUseCount - 驱虫药其他使用数量
     */
    public BigDecimal getEchAnthelminticotherusecount() {
        return echAnthelminticotherusecount;
    }

    /**
     * 设置驱虫药其他使用数量
     *
     * @param echAnthelminticotherusecount 驱虫药其他使用数量
     */
    public void setEchAnthelminticotherusecount(BigDecimal echAnthelminticotherusecount) {
        this.echAnthelminticotherusecount = echAnthelminticotherusecount;
    }

    /**
     * 获取驱虫药其他库存数量
     *
     * @return ech_anthelminticOtheStoreCount - 驱虫药其他库存数量
     */
    public BigDecimal getEchAnthelminticothestorecount() {
        return echAnthelminticothestorecount;
    }

    /**
     * 设置驱虫药其他库存数量
     *
     * @param echAnthelminticothestorecount 驱虫药其他库存数量
     */
    public void setEchAnthelminticothestorecount(BigDecimal echAnthelminticothestorecount) {
        this.echAnthelminticothestorecount = echAnthelminticothestorecount;
    }

    /**
     * 获取驱虫药其他年使用数量
     *
     * @return ech_anthelminticOtheYearCount - 驱虫药其他年使用数量
     */
    public BigDecimal getEchAnthelminticotheyearcount() {
        return echAnthelminticotheyearcount;
    }

    /**
     * 设置驱虫药其他年使用数量
     *
     * @param echAnthelminticotheyearcount 驱虫药其他年使用数量
     */
    public void setEchAnthelminticotheyearcount(BigDecimal echAnthelminticotheyearcount) {
        this.echAnthelminticotheyearcount = echAnthelminticotheyearcount;
    }

    /**
     * 获取驱虫犬只数量
     *
     * @return ech_immuneDogCount - 驱虫犬只数量
     */
    public BigDecimal getEchImmunedogcount() {
        return echImmunedogcount;
    }

    /**
     * 设置驱虫犬只数量
     *
     * @param echImmunedogcount 驱虫犬只数量
     */
    public void setEchImmunedogcount(BigDecimal echImmunedogcount) {
        this.echImmunedogcount = echImmunedogcount;
    }
}