package com.topie.database.core.template.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "b_disinfectiondrugs")
public class Disinfectiondrugs {

    @Id
    @Column(name = "df_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String dfId;

    @Column(name = "df_reportId")
    private String dfReportid;

    @Column(name = "df_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date dfDate;

    @Column(name = "df_regionCode")
    private String dfRegioncode;

    @Column(name = "df_drugs")
    private BigDecimal dfDrugs;

    @Column(name = "df_pharmacy")
    private BigDecimal dfPharmacy;

    @Column(name = "df_other")
    private BigDecimal dfOther;

    @Column(name = "df_regionName")
    private String dfRegionname;

    @Column(name = "df_Alldrugs")
    private BigDecimal dfAlldrugs;

    @Column(name = "df_Allpharmacy")
    private BigDecimal dfAllpharmacy;

    @Column(name = "df_Allother")
    private BigDecimal dfAllother;

    @Column(name = "bz")
    private String bz;

    /**
     * @return df_id
     */
    public String getDfId() {
        return dfId;
    }

    /**
     * @param dfId
     */
    public void setDfId(String dfId) {
        this.dfId = dfId;
    }

    /**
     * @return df_reportId
     */
    public String getDfReportid() {
        return dfReportid;
    }

    /**
     * @param dfReportid
     */
    public void setDfReportid(String dfReportid) {
        this.dfReportid = dfReportid;
    }

    /**
     * @return df_date
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Shanghai")
    public Date getDfDate() {
        return dfDate;
    }

    /**
     * @param dfDate
     */
    public void setDfDate(Date dfDate) {
        this.dfDate = dfDate;
    }

    /**
     * @return df_regionCode
     */
    public String getDfRegioncode() {
        return dfRegioncode;
    }

    /**
     * @param dfRegioncode
     */
    public void setDfRegioncode(String dfRegioncode) {
        this.dfRegioncode = dfRegioncode;
    }

    /**
     * @return df_drugs
     */
    public BigDecimal getDfDrugs() {
        return dfDrugs;
    }

    /**
     * @param dfDrugs
     */
    public void setDfDrugs(BigDecimal dfDrugs) {
        this.dfDrugs = dfDrugs;
    }

    /**
     * @return df_pharmacy
     */
    public BigDecimal getDfPharmacy() {
        return dfPharmacy;
    }

    /**
     * @param dfPharmacy
     */
    public void setDfPharmacy(BigDecimal dfPharmacy) {
        this.dfPharmacy = dfPharmacy;
    }

    /**
     * @return df_other
     */
    public BigDecimal getDfOther() {
        return dfOther;
    }

    /**
     * @param dfOther
     */
    public void setDfOther(BigDecimal dfOther) {
        this.dfOther = dfOther;
    }

    /**
     * @return df_regionName
     */
    public String getDfRegionname() {
        return dfRegionname;
    }

    /**
     * @param dfRegionname
     */
    public void setDfRegionname(String dfRegionname) {
        this.dfRegionname = dfRegionname;
    }

    /**
     * @return df_Alldrugs
     */
    public BigDecimal getDfAlldrugs() {
        return dfAlldrugs;
    }

    /**
     * @param dfAlldrugs
     */
    public void setDfAlldrugs(BigDecimal dfAlldrugs) {
        this.dfAlldrugs = dfAlldrugs;
    }

    /**
     * @return df_Allpharmacy
     */
    public BigDecimal getDfAllpharmacy() {
        return dfAllpharmacy;
    }

    /**
     * @param dfAllpharmacy
     */
    public void setDfAllpharmacy(BigDecimal dfAllpharmacy) {
        this.dfAllpharmacy = dfAllpharmacy;
    }

    /**
     * @return df_Allother
     */
    public BigDecimal getDfAllother() {
        return dfAllother;
    }

    /**
     * @param dfAllother
     */
    public void setDfAllother(BigDecimal dfAllother) {
        this.dfAllother = dfAllother;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }
}
