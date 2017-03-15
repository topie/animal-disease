package com.topie.database.core.template.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "b_classicalswinefever")
public class Classicalswinefever {
    @Id
    @Column(name = "csf_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String csfId;

    @Column(name = "csf_reportId")
    private String csfReportid;

    @Column(name = "csf_date")
    private Date csfDate;

    @Column(name = "csf_regionCode")
    private String csfRegioncode;

    @Column(name = "csf_regionName")
    private String csfRegionname;

    @Column(name = "csf_vaccine")
    private BigDecimal csfVaccine;

    @Column(name = "csf_immuneAmount")
    private BigDecimal csfImmuneamount;

    @Column(name = "csf_shouldAmount")
    private BigDecimal csfShouldamount;

    /**
     * @return csf_id
     */
    public String getCsfId() {
        return csfId;
    }

    /**
     * @param csfId
     */
    public void setCsfId(String csfId) {
        this.csfId = csfId;
    }

    /**
     * @return csf_reportId
     */
    public String getCsfReportid() {
        return csfReportid;
    }

    /**
     * @param csfReportid
     */
    public void setCsfReportid(String csfReportid) {
        this.csfReportid = csfReportid;
    }

    /**
     * @return csf_date
     */
    public Date getCsfDate() {
        return csfDate;
    }

    /**
     * @param csfDate
     */
    public void setCsfDate(Date csfDate) {
        this.csfDate = csfDate;
    }

    /**
     * @return csf_regionCode
     */
    public String getCsfRegioncode() {
        return csfRegioncode;
    }

    /**
     * @param csfRegioncode
     */
    public void setCsfRegioncode(String csfRegioncode) {
        this.csfRegioncode = csfRegioncode;
    }

    /**
     * @return csf_regionName
     */
    public String getCsfRegionname() {
        return csfRegionname;
    }

    /**
     * @param csfRegionname
     */
    public void setCsfRegionname(String csfRegionname) {
        this.csfRegionname = csfRegionname;
    }

    /**
     * @return csf_vaccine
     */
    public BigDecimal getCsfVaccine() {
        return csfVaccine;
    }

    /**
     * @param csfVaccine
     */
    public void setCsfVaccine(BigDecimal csfVaccine) {
        this.csfVaccine = csfVaccine;
    }

    /**
     * @return csf_immuneAmount
     */
    public BigDecimal getCsfImmuneamount() {
        return csfImmuneamount;
    }

    /**
     * @param csfImmuneamount
     */
    public void setCsfImmuneamount(BigDecimal csfImmuneamount) {
        this.csfImmuneamount = csfImmuneamount;
    }

    /**
     * @return csf_shouldAmount
     */
    public BigDecimal getCsfShouldamount() {
        return csfShouldamount;
    }

    /**
     * @param csfShouldamount
     */
    public void setCsfShouldamount(BigDecimal csfShouldamount) {
        this.csfShouldamount = csfShouldamount;
    }
}