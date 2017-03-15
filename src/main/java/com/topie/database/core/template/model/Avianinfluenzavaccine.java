package com.topie.database.core.template.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "b_avianinfluenzavaccine")
public class Avianinfluenzavaccine {
    @Id
    @Column(name = "av_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String avId;

    @Column(name = "av_reportId")
    private String avReportid;

    @Column(name = "av_regionCode")
    private String avRegioncode;

    @Column(name = "av_regionName")
    private String avRegionname;

    @Column(name = "av_date")
    private Date avDate;

    @Column(name = "av_Re5AndRe4UseCount")
    private BigDecimal avRe5andre4usecount;

    @Column(name = "av_rHRH5UseCount")
    private BigDecimal avRhrh5usecount;

    @Column(name = "av_H5N1Re4UseCount")
    private BigDecimal avH5n1re4usecount;

    @Column(name = "av_H5N1Re5UseCount")
    private BigDecimal avH5n1re5usecount;

    @Column(name = "av_H5H9UseCount")
    private BigDecimal avH5h9usecount;

    @Column(name = "av_Re5AndRe4StoreCount")
    private BigDecimal avRe5andre4storecount;

    @Column(name = "av_rHRH5StoreCount")
    private BigDecimal avRhrh5storecount;

    @Column(name = "av_H5N1Re4StoreCount")
    private BigDecimal avH5n1re4storecount;

    @Column(name = "av_H5N1Re5StoreCount")
    private BigDecimal avH5n1re5storecount;

    @Column(name = "av_H5H9StoreCount")
    private BigDecimal avH5h9storecount;

    @Column(name = "av_Re5AndRe4YearCount")
    private BigDecimal avRe5andre4yearcount;

    @Column(name = "av_rHRH5YearCount")
    private BigDecimal avRhrh5yearcount;

    @Column(name = "av_H5N1Re4YearCount")
    private BigDecimal avH5n1re4yearcount;

    @Column(name = "av_H5N1Re5YearCount")
    private BigDecimal avH5n1re5yearcount;

    @Column(name = "av_H5H9YearCount")
    private BigDecimal avH5h9yearcount;

    @Column(name = "av_H5N2D7UseCount")
    private BigDecimal avH5n2d7usecount;

    @Column(name = "av_H5N2D7StoreCount")
    private BigDecimal avH5n2d7storecount;

    @Column(name = "av_H5N2D7YearCount")
    private BigDecimal avH5n2d7yearcount;

    @Column(name = "av_H5N1Re6UseCount")
    private BigDecimal avH5n1re6usecount;

    @Column(name = "av_H5N1Re6StoreCount")
    private BigDecimal avH5n1re6storecount;

    @Column(name = "av_H5N1Re6YearCount")
    private BigDecimal avH5n1re6yearcount;

    @Column(name = "av_H5N1Re7UseCount")
    private BigDecimal avH5n1re7usecount;

    @Column(name = "av_H5N1Re7StoreCount")
    private BigDecimal avH5n1re7storecount;

    @Column(name = "av_H5N1Re7YearCount")
    private BigDecimal avH5n1re7yearcount;

    @Column(name = "av_Re6Re7UseCount")
    private BigDecimal avRe6re7usecount;

    @Column(name = "av_Re6Re7StoreCount")
    private BigDecimal avRe6re7storecount;

    @Column(name = "av_Re6Re7YearCount")
    private BigDecimal avRe6re7yearcount;

    @Column(name = "av_Re6Re8UseCount")
    private BigDecimal avRe6re8usecount;

    @Column(name = "av_Re6Re8StoreCount")
    private BigDecimal avRe6re8storecount;

    @Column(name = "av_Re6Re8YearCount")
    private BigDecimal avRe6re8yearcount;

    @Column(name = "av_Re6Re7Re8UseCount")
    private BigDecimal avRe6re7re8usecount;

    @Column(name = "av_Re6Re7Re8StoreCount")
    private BigDecimal avRe6re7re8storecount;

    @Column(name = "av_Re6Re7Re8YearCount")
    private BigDecimal avRe6re7re8yearcount;

    /**
     * @return av_id
     */
    public String getAvId() {
        return avId;
    }

    /**
     * @param avId
     */
    public void setAvId(String avId) {
        this.avId = avId;
    }

    /**
     * @return av_reportId
     */
    public String getAvReportid() {
        return avReportid;
    }

    /**
     * @param avReportid
     */
    public void setAvReportid(String avReportid) {
        this.avReportid = avReportid;
    }

    /**
     * @return av_regionCode
     */
    public String getAvRegioncode() {
        return avRegioncode;
    }

    /**
     * @param avRegioncode
     */
    public void setAvRegioncode(String avRegioncode) {
        this.avRegioncode = avRegioncode;
    }

    /**
     * @return av_regionName
     */
    public String getAvRegionname() {
        return avRegionname;
    }

    /**
     * @param avRegionname
     */
    public void setAvRegionname(String avRegionname) {
        this.avRegionname = avRegionname;
    }

    /**
     * @return av_date
     */
    public Date getAvDate() {
        return avDate;
    }

    /**
     * @param avDate
     */
    public void setAvDate(Date avDate) {
        this.avDate = avDate;
    }

    /**
     * @return av_Re5AndRe4UseCount
     */
    public BigDecimal getAvRe5andre4usecount() {
        return avRe5andre4usecount;
    }

    /**
     * @param avRe5andre4usecount
     */
    public void setAvRe5andre4usecount(BigDecimal avRe5andre4usecount) {
        this.avRe5andre4usecount = avRe5andre4usecount;
    }

    /**
     * @return av_rHRH5UseCount
     */
    public BigDecimal getAvRhrh5usecount() {
        return avRhrh5usecount;
    }

    /**
     * @param avRhrh5usecount
     */
    public void setAvRhrh5usecount(BigDecimal avRhrh5usecount) {
        this.avRhrh5usecount = avRhrh5usecount;
    }

    /**
     * @return av_H5N1Re4UseCount
     */
    public BigDecimal getAvH5n1re4usecount() {
        return avH5n1re4usecount;
    }

    /**
     * @param avH5n1re4usecount
     */
    public void setAvH5n1re4usecount(BigDecimal avH5n1re4usecount) {
        this.avH5n1re4usecount = avH5n1re4usecount;
    }

    /**
     * @return av_H5N1Re5UseCount
     */
    public BigDecimal getAvH5n1re5usecount() {
        return avH5n1re5usecount;
    }

    /**
     * @param avH5n1re5usecount
     */
    public void setAvH5n1re5usecount(BigDecimal avH5n1re5usecount) {
        this.avH5n1re5usecount = avH5n1re5usecount;
    }

    /**
     * @return av_H5H9UseCount
     */
    public BigDecimal getAvH5h9usecount() {
        return avH5h9usecount;
    }

    /**
     * @param avH5h9usecount
     */
    public void setAvH5h9usecount(BigDecimal avH5h9usecount) {
        this.avH5h9usecount = avH5h9usecount;
    }

    /**
     * @return av_Re5AndRe4StoreCount
     */
    public BigDecimal getAvRe5andre4storecount() {
        return avRe5andre4storecount;
    }

    /**
     * @param avRe5andre4storecount
     */
    public void setAvRe5andre4storecount(BigDecimal avRe5andre4storecount) {
        this.avRe5andre4storecount = avRe5andre4storecount;
    }

    /**
     * @return av_rHRH5StoreCount
     */
    public BigDecimal getAvRhrh5storecount() {
        return avRhrh5storecount;
    }

    /**
     * @param avRhrh5storecount
     */
    public void setAvRhrh5storecount(BigDecimal avRhrh5storecount) {
        this.avRhrh5storecount = avRhrh5storecount;
    }

    /**
     * @return av_H5N1Re4StoreCount
     */
    public BigDecimal getAvH5n1re4storecount() {
        return avH5n1re4storecount;
    }

    /**
     * @param avH5n1re4storecount
     */
    public void setAvH5n1re4storecount(BigDecimal avH5n1re4storecount) {
        this.avH5n1re4storecount = avH5n1re4storecount;
    }

    /**
     * @return av_H5N1Re5StoreCount
     */
    public BigDecimal getAvH5n1re5storecount() {
        return avH5n1re5storecount;
    }

    /**
     * @param avH5n1re5storecount
     */
    public void setAvH5n1re5storecount(BigDecimal avH5n1re5storecount) {
        this.avH5n1re5storecount = avH5n1re5storecount;
    }

    /**
     * @return av_H5H9StoreCount
     */
    public BigDecimal getAvH5h9storecount() {
        return avH5h9storecount;
    }

    /**
     * @param avH5h9storecount
     */
    public void setAvH5h9storecount(BigDecimal avH5h9storecount) {
        this.avH5h9storecount = avH5h9storecount;
    }

    /**
     * @return av_Re5AndRe4YearCount
     */
    public BigDecimal getAvRe5andre4yearcount() {
        return avRe5andre4yearcount;
    }

    /**
     * @param avRe5andre4yearcount
     */
    public void setAvRe5andre4yearcount(BigDecimal avRe5andre4yearcount) {
        this.avRe5andre4yearcount = avRe5andre4yearcount;
    }

    /**
     * @return av_rHRH5YearCount
     */
    public BigDecimal getAvRhrh5yearcount() {
        return avRhrh5yearcount;
    }

    /**
     * @param avRhrh5yearcount
     */
    public void setAvRhrh5yearcount(BigDecimal avRhrh5yearcount) {
        this.avRhrh5yearcount = avRhrh5yearcount;
    }

    /**
     * @return av_H5N1Re4YearCount
     */
    public BigDecimal getAvH5n1re4yearcount() {
        return avH5n1re4yearcount;
    }

    /**
     * @param avH5n1re4yearcount
     */
    public void setAvH5n1re4yearcount(BigDecimal avH5n1re4yearcount) {
        this.avH5n1re4yearcount = avH5n1re4yearcount;
    }

    /**
     * @return av_H5N1Re5YearCount
     */
    public BigDecimal getAvH5n1re5yearcount() {
        return avH5n1re5yearcount;
    }

    /**
     * @param avH5n1re5yearcount
     */
    public void setAvH5n1re5yearcount(BigDecimal avH5n1re5yearcount) {
        this.avH5n1re5yearcount = avH5n1re5yearcount;
    }

    /**
     * @return av_H5H9YearCount
     */
    public BigDecimal getAvH5h9yearcount() {
        return avH5h9yearcount;
    }

    /**
     * @param avH5h9yearcount
     */
    public void setAvH5h9yearcount(BigDecimal avH5h9yearcount) {
        this.avH5h9yearcount = avH5h9yearcount;
    }

    /**
     * @return av_H5N2D7UseCount
     */
    public BigDecimal getAvH5n2d7usecount() {
        return avH5n2d7usecount;
    }

    /**
     * @param avH5n2d7usecount
     */
    public void setAvH5n2d7usecount(BigDecimal avH5n2d7usecount) {
        this.avH5n2d7usecount = avH5n2d7usecount;
    }

    /**
     * @return av_H5N2D7StoreCount
     */
    public BigDecimal getAvH5n2d7storecount() {
        return avH5n2d7storecount;
    }

    /**
     * @param avH5n2d7storecount
     */
    public void setAvH5n2d7storecount(BigDecimal avH5n2d7storecount) {
        this.avH5n2d7storecount = avH5n2d7storecount;
    }

    /**
     * @return av_H5N2D7YearCount
     */
    public BigDecimal getAvH5n2d7yearcount() {
        return avH5n2d7yearcount;
    }

    /**
     * @param avH5n2d7yearcount
     */
    public void setAvH5n2d7yearcount(BigDecimal avH5n2d7yearcount) {
        this.avH5n2d7yearcount = avH5n2d7yearcount;
    }

    /**
     * @return av_H5N1Re6UseCount
     */
    public BigDecimal getAvH5n1re6usecount() {
        return avH5n1re6usecount;
    }

    /**
     * @param avH5n1re6usecount
     */
    public void setAvH5n1re6usecount(BigDecimal avH5n1re6usecount) {
        this.avH5n1re6usecount = avH5n1re6usecount;
    }

    /**
     * @return av_H5N1Re6StoreCount
     */
    public BigDecimal getAvH5n1re6storecount() {
        return avH5n1re6storecount;
    }

    /**
     * @param avH5n1re6storecount
     */
    public void setAvH5n1re6storecount(BigDecimal avH5n1re6storecount) {
        this.avH5n1re6storecount = avH5n1re6storecount;
    }

    /**
     * @return av_H5N1Re6YearCount
     */
    public BigDecimal getAvH5n1re6yearcount() {
        return avH5n1re6yearcount;
    }

    /**
     * @param avH5n1re6yearcount
     */
    public void setAvH5n1re6yearcount(BigDecimal avH5n1re6yearcount) {
        this.avH5n1re6yearcount = avH5n1re6yearcount;
    }

    /**
     * @return av_H5N1Re7UseCount
     */
    public BigDecimal getAvH5n1re7usecount() {
        return avH5n1re7usecount;
    }

    /**
     * @param avH5n1re7usecount
     */
    public void setAvH5n1re7usecount(BigDecimal avH5n1re7usecount) {
        this.avH5n1re7usecount = avH5n1re7usecount;
    }

    /**
     * @return av_H5N1Re7StoreCount
     */
    public BigDecimal getAvH5n1re7storecount() {
        return avH5n1re7storecount;
    }

    /**
     * @param avH5n1re7storecount
     */
    public void setAvH5n1re7storecount(BigDecimal avH5n1re7storecount) {
        this.avH5n1re7storecount = avH5n1re7storecount;
    }

    /**
     * @return av_H5N1Re7YearCount
     */
    public BigDecimal getAvH5n1re7yearcount() {
        return avH5n1re7yearcount;
    }

    /**
     * @param avH5n1re7yearcount
     */
    public void setAvH5n1re7yearcount(BigDecimal avH5n1re7yearcount) {
        this.avH5n1re7yearcount = avH5n1re7yearcount;
    }

    /**
     * @return av_Re6Re7UseCount
     */
    public BigDecimal getAvRe6re7usecount() {
        return avRe6re7usecount;
    }

    /**
     * @param avRe6re7usecount
     */
    public void setAvRe6re7usecount(BigDecimal avRe6re7usecount) {
        this.avRe6re7usecount = avRe6re7usecount;
    }

    /**
     * @return av_Re6Re7StoreCount
     */
    public BigDecimal getAvRe6re7storecount() {
        return avRe6re7storecount;
    }

    /**
     * @param avRe6re7storecount
     */
    public void setAvRe6re7storecount(BigDecimal avRe6re7storecount) {
        this.avRe6re7storecount = avRe6re7storecount;
    }

    /**
     * @return av_Re6Re7YearCount
     */
    public BigDecimal getAvRe6re7yearcount() {
        return avRe6re7yearcount;
    }

    /**
     * @param avRe6re7yearcount
     */
    public void setAvRe6re7yearcount(BigDecimal avRe6re7yearcount) {
        this.avRe6re7yearcount = avRe6re7yearcount;
    }

    /**
     * @return av_Re6Re8UseCount
     */
    public BigDecimal getAvRe6re8usecount() {
        return avRe6re8usecount;
    }

    /**
     * @param avRe6re8usecount
     */
    public void setAvRe6re8usecount(BigDecimal avRe6re8usecount) {
        this.avRe6re8usecount = avRe6re8usecount;
    }

    /**
     * @return av_Re6Re8StoreCount
     */
    public BigDecimal getAvRe6re8storecount() {
        return avRe6re8storecount;
    }

    /**
     * @param avRe6re8storecount
     */
    public void setAvRe6re8storecount(BigDecimal avRe6re8storecount) {
        this.avRe6re8storecount = avRe6re8storecount;
    }

    /**
     * @return av_Re6Re8YearCount
     */
    public BigDecimal getAvRe6re8yearcount() {
        return avRe6re8yearcount;
    }

    /**
     * @param avRe6re8yearcount
     */
    public void setAvRe6re8yearcount(BigDecimal avRe6re8yearcount) {
        this.avRe6re8yearcount = avRe6re8yearcount;
    }

    /**
     * @return av_Re6Re7Re8UseCount
     */
    public BigDecimal getAvRe6re7re8usecount() {
        return avRe6re7re8usecount;
    }

    /**
     * @param avRe6re7re8usecount
     */
    public void setAvRe6re7re8usecount(BigDecimal avRe6re7re8usecount) {
        this.avRe6re7re8usecount = avRe6re7re8usecount;
    }

    /**
     * @return av_Re6Re7Re8StoreCount
     */
    public BigDecimal getAvRe6re7re8storecount() {
        return avRe6re7re8storecount;
    }

    /**
     * @param avRe6re7re8storecount
     */
    public void setAvRe6re7re8storecount(BigDecimal avRe6re7re8storecount) {
        this.avRe6re7re8storecount = avRe6re7re8storecount;
    }

    /**
     * @return av_Re6Re7Re8YearCount
     */
    public BigDecimal getAvRe6re7re8yearcount() {
        return avRe6re7re8yearcount;
    }

    /**
     * @param avRe6re7re8yearcount
     */
    public void setAvRe6re7re8yearcount(BigDecimal avRe6re7re8yearcount) {
        this.avRe6re7re8yearcount = avRe6re7re8yearcount;
    }
}