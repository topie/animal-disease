package com.topie.database.core.template.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "b_wpestedespetitsruminants")
public class Wpestedespetitsruminants {
    @Id
    @Column(name = "wpdr_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String wpdrId;

    @Column(name = "wpdr_reportId")
    private String wpdrReportid;

    @Column(name = "wpdr_date")
    private Date wpdrDate;

    @Column(name = "wpdr_regionCode")
    private String wpdrRegioncode;

    @Column(name = "wpdr_regionName")
    private String wpdrRegionname;

    @Column(name = "wpdr_vaccine")
    private BigDecimal wpdrVaccine;

    @Column(name = "wpdr_immuneAmount")
    private BigDecimal wpdrImmuneamount;

    @Column(name = "wpdr_shouldAmount")
    private BigDecimal wpdrShouldamount;

    /**
     * @return wpdr_id
     */
    public String getWpdrId() {
        return wpdrId;
    }

    /**
     * @param wpdrId
     */
    public void setWpdrId(String wpdrId) {
        this.wpdrId = wpdrId;
    }

    /**
     * @return wpdr_reportId
     */
    public String getWpdrReportid() {
        return wpdrReportid;
    }

    /**
     * @param wpdrReportid
     */
    public void setWpdrReportid(String wpdrReportid) {
        this.wpdrReportid = wpdrReportid;
    }

    /**
     * @return wpdr_date
     */
    public Date getWpdrDate() {
        return wpdrDate;
    }

    /**
     * @param wpdrDate
     */
    public void setWpdrDate(Date wpdrDate) {
        this.wpdrDate = wpdrDate;
    }

    /**
     * @return wpdr_regionCode
     */
    public String getWpdrRegioncode() {
        return wpdrRegioncode;
    }

    /**
     * @param wpdrRegioncode
     */
    public void setWpdrRegioncode(String wpdrRegioncode) {
        this.wpdrRegioncode = wpdrRegioncode;
    }

    /**
     * @return wpdr_regionName
     */
    public String getWpdrRegionname() {
        return wpdrRegionname;
    }

    /**
     * @param wpdrRegionname
     */
    public void setWpdrRegionname(String wpdrRegionname) {
        this.wpdrRegionname = wpdrRegionname;
    }

    /**
     * @return wpdr_vaccine
     */
    public BigDecimal getWpdrVaccine() {
        return wpdrVaccine;
    }

    /**
     * @param wpdrVaccine
     */
    public void setWpdrVaccine(BigDecimal wpdrVaccine) {
        this.wpdrVaccine = wpdrVaccine;
    }

    /**
     * @return wpdr_immuneAmount
     */
    public BigDecimal getWpdrImmuneamount() {
        return wpdrImmuneamount;
    }

    /**
     * @param wpdrImmuneamount
     */
    public void setWpdrImmuneamount(BigDecimal wpdrImmuneamount) {
        this.wpdrImmuneamount = wpdrImmuneamount;
    }

    /**
     * @return wpdr_shouldAmount
     */
    public BigDecimal getWpdrShouldamount() {
        return wpdrShouldamount;
    }

    /**
     * @param wpdrShouldamount
     */
    public void setWpdrShouldamount(BigDecimal wpdrShouldamount) {
        this.wpdrShouldamount = wpdrShouldamount;
    }
}