package com.topie.database.core.template.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "b_brucellosisdisease")
public class BrucellosisDisease {
    @Id
    @Column(name = "bru_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String bruId;

    @Column(name = "bru_reportId")
    private String bruReportid;

    @Column(name = "bru_date")
    private Date bruDate;

    @Column(name = "bru_regionCode")
    private String bruRegioncode;

    @Column(name = "bru_regionName")
    private String bruRegionname;

    @Column(name = "bru_s2Vaccine")
    private BigDecimal brus2Vaccine;

    @Column(name = "bru_s2NiuImmuneAmount")
    private BigDecimal brus2Niuimmuneamount;

    @Column(name = "bru_s2NiuShouldAmount")
    private BigDecimal brus2Niushouldamount;

    @Column(name = "bru_m5Vaccine")
    private BigDecimal brum5Vaccine;

    @Column(name = "bru_m5NiuImmuneAmount")
    private BigDecimal brum5Niuimmuneamount;

    @Column(name = "bru_m5NiuShouldAmount")
    private BigDecimal brum5Niushouldamount;

    @Column(name = "bru_a19Vaccine")
    private BigDecimal brua19Vaccine;

    @Column(name = "bru_a19NiuImmuneAmount")
    private BigDecimal brua19Niuimmuneamount;

    @Column(name = "bru_a19NiuShouldAmount")
    private BigDecimal brua19Niushouldamount;

    @Column(name = "bru_s2SheepImmuneAmount")
    private BigDecimal brus2Sheepimmuneamount;

    @Column(name = "bru_s2SheepShouldAmount")
    private BigDecimal brus2Sheepshouldamount;

    @Column(name = "bru_m5SheepImmuneAmount")
    private BigDecimal brum5Sheepimmuneamount;

    @Column(name = "bru_m5SheepShouldAmount")
    private BigDecimal brum5Sheepshouldamount;

    @Column(name = "bru_a19SheepImmuneAmount")
    private BigDecimal brua19Sheepimmuneamount;

    @Column(name = "bru_a19SheepShouldAmount")
    private BigDecimal brua19Sheepshouldamount;

    public String getBruId() {
        return bruId;
    }

    public String getBruReportid() {
        return bruReportid;
    }

    public Date getBruDate() {
        return bruDate;
    }

    public String getBruRegioncode() {
        return bruRegioncode;
    }

    public String getBruRegionname() {
        return bruRegionname;
    }

    public BigDecimal getBrus2Vaccine() {
        return brus2Vaccine;
    }

    public BigDecimal getBrus2Niuimmuneamount() {
        return brus2Niuimmuneamount;
    }

    public BigDecimal getBrus2Niushouldamount() {
        return brus2Niushouldamount;
    }

    public BigDecimal getBrum5Vaccine() {
        return brum5Vaccine;
    }

    public BigDecimal getBrum5Niuimmuneamount() {
        return brum5Niuimmuneamount;
    }

    public BigDecimal getBrum5Niushouldamount() {
        return brum5Niushouldamount;
    }

    public BigDecimal getBrua19Vaccine() {
        return brua19Vaccine;
    }

    public BigDecimal getBrua19Niuimmuneamount() {
        return brua19Niuimmuneamount;
    }

    public BigDecimal getBrua19Niushouldamount() {
        return brua19Niushouldamount;
    }

    public BigDecimal getBrus2Sheepimmuneamount() {
        return brus2Sheepimmuneamount;
    }

    public BigDecimal getBrus2Sheepshouldamount() {
        return brus2Sheepshouldamount;
    }

    public BigDecimal getBrum5Sheepimmuneamount() {
        return brum5Sheepimmuneamount;
    }

    public BigDecimal getBrum5Sheepshouldamount() {
        return brum5Sheepshouldamount;
    }

    public BigDecimal getBrua19Sheepimmuneamount() {
        return brua19Sheepimmuneamount;
    }

    public BigDecimal getBrua19Sheepshouldamount() {
        return brua19Sheepshouldamount;
    }

    public void setBruId(String bruId) {
        this.bruId = bruId;
    }

    public void setBruReportid(String bruReportid) {
        this.bruReportid = bruReportid;
    }

    public void setBruDate(Date bruDate) {
        this.bruDate = bruDate;
    }

    public void setBruRegioncode(String bruRegioncode) {
        this.bruRegioncode = bruRegioncode;
    }

    public void setBruRegionname(String bruRegionname) {
        this.bruRegionname = bruRegionname;
    }

    public void setBrus2Vaccine(BigDecimal brus2Vaccine) {
        this.brus2Vaccine = brus2Vaccine;
    }

    public void setBrus2Niuimmuneamount(BigDecimal brus2Niuimmuneamount) {
        this.brus2Niuimmuneamount = brus2Niuimmuneamount;
    }

    public void setBrus2Niushouldamount(BigDecimal brus2Niushouldamount) {
        this.brus2Niushouldamount = brus2Niushouldamount;
    }

    public void setBrum5Vaccine(BigDecimal brum5Vaccine) {
        this.brum5Vaccine = brum5Vaccine;
    }

    public void setBrum5Niuimmuneamount(BigDecimal brum5Niuimmuneamount) {
        this.brum5Niuimmuneamount = brum5Niuimmuneamount;
    }

    public void setBrum5Niushouldamount(BigDecimal brum5Niushouldamount) {
        this.brum5Niushouldamount = brum5Niushouldamount;
    }

    public void setBrua19Vaccine(BigDecimal brua19Vaccine) {
        this.brua19Vaccine = brua19Vaccine;
    }

    public void setBrua19Niuimmuneamount(BigDecimal brua19Niuimmuneamount) {
        this.brua19Niuimmuneamount = brua19Niuimmuneamount;
    }

    public void setBrua19Niushouldamount(BigDecimal brua19Niushouldamount) {
        this.brua19Niushouldamount = brua19Niushouldamount;
    }

    public void setBrus2Sheepimmuneamount(BigDecimal brus2Sheepimmuneamount) {
        this.brus2Sheepimmuneamount = brus2Sheepimmuneamount;
    }

    public void setBrus2Sheepshouldamount(BigDecimal brus2Sheepshouldamount) {
        this.brus2Sheepshouldamount = brus2Sheepshouldamount;
    }

    public void setBrum5Sheepimmuneamount(BigDecimal brum5Sheepimmuneamount) {
        this.brum5Sheepimmuneamount = brum5Sheepimmuneamount;
    }

    public void setBrum5Sheepshouldamount(BigDecimal brum5Sheepshouldamount) {
        this.brum5Sheepshouldamount = brum5Sheepshouldamount;
    }

    public void setBrua19Sheepimmuneamount(BigDecimal brua19Sheepimmuneamount) {
        this.brua19Sheepimmuneamount = brua19Sheepimmuneamount;
    }

    public void setBrua19Sheepshouldamount(BigDecimal brua19Sheepshouldamount) {
        this.brua19Sheepshouldamount = brua19Sheepshouldamount;
    }
}