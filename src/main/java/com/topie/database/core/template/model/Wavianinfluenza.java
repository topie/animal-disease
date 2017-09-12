package com.topie.database.core.template.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "b_wavianinfluenza")
public class Wavianinfluenza {
    @Id
    @Column(name = "ai_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String aiId;

    @Column(name = "ai_reportId")
    private String aiReportid;

    @Column(name = "ai_regionCode")
    private String aiRegioncode;

    @Column(name = "ai_regionName")
    private String aiRegionname;

    @Column(name = "ai_date")
    private Date aiDate;

    @Column(name = "ai_inactivatedVaccine")
    private BigDecimal aiInactivatedvaccine;

    @Column(name = "ai_inactivatedImmuneAmountChicken")
    private BigDecimal aiInactivatedimmuneamountchicken;

    @Column(name = "ai_inactivatedImmuneAmountDuck")
    private BigDecimal aiInactivatedimmuneamountduck;

    @Column(name = "ai_inactivatedImmuneAmountGoose")
    private BigDecimal aiInactivatedimmuneamountgoose;

    @Column(name = "ai_inactivatedImmuneAmountOther")
    private BigDecimal aiInactivatedimmuneamountother;

    @Column(name = "ai_inactivatedShouldAmountChicken")
    private BigDecimal aiInactivatedshouldamountchicken;

    @Column(name = "ai_inactivatedShouldAmountDuck")
    private BigDecimal aiInactivatedshouldamountduck;

    @Column(name = "ai_inactivatedShouldAmountGoose")
    private BigDecimal aiInactivatedshouldamountgoose;

    @Column(name = "ai_inactivatedShouldAmountOther")
    private BigDecimal aiInactivatedshouldamountother;

    @Column(name = "ai_jointImmuneAmountChicken")
    private BigDecimal aiJointimmuneamountchicken;

    @Column(name = "ai_jointImmuneAmountDuck")
    private BigDecimal aiJointimmuneamountduck;

    @Column(name = "ai_jointImmuneAmountGoose")
    private BigDecimal aiJointimmuneamountgoose;

    @Column(name = "ai_jointImmuneAmountOther")
    private BigDecimal aiJointimmuneamountother;

    @Column(name = "ai_jointShouldAmountChicken")
    private BigDecimal aiJointshouldamountchicken;

    @Column(name = "ai_jointShouldAmountDuck")
    private BigDecimal aiJointshouldamountduck;

    @Column(name = "ai_jointShouldAmountGoose")
    private BigDecimal aiJointshouldamountgoose;

    @Column(name = "ai_jointShouldAmountOther")
    private BigDecimal aiJointshouldamountother;

    @Column(name = "ai_jointVaccine")
    private BigDecimal aiJointvaccine;


    @Column(name = "ai_H5H7Vaccine")
    private BigDecimal aiH5H7Vaccine;

    @Column(name = "ai_H5H7ImmuneAmountChicken")
    private BigDecimal aiH5H7ImmuneAmountChicken;

    @Column(name = "ai_H5H7ImmuneAmountDuck")
    private BigDecimal aiH5H7ImmuneAmountDuck;

    @Column(name = "ai_H5H7ImmuneAmountGoose")
    private BigDecimal aiH5H7ImmuneAmountGoose;

    @Column(name = "ai_H5H7ImmuneAmountOther")
    private BigDecimal aiH5H7ImmuneAmountOther;

    public void setAiH5H7Vaccine(BigDecimal aiH5H7Vaccine) {
        this.aiH5H7Vaccine = aiH5H7Vaccine;
    }

    public void setAiH5H7ImmuneAmountChicken(BigDecimal aiH5H7ImmuneAmountChicken) {
        this.aiH5H7ImmuneAmountChicken = aiH5H7ImmuneAmountChicken;
    }

    public void setAiH5H7ImmuneAmountDuck(BigDecimal aiH5H7ImmuneAmountDuck) {
        this.aiH5H7ImmuneAmountDuck = aiH5H7ImmuneAmountDuck;
    }

    public void setAiH5H7ImmuneAmountGoose(BigDecimal aiH5H7ImmuneAmountGoose) {
        this.aiH5H7ImmuneAmountGoose = aiH5H7ImmuneAmountGoose;
    }

    public BigDecimal getAiH5H7ImmuneAmountOther() {
        return aiH5H7ImmuneAmountOther;
    }

    public BigDecimal getAiH5H7Vaccine() {
        return aiH5H7Vaccine;
    }

    public BigDecimal getAiH5H7ImmuneAmountChicken() {
        return aiH5H7ImmuneAmountChicken;
    }

    public BigDecimal getAiH5H7ImmuneAmountDuck() {
        return aiH5H7ImmuneAmountDuck;
    }

    public BigDecimal getAiH5H7ImmuneAmountGoose() {
        return aiH5H7ImmuneAmountGoose;
    }

    public void setAiH5H7ImmuneAmountOther(BigDecimal aiH5H7ImmuneAmountOther) {
        this.aiH5H7ImmuneAmountOther = aiH5H7ImmuneAmountOther;
    }

    /**
     * @return ai_id
     */
    public String getAiId() {
        return aiId;
    }

    /**
     * @param aiId
     */
    public void setAiId(String aiId) {
        this.aiId = aiId;
    }

    /**
     * @return ai_reportId
     */
    public String getAiReportid() {
        return aiReportid;
    }

    /**
     * @param aiReportid
     */
    public void setAiReportid(String aiReportid) {
        this.aiReportid = aiReportid;
    }

    /**
     * @return ai_regionCode
     */
    public String getAiRegioncode() {
        return aiRegioncode;
    }

    /**
     * @param aiRegioncode
     */
    public void setAiRegioncode(String aiRegioncode) {
        this.aiRegioncode = aiRegioncode;
    }

    /**
     * @return ai_regionName
     */
    public String getAiRegionname() {
        return aiRegionname;
    }

    /**
     * @param aiRegionname
     */
    public void setAiRegionname(String aiRegionname) {
        this.aiRegionname = aiRegionname;
    }

    /**
     * @return ai_date
     */
    public Date getAiDate() {
        return aiDate;
    }

    /**
     * @param aiDate
     */
    public void setAiDate(Date aiDate) {
        this.aiDate = aiDate;
    }

    /**
     * @return ai_inactivatedVaccine
     */
    public BigDecimal getAiInactivatedvaccine() {
        return aiInactivatedvaccine;
    }

    /**
     * @param aiInactivatedvaccine
     */
    public void setAiInactivatedvaccine(BigDecimal aiInactivatedvaccine) {
        this.aiInactivatedvaccine = aiInactivatedvaccine;
    }

    /**
     * @return ai_inactivatedImmuneAmountChicken
     */
    public BigDecimal getAiInactivatedimmuneamountchicken() {
        return aiInactivatedimmuneamountchicken;
    }

    /**
     * @param aiInactivatedimmuneamountchicken
     */
    public void setAiInactivatedimmuneamountchicken(BigDecimal aiInactivatedimmuneamountchicken) {
        this.aiInactivatedimmuneamountchicken = aiInactivatedimmuneamountchicken;
    }

    /**
     * @return ai_inactivatedImmuneAmountDuck
     */
    public BigDecimal getAiInactivatedimmuneamountduck() {
        return aiInactivatedimmuneamountduck;
    }

    /**
     * @param aiInactivatedimmuneamountduck
     */
    public void setAiInactivatedimmuneamountduck(BigDecimal aiInactivatedimmuneamountduck) {
        this.aiInactivatedimmuneamountduck = aiInactivatedimmuneamountduck;
    }

    /**
     * @return ai_inactivatedImmuneAmountGoose
     */
    public BigDecimal getAiInactivatedimmuneamountgoose() {
        return aiInactivatedimmuneamountgoose;
    }

    /**
     * @param aiInactivatedimmuneamountgoose
     */
    public void setAiInactivatedimmuneamountgoose(BigDecimal aiInactivatedimmuneamountgoose) {
        this.aiInactivatedimmuneamountgoose = aiInactivatedimmuneamountgoose;
    }

    /**
     * @return ai_inactivatedImmuneAmountOther
     */
    public BigDecimal getAiInactivatedimmuneamountother() {
        return aiInactivatedimmuneamountother;
    }

    /**
     * @param aiInactivatedimmuneamountother
     */
    public void setAiInactivatedimmuneamountother(BigDecimal aiInactivatedimmuneamountother) {
        this.aiInactivatedimmuneamountother = aiInactivatedimmuneamountother;
    }

    /**
     * @return ai_inactivatedShouldAmountChicken
     */
    public BigDecimal getAiInactivatedshouldamountchicken() {
        return aiInactivatedshouldamountchicken;
    }

    /**
     * @param aiInactivatedshouldamountchicken
     */
    public void setAiInactivatedshouldamountchicken(BigDecimal aiInactivatedshouldamountchicken) {
        this.aiInactivatedshouldamountchicken = aiInactivatedshouldamountchicken;
    }

    /**
     * @return ai_inactivatedShouldAmountDuck
     */
    public BigDecimal getAiInactivatedshouldamountduck() {
        return aiInactivatedshouldamountduck;
    }

    /**
     * @param aiInactivatedshouldamountduck
     */
    public void setAiInactivatedshouldamountduck(BigDecimal aiInactivatedshouldamountduck) {
        this.aiInactivatedshouldamountduck = aiInactivatedshouldamountduck;
    }

    /**
     * @return ai_inactivatedShouldAmountGoose
     */
    public BigDecimal getAiInactivatedshouldamountgoose() {
        return aiInactivatedshouldamountgoose;
    }

    /**
     * @param aiInactivatedshouldamountgoose
     */
    public void setAiInactivatedshouldamountgoose(BigDecimal aiInactivatedshouldamountgoose) {
        this.aiInactivatedshouldamountgoose = aiInactivatedshouldamountgoose;
    }

    /**
     * @return ai_inactivatedShouldAmountOther
     */
    public BigDecimal getAiInactivatedshouldamountother() {
        return aiInactivatedshouldamountother;
    }

    /**
     * @param aiInactivatedshouldamountother
     */
    public void setAiInactivatedshouldamountother(BigDecimal aiInactivatedshouldamountother) {
        this.aiInactivatedshouldamountother = aiInactivatedshouldamountother;
    }

    /**
     * @return ai_jointImmuneAmountChicken
     */
    public BigDecimal getAiJointimmuneamountchicken() {
        return aiJointimmuneamountchicken;
    }

    /**
     * @param aiJointimmuneamountchicken
     */
    public void setAiJointimmuneamountchicken(BigDecimal aiJointimmuneamountchicken) {
        this.aiJointimmuneamountchicken = aiJointimmuneamountchicken;
    }

    /**
     * @return ai_jointImmuneAmountDuck
     */
    public BigDecimal getAiJointimmuneamountduck() {
        return aiJointimmuneamountduck;
    }

    /**
     * @param aiJointimmuneamountduck
     */
    public void setAiJointimmuneamountduck(BigDecimal aiJointimmuneamountduck) {
        this.aiJointimmuneamountduck = aiJointimmuneamountduck;
    }

    /**
     * @return ai_jointImmuneAmountGoose
     */
    public BigDecimal getAiJointimmuneamountgoose() {
        return aiJointimmuneamountgoose;
    }

    /**
     * @param aiJointimmuneamountgoose
     */
    public void setAiJointimmuneamountgoose(BigDecimal aiJointimmuneamountgoose) {
        this.aiJointimmuneamountgoose = aiJointimmuneamountgoose;
    }

    /**
     * @return ai_jointImmuneAmountOther
     */
    public BigDecimal getAiJointimmuneamountother() {
        return aiJointimmuneamountother;
    }

    /**
     * @param aiJointimmuneamountother
     */
    public void setAiJointimmuneamountother(BigDecimal aiJointimmuneamountother) {
        this.aiJointimmuneamountother = aiJointimmuneamountother;
    }

    /**
     * @return ai_jointShouldAmountChicken
     */
    public BigDecimal getAiJointshouldamountchicken() {
        return aiJointshouldamountchicken;
    }

    /**
     * @param aiJointshouldamountchicken
     */
    public void setAiJointshouldamountchicken(BigDecimal aiJointshouldamountchicken) {
        this.aiJointshouldamountchicken = aiJointshouldamountchicken;
    }

    /**
     * @return ai_jointShouldAmountDuck
     */
    public BigDecimal getAiJointshouldamountduck() {
        return aiJointshouldamountduck;
    }

    /**
     * @param aiJointshouldamountduck
     */
    public void setAiJointshouldamountduck(BigDecimal aiJointshouldamountduck) {
        this.aiJointshouldamountduck = aiJointshouldamountduck;
    }

    /**
     * @return ai_jointShouldAmountGoose
     */
    public BigDecimal getAiJointshouldamountgoose() {
        return aiJointshouldamountgoose;
    }

    /**
     * @param aiJointshouldamountgoose
     */
    public void setAiJointshouldamountgoose(BigDecimal aiJointshouldamountgoose) {
        this.aiJointshouldamountgoose = aiJointshouldamountgoose;
    }

    /**
     * @return ai_jointShouldAmountOther
     */
    public BigDecimal getAiJointshouldamountother() {
        return aiJointshouldamountother;
    }

    /**
     * @param aiJointshouldamountother
     */
    public void setAiJointshouldamountother(BigDecimal aiJointshouldamountother) {
        this.aiJointshouldamountother = aiJointshouldamountother;
    }

    /**
     * @return ai_jointVaccine
     */
    public BigDecimal getAiJointvaccine() {
        return aiJointvaccine;
    }

    /**
     * @param aiJointvaccine
     */
    public void setAiJointvaccine(BigDecimal aiJointvaccine) {
        this.aiJointvaccine = aiJointvaccine;
    }
}