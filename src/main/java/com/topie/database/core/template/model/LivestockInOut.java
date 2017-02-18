package com.topie.database.core.template.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "d_livestock_in_out")
public class LivestockInOut {

    /**
     * ID
     */
    @Id
    @Column(name = "livestock_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer livestockId;

    /**
     * 填报ID
     */
    @Column(name = "fill_id")
    private Integer fillId;

    /**
     * 上报人ID
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 省行政ID
     */
    @Column(name = "org_id")
    private Integer orgId;

    private String province;

    /**
     * 上报时间
     */
    @Column(name = "livestock_date")
    private Date livestockDate;

    /**
     * 填报状态
     */
    private Integer status;

    /**
     * 当月存栏数量(万头/只/羽)-猪
     */
    @Column(name = "herds_pig")
    private BigDecimal herdsPig;

    /**
     * 当月存栏数量(万头/只/羽)-牛
     */
    @Column(name = "herds_niu")
    private BigDecimal herdsNiu;

    /**
     * 当月存栏数量(万头/只/羽)-羊
     */
    @Column(name = "herds_sheep")
    private BigDecimal herdsSheep;

    /**
     * 当月存栏数量(万头/只/羽)-其他
     */
    @Column(name = "herds_other")
    private BigDecimal herdsOther;

    /**
     * 当月存栏数量(万头/只/羽)-鸡
     */
    @Column(name = "herds_chicken")
    private BigDecimal herdsChicken;

    /**
     * 当月存栏数量(万头/只/羽)-鸭
     */
    @Column(name = "herds_duck")
    private BigDecimal herdsDuck;

    /**
     * 当月存栏数量(万头/只/羽)-鹅
     */
    @Column(name = "herds_goose")
    private BigDecimal herdsGoose;

    /**
     * 当月存栏数量(万头/只/羽)-其他禽
     */
    @Column(name = "herds_other_q")
    private BigDecimal herdsOtherQ;

    /**
     * 禽流感当月应免数量(万羽)-鸡
     */
    @Column(name = "immune_bird_flu_checken")
    private BigDecimal immuneBirdFluChecken;

    /**
     * 禽流感当月应免数量(万羽)-鸭
     */
    @Column(name = "immune_bird_flu_duck")
    private BigDecimal immuneBirdFluDuck;

    /**
     * 禽流感当月应免数量(万羽)-鹅
     */
    @Column(name = "immune_bird_flu_goose")
    private BigDecimal immuneBirdFluGoose;

    /**
     * 禽流感当月应免数量(万羽)-其他禽
     */
    @Column(name = "immune_bird_flu_other")
    private BigDecimal immuneBirdFluOther;

    /**
     * A型口蹄疫当月应免数量(万头/只)-牛
     */
    @Column(name = "immune_afmd_niu")
    private BigDecimal immuneAfmdNiu;

    /**
     * A型口蹄疫当月应免数量(万头/只)-羊
     */
    @Column(name = "immune_afmd_sheep")
    private BigDecimal immuneAfmdSheep;

    /**
     * 高致病性猪蓝耳病当月应免数量(万头)-猪
     */
    @Column(name = "immune_blue_ear")
    private BigDecimal immuneBlueEar;

    /**
     * 猪瘟当月应免数量(万头)
     */
    @Column(name = "immune_swine")
    private BigDecimal immuneSwine;

    /**
     * 新城疫当月应免数量(万羽)
     */
    @Column(name = "immune_new_castle")
    private BigDecimal immuneNewCastle;

    /**
     * 牲畜口蹄疫当月应免数量(万头/只)-猪
     */
    @Column(name = "immune_fmd_pig")
    private BigDecimal immuneFmdPig;

    /**
     * 牲畜口蹄疫当月应免数量(万头/只)-牛
     */
    @Column(name = "immune_fmd_niu")
    private BigDecimal immuneFmdNiu;

    /**
     * 牲畜口蹄疫当月应免数量(万头/只)-羊
     */
    @Column(name = "immune_fmd_sheep")
    private BigDecimal immuneFmdSheep;

    /**
     * 牲畜口蹄疫当月应免数量(万头/只)-其他
     */
    @Column(name = "immune_fmd_other")
    private BigDecimal immuneFmdOther;

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * 获取ID
     *
     * @return livestock_id - ID
     */
    public Integer getLivestockId() {
        return livestockId;
    }

    /**
     * 设置ID
     *
     * @param livestockId ID
     */
    public void setLivestockId(Integer livestockId) {
        this.livestockId = livestockId;
    }

    /**
     * 获取填报ID
     *
     * @return fill_id - 填报ID
     */
    public Integer getFillId() {
        return fillId;
    }

    /**
     * 设置填报ID
     *
     * @param fillId 填报ID
     */
    public void setFillId(Integer fillId) {
        this.fillId = fillId;
    }

    /**
     * 获取上报人ID
     *
     * @return user_id - 上报人ID
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置上报人ID
     *
     * @param userId 上报人ID
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取省行政ID
     *
     * @return org_id - 省行政ID
     */
    public Integer getOrgId() {
        return orgId;
    }

    /**
     * 设置省行政ID
     *
     * @param orgId 省行政ID
     */
    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    /**
     * 获取上报时间
     *
     * @return livestock_date - 上报时间
     */
    public Date getLivestockDate() {
        return livestockDate;
    }

    /**
     * 设置上报时间
     *
     * @param livestockDate 上报时间
     */
    public void setLivestockDate(Date livestockDate) {
        this.livestockDate = livestockDate;
    }

    /**
     * 获取填报状态
     *
     * @return status - 填报状态
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置填报状态
     *
     * @param status 填报状态
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取当月存栏数量(万头/只/羽)-猪
     *
     * @return herds_pig - 当月存栏数量(万头/只/羽)-猪
     */
    public BigDecimal getHerdsPig() {
        return herdsPig;
    }

    /**
     * 设置当月存栏数量(万头/只/羽)-猪
     *
     * @param herdsPig 当月存栏数量(万头/只/羽)-猪
     */
    public void setHerdsPig(BigDecimal herdsPig) {
        this.herdsPig = herdsPig;
    }

    /**
     * 获取当月存栏数量(万头/只/羽)-牛
     *
     * @return herds_niu - 当月存栏数量(万头/只/羽)-牛
     */
    public BigDecimal getHerdsNiu() {
        return herdsNiu;
    }

    /**
     * 设置当月存栏数量(万头/只/羽)-牛
     *
     * @param herdsNiu 当月存栏数量(万头/只/羽)-牛
     */
    public void setHerdsNiu(BigDecimal herdsNiu) {
        this.herdsNiu = herdsNiu;
    }

    /**
     * 获取当月存栏数量(万头/只/羽)-羊
     *
     * @return herds_sheep - 当月存栏数量(万头/只/羽)-羊
     */
    public BigDecimal getHerdsSheep() {
        return herdsSheep;
    }

    /**
     * 设置当月存栏数量(万头/只/羽)-羊
     *
     * @param herdsSheep 当月存栏数量(万头/只/羽)-羊
     */
    public void setHerdsSheep(BigDecimal herdsSheep) {
        this.herdsSheep = herdsSheep;
    }

    /**
     * 获取当月存栏数量(万头/只/羽)-其他
     *
     * @return herds_other - 当月存栏数量(万头/只/羽)-其他
     */
    public BigDecimal getHerdsOther() {
        return herdsOther;
    }

    /**
     * 设置当月存栏数量(万头/只/羽)-其他
     *
     * @param herdsOther 当月存栏数量(万头/只/羽)-其他
     */
    public void setHerdsOther(BigDecimal herdsOther) {
        this.herdsOther = herdsOther;
    }

    /**
     * 获取当月存栏数量(万头/只/羽)-鸡
     *
     * @return herds_chicken - 当月存栏数量(万头/只/羽)-鸡
     */
    public BigDecimal getHerdsChicken() {
        return herdsChicken;
    }

    /**
     * 设置当月存栏数量(万头/只/羽)-鸡
     *
     * @param herdsChicken 当月存栏数量(万头/只/羽)-鸡
     */
    public void setHerdsChicken(BigDecimal herdsChicken) {
        this.herdsChicken = herdsChicken;
    }

    /**
     * 获取当月存栏数量(万头/只/羽)-鸭
     *
     * @return herds_duck - 当月存栏数量(万头/只/羽)-鸭
     */
    public BigDecimal getHerdsDuck() {
        return herdsDuck;
    }

    /**
     * 设置当月存栏数量(万头/只/羽)-鸭
     *
     * @param herdsDuck 当月存栏数量(万头/只/羽)-鸭
     */
    public void setHerdsDuck(BigDecimal herdsDuck) {
        this.herdsDuck = herdsDuck;
    }

    /**
     * 获取当月存栏数量(万头/只/羽)-鹅
     *
     * @return herds_goose - 当月存栏数量(万头/只/羽)-鹅
     */
    public BigDecimal getHerdsGoose() {
        return herdsGoose;
    }

    /**
     * 设置当月存栏数量(万头/只/羽)-鹅
     *
     * @param herdsGoose 当月存栏数量(万头/只/羽)-鹅
     */
    public void setHerdsGoose(BigDecimal herdsGoose) {
        this.herdsGoose = herdsGoose;
    }

    /**
     * 获取当月存栏数量(万头/只/羽)-其他禽
     *
     * @return herds_other_q - 当月存栏数量(万头/只/羽)-其他禽
     */
    public BigDecimal getHerdsOtherQ() {
        return herdsOtherQ;
    }

    /**
     * 设置当月存栏数量(万头/只/羽)-其他禽
     *
     * @param herdsOtherQ 当月存栏数量(万头/只/羽)-其他禽
     */
    public void setHerdsOtherQ(BigDecimal herdsOtherQ) {
        this.herdsOtherQ = herdsOtherQ;
    }

    /**
     * 获取禽流感当月应免数量(万羽)-鸡
     *
     * @return immune_bird_flu_checken - 禽流感当月应免数量(万羽)-鸡
     */
    public BigDecimal getImmuneBirdFluChecken() {
        return immuneBirdFluChecken;
    }

    /**
     * 设置禽流感当月应免数量(万羽)-鸡
     *
     * @param immuneBirdFluChecken 禽流感当月应免数量(万羽)-鸡
     */
    public void setImmuneBirdFluChecken(BigDecimal immuneBirdFluChecken) {
        this.immuneBirdFluChecken = immuneBirdFluChecken;
    }

    /**
     * 获取禽流感当月应免数量(万羽)-鸭
     *
     * @return immune_bird_flu_duck - 禽流感当月应免数量(万羽)-鸭
     */
    public BigDecimal getImmuneBirdFluDuck() {
        return immuneBirdFluDuck;
    }

    /**
     * 设置禽流感当月应免数量(万羽)-鸭
     *
     * @param immuneBirdFluDuck 禽流感当月应免数量(万羽)-鸭
     */
    public void setImmuneBirdFluDuck(BigDecimal immuneBirdFluDuck) {
        this.immuneBirdFluDuck = immuneBirdFluDuck;
    }

    /**
     * 获取禽流感当月应免数量(万羽)-鹅
     *
     * @return immune_bird_flu_goose - 禽流感当月应免数量(万羽)-鹅
     */
    public BigDecimal getImmuneBirdFluGoose() {
        return immuneBirdFluGoose;
    }

    /**
     * 设置禽流感当月应免数量(万羽)-鹅
     *
     * @param immuneBirdFluGoose 禽流感当月应免数量(万羽)-鹅
     */
    public void setImmuneBirdFluGoose(BigDecimal immuneBirdFluGoose) {
        this.immuneBirdFluGoose = immuneBirdFluGoose;
    }

    /**
     * 获取禽流感当月应免数量(万羽)-其他禽
     *
     * @return immune_bird_flu_other - 禽流感当月应免数量(万羽)-其他禽
     */
    public BigDecimal getImmuneBirdFluOther() {
        return immuneBirdFluOther;
    }

    /**
     * 设置禽流感当月应免数量(万羽)-其他禽
     *
     * @param immuneBirdFluOther 禽流感当月应免数量(万羽)-其他禽
     */
    public void setImmuneBirdFluOther(BigDecimal immuneBirdFluOther) {
        this.immuneBirdFluOther = immuneBirdFluOther;
    }

    /**
     * 获取A型口蹄疫当月应免数量(万头/只)-牛
     *
     * @return immune_afmd_niu - A型口蹄疫当月应免数量(万头/只)-牛
     */
    public BigDecimal getImmuneAfmdNiu() {
        return immuneAfmdNiu;
    }

    /**
     * 设置A型口蹄疫当月应免数量(万头/只)-牛
     *
     * @param immuneAfmdNiu A型口蹄疫当月应免数量(万头/只)-牛
     */
    public void setImmuneAfmdNiu(BigDecimal immuneAfmdNiu) {
        this.immuneAfmdNiu = immuneAfmdNiu;
    }

    /**
     * 获取A型口蹄疫当月应免数量(万头/只)-羊
     *
     * @return immune_afmd_sheep - A型口蹄疫当月应免数量(万头/只)-羊
     */
    public BigDecimal getImmuneAfmdSheep() {
        return immuneAfmdSheep;
    }

    /**
     * 设置A型口蹄疫当月应免数量(万头/只)-羊
     *
     * @param immuneAfmdSheep A型口蹄疫当月应免数量(万头/只)-羊
     */
    public void setImmuneAfmdSheep(BigDecimal immuneAfmdSheep) {
        this.immuneAfmdSheep = immuneAfmdSheep;
    }

    /**
     * 获取高致病性猪蓝耳病当月应免数量(万头)-猪
     *
     * @return immune_blue_ear - 高致病性猪蓝耳病当月应免数量(万头)-猪
     */
    public BigDecimal getImmuneBlueEar() {
        return immuneBlueEar;
    }

    /**
     * 设置高致病性猪蓝耳病当月应免数量(万头)-猪
     *
     * @param immuneBlueEar 高致病性猪蓝耳病当月应免数量(万头)-猪
     */
    public void setImmuneBlueEar(BigDecimal immuneBlueEar) {
        this.immuneBlueEar = immuneBlueEar;
    }

    /**
     * 获取猪瘟当月应免数量(万头)
     *
     * @return immune_swine - 猪瘟当月应免数量(万头)
     */
    public BigDecimal getImmuneSwine() {
        return immuneSwine;
    }

    /**
     * 设置猪瘟当月应免数量(万头)
     *
     * @param immuneSwine 猪瘟当月应免数量(万头)
     */
    public void setImmuneSwine(BigDecimal immuneSwine) {
        this.immuneSwine = immuneSwine;
    }

    /**
     * 获取新城疫当月应免数量(万羽)
     *
     * @return immune_new_castle - 新城疫当月应免数量(万羽)
     */
    public BigDecimal getImmuneNewCastle() {
        return immuneNewCastle;
    }

    /**
     * 设置新城疫当月应免数量(万羽)
     *
     * @param immuneNewCastle 新城疫当月应免数量(万羽)
     */
    public void setImmuneNewCastle(BigDecimal immuneNewCastle) {
        this.immuneNewCastle = immuneNewCastle;
    }

    /**
     * 获取牲畜口蹄疫当月应免数量(万头/只)-猪
     *
     * @return immune_fmd_pig - 牲畜口蹄疫当月应免数量(万头/只)-猪
     */
    public BigDecimal getImmuneFmdPig() {
        return immuneFmdPig;
    }

    /**
     * 设置牲畜口蹄疫当月应免数量(万头/只)-猪
     *
     * @param immuneFmdPig 牲畜口蹄疫当月应免数量(万头/只)-猪
     */
    public void setImmuneFmdPig(BigDecimal immuneFmdPig) {
        this.immuneFmdPig = immuneFmdPig;
    }

    /**
     * 获取牲畜口蹄疫当月应免数量(万头/只)-牛
     *
     * @return immune_fmd_niu - 牲畜口蹄疫当月应免数量(万头/只)-牛
     */
    public BigDecimal getImmuneFmdNiu() {
        return immuneFmdNiu;
    }

    /**
     * 设置牲畜口蹄疫当月应免数量(万头/只)-牛
     *
     * @param immuneFmdNiu 牲畜口蹄疫当月应免数量(万头/只)-牛
     */
    public void setImmuneFmdNiu(BigDecimal immuneFmdNiu) {
        this.immuneFmdNiu = immuneFmdNiu;
    }

    /**
     * 获取牲畜口蹄疫当月应免数量(万头/只)-羊
     *
     * @return immune_fmd_sheep - 牲畜口蹄疫当月应免数量(万头/只)-羊
     */
    public BigDecimal getImmuneFmdSheep() {
        return immuneFmdSheep;
    }

    /**
     * 设置牲畜口蹄疫当月应免数量(万头/只)-羊
     *
     * @param immuneFmdSheep 牲畜口蹄疫当月应免数量(万头/只)-羊
     */
    public void setImmuneFmdSheep(BigDecimal immuneFmdSheep) {
        this.immuneFmdSheep = immuneFmdSheep;
    }

    /**
     * 获取牲畜口蹄疫当月应免数量(万头/只)-其他
     *
     * @return immune_fmd_other - 牲畜口蹄疫当月应免数量(万头/只)-其他
     */
    public BigDecimal getImmuneFmdOther() {
        return immuneFmdOther;
    }

    /**
     * 设置牲畜口蹄疫当月应免数量(万头/只)-其他
     *
     * @param immuneFmdOther 牲畜口蹄疫当月应免数量(万头/只)-其他
     */
    public void setImmuneFmdOther(BigDecimal immuneFmdOther) {
        this.immuneFmdOther = immuneFmdOther;
    }
}
