package com.topie.database.core.template.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "b_smallruminantsvaccine")
public class Smallruminantsvaccine {
    @Id
    @Column(name = "srv_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String srvId;

    @Column(name = "srv_reportId")
    private String srvReportid;

    @Column(name = "srv_regionCode")
    private String srvRegioncode;

    @Column(name = "srv_regionName")
    private String srvRegionname;

    @Column(name = "srv_date")
    private Date srvDate;

    @Column(name = "srv_H5N2D7UseCount")
    private BigDecimal srvH5n2d7usecount;

    @Column(name = "srv_H5N2D7StoreCount")
    private BigDecimal srvH5n2d7storecount;

    @Column(name = "srv_H5N2D7YearCount")
    private BigDecimal srvH5n2d7yearcount;

    /**
     * @return srv_id
     */
    public String getSrvId() {
        return srvId;
    }

    /**
     * @param srvId
     */
    public void setSrvId(String srvId) {
        this.srvId = srvId;
    }

    /**
     * @return srv_reportId
     */
    public String getSrvReportid() {
        return srvReportid;
    }

    /**
     * @param srvReportid
     */
    public void setSrvReportid(String srvReportid) {
        this.srvReportid = srvReportid;
    }

    /**
     * @return srv_regionCode
     */
    public String getSrvRegioncode() {
        return srvRegioncode;
    }

    /**
     * @param srvRegioncode
     */
    public void setSrvRegioncode(String srvRegioncode) {
        this.srvRegioncode = srvRegioncode;
    }

    /**
     * @return srv_regionName
     */
    public String getSrvRegionname() {
        return srvRegionname;
    }

    /**
     * @param srvRegionname
     */
    public void setSrvRegionname(String srvRegionname) {
        this.srvRegionname = srvRegionname;
    }

    /**
     * @return srv_date
     */
    public Date getSrvDate() {
        return srvDate;
    }

    /**
     * @param srvDate
     */
    public void setSrvDate(Date srvDate) {
        this.srvDate = srvDate;
    }

    /**
     * @return srv_H5N2D7UseCount
     */
    public BigDecimal getSrvH5n2d7usecount() {
        return srvH5n2d7usecount;
    }

    /**
     * @param srvH5n2d7usecount
     */
    public void setSrvH5n2d7usecount(BigDecimal srvH5n2d7usecount) {
        this.srvH5n2d7usecount = srvH5n2d7usecount;
    }

    /**
     * @return srv_H5N2D7StoreCount
     */
    public BigDecimal getSrvH5n2d7storecount() {
        return srvH5n2d7storecount;
    }

    /**
     * @param srvH5n2d7storecount
     */
    public void setSrvH5n2d7storecount(BigDecimal srvH5n2d7storecount) {
        this.srvH5n2d7storecount = srvH5n2d7storecount;
    }

    /**
     * @return srv_H5N2D7YearCount
     */
    public BigDecimal getSrvH5n2d7yearcount() {
        return srvH5n2d7yearcount;
    }

    /**
     * @param srvH5n2d7yearcount
     */
    public void setSrvH5n2d7yearcount(BigDecimal srvH5n2d7yearcount) {
        this.srvH5n2d7yearcount = srvH5n2d7yearcount;
    }
}