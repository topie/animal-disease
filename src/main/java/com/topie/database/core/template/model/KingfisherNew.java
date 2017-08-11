package com.topie.database.core.template.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "b_kingfisher_new")
public class KingfisherNew {
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

    @Column(name = "kf_yearYmpt")
    private BigDecimal kfYearympt;

    @Column(name = "kf_yearFyfw")
    private BigDecimal kfYearfyfw;

    @Column(name = "kf_yearOther")
    private BigDecimal kfYearother;

    @Column(name = "kf_yearQzps")
    private BigDecimal kfYearqzps;

    @Column(name = "kf_yearWhhcl")
    private BigDecimal kfYearwhhcl;

    @Column(name = "kf_AllShengYmpt")
    private BigDecimal kfAllshengympt;

    @Column(name = "kf_AllShengFyfw")
    private BigDecimal kfAllshengfyfw;

    @Column(name = "kf_AllShengOther")
    private BigDecimal kfAllshengother;

    @Column(name = "kf_AllShengQzps")
    private BigDecimal kfAllshengqzps;

    @Column(name = "kf_AllShengWhhcl")
    private BigDecimal kfAllshengwhhcl;

    @Column(name = "kf_ShengYmpt")
    private BigDecimal kfShengympt;

    @Column(name = "kf_ShengFyfw")
    private BigDecimal kfShengfyfw;

    @Column(name = "kf_ShengOther")
    private BigDecimal kfShengother;

    @Column(name = "kf_ShengQzps")
    private BigDecimal kfShengqzps;

    @Column(name = "kf_ShengWhhcl")
    private BigDecimal kfShengwhhcl;

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
     * @return kf_yearYmpt
     */
    public BigDecimal getKfYearympt() {
        return kfYearympt;
    }

    /**
     * @param kfYearympt
     */
    public void setKfYearympt(BigDecimal kfYearympt) {
        this.kfYearympt = kfYearympt;
    }

    /**
     * @return kf_yearFyfw
     */
    public BigDecimal getKfYearfyfw() {
        return kfYearfyfw;
    }

    /**
     * @param kfYearfyfw
     */
    public void setKfYearfyfw(BigDecimal kfYearfyfw) {
        this.kfYearfyfw = kfYearfyfw;
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
     * @return kf_yearQzps
     */
    public BigDecimal getKfYearqzps() {
        return kfYearqzps;
    }

    /**
     * @param kfYearqzps
     */
    public void setKfYearqzps(BigDecimal kfYearqzps) {
        this.kfYearqzps = kfYearqzps;
    }

    /**
     * @return kf_yearWhhcl
     */
    public BigDecimal getKfYearwhhcl() {
        return kfYearwhhcl;
    }

    /**
     * @param kfYearwhhcl
     */
    public void setKfYearwhhcl(BigDecimal kfYearwhhcl) {
        this.kfYearwhhcl = kfYearwhhcl;
    }

    /**
     * @return kf_AllShengYmpt
     */
    public BigDecimal getKfAllshengympt() {
        return kfAllshengympt;
    }

    /**
     * @param kfAllshengympt
     */
    public void setKfAllshengympt(BigDecimal kfAllshengympt) {
        this.kfAllshengympt = kfAllshengympt;
    }

    /**
     * @return kf_AllShengFyfw
     */
    public BigDecimal getKfAllshengfyfw() {
        return kfAllshengfyfw;
    }

    /**
     * @param kfAllshengfyfw
     */
    public void setKfAllshengfyfw(BigDecimal kfAllshengfyfw) {
        this.kfAllshengfyfw = kfAllshengfyfw;
    }

    /**
     * @return kf_AllShengOther
     */
    public BigDecimal getKfAllshengother() {
        return kfAllshengother;
    }

    /**
     * @param kfAllshengother
     */
    public void setKfAllshengother(BigDecimal kfAllshengother) {
        this.kfAllshengother = kfAllshengother;
    }

    /**
     * @return kf_AllShengQzps
     */
    public BigDecimal getKfAllshengqzps() {
        return kfAllshengqzps;
    }

    /**
     * @param kfAllshengqzps
     */
    public void setKfAllshengqzps(BigDecimal kfAllshengqzps) {
        this.kfAllshengqzps = kfAllshengqzps;
    }

    /**
     * @return kf_AllShengWhhcl
     */
    public BigDecimal getKfAllshengwhhcl() {
        return kfAllshengwhhcl;
    }

    /**
     * @param kfAllshengwhhcl
     */
    public void setKfAllshengwhhcl(BigDecimal kfAllshengwhhcl) {
        this.kfAllshengwhhcl = kfAllshengwhhcl;
    }

    /**
     * @return kf_ShengYmpt
     */
    public BigDecimal getKfShengympt() {
        return kfShengympt;
    }

    /**
     * @param kfShengympt
     */
    public void setKfShengympt(BigDecimal kfShengympt) {
        this.kfShengympt = kfShengympt;
    }

    /**
     * @return kf_ShengFyfw
     */
    public BigDecimal getKfShengfyfw() {
        return kfShengfyfw;
    }

    /**
     * @param kfShengfyfw
     */
    public void setKfShengfyfw(BigDecimal kfShengfyfw) {
        this.kfShengfyfw = kfShengfyfw;
    }

    /**
     * @return kf_ShengOther
     */
    public BigDecimal getKfShengother() {
        return kfShengother;
    }

    /**
     * @param kfShengother
     */
    public void setKfShengother(BigDecimal kfShengother) {
        this.kfShengother = kfShengother;
    }

    /**
     * @return kf_ShengQzps
     */
    public BigDecimal getKfShengqzps() {
        return kfShengqzps;
    }

    /**
     * @param kfShengqzps
     */
    public void setKfShengqzps(BigDecimal kfShengqzps) {
        this.kfShengqzps = kfShengqzps;
    }

    /**
     * @return kf_ShengWhhcl
     */
    public BigDecimal getKfShengwhhcl() {
        return kfShengwhhcl;
    }

    /**
     * @param kfShengwhhcl
     */
    public void setKfShengwhhcl(BigDecimal kfShengwhhcl) {
        this.kfShengwhhcl = kfShengwhhcl;
    }
}