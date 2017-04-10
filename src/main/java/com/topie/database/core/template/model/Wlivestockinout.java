package com.topie.database.core.template.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "b_wlivestockinout")
public class Wlivestockinout {
    @Id
    @Column(name = "LivestockId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String livestockid;

    @Column(name = "ReportId")
    private String reportid;

    @Column(name = "Liv_regionCode")
    private String livRegioncode;

    @Column(name = "Liv_regionName")
    private String livRegionname;

    @Column(name = "LivestockDate")
    private Date livestockdate;

    @Column(name = "HerdsPig")
    private BigDecimal herdspig;

    @Column(name = "HerdsNiu")
    private BigDecimal herdsniu;

    @Column(name = "HerdsSheep")
    private BigDecimal herdssheep;

    @Column(name = "HerdsOther")
    private BigDecimal herdsother;

    @Column(name = "HerdsChicken")
    private BigDecimal herdschicken;

    @Column(name = "HerdsDuck")
    private BigDecimal herdsduck;

    @Column(name = "HerdsGoose")
    private BigDecimal herdsgoose;

    @Column(name = "HerdsOtherQ")
    private BigDecimal herdsotherq;

    @Column(name = "ImmuneBirdFluChecken")
    private BigDecimal immunebirdfluchecken;

    @Column(name = "ImmuneBirdFluDuck")
    private BigDecimal immunebirdfluduck;

    @Column(name = "ImmuneBirdFluGoose")
    private BigDecimal immunebirdflugoose;

    @Column(name = "ImmuneBirdFluOther")
    private BigDecimal immunebirdfluother;

    @Column(name = "ImmuneAFMDNiu")
    private BigDecimal immuneafmdniu;

    @Column(name = "ImmuneAFMDSheep")
    private BigDecimal immuneafmdsheep;

    @Column(name = "ImmuneBlueEar")
    private BigDecimal immuneblueear;

    @Column(name = "ImmuneSwine")
    private BigDecimal immuneswine;

    @Column(name = "ImmuneNewcastle")
    private BigDecimal immunenewcastle;

    @Column(name = "ImmuneFMDPig")
    private BigDecimal immunefmdpig;

    @Column(name = "ImmuneFMDNiu")
    private BigDecimal immunefmdniu;

    @Column(name = "ImmuneFMDSheep")
    private BigDecimal immunefmdsheep;

    @Column(name = "ImmuneFMDOther")
    private BigDecimal immunefmdother;

    @Column(name = "PesteDesPetitsRuminants")
    private BigDecimal pestedespetitsruminants;

    @Column(name = "ImmuneBruniu")
    private BigDecimal immuneBruniu;

    @Column(name = "ImmuneBruSheep")
    private BigDecimal immuneBruSheep;

    @Column(name = "ImmuneEchSheep")
    private BigDecimal immuneEchSheep;

    /**
     * @return LivestockId
     */
    public String getLivestockid() {
        return livestockid;
    }

    /**
     * @param livestockid
     */
    public void setLivestockid(String livestockid) {
        this.livestockid = livestockid;
    }

    /**
     * @return ReportId
     */
    public String getReportid() {
        return reportid;
    }

    /**
     * @param reportid
     */
    public void setReportid(String reportid) {
        this.reportid = reportid;
    }

    /**
     * @return Liv_regionCode
     */
    public String getLivRegioncode() {
        return livRegioncode;
    }

    /**
     * @param livRegioncode
     */
    public void setLivRegioncode(String livRegioncode) {
        this.livRegioncode = livRegioncode;
    }

    /**
     * @return Liv_regionName
     */
    public String getLivRegionname() {
        return livRegionname;
    }

    /**
     * @param livRegionname
     */
    public void setLivRegionname(String livRegionname) {
        this.livRegionname = livRegionname;
    }

    /**
     * @return LivestockDate
     */
    public Date getLivestockdate() {
        return livestockdate;
    }

    /**
     * @param livestockdate
     */
    public void setLivestockdate(Date livestockdate) {
        this.livestockdate = livestockdate;
    }

    /**
     * @return HerdsPig
     */
    public BigDecimal getHerdspig() {
        return herdspig;
    }

    /**
     * @param herdspig
     */
    public void setHerdspig(BigDecimal herdspig) {
        this.herdspig = herdspig;
    }

    /**
     * @return HerdsNiu
     */
    public BigDecimal getHerdsniu() {
        return herdsniu;
    }

    /**
     * @param herdsniu
     */
    public void setHerdsniu(BigDecimal herdsniu) {
        this.herdsniu = herdsniu;
    }

    /**
     * @return HerdsSheep
     */
    public BigDecimal getHerdssheep() {
        return herdssheep;
    }

    /**
     * @param herdssheep
     */
    public void setHerdssheep(BigDecimal herdssheep) {
        this.herdssheep = herdssheep;
    }

    /**
     * @return HerdsOther
     */
    public BigDecimal getHerdsother() {
        return herdsother;
    }

    /**
     * @param herdsother
     */
    public void setHerdsother(BigDecimal herdsother) {
        this.herdsother = herdsother;
    }

    /**
     * @return HerdsChicken
     */
    public BigDecimal getHerdschicken() {
        return herdschicken;
    }

    /**
     * @param herdschicken
     */
    public void setHerdschicken(BigDecimal herdschicken) {
        this.herdschicken = herdschicken;
    }

    /**
     * @return HerdsDuck
     */
    public BigDecimal getHerdsduck() {
        return herdsduck;
    }

    /**
     * @param herdsduck
     */
    public void setHerdsduck(BigDecimal herdsduck) {
        this.herdsduck = herdsduck;
    }

    /**
     * @return HerdsGoose
     */
    public BigDecimal getHerdsgoose() {
        return herdsgoose;
    }

    /**
     * @param herdsgoose
     */
    public void setHerdsgoose(BigDecimal herdsgoose) {
        this.herdsgoose = herdsgoose;
    }

    /**
     * @return HerdsOtherQ
     */
    public BigDecimal getHerdsotherq() {
        return herdsotherq;
    }

    /**
     * @param herdsotherq
     */
    public void setHerdsotherq(BigDecimal herdsotherq) {
        this.herdsotherq = herdsotherq;
    }

    /**
     * @return ImmuneBirdFluChecken
     */
    public BigDecimal getImmunebirdfluchecken() {
        return immunebirdfluchecken;
    }

    /**
     * @param immunebirdfluchecken
     */
    public void setImmunebirdfluchecken(BigDecimal immunebirdfluchecken) {
        this.immunebirdfluchecken = immunebirdfluchecken;
    }

    /**
     * @return ImmuneBirdFluDuck
     */
    public BigDecimal getImmunebirdfluduck() {
        return immunebirdfluduck;
    }

    /**
     * @param immunebirdfluduck
     */
    public void setImmunebirdfluduck(BigDecimal immunebirdfluduck) {
        this.immunebirdfluduck = immunebirdfluduck;
    }

    /**
     * @return ImmuneBirdFluGoose
     */
    public BigDecimal getImmunebirdflugoose() {
        return immunebirdflugoose;
    }

    /**
     * @param immunebirdflugoose
     */
    public void setImmunebirdflugoose(BigDecimal immunebirdflugoose) {
        this.immunebirdflugoose = immunebirdflugoose;
    }

    /**
     * @return ImmuneBirdFluOther
     */
    public BigDecimal getImmunebirdfluother() {
        return immunebirdfluother;
    }

    /**
     * @param immunebirdfluother
     */
    public void setImmunebirdfluother(BigDecimal immunebirdfluother) {
        this.immunebirdfluother = immunebirdfluother;
    }

    /**
     * @return ImmuneAFMDNiu
     */
    public BigDecimal getImmuneafmdniu() {
        return immuneafmdniu;
    }

    /**
     * @param immuneafmdniu
     */
    public void setImmuneafmdniu(BigDecimal immuneafmdniu) {
        this.immuneafmdniu = immuneafmdniu;
    }

    /**
     * @return ImmuneAFMDSheep
     */
    public BigDecimal getImmuneafmdsheep() {
        return immuneafmdsheep;
    }

    /**
     * @param immuneafmdsheep
     */
    public void setImmuneafmdsheep(BigDecimal immuneafmdsheep) {
        this.immuneafmdsheep = immuneafmdsheep;
    }

    /**
     * @return ImmuneBlueEar
     */
    public BigDecimal getImmuneblueear() {
        return immuneblueear;
    }

    /**
     * @param immuneblueear
     */
    public void setImmuneblueear(BigDecimal immuneblueear) {
        this.immuneblueear = immuneblueear;
    }

    /**
     * @return ImmuneSwine
     */
    public BigDecimal getImmuneswine() {
        return immuneswine;
    }

    /**
     * @param immuneswine
     */
    public void setImmuneswine(BigDecimal immuneswine) {
        this.immuneswine = immuneswine;
    }

    /**
     * @return ImmuneNewcastle
     */
    public BigDecimal getImmunenewcastle() {
        return immunenewcastle;
    }

    /**
     * @param immunenewcastle
     */
    public void setImmunenewcastle(BigDecimal immunenewcastle) {
        this.immunenewcastle = immunenewcastle;
    }

    /**
     * @return ImmuneFMDPig
     */
    public BigDecimal getImmunefmdpig() {
        return immunefmdpig;
    }

    /**
     * @param immunefmdpig
     */
    public void setImmunefmdpig(BigDecimal immunefmdpig) {
        this.immunefmdpig = immunefmdpig;
    }

    /**
     * @return ImmuneFMDNiu
     */
    public BigDecimal getImmunefmdniu() {
        return immunefmdniu;
    }

    /**
     * @param immunefmdniu
     */
    public void setImmunefmdniu(BigDecimal immunefmdniu) {
        this.immunefmdniu = immunefmdniu;
    }

    /**
     * @return ImmuneFMDSheep
     */
    public BigDecimal getImmunefmdsheep() {
        return immunefmdsheep;
    }

    /**
     * @param immunefmdsheep
     */
    public void setImmunefmdsheep(BigDecimal immunefmdsheep) {
        this.immunefmdsheep = immunefmdsheep;
    }

    /**
     * @return ImmuneFMDOther
     */
    public BigDecimal getImmunefmdother() {
        return immunefmdother;
    }

    /**
     * @param immunefmdother
     */
    public void setImmunefmdother(BigDecimal immunefmdother) {
        this.immunefmdother = immunefmdother;
    }

    /**
     * @return PesteDesPetitsRuminants
     */
    public BigDecimal getPestedespetitsruminants() {
        return pestedespetitsruminants;
    }

    /**
     * @param pestedespetitsruminants
     */
    public void setPestedespetitsruminants(BigDecimal pestedespetitsruminants) {
        this.pestedespetitsruminants = pestedespetitsruminants;
    }

    public BigDecimal getImmuneBruniu() {
        return immuneBruniu;
    }

    public BigDecimal getImmuneBruSheep() {
        return immuneBruSheep;
    }

    public BigDecimal getImmuneEchSheep() {
        return immuneEchSheep;
    }

    public void setImmuneBruniu(BigDecimal immuneBruniu) {
        this.immuneBruniu = immuneBruniu;
    }

    public void setImmuneBruSheep(BigDecimal immuneBruSheep) {
        this.immuneBruSheep = immuneBruSheep;
    }

    public void setImmuneEchSheep(BigDecimal immuneEchSheep) {
        this.immuneEchSheep = immuneEchSheep;
    }
}