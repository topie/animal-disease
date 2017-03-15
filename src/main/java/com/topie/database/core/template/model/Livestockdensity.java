package com.topie.database.core.template.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "b_livestockdensity")
public class Livestockdensity {
    @Column(name = "ld_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String ldId;

    @Column(name = "ld_reportId")
    private String ldReportid;

    @Column(name = "ld_regionCode")
    private String ldRegioncode;

    @Column(name = "ld_regionName")
    private String ldRegionname;

    @Column(name = "ld_date")
    private Date ldDate;

    @Column(name = "ld_pidHerdsCount")
    private BigDecimal ldPidherdscount;

    @Column(name = "ld_pigOShuldCount")
    private BigDecimal ldPigoshuldcount;

    @Column(name = "ld_pigOActualCount")
    private BigDecimal ldPigoactualcount;

    @Column(name = "ld_pigBShuldCount")
    private BigDecimal ldPigbshuldcount;

    @Column(name = "ld_pigBActualCount")
    private BigDecimal ldPigbactualcount;

    @Column(name = "ld_pigCShuldCount")
    private BigDecimal ldPigcshuldcount;

    @Column(name = "ld_pigCActualCount")
    private BigDecimal ldPigcactualcount;

    @Column(name = "ld_niuHerdsCount")
    private BigDecimal ldNiuherdscount;

    @Column(name = "ld_niuShuldCount")
    private BigDecimal ldNiushuldcount;

    @Column(name = "ld_niuActualCount")
    private BigDecimal ldNiuactualcount;

    @Column(name = "ld_cowHerdsCount")
    private BigDecimal ldCowherdscount;

    @Column(name = "ld_cowShuldCount")
    private BigDecimal ldCowshuldcount;

    @Column(name = "ld_cowActualCount")
    private BigDecimal ldCowactualcount;

    @Column(name = "ld_sheepHerdsCount")
    private BigDecimal ldSheepherdscount;

    @Column(name = "ld_sheepOShuldCount")
    private BigDecimal ldSheeposhuldcount;

    @Column(name = "ld_sheepOActualCount")
    private BigDecimal ldSheepoactualcount;

    @Column(name = "ld_sheepAShuldCount")
    private BigDecimal ldSheepashuldcount;

    @Column(name = "ld_sheepAActualCount")
    private BigDecimal ldSheepaactualcount;

    @Column(name = "ld_otherHerdsCount")
    private BigDecimal ldOtherherdscount;

    @Column(name = "ld_otherOShuldCount")
    private BigDecimal ldOtheroshuldcount;

    @Column(name = "ld_otherOActualCount")
    private BigDecimal ldOtheroactualcount;

    @Column(name = "ld_otherOIShuldCount")
    private BigDecimal ldOtheroishuldcount;

    @Column(name = "ld_otherOIActualCount")
    private BigDecimal ldOtheroiactualcount;

    @Column(name = "ld_pigOIShuldCount")
    private BigDecimal ldPigoishuldcount;

    @Column(name = "ld_pigOIActualCount")
    private BigDecimal ldPigoiactualcount;

    @Column(name = "ld_niuOAIShuldCount")
    private BigDecimal ldNiuoaishuldcount;

    @Column(name = "ld_niuOAIActualCount")
    private BigDecimal ldNiuoaiactualcount;

    @Column(name = "ld_sheepOAIShuldCount")
    private BigDecimal ldSheepoaishuldcount;

    @Column(name = "ld_sheepOAIActualCount")
    private BigDecimal ldSheepoaiactualcount;

    @Column(name = "fv_O3InactivatedUseCount")
    private BigDecimal fvO3inactivatedusecount;

    @Column(name = "fv_O3InactivatedStoreCount")
    private BigDecimal fvO3inactivatedstorecount;

    @Column(name = "fv_O3InactivatedSYearCount")
    private BigDecimal fvO3inactivatedsyearcount;

    @Column(name = "ld_niuAShuldCount")
    private BigDecimal ldNiuashuldcount;

    @Column(name = "ld_niuAActualCount")
    private BigDecimal ldNiuaactualcount;

    @Column(name = "ld_cowOAIShuldCount")
    private BigDecimal ldCowoaishuldcount;

    @Column(name = "ld_cowOAIActualCount")
    private BigDecimal ldCowoaiactualcount;

    @Column(name = "ld_sheepPDPRShuldCount")
    private BigDecimal ldSheeppdprshuldcount;

    @Column(name = "ld_sheepPDPRActualCount")
    private BigDecimal ldSheeppdpractualcount;

    /**
     * @return ld_id
     */
    public String getLdId() {
        return ldId;
    }

    /**
     * @param ldId
     */
    public void setLdId(String ldId) {
        this.ldId = ldId;
    }

    /**
     * @return ld_reportId
     */
    public String getLdReportid() {
        return ldReportid;
    }

    /**
     * @param ldReportid
     */
    public void setLdReportid(String ldReportid) {
        this.ldReportid = ldReportid;
    }

    /**
     * @return ld_regionCode
     */
    public String getLdRegioncode() {
        return ldRegioncode;
    }

    /**
     * @param ldRegioncode
     */
    public void setLdRegioncode(String ldRegioncode) {
        this.ldRegioncode = ldRegioncode;
    }

    /**
     * @return ld_regionName
     */
    public String getLdRegionname() {
        return ldRegionname;
    }

    /**
     * @param ldRegionname
     */
    public void setLdRegionname(String ldRegionname) {
        this.ldRegionname = ldRegionname;
    }

    /**
     * @return ld_date
     */
    public Date getLdDate() {
        return ldDate;
    }

    /**
     * @param ldDate
     */
    public void setLdDate(Date ldDate) {
        this.ldDate = ldDate;
    }

    /**
     * @return ld_pidHerdsCount
     */
    public BigDecimal getLdPidherdscount() {
        return ldPidherdscount;
    }

    /**
     * @param ldPidherdscount
     */
    public void setLdPidherdscount(BigDecimal ldPidherdscount) {
        this.ldPidherdscount = ldPidherdscount;
    }

    /**
     * @return ld_pigOShuldCount
     */
    public BigDecimal getLdPigoshuldcount() {
        return ldPigoshuldcount;
    }

    /**
     * @param ldPigoshuldcount
     */
    public void setLdPigoshuldcount(BigDecimal ldPigoshuldcount) {
        this.ldPigoshuldcount = ldPigoshuldcount;
    }

    /**
     * @return ld_pigOActualCount
     */
    public BigDecimal getLdPigoactualcount() {
        return ldPigoactualcount;
    }

    /**
     * @param ldPigoactualcount
     */
    public void setLdPigoactualcount(BigDecimal ldPigoactualcount) {
        this.ldPigoactualcount = ldPigoactualcount;
    }

    /**
     * @return ld_pigBShuldCount
     */
    public BigDecimal getLdPigbshuldcount() {
        return ldPigbshuldcount;
    }

    /**
     * @param ldPigbshuldcount
     */
    public void setLdPigbshuldcount(BigDecimal ldPigbshuldcount) {
        this.ldPigbshuldcount = ldPigbshuldcount;
    }

    /**
     * @return ld_pigBActualCount
     */
    public BigDecimal getLdPigbactualcount() {
        return ldPigbactualcount;
    }

    /**
     * @param ldPigbactualcount
     */
    public void setLdPigbactualcount(BigDecimal ldPigbactualcount) {
        this.ldPigbactualcount = ldPigbactualcount;
    }

    /**
     * @return ld_pigCShuldCount
     */
    public BigDecimal getLdPigcshuldcount() {
        return ldPigcshuldcount;
    }

    /**
     * @param ldPigcshuldcount
     */
    public void setLdPigcshuldcount(BigDecimal ldPigcshuldcount) {
        this.ldPigcshuldcount = ldPigcshuldcount;
    }

    /**
     * @return ld_pigCActualCount
     */
    public BigDecimal getLdPigcactualcount() {
        return ldPigcactualcount;
    }

    /**
     * @param ldPigcactualcount
     */
    public void setLdPigcactualcount(BigDecimal ldPigcactualcount) {
        this.ldPigcactualcount = ldPigcactualcount;
    }

    /**
     * @return ld_niuHerdsCount
     */
    public BigDecimal getLdNiuherdscount() {
        return ldNiuherdscount;
    }

    /**
     * @param ldNiuherdscount
     */
    public void setLdNiuherdscount(BigDecimal ldNiuherdscount) {
        this.ldNiuherdscount = ldNiuherdscount;
    }

    /**
     * @return ld_niuShuldCount
     */
    public BigDecimal getLdNiushuldcount() {
        return ldNiushuldcount;
    }

    /**
     * @param ldNiushuldcount
     */
    public void setLdNiushuldcount(BigDecimal ldNiushuldcount) {
        this.ldNiushuldcount = ldNiushuldcount;
    }

    /**
     * @return ld_niuActualCount
     */
    public BigDecimal getLdNiuactualcount() {
        return ldNiuactualcount;
    }

    /**
     * @param ldNiuactualcount
     */
    public void setLdNiuactualcount(BigDecimal ldNiuactualcount) {
        this.ldNiuactualcount = ldNiuactualcount;
    }

    /**
     * @return ld_cowHerdsCount
     */
    public BigDecimal getLdCowherdscount() {
        return ldCowherdscount;
    }

    /**
     * @param ldCowherdscount
     */
    public void setLdCowherdscount(BigDecimal ldCowherdscount) {
        this.ldCowherdscount = ldCowherdscount;
    }

    /**
     * @return ld_cowShuldCount
     */
    public BigDecimal getLdCowshuldcount() {
        return ldCowshuldcount;
    }

    /**
     * @param ldCowshuldcount
     */
    public void setLdCowshuldcount(BigDecimal ldCowshuldcount) {
        this.ldCowshuldcount = ldCowshuldcount;
    }

    /**
     * @return ld_cowActualCount
     */
    public BigDecimal getLdCowactualcount() {
        return ldCowactualcount;
    }

    /**
     * @param ldCowactualcount
     */
    public void setLdCowactualcount(BigDecimal ldCowactualcount) {
        this.ldCowactualcount = ldCowactualcount;
    }

    /**
     * @return ld_sheepHerdsCount
     */
    public BigDecimal getLdSheepherdscount() {
        return ldSheepherdscount;
    }

    /**
     * @param ldSheepherdscount
     */
    public void setLdSheepherdscount(BigDecimal ldSheepherdscount) {
        this.ldSheepherdscount = ldSheepherdscount;
    }

    /**
     * @return ld_sheepOShuldCount
     */
    public BigDecimal getLdSheeposhuldcount() {
        return ldSheeposhuldcount;
    }

    /**
     * @param ldSheeposhuldcount
     */
    public void setLdSheeposhuldcount(BigDecimal ldSheeposhuldcount) {
        this.ldSheeposhuldcount = ldSheeposhuldcount;
    }

    /**
     * @return ld_sheepOActualCount
     */
    public BigDecimal getLdSheepoactualcount() {
        return ldSheepoactualcount;
    }

    /**
     * @param ldSheepoactualcount
     */
    public void setLdSheepoactualcount(BigDecimal ldSheepoactualcount) {
        this.ldSheepoactualcount = ldSheepoactualcount;
    }

    /**
     * @return ld_sheepAShuldCount
     */
    public BigDecimal getLdSheepashuldcount() {
        return ldSheepashuldcount;
    }

    /**
     * @param ldSheepashuldcount
     */
    public void setLdSheepashuldcount(BigDecimal ldSheepashuldcount) {
        this.ldSheepashuldcount = ldSheepashuldcount;
    }

    /**
     * @return ld_sheepAActualCount
     */
    public BigDecimal getLdSheepaactualcount() {
        return ldSheepaactualcount;
    }

    /**
     * @param ldSheepaactualcount
     */
    public void setLdSheepaactualcount(BigDecimal ldSheepaactualcount) {
        this.ldSheepaactualcount = ldSheepaactualcount;
    }

    /**
     * @return ld_otherHerdsCount
     */
    public BigDecimal getLdOtherherdscount() {
        return ldOtherherdscount;
    }

    /**
     * @param ldOtherherdscount
     */
    public void setLdOtherherdscount(BigDecimal ldOtherherdscount) {
        this.ldOtherherdscount = ldOtherherdscount;
    }

    /**
     * @return ld_otherOShuldCount
     */
    public BigDecimal getLdOtheroshuldcount() {
        return ldOtheroshuldcount;
    }

    /**
     * @param ldOtheroshuldcount
     */
    public void setLdOtheroshuldcount(BigDecimal ldOtheroshuldcount) {
        this.ldOtheroshuldcount = ldOtheroshuldcount;
    }

    /**
     * @return ld_otherOActualCount
     */
    public BigDecimal getLdOtheroactualcount() {
        return ldOtheroactualcount;
    }

    /**
     * @param ldOtheroactualcount
     */
    public void setLdOtheroactualcount(BigDecimal ldOtheroactualcount) {
        this.ldOtheroactualcount = ldOtheroactualcount;
    }

    /**
     * @return ld_otherOIShuldCount
     */
    public BigDecimal getLdOtheroishuldcount() {
        return ldOtheroishuldcount;
    }

    /**
     * @param ldOtheroishuldcount
     */
    public void setLdOtheroishuldcount(BigDecimal ldOtheroishuldcount) {
        this.ldOtheroishuldcount = ldOtheroishuldcount;
    }

    /**
     * @return ld_otherOIActualCount
     */
    public BigDecimal getLdOtheroiactualcount() {
        return ldOtheroiactualcount;
    }

    /**
     * @param ldOtheroiactualcount
     */
    public void setLdOtheroiactualcount(BigDecimal ldOtheroiactualcount) {
        this.ldOtheroiactualcount = ldOtheroiactualcount;
    }

    /**
     * @return ld_pigOIShuldCount
     */
    public BigDecimal getLdPigoishuldcount() {
        return ldPigoishuldcount;
    }

    /**
     * @param ldPigoishuldcount
     */
    public void setLdPigoishuldcount(BigDecimal ldPigoishuldcount) {
        this.ldPigoishuldcount = ldPigoishuldcount;
    }

    /**
     * @return ld_pigOIActualCount
     */
    public BigDecimal getLdPigoiactualcount() {
        return ldPigoiactualcount;
    }

    /**
     * @param ldPigoiactualcount
     */
    public void setLdPigoiactualcount(BigDecimal ldPigoiactualcount) {
        this.ldPigoiactualcount = ldPigoiactualcount;
    }

    /**
     * @return ld_niuOAIShuldCount
     */
    public BigDecimal getLdNiuoaishuldcount() {
        return ldNiuoaishuldcount;
    }

    /**
     * @param ldNiuoaishuldcount
     */
    public void setLdNiuoaishuldcount(BigDecimal ldNiuoaishuldcount) {
        this.ldNiuoaishuldcount = ldNiuoaishuldcount;
    }

    /**
     * @return ld_niuOAIActualCount
     */
    public BigDecimal getLdNiuoaiactualcount() {
        return ldNiuoaiactualcount;
    }

    /**
     * @param ldNiuoaiactualcount
     */
    public void setLdNiuoaiactualcount(BigDecimal ldNiuoaiactualcount) {
        this.ldNiuoaiactualcount = ldNiuoaiactualcount;
    }

    /**
     * @return ld_sheepOAIShuldCount
     */
    public BigDecimal getLdSheepoaishuldcount() {
        return ldSheepoaishuldcount;
    }

    /**
     * @param ldSheepoaishuldcount
     */
    public void setLdSheepoaishuldcount(BigDecimal ldSheepoaishuldcount) {
        this.ldSheepoaishuldcount = ldSheepoaishuldcount;
    }

    /**
     * @return ld_sheepOAIActualCount
     */
    public BigDecimal getLdSheepoaiactualcount() {
        return ldSheepoaiactualcount;
    }

    /**
     * @param ldSheepoaiactualcount
     */
    public void setLdSheepoaiactualcount(BigDecimal ldSheepoaiactualcount) {
        this.ldSheepoaiactualcount = ldSheepoaiactualcount;
    }

    /**
     * @return fv_O3InactivatedUseCount
     */
    public BigDecimal getFvO3inactivatedusecount() {
        return fvO3inactivatedusecount;
    }

    /**
     * @param fvO3inactivatedusecount
     */
    public void setFvO3inactivatedusecount(BigDecimal fvO3inactivatedusecount) {
        this.fvO3inactivatedusecount = fvO3inactivatedusecount;
    }

    /**
     * @return fv_O3InactivatedStoreCount
     */
    public BigDecimal getFvO3inactivatedstorecount() {
        return fvO3inactivatedstorecount;
    }

    /**
     * @param fvO3inactivatedstorecount
     */
    public void setFvO3inactivatedstorecount(BigDecimal fvO3inactivatedstorecount) {
        this.fvO3inactivatedstorecount = fvO3inactivatedstorecount;
    }

    /**
     * @return fv_O3InactivatedSYearCount
     */
    public BigDecimal getFvO3inactivatedsyearcount() {
        return fvO3inactivatedsyearcount;
    }

    /**
     * @param fvO3inactivatedsyearcount
     */
    public void setFvO3inactivatedsyearcount(BigDecimal fvO3inactivatedsyearcount) {
        this.fvO3inactivatedsyearcount = fvO3inactivatedsyearcount;
    }

    /**
     * @return ld_niuAShuldCount
     */
    public BigDecimal getLdNiuashuldcount() {
        return ldNiuashuldcount;
    }

    /**
     * @param ldNiuashuldcount
     */
    public void setLdNiuashuldcount(BigDecimal ldNiuashuldcount) {
        this.ldNiuashuldcount = ldNiuashuldcount;
    }

    /**
     * @return ld_niuAActualCount
     */
    public BigDecimal getLdNiuaactualcount() {
        return ldNiuaactualcount;
    }

    /**
     * @param ldNiuaactualcount
     */
    public void setLdNiuaactualcount(BigDecimal ldNiuaactualcount) {
        this.ldNiuaactualcount = ldNiuaactualcount;
    }

    /**
     * @return ld_cowOAIShuldCount
     */
    public BigDecimal getLdCowoaishuldcount() {
        return ldCowoaishuldcount;
    }

    /**
     * @param ldCowoaishuldcount
     */
    public void setLdCowoaishuldcount(BigDecimal ldCowoaishuldcount) {
        this.ldCowoaishuldcount = ldCowoaishuldcount;
    }

    /**
     * @return ld_cowOAIActualCount
     */
    public BigDecimal getLdCowoaiactualcount() {
        return ldCowoaiactualcount;
    }

    /**
     * @param ldCowoaiactualcount
     */
    public void setLdCowoaiactualcount(BigDecimal ldCowoaiactualcount) {
        this.ldCowoaiactualcount = ldCowoaiactualcount;
    }

    /**
     * @return ld_sheepPDPRShuldCount
     */
    public BigDecimal getLdSheeppdprshuldcount() {
        return ldSheeppdprshuldcount;
    }

    /**
     * @param ldSheeppdprshuldcount
     */
    public void setLdSheeppdprshuldcount(BigDecimal ldSheeppdprshuldcount) {
        this.ldSheeppdprshuldcount = ldSheeppdprshuldcount;
    }

    /**
     * @return ld_sheepPDPRActualCount
     */
    public BigDecimal getLdSheeppdpractualcount() {
        return ldSheeppdpractualcount;
    }

    /**
     * @param ldSheeppdpractualcount
     */
    public void setLdSheeppdpractualcount(BigDecimal ldSheeppdpractualcount) {
        this.ldSheeppdpractualcount = ldSheeppdpractualcount;
    }
}