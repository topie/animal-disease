package com.topie.database.core.template.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "b_vaccineorder")
public class Vaccineorder {
    @Id
    @Column(name = "ReportId")
    private String reportid;

    @Column(name = "VaccineOrderId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String vaccineorderid;

    @Column(name = "regionCode")
    private String regioncode;

    @Column(name = "regionName")
    private String regionname;

    @Column(name = "Date")
    private Date date;

    @Column(name = "ev_FMOInactivatedD")
    private BigDecimal evFmoinactivatedd;

    @Column(name = "ev_FMOInactivatedDH")
    private BigDecimal evFmoinactivateddh;

    @Column(name = "ev_FMOInactivatedX")
    private BigDecimal evFmoinactivatedx;

    @Column(name = "ev_FMOSyntheticD")
    private BigDecimal evFmosyntheticd;

    @Column(name = "ev_FMOSyntheticDH")
    private BigDecimal evFmosyntheticdh;

    @Column(name = "ev_FMOSyntheticX")
    private BigDecimal evFmosyntheticx;

    @Column(name = "ev_FMOSInactivatedD")
    private BigDecimal evFmosinactivatedd;

    @Column(name = "ev_FMOSInactivatedDH")
    private BigDecimal evFmosinactivateddh;

    @Column(name = "ev_FMOSInactivatedX")
    private BigDecimal evFmosinactivatedx;

    @Column(name = "ev_FMOASD")
    private BigDecimal evFmoasd;

    @Column(name = "ev_FMOASDH")
    private BigDecimal evFmoasdh;

    @Column(name = "ev_FMOASX")
    private BigDecimal evFmoasx;

    @Column(name = "ev_FMOAD")
    private BigDecimal evFmoad;

    @Column(name = "ev_FMOADH")
    private BigDecimal evFmoadh;

    @Column(name = "ev_FMOAX")
    private BigDecimal evFmoax;

    @Column(name = "ev_AIRLH5D")
    private BigDecimal evAirlh5d;

    @Column(name = "ev_AIRLH5DH")
    private BigDecimal evAirlh5dh;

    @Column(name = "ev_AIRLH5X")
    private BigDecimal evAirlh5x;

    @Column(name = "ev_AIH5N1Re5Re4D")
    private BigDecimal evAih5n1re5re4d;

    @Column(name = "ev_AIH5N1Re5Re4DH")
    private BigDecimal evAih5n1re5re4dh;

    @Column(name = "ev_AIH5N1Re5Re4X")
    private BigDecimal evAih5n1re5re4x;

    @Column(name = "ev_AIH5N1Re4D")
    private BigDecimal evAih5n1re4d;

    @Column(name = "ev_AIH5N1Re4DH")
    private BigDecimal evAih5n1re4dh;

    @Column(name = "ev_AIH5N1Re4X")
    private BigDecimal evAih5n1re4x;

    @Column(name = "ev_AIH5N1Re5D")
    private BigDecimal evAih5n1re5d;

    @Column(name = "ev_AIH5N1Re5DH")
    private BigDecimal evAih5n1re5dh;

    @Column(name = "ev_AIH5N1Re5X")
    private BigDecimal evAih5n1re5x;

    @Column(name = "ev_AIH5H9D")
    private BigDecimal evAih5h9d;

    @Column(name = "ev_AIH5H9DH")
    private BigDecimal evAih5h9dh;

    @Column(name = "ev_AIH5H9X")
    private BigDecimal evAih5h9x;

    @Column(name = "ev_BED")
    private BigDecimal evBed;

    @Column(name = "ev_BEDH")
    private BigDecimal evBedh;

    @Column(name = "ev_BEX")
    private BigDecimal evBex;

    @Column(name = "ev_BEInactivatedD")
    private BigDecimal evBeinactivatedd;

    @Column(name = "ev_BEInactivatedDH")
    private BigDecimal evBeinactivateddh;

    @Column(name = "ev_BEInactivatedX")
    private BigDecimal evBeinactivatedx;

    @Column(name = "ev_CSD")
    private BigDecimal evCsd;

    @Column(name = "ev_CSDH")
    private BigDecimal evCsdh;

    @Column(name = "ev_CSX")
    private BigDecimal evCsx;

    @Column(name = "ev_CSPassageD")
    private BigDecimal evCspassaged;

    @Column(name = "ev_CSPassageDH")
    private BigDecimal evCspassagedh;

    @Column(name = "ev_CSPassageX")
    private BigDecimal evCspassagex;

    @Column(name = "ev_NCInactivatedD")
    private BigDecimal evNcinactivatedd;

    @Column(name = "ev_NCInactivatedDH")
    private BigDecimal evNcinactivateddh;

    @Column(name = "ev_NCInactivatedX")
    private BigDecimal evNcinactivatedx;

    @Column(name = "ev_NCWeakD")
    private BigDecimal evNcweakd;

    @Column(name = "ev_NCWeakDH")
    private BigDecimal evNcweakdh;

    @Column(name = "ev_NCWeakX")
    private BigDecimal evNcweakx;

    @Column(name = "ev_FMO3InactivatedD")
    private BigDecimal evFmo3inactivatedd;

    @Column(name = "ev_FMO3InactivatedDH")
    private BigDecimal evFmo3inactivateddh;

    @Column(name = "ev_FMO3InactivatedX")
    private BigDecimal evFmo3inactivatedx;

    @Column(name = "ev_AllFMOInactivatedDH")
    private BigDecimal evAllfmoinactivateddh;

    @Column(name = "ev_AllFMOInactivatedX")
    private BigDecimal evAllfmoinactivatedx;

    @Column(name = "ev_AllFMOSyntheticDH")
    private BigDecimal evAllfmosyntheticdh;

    @Column(name = "ev_AllFMOSyntheticX")
    private BigDecimal evAllfmosyntheticx;

    @Column(name = "ev_AllFMOSInactivatedDH")
    private BigDecimal evAllfmosinactivateddh;

    @Column(name = "ev_AllFMOSInactivatedX")
    private BigDecimal evAllfmosinactivatedx;

    @Column(name = "ev_AllFMOASDH")
    private BigDecimal evAllfmoasdh;

    @Column(name = "ev_AllFMOASX")
    private BigDecimal evAllfmoasx;

    @Column(name = "ev_AllFMO3InactivatedDH")
    private BigDecimal evAllfmo3inactivateddh;

    @Column(name = "ev_AllFMO3InactivatedX")
    private BigDecimal evAllfmo3inactivatedx;

    @Column(name = "ev_AllFMOADH")
    private BigDecimal evAllfmoadh;

    @Column(name = "ev_AllFMOAX")
    private BigDecimal evAllfmoax;

    @Column(name = "ev_AllAIH5N1Re4DH")
    private BigDecimal evAllaih5n1re4dh;

    @Column(name = "ev_AllAIH5N1Re4X")
    private BigDecimal evAllaih5n1re4x;

    @Column(name = "ev_AllAIH5N1Re5DH")
    private BigDecimal evAllaih5n1re5dh;

    @Column(name = "ev_AllAIH5N1Re5X")
    private BigDecimal evAllaih5n1re5x;

    @Column(name = "ev_AllAIH5N1Re5Re4DH")
    private BigDecimal evAllaih5n1re5re4dh;

    @Column(name = "ev_AllAIH5N1Re5Re4X")
    private BigDecimal evAllaih5n1re5re4x;

    @Column(name = "ev_AllAIH5H9DH")
    private BigDecimal evAllaih5h9dh;

    @Column(name = "ev_AllAIH5H9X")
    private BigDecimal evAllaih5h9x;

    @Column(name = "ev_AIH5N1Re6DH")
    private BigDecimal evAih5n1re6dh;

    @Column(name = "ev_AllAIH5N1Re6DH")
    private BigDecimal evAllaih5n1re6dh;

    @Column(name = "ev_AIH5N1Re6X")
    private BigDecimal evAih5n1re6x;

    @Column(name = "ev_AllAIH5N1Re6X")
    private BigDecimal evAllaih5n1re6x;

    @Column(name = "ev_AIH5N1Re7DH")
    private BigDecimal evAih5n1re7dh;

    @Column(name = "ev_AllAIH5N1Re7DH")
    private BigDecimal evAllaih5n1re7dh;

    @Column(name = "ev_AIH5N1Re7X")
    private BigDecimal evAih5n1re7x;

    @Column(name = "ev_AllAIH5N1Re7X")
    private BigDecimal evAllaih5n1re7x;

    @Column(name = "ev_AIH5N1Re6Re7DH")
    private BigDecimal evAih5n1re6re7dh;

    @Column(name = "ev_AllAIH5N1Re6Re7DH")
    private BigDecimal evAllaih5n1re6re7dh;

    @Column(name = "ev_AIH5N1Re6Re7X")
    private BigDecimal evAih5n1re6re7x;

    @Column(name = "ev_AllAIH5N1Re6Re7X")
    private BigDecimal evAllaih5n1re6re7x;

    @Column(name = "ev_AIH5N1Re6Re8DH")
    private BigDecimal evAih5n1re6re8dh;

    @Column(name = "ev_AllAIH5N1Re6Re8DH")
    private BigDecimal evAllaih5n1re6re8dh;

    @Column(name = "ev_AIH5N1Re6Re8X")
    private BigDecimal evAih5n1re6re8x;

    @Column(name = "ev_AllAIH5N1Re6Re8X")
    private BigDecimal evAllaih5n1re6re8x;

    @Column(name = "ev_AIH5N1Re6Re7Re8DH")
    private BigDecimal evAih5n1re6re7re8dh;

    @Column(name = "ev_AllAIH5N1Re6Re7Re8DH")
    private BigDecimal evAllaih5n1re6re7re8dh;

    @Column(name = "ev_AIH5N1Re6Re7Re8X")
    private BigDecimal evAih5n1re6re7re8x;

    @Column(name = "ev_AllAIH5N1Re6Re7Re8X")
    private BigDecimal evAllaih5n1re6re7re8x;

    @Column(name = "ev_AIH5N2D7DH")
    private BigDecimal evAih5n2d7dh;

    @Column(name = "ev_AllAIH5N2D7DH")
    private BigDecimal evAllaih5n2d7dh;

    @Column(name = "ev_AIH5N2D7X")
    private BigDecimal evAih5n2d7x;

    @Column(name = "ev_AllAIH5N2D7X")
    private BigDecimal evAllaih5n2d7x;

    @Column(name = "ev_AllAIRLH5DH")
    private BigDecimal evAllairlh5dh;

    @Column(name = "ev_AllAIRLH5X")
    private BigDecimal evAllairlh5x;

    @Column(name = "ev_AllBEInactivatedDH")
    private BigDecimal evAllbeinactivateddh;

    @Column(name = "ev_AllBEInactivatedX")
    private BigDecimal evAllbeinactivatedx;

    @Column(name = "ev_AllBEDH")
    private BigDecimal evAllbedh;

    @Column(name = "ev_AllBEX")
    private BigDecimal evAllbex;

    @Column(name = "ev_AllCSDH")
    private BigDecimal evAllcsdh;

    @Column(name = "ev_AllCSX")
    private BigDecimal evAllcsx;

    @Column(name = "ev_AllCSPassageDH")
    private BigDecimal evAllcspassagedh;

    @Column(name = "ev_AllCSPassageX")
    private BigDecimal evAllcspassagex;

    @Column(name = "ev_AllNCInactivatedDH")
    private BigDecimal evAllncinactivateddh;

    @Column(name = "ev_AllNCInactivatedX")
    private BigDecimal evAllncinactivatedx;

    @Column(name = "ev_AllNCWeakDH")
    private BigDecimal evAllncweakdh;

    @Column(name = "ev_AllNCWeakX")
    private BigDecimal evAllncweakx;

    @Column(name = "ev_PDPRDH")
    private BigDecimal evPdprdh;

    @Column(name = "ev_AllPDPRDH")
    private BigDecimal evAllpdprdh;

    @Column(name = "ev_PDPRX")
    private BigDecimal evPdprx;

    @Column(name = "ev_AllPDPRX")
    private BigDecimal evAllpdprx;

    @Column(name = "ev_BrucellaS2DH")
    private BigDecimal evBrucellas2dh;

    @Column(name = "ev_AllBrucellaS2DH")
    private BigDecimal evAllbrucellas2dh;

    @Column(name = "ev_BrucellaS2X")
    private BigDecimal evBrucellas2x;

    @Column(name = "ev_AllBrucellaS2X")
    private BigDecimal evAllbrucellas2x;

    @Column(name = "ev_BrucellaA19DH")
    private BigDecimal evBrucellaa19dh;

    @Column(name = "ev_AllBrucellaA19DH")
    private BigDecimal evAllbrucellaa19dh;

    @Column(name = "ev_BrucellaA19X")
    private BigDecimal evBrucellaa19x;

    @Column(name = "ev_AllBrucellaA19X")
    private BigDecimal evAllbrucellaa19x;

    @Column(name = "ev_SheepHydatidDH")
    private BigDecimal evSheephydatiddh;

    @Column(name = "ev_AllSheepHydatidDH")
    private BigDecimal evAllsheephydatiddh;

    @Column(name = "ev_SheepHydatidX")
    private BigDecimal evSheephydatidx;

    @Column(name = "ev_AllSheepHydatidX")
    private BigDecimal evAllsheephydatidx;


    @Column(name = "ev_BrucellaM5DH")
    private BigDecimal evBrucellam5dh;

    @Column(name = "ev_AllBrucellaM5DH")
    private BigDecimal evAllbrucellam5dh;

    @Column(name = "ev_BrucellaM5X")
    private BigDecimal evBrucellam5x;

    @Column(name = "ev_AllBrucellaM5X")
    private BigDecimal evAllbrucellam5x;
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
     * @return VaccineOrderId
     */
    public String getVaccineorderid() {
        return vaccineorderid;
    }

    /**
     * @param vaccineorderid
     */
    public void setVaccineorderid(String vaccineorderid) {
        this.vaccineorderid = vaccineorderid;
    }

    /**
     * @return regionCode
     */
    public String getRegioncode() {
        return regioncode;
    }

    /**
     * @param regioncode
     */
    public void setRegioncode(String regioncode) {
        this.regioncode = regioncode;
    }

    /**
     * @return regionName
     */
    public String getRegionname() {
        return regionname;
    }

    /**
     * @param regionname
     */
    public void setRegionname(String regionname) {
        this.regionname = regionname;
    }

    /**
     * @return Date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return ev_FMOInactivatedD
     */
    public BigDecimal getEvFmoinactivatedd() {
        return evFmoinactivatedd;
    }

    /**
     * @param evFmoinactivatedd
     */
    public void setEvFmoinactivatedd(BigDecimal evFmoinactivatedd) {
        this.evFmoinactivatedd = evFmoinactivatedd;
    }

    /**
     * @return ev_FMOInactivatedDH
     */
    public BigDecimal getEvFmoinactivateddh() {
        return evFmoinactivateddh;
    }

    /**
     * @param evFmoinactivateddh
     */
    public void setEvFmoinactivateddh(BigDecimal evFmoinactivateddh) {
        this.evFmoinactivateddh = evFmoinactivateddh;
    }

    /**
     * @return ev_FMOInactivatedX
     */
    public BigDecimal getEvFmoinactivatedx() {
        return evFmoinactivatedx;
    }

    /**
     * @param evFmoinactivatedx
     */
    public void setEvFmoinactivatedx(BigDecimal evFmoinactivatedx) {
        this.evFmoinactivatedx = evFmoinactivatedx;
    }

    /**
     * @return ev_FMOSyntheticD
     */
    public BigDecimal getEvFmosyntheticd() {
        return evFmosyntheticd;
    }

    /**
     * @param evFmosyntheticd
     */
    public void setEvFmosyntheticd(BigDecimal evFmosyntheticd) {
        this.evFmosyntheticd = evFmosyntheticd;
    }

    /**
     * @return ev_FMOSyntheticDH
     */
    public BigDecimal getEvFmosyntheticdh() {
        return evFmosyntheticdh;
    }

    /**
     * @param evFmosyntheticdh
     */
    public void setEvFmosyntheticdh(BigDecimal evFmosyntheticdh) {
        this.evFmosyntheticdh = evFmosyntheticdh;
    }

    /**
     * @return ev_FMOSyntheticX
     */
    public BigDecimal getEvFmosyntheticx() {
        return evFmosyntheticx;
    }

    /**
     * @param evFmosyntheticx
     */
    public void setEvFmosyntheticx(BigDecimal evFmosyntheticx) {
        this.evFmosyntheticx = evFmosyntheticx;
    }

    /**
     * @return ev_FMOSInactivatedD
     */
    public BigDecimal getEvFmosinactivatedd() {
        return evFmosinactivatedd;
    }

    /**
     * @param evFmosinactivatedd
     */
    public void setEvFmosinactivatedd(BigDecimal evFmosinactivatedd) {
        this.evFmosinactivatedd = evFmosinactivatedd;
    }

    /**
     * @return ev_FMOSInactivatedDH
     */
    public BigDecimal getEvFmosinactivateddh() {
        return evFmosinactivateddh;
    }

    /**
     * @param evFmosinactivateddh
     */
    public void setEvFmosinactivateddh(BigDecimal evFmosinactivateddh) {
        this.evFmosinactivateddh = evFmosinactivateddh;
    }

    /**
     * @return ev_FMOSInactivatedX
     */
    public BigDecimal getEvFmosinactivatedx() {
        return evFmosinactivatedx;
    }

    /**
     * @param evFmosinactivatedx
     */
    public void setEvFmosinactivatedx(BigDecimal evFmosinactivatedx) {
        this.evFmosinactivatedx = evFmosinactivatedx;
    }

    /**
     * @return ev_FMOASD
     */
    public BigDecimal getEvFmoasd() {
        return evFmoasd;
    }

    /**
     * @param evFmoasd
     */
    public void setEvFmoasd(BigDecimal evFmoasd) {
        this.evFmoasd = evFmoasd;
    }

    /**
     * @return ev_FMOASDH
     */
    public BigDecimal getEvFmoasdh() {
        return evFmoasdh;
    }

    /**
     * @param evFmoasdh
     */
    public void setEvFmoasdh(BigDecimal evFmoasdh) {
        this.evFmoasdh = evFmoasdh;
    }

    /**
     * @return ev_FMOASX
     */
    public BigDecimal getEvFmoasx() {
        return evFmoasx;
    }

    /**
     * @param evFmoasx
     */
    public void setEvFmoasx(BigDecimal evFmoasx) {
        this.evFmoasx = evFmoasx;
    }

    /**
     * @return ev_FMOAD
     */
    public BigDecimal getEvFmoad() {
        return evFmoad;
    }

    /**
     * @param evFmoad
     */
    public void setEvFmoad(BigDecimal evFmoad) {
        this.evFmoad = evFmoad;
    }

    /**
     * @return ev_FMOADH
     */
    public BigDecimal getEvFmoadh() {
        return evFmoadh;
    }

    /**
     * @param evFmoadh
     */
    public void setEvFmoadh(BigDecimal evFmoadh) {
        this.evFmoadh = evFmoadh;
    }

    /**
     * @return ev_FMOAX
     */
    public BigDecimal getEvFmoax() {
        return evFmoax;
    }

    /**
     * @param evFmoax
     */
    public void setEvFmoax(BigDecimal evFmoax) {
        this.evFmoax = evFmoax;
    }

    /**
     * @return ev_AIRLH5D
     */
    public BigDecimal getEvAirlh5d() {
        return evAirlh5d;
    }

    /**
     * @param evAirlh5d
     */
    public void setEvAirlh5d(BigDecimal evAirlh5d) {
        this.evAirlh5d = evAirlh5d;
    }

    /**
     * @return ev_AIRLH5DH
     */
    public BigDecimal getEvAirlh5dh() {
        return evAirlh5dh;
    }

    /**
     * @param evAirlh5dh
     */
    public void setEvAirlh5dh(BigDecimal evAirlh5dh) {
        this.evAirlh5dh = evAirlh5dh;
    }

    /**
     * @return ev_AIRLH5X
     */
    public BigDecimal getEvAirlh5x() {
        return evAirlh5x;
    }

    /**
     * @param evAirlh5x
     */
    public void setEvAirlh5x(BigDecimal evAirlh5x) {
        this.evAirlh5x = evAirlh5x;
    }

    /**
     * @return ev_AIH5N1Re5Re4D
     */
    public BigDecimal getEvAih5n1re5re4d() {
        return evAih5n1re5re4d;
    }

    /**
     * @param evAih5n1re5re4d
     */
    public void setEvAih5n1re5re4d(BigDecimal evAih5n1re5re4d) {
        this.evAih5n1re5re4d = evAih5n1re5re4d;
    }

    /**
     * @return ev_AIH5N1Re5Re4DH
     */
    public BigDecimal getEvAih5n1re5re4dh() {
        return evAih5n1re5re4dh;
    }

    /**
     * @param evAih5n1re5re4dh
     */
    public void setEvAih5n1re5re4dh(BigDecimal evAih5n1re5re4dh) {
        this.evAih5n1re5re4dh = evAih5n1re5re4dh;
    }

    /**
     * @return ev_AIH5N1Re5Re4X
     */
    public BigDecimal getEvAih5n1re5re4x() {
        return evAih5n1re5re4x;
    }

    /**
     * @param evAih5n1re5re4x
     */
    public void setEvAih5n1re5re4x(BigDecimal evAih5n1re5re4x) {
        this.evAih5n1re5re4x = evAih5n1re5re4x;
    }

    /**
     * @return ev_AIH5N1Re4D
     */
    public BigDecimal getEvAih5n1re4d() {
        return evAih5n1re4d;
    }

    /**
     * @param evAih5n1re4d
     */
    public void setEvAih5n1re4d(BigDecimal evAih5n1re4d) {
        this.evAih5n1re4d = evAih5n1re4d;
    }

    /**
     * @return ev_AIH5N1Re4DH
     */
    public BigDecimal getEvAih5n1re4dh() {
        return evAih5n1re4dh;
    }

    /**
     * @param evAih5n1re4dh
     */
    public void setEvAih5n1re4dh(BigDecimal evAih5n1re4dh) {
        this.evAih5n1re4dh = evAih5n1re4dh;
    }

    /**
     * @return ev_AIH5N1Re4X
     */
    public BigDecimal getEvAih5n1re4x() {
        return evAih5n1re4x;
    }

    /**
     * @param evAih5n1re4x
     */
    public void setEvAih5n1re4x(BigDecimal evAih5n1re4x) {
        this.evAih5n1re4x = evAih5n1re4x;
    }

    /**
     * @return ev_AIH5N1Re5D
     */
    public BigDecimal getEvAih5n1re5d() {
        return evAih5n1re5d;
    }

    /**
     * @param evAih5n1re5d
     */
    public void setEvAih5n1re5d(BigDecimal evAih5n1re5d) {
        this.evAih5n1re5d = evAih5n1re5d;
    }

    /**
     * @return ev_AIH5N1Re5DH
     */
    public BigDecimal getEvAih5n1re5dh() {
        return evAih5n1re5dh;
    }

    /**
     * @param evAih5n1re5dh
     */
    public void setEvAih5n1re5dh(BigDecimal evAih5n1re5dh) {
        this.evAih5n1re5dh = evAih5n1re5dh;
    }

    /**
     * @return ev_AIH5N1Re5X
     */
    public BigDecimal getEvAih5n1re5x() {
        return evAih5n1re5x;
    }

    /**
     * @param evAih5n1re5x
     */
    public void setEvAih5n1re5x(BigDecimal evAih5n1re5x) {
        this.evAih5n1re5x = evAih5n1re5x;
    }

    /**
     * @return ev_AIH5H9D
     */
    public BigDecimal getEvAih5h9d() {
        return evAih5h9d;
    }

    /**
     * @param evAih5h9d
     */
    public void setEvAih5h9d(BigDecimal evAih5h9d) {
        this.evAih5h9d = evAih5h9d;
    }

    /**
     * @return ev_AIH5H9DH
     */
    public BigDecimal getEvAih5h9dh() {
        return evAih5h9dh;
    }

    /**
     * @param evAih5h9dh
     */
    public void setEvAih5h9dh(BigDecimal evAih5h9dh) {
        this.evAih5h9dh = evAih5h9dh;
    }

    /**
     * @return ev_AIH5H9X
     */
    public BigDecimal getEvAih5h9x() {
        return evAih5h9x;
    }

    /**
     * @param evAih5h9x
     */
    public void setEvAih5h9x(BigDecimal evAih5h9x) {
        this.evAih5h9x = evAih5h9x;
    }

    /**
     * @return ev_BED
     */
    public BigDecimal getEvBed() {
        return evBed;
    }

    /**
     * @param evBed
     */
    public void setEvBed(BigDecimal evBed) {
        this.evBed = evBed;
    }

    /**
     * @return ev_BEDH
     */
    public BigDecimal getEvBedh() {
        return evBedh;
    }

    /**
     * @param evBedh
     */
    public void setEvBedh(BigDecimal evBedh) {
        this.evBedh = evBedh;
    }

    /**
     * @return ev_BEX
     */
    public BigDecimal getEvBex() {
        return evBex;
    }

    /**
     * @param evBex
     */
    public void setEvBex(BigDecimal evBex) {
        this.evBex = evBex;
    }

    /**
     * @return ev_BEInactivatedD
     */
    public BigDecimal getEvBeinactivatedd() {
        return evBeinactivatedd;
    }

    /**
     * @param evBeinactivatedd
     */
    public void setEvBeinactivatedd(BigDecimal evBeinactivatedd) {
        this.evBeinactivatedd = evBeinactivatedd;
    }

    /**
     * @return ev_BEInactivatedDH
     */
    public BigDecimal getEvBeinactivateddh() {
        return evBeinactivateddh;
    }

    /**
     * @param evBeinactivateddh
     */
    public void setEvBeinactivateddh(BigDecimal evBeinactivateddh) {
        this.evBeinactivateddh = evBeinactivateddh;
    }

    /**
     * @return ev_BEInactivatedX
     */
    public BigDecimal getEvBeinactivatedx() {
        return evBeinactivatedx;
    }

    /**
     * @param evBeinactivatedx
     */
    public void setEvBeinactivatedx(BigDecimal evBeinactivatedx) {
        this.evBeinactivatedx = evBeinactivatedx;
    }

    /**
     * @return ev_CSD
     */
    public BigDecimal getEvCsd() {
        return evCsd;
    }

    /**
     * @param evCsd
     */
    public void setEvCsd(BigDecimal evCsd) {
        this.evCsd = evCsd;
    }

    /**
     * @return ev_CSDH
     */
    public BigDecimal getEvCsdh() {
        return evCsdh;
    }

    /**
     * @param evCsdh
     */
    public void setEvCsdh(BigDecimal evCsdh) {
        this.evCsdh = evCsdh;
    }

    /**
     * @return ev_CSX
     */
    public BigDecimal getEvCsx() {
        return evCsx;
    }

    /**
     * @param evCsx
     */
    public void setEvCsx(BigDecimal evCsx) {
        this.evCsx = evCsx;
    }

    /**
     * @return ev_CSPassageD
     */
    public BigDecimal getEvCspassaged() {
        return evCspassaged;
    }

    /**
     * @param evCspassaged
     */
    public void setEvCspassaged(BigDecimal evCspassaged) {
        this.evCspassaged = evCspassaged;
    }

    /**
     * @return ev_CSPassageDH
     */
    public BigDecimal getEvCspassagedh() {
        return evCspassagedh;
    }

    /**
     * @param evCspassagedh
     */
    public void setEvCspassagedh(BigDecimal evCspassagedh) {
        this.evCspassagedh = evCspassagedh;
    }

    /**
     * @return ev_CSPassageX
     */
    public BigDecimal getEvCspassagex() {
        return evCspassagex;
    }

    /**
     * @param evCspassagex
     */
    public void setEvCspassagex(BigDecimal evCspassagex) {
        this.evCspassagex = evCspassagex;
    }

    /**
     * @return ev_NCInactivatedD
     */
    public BigDecimal getEvNcinactivatedd() {
        return evNcinactivatedd;
    }

    /**
     * @param evNcinactivatedd
     */
    public void setEvNcinactivatedd(BigDecimal evNcinactivatedd) {
        this.evNcinactivatedd = evNcinactivatedd;
    }

    /**
     * @return ev_NCInactivatedDH
     */
    public BigDecimal getEvNcinactivateddh() {
        return evNcinactivateddh;
    }

    /**
     * @param evNcinactivateddh
     */
    public void setEvNcinactivateddh(BigDecimal evNcinactivateddh) {
        this.evNcinactivateddh = evNcinactivateddh;
    }

    /**
     * @return ev_NCInactivatedX
     */
    public BigDecimal getEvNcinactivatedx() {
        return evNcinactivatedx;
    }

    /**
     * @param evNcinactivatedx
     */
    public void setEvNcinactivatedx(BigDecimal evNcinactivatedx) {
        this.evNcinactivatedx = evNcinactivatedx;
    }

    /**
     * @return ev_NCWeakD
     */
    public BigDecimal getEvNcweakd() {
        return evNcweakd;
    }

    /**
     * @param evNcweakd
     */
    public void setEvNcweakd(BigDecimal evNcweakd) {
        this.evNcweakd = evNcweakd;
    }

    /**
     * @return ev_NCWeakDH
     */
    public BigDecimal getEvNcweakdh() {
        return evNcweakdh;
    }

    /**
     * @param evNcweakdh
     */
    public void setEvNcweakdh(BigDecimal evNcweakdh) {
        this.evNcweakdh = evNcweakdh;
    }

    /**
     * @return ev_NCWeakX
     */
    public BigDecimal getEvNcweakx() {
        return evNcweakx;
    }

    /**
     * @param evNcweakx
     */
    public void setEvNcweakx(BigDecimal evNcweakx) {
        this.evNcweakx = evNcweakx;
    }

    /**
     * @return ev_FMO3InactivatedD
     */
    public BigDecimal getEvFmo3inactivatedd() {
        return evFmo3inactivatedd;
    }

    /**
     * @param evFmo3inactivatedd
     */
    public void setEvFmo3inactivatedd(BigDecimal evFmo3inactivatedd) {
        this.evFmo3inactivatedd = evFmo3inactivatedd;
    }

    /**
     * @return ev_FMO3InactivatedDH
     */
    public BigDecimal getEvFmo3inactivateddh() {
        return evFmo3inactivateddh;
    }

    /**
     * @param evFmo3inactivateddh
     */
    public void setEvFmo3inactivateddh(BigDecimal evFmo3inactivateddh) {
        this.evFmo3inactivateddh = evFmo3inactivateddh;
    }

    /**
     * @return ev_FMO3InactivatedX
     */
    public BigDecimal getEvFmo3inactivatedx() {
        return evFmo3inactivatedx;
    }

    /**
     * @param evFmo3inactivatedx
     */
    public void setEvFmo3inactivatedx(BigDecimal evFmo3inactivatedx) {
        this.evFmo3inactivatedx = evFmo3inactivatedx;
    }

    /**
     * @return ev_AllFMOInactivatedDH
     */
    public BigDecimal getEvAllfmoinactivateddh() {
        return evAllfmoinactivateddh;
    }

    /**
     * @param evAllfmoinactivateddh
     */
    public void setEvAllfmoinactivateddh(BigDecimal evAllfmoinactivateddh) {
        this.evAllfmoinactivateddh = evAllfmoinactivateddh;
    }

    /**
     * @return ev_AllFMOInactivatedX
     */
    public BigDecimal getEvAllfmoinactivatedx() {
        return evAllfmoinactivatedx;
    }

    /**
     * @param evAllfmoinactivatedx
     */
    public void setEvAllfmoinactivatedx(BigDecimal evAllfmoinactivatedx) {
        this.evAllfmoinactivatedx = evAllfmoinactivatedx;
    }

    /**
     * @return ev_AllFMOSyntheticDH
     */
    public BigDecimal getEvAllfmosyntheticdh() {
        return evAllfmosyntheticdh;
    }

    /**
     * @param evAllfmosyntheticdh
     */
    public void setEvAllfmosyntheticdh(BigDecimal evAllfmosyntheticdh) {
        this.evAllfmosyntheticdh = evAllfmosyntheticdh;
    }

    /**
     * @return ev_AllFMOSyntheticX
     */
    public BigDecimal getEvAllfmosyntheticx() {
        return evAllfmosyntheticx;
    }

    /**
     * @param evAllfmosyntheticx
     */
    public void setEvAllfmosyntheticx(BigDecimal evAllfmosyntheticx) {
        this.evAllfmosyntheticx = evAllfmosyntheticx;
    }

    /**
     * @return ev_AllFMOSInactivatedDH
     */
    public BigDecimal getEvAllfmosinactivateddh() {
        return evAllfmosinactivateddh;
    }

    /**
     * @param evAllfmosinactivateddh
     */
    public void setEvAllfmosinactivateddh(BigDecimal evAllfmosinactivateddh) {
        this.evAllfmosinactivateddh = evAllfmosinactivateddh;
    }

    /**
     * @return ev_AllFMOSInactivatedX
     */
    public BigDecimal getEvAllfmosinactivatedx() {
        return evAllfmosinactivatedx;
    }

    /**
     * @param evAllfmosinactivatedx
     */
    public void setEvAllfmosinactivatedx(BigDecimal evAllfmosinactivatedx) {
        this.evAllfmosinactivatedx = evAllfmosinactivatedx;
    }

    /**
     * @return ev_AllFMOASDH
     */
    public BigDecimal getEvAllfmoasdh() {
        return evAllfmoasdh;
    }

    /**
     * @param evAllfmoasdh
     */
    public void setEvAllfmoasdh(BigDecimal evAllfmoasdh) {
        this.evAllfmoasdh = evAllfmoasdh;
    }

    /**
     * @return ev_AllFMOASX
     */
    public BigDecimal getEvAllfmoasx() {
        return evAllfmoasx;
    }

    /**
     * @param evAllfmoasx
     */
    public void setEvAllfmoasx(BigDecimal evAllfmoasx) {
        this.evAllfmoasx = evAllfmoasx;
    }

    /**
     * @return ev_AllFMO3InactivatedDH
     */
    public BigDecimal getEvAllfmo3inactivateddh() {
        return evAllfmo3inactivateddh;
    }

    /**
     * @param evAllfmo3inactivateddh
     */
    public void setEvAllfmo3inactivateddh(BigDecimal evAllfmo3inactivateddh) {
        this.evAllfmo3inactivateddh = evAllfmo3inactivateddh;
    }

    /**
     * @return ev_AllFMO3InactivatedX
     */
    public BigDecimal getEvAllfmo3inactivatedx() {
        return evAllfmo3inactivatedx;
    }

    /**
     * @param evAllfmo3inactivatedx
     */
    public void setEvAllfmo3inactivatedx(BigDecimal evAllfmo3inactivatedx) {
        this.evAllfmo3inactivatedx = evAllfmo3inactivatedx;
    }

    /**
     * @return ev_AllFMOADH
     */
    public BigDecimal getEvAllfmoadh() {
        return evAllfmoadh;
    }

    /**
     * @param evAllfmoadh
     */
    public void setEvAllfmoadh(BigDecimal evAllfmoadh) {
        this.evAllfmoadh = evAllfmoadh;
    }

    /**
     * @return ev_AllFMOAX
     */
    public BigDecimal getEvAllfmoax() {
        return evAllfmoax;
    }

    /**
     * @param evAllfmoax
     */
    public void setEvAllfmoax(BigDecimal evAllfmoax) {
        this.evAllfmoax = evAllfmoax;
    }

    /**
     * @return ev_AllAIH5N1Re4DH
     */
    public BigDecimal getEvAllaih5n1re4dh() {
        return evAllaih5n1re4dh;
    }

    /**
     * @param evAllaih5n1re4dh
     */
    public void setEvAllaih5n1re4dh(BigDecimal evAllaih5n1re4dh) {
        this.evAllaih5n1re4dh = evAllaih5n1re4dh;
    }

    /**
     * @return ev_AllAIH5N1Re4X
     */
    public BigDecimal getEvAllaih5n1re4x() {
        return evAllaih5n1re4x;
    }

    /**
     * @param evAllaih5n1re4x
     */
    public void setEvAllaih5n1re4x(BigDecimal evAllaih5n1re4x) {
        this.evAllaih5n1re4x = evAllaih5n1re4x;
    }

    /**
     * @return ev_AllAIH5N1Re5DH
     */
    public BigDecimal getEvAllaih5n1re5dh() {
        return evAllaih5n1re5dh;
    }

    /**
     * @param evAllaih5n1re5dh
     */
    public void setEvAllaih5n1re5dh(BigDecimal evAllaih5n1re5dh) {
        this.evAllaih5n1re5dh = evAllaih5n1re5dh;
    }

    /**
     * @return ev_AllAIH5N1Re5X
     */
    public BigDecimal getEvAllaih5n1re5x() {
        return evAllaih5n1re5x;
    }

    /**
     * @param evAllaih5n1re5x
     */
    public void setEvAllaih5n1re5x(BigDecimal evAllaih5n1re5x) {
        this.evAllaih5n1re5x = evAllaih5n1re5x;
    }

    /**
     * @return ev_AllAIH5N1Re5Re4DH
     */
    public BigDecimal getEvAllaih5n1re5re4dh() {
        return evAllaih5n1re5re4dh;
    }

    /**
     * @param evAllaih5n1re5re4dh
     */
    public void setEvAllaih5n1re5re4dh(BigDecimal evAllaih5n1re5re4dh) {
        this.evAllaih5n1re5re4dh = evAllaih5n1re5re4dh;
    }

    /**
     * @return ev_AllAIH5N1Re5Re4X
     */
    public BigDecimal getEvAllaih5n1re5re4x() {
        return evAllaih5n1re5re4x;
    }

    /**
     * @param evAllaih5n1re5re4x
     */
    public void setEvAllaih5n1re5re4x(BigDecimal evAllaih5n1re5re4x) {
        this.evAllaih5n1re5re4x = evAllaih5n1re5re4x;
    }

    /**
     * @return ev_AllAIH5H9DH
     */
    public BigDecimal getEvAllaih5h9dh() {
        return evAllaih5h9dh;
    }

    /**
     * @param evAllaih5h9dh
     */
    public void setEvAllaih5h9dh(BigDecimal evAllaih5h9dh) {
        this.evAllaih5h9dh = evAllaih5h9dh;
    }

    /**
     * @return ev_AllAIH5H9X
     */
    public BigDecimal getEvAllaih5h9x() {
        return evAllaih5h9x;
    }

    /**
     * @param evAllaih5h9x
     */
    public void setEvAllaih5h9x(BigDecimal evAllaih5h9x) {
        this.evAllaih5h9x = evAllaih5h9x;
    }

    /**
     * @return ev_AIH5N1Re6DH
     */
    public BigDecimal getEvAih5n1re6dh() {
        return evAih5n1re6dh;
    }

    /**
     * @param evAih5n1re6dh
     */
    public void setEvAih5n1re6dh(BigDecimal evAih5n1re6dh) {
        this.evAih5n1re6dh = evAih5n1re6dh;
    }

    /**
     * @return ev_AllAIH5N1Re6DH
     */
    public BigDecimal getEvAllaih5n1re6dh() {
        return evAllaih5n1re6dh;
    }

    /**
     * @param evAllaih5n1re6dh
     */
    public void setEvAllaih5n1re6dh(BigDecimal evAllaih5n1re6dh) {
        this.evAllaih5n1re6dh = evAllaih5n1re6dh;
    }

    /**
     * @return ev_AIH5N1Re6X
     */
    public BigDecimal getEvAih5n1re6x() {
        return evAih5n1re6x;
    }

    /**
     * @param evAih5n1re6x
     */
    public void setEvAih5n1re6x(BigDecimal evAih5n1re6x) {
        this.evAih5n1re6x = evAih5n1re6x;
    }

    /**
     * @return ev_AllAIH5N1Re6X
     */
    public BigDecimal getEvAllaih5n1re6x() {
        return evAllaih5n1re6x;
    }

    /**
     * @param evAllaih5n1re6x
     */
    public void setEvAllaih5n1re6x(BigDecimal evAllaih5n1re6x) {
        this.evAllaih5n1re6x = evAllaih5n1re6x;
    }

    /**
     * @return ev_AIH5N1Re7DH
     */
    public BigDecimal getEvAih5n1re7dh() {
        return evAih5n1re7dh;
    }

    /**
     * @param evAih5n1re7dh
     */
    public void setEvAih5n1re7dh(BigDecimal evAih5n1re7dh) {
        this.evAih5n1re7dh = evAih5n1re7dh;
    }

    /**
     * @return ev_AllAIH5N1Re7DH
     */
    public BigDecimal getEvAllaih5n1re7dh() {
        return evAllaih5n1re7dh;
    }

    /**
     * @param evAllaih5n1re7dh
     */
    public void setEvAllaih5n1re7dh(BigDecimal evAllaih5n1re7dh) {
        this.evAllaih5n1re7dh = evAllaih5n1re7dh;
    }

    /**
     * @return ev_AIH5N1Re7X
     */
    public BigDecimal getEvAih5n1re7x() {
        return evAih5n1re7x;
    }

    /**
     * @param evAih5n1re7x
     */
    public void setEvAih5n1re7x(BigDecimal evAih5n1re7x) {
        this.evAih5n1re7x = evAih5n1re7x;
    }

    /**
     * @return ev_AllAIH5N1Re7X
     */
    public BigDecimal getEvAllaih5n1re7x() {
        return evAllaih5n1re7x;
    }

    /**
     * @param evAllaih5n1re7x
     */
    public void setEvAllaih5n1re7x(BigDecimal evAllaih5n1re7x) {
        this.evAllaih5n1re7x = evAllaih5n1re7x;
    }

    /**
     * @return ev_AIH5N1Re6Re7DH
     */
    public BigDecimal getEvAih5n1re6re7dh() {
        return evAih5n1re6re7dh;
    }

    /**
     * @param evAih5n1re6re7dh
     */
    public void setEvAih5n1re6re7dh(BigDecimal evAih5n1re6re7dh) {
        this.evAih5n1re6re7dh = evAih5n1re6re7dh;
    }

    /**
     * @return ev_AllAIH5N1Re6Re7DH
     */
    public BigDecimal getEvAllaih5n1re6re7dh() {
        return evAllaih5n1re6re7dh;
    }

    /**
     * @param evAllaih5n1re6re7dh
     */
    public void setEvAllaih5n1re6re7dh(BigDecimal evAllaih5n1re6re7dh) {
        this.evAllaih5n1re6re7dh = evAllaih5n1re6re7dh;
    }

    /**
     * @return ev_AIH5N1Re6Re7X
     */
    public BigDecimal getEvAih5n1re6re7x() {
        return evAih5n1re6re7x;
    }

    /**
     * @param evAih5n1re6re7x
     */
    public void setEvAih5n1re6re7x(BigDecimal evAih5n1re6re7x) {
        this.evAih5n1re6re7x = evAih5n1re6re7x;
    }

    /**
     * @return ev_AllAIH5N1Re6Re7X
     */
    public BigDecimal getEvAllaih5n1re6re7x() {
        return evAllaih5n1re6re7x;
    }

    /**
     * @param evAllaih5n1re6re7x
     */
    public void setEvAllaih5n1re6re7x(BigDecimal evAllaih5n1re6re7x) {
        this.evAllaih5n1re6re7x = evAllaih5n1re6re7x;
    }

    /**
     * @return ev_AIH5N1Re6Re8DH
     */
    public BigDecimal getEvAih5n1re6re8dh() {
        return evAih5n1re6re8dh;
    }

    /**
     * @param evAih5n1re6re8dh
     */
    public void setEvAih5n1re6re8dh(BigDecimal evAih5n1re6re8dh) {
        this.evAih5n1re6re8dh = evAih5n1re6re8dh;
    }

    /**
     * @return ev_AllAIH5N1Re6Re8DH
     */
    public BigDecimal getEvAllaih5n1re6re8dh() {
        return evAllaih5n1re6re8dh;
    }

    /**
     * @param evAllaih5n1re6re8dh
     */
    public void setEvAllaih5n1re6re8dh(BigDecimal evAllaih5n1re6re8dh) {
        this.evAllaih5n1re6re8dh = evAllaih5n1re6re8dh;
    }

    /**
     * @return ev_AIH5N1Re6Re8X
     */
    public BigDecimal getEvAih5n1re6re8x() {
        return evAih5n1re6re8x;
    }

    /**
     * @param evAih5n1re6re8x
     */
    public void setEvAih5n1re6re8x(BigDecimal evAih5n1re6re8x) {
        this.evAih5n1re6re8x = evAih5n1re6re8x;
    }

    /**
     * @return ev_AllAIH5N1Re6Re8X
     */
    public BigDecimal getEvAllaih5n1re6re8x() {
        return evAllaih5n1re6re8x;
    }

    /**
     * @param evAllaih5n1re6re8x
     */
    public void setEvAllaih5n1re6re8x(BigDecimal evAllaih5n1re6re8x) {
        this.evAllaih5n1re6re8x = evAllaih5n1re6re8x;
    }

    /**
     * @return ev_AIH5N1Re6Re7Re8DH
     */
    public BigDecimal getEvAih5n1re6re7re8dh() {
        return evAih5n1re6re7re8dh;
    }

    /**
     * @param evAih5n1re6re7re8dh
     */
    public void setEvAih5n1re6re7re8dh(BigDecimal evAih5n1re6re7re8dh) {
        this.evAih5n1re6re7re8dh = evAih5n1re6re7re8dh;
    }

    /**
     * @return ev_AllAIH5N1Re6Re7Re8DH
     */
    public BigDecimal getEvAllaih5n1re6re7re8dh() {
        return evAllaih5n1re6re7re8dh;
    }

    /**
     * @param evAllaih5n1re6re7re8dh
     */
    public void setEvAllaih5n1re6re7re8dh(BigDecimal evAllaih5n1re6re7re8dh) {
        this.evAllaih5n1re6re7re8dh = evAllaih5n1re6re7re8dh;
    }

    /**
     * @return ev_AIH5N1Re6Re7Re8X
     */
    public BigDecimal getEvAih5n1re6re7re8x() {
        return evAih5n1re6re7re8x;
    }

    /**
     * @param evAih5n1re6re7re8x
     */
    public void setEvAih5n1re6re7re8x(BigDecimal evAih5n1re6re7re8x) {
        this.evAih5n1re6re7re8x = evAih5n1re6re7re8x;
    }

    /**
     * @return ev_AllAIH5N1Re6Re7Re8X
     */
    public BigDecimal getEvAllaih5n1re6re7re8x() {
        return evAllaih5n1re6re7re8x;
    }

    /**
     * @param evAllaih5n1re6re7re8x
     */
    public void setEvAllaih5n1re6re7re8x(BigDecimal evAllaih5n1re6re7re8x) {
        this.evAllaih5n1re6re7re8x = evAllaih5n1re6re7re8x;
    }

    /**
     * @return ev_AIH5N2D7DH
     */
    public BigDecimal getEvAih5n2d7dh() {
        return evAih5n2d7dh;
    }

    /**
     * @param evAih5n2d7dh
     */
    public void setEvAih5n2d7dh(BigDecimal evAih5n2d7dh) {
        this.evAih5n2d7dh = evAih5n2d7dh;
    }

    /**
     * @return ev_AllAIH5N2D7DH
     */
    public BigDecimal getEvAllaih5n2d7dh() {
        return evAllaih5n2d7dh;
    }

    /**
     * @param evAllaih5n2d7dh
     */
    public void setEvAllaih5n2d7dh(BigDecimal evAllaih5n2d7dh) {
        this.evAllaih5n2d7dh = evAllaih5n2d7dh;
    }

    /**
     * @return ev_AIH5N2D7X
     */
    public BigDecimal getEvAih5n2d7x() {
        return evAih5n2d7x;
    }

    /**
     * @param evAih5n2d7x
     */
    public void setEvAih5n2d7x(BigDecimal evAih5n2d7x) {
        this.evAih5n2d7x = evAih5n2d7x;
    }

    /**
     * @return ev_AllAIH5N2D7X
     */
    public BigDecimal getEvAllaih5n2d7x() {
        return evAllaih5n2d7x;
    }

    /**
     * @param evAllaih5n2d7x
     */
    public void setEvAllaih5n2d7x(BigDecimal evAllaih5n2d7x) {
        this.evAllaih5n2d7x = evAllaih5n2d7x;
    }

    /**
     * @return ev_AllAIRLH5DH
     */
    public BigDecimal getEvAllairlh5dh() {
        return evAllairlh5dh;
    }

    /**
     * @param evAllairlh5dh
     */
    public void setEvAllairlh5dh(BigDecimal evAllairlh5dh) {
        this.evAllairlh5dh = evAllairlh5dh;
    }

    /**
     * @return ev_AllAIRLH5X
     */
    public BigDecimal getEvAllairlh5x() {
        return evAllairlh5x;
    }

    /**
     * @param evAllairlh5x
     */
    public void setEvAllairlh5x(BigDecimal evAllairlh5x) {
        this.evAllairlh5x = evAllairlh5x;
    }

    /**
     * @return ev_AllBEInactivatedDH
     */
    public BigDecimal getEvAllbeinactivateddh() {
        return evAllbeinactivateddh;
    }

    /**
     * @param evAllbeinactivateddh
     */
    public void setEvAllbeinactivateddh(BigDecimal evAllbeinactivateddh) {
        this.evAllbeinactivateddh = evAllbeinactivateddh;
    }

    /**
     * @return ev_AllBEInactivatedX
     */
    public BigDecimal getEvAllbeinactivatedx() {
        return evAllbeinactivatedx;
    }

    /**
     * @param evAllbeinactivatedx
     */
    public void setEvAllbeinactivatedx(BigDecimal evAllbeinactivatedx) {
        this.evAllbeinactivatedx = evAllbeinactivatedx;
    }

    /**
     * @return ev_AllBEDH
     */
    public BigDecimal getEvAllbedh() {
        return evAllbedh;
    }

    /**
     * @param evAllbedh
     */
    public void setEvAllbedh(BigDecimal evAllbedh) {
        this.evAllbedh = evAllbedh;
    }

    /**
     * @return ev_AllBEX
     */
    public BigDecimal getEvAllbex() {
        return evAllbex;
    }

    /**
     * @param evAllbex
     */
    public void setEvAllbex(BigDecimal evAllbex) {
        this.evAllbex = evAllbex;
    }

    /**
     * @return ev_AllCSDH
     */
    public BigDecimal getEvAllcsdh() {
        return evAllcsdh;
    }

    /**
     * @param evAllcsdh
     */
    public void setEvAllcsdh(BigDecimal evAllcsdh) {
        this.evAllcsdh = evAllcsdh;
    }

    /**
     * @return ev_AllCSX
     */
    public BigDecimal getEvAllcsx() {
        return evAllcsx;
    }

    /**
     * @param evAllcsx
     */
    public void setEvAllcsx(BigDecimal evAllcsx) {
        this.evAllcsx = evAllcsx;
    }

    /**
     * @return ev_AllCSPassageDH
     */
    public BigDecimal getEvAllcspassagedh() {
        return evAllcspassagedh;
    }

    /**
     * @param evAllcspassagedh
     */
    public void setEvAllcspassagedh(BigDecimal evAllcspassagedh) {
        this.evAllcspassagedh = evAllcspassagedh;
    }

    /**
     * @return ev_AllCSPassageX
     */
    public BigDecimal getEvAllcspassagex() {
        return evAllcspassagex;
    }

    /**
     * @param evAllcspassagex
     */
    public void setEvAllcspassagex(BigDecimal evAllcspassagex) {
        this.evAllcspassagex = evAllcspassagex;
    }

    /**
     * @return ev_AllNCInactivatedDH
     */
    public BigDecimal getEvAllncinactivateddh() {
        return evAllncinactivateddh;
    }

    /**
     * @param evAllncinactivateddh
     */
    public void setEvAllncinactivateddh(BigDecimal evAllncinactivateddh) {
        this.evAllncinactivateddh = evAllncinactivateddh;
    }

    /**
     * @return ev_AllNCInactivatedX
     */
    public BigDecimal getEvAllncinactivatedx() {
        return evAllncinactivatedx;
    }

    /**
     * @param evAllncinactivatedx
     */
    public void setEvAllncinactivatedx(BigDecimal evAllncinactivatedx) {
        this.evAllncinactivatedx = evAllncinactivatedx;
    }

    /**
     * @return ev_AllNCWeakDH
     */
    public BigDecimal getEvAllncweakdh() {
        return evAllncweakdh;
    }

    /**
     * @param evAllncweakdh
     */
    public void setEvAllncweakdh(BigDecimal evAllncweakdh) {
        this.evAllncweakdh = evAllncweakdh;
    }

    /**
     * @return ev_AllNCWeakX
     */
    public BigDecimal getEvAllncweakx() {
        return evAllncweakx;
    }

    /**
     * @param evAllncweakx
     */
    public void setEvAllncweakx(BigDecimal evAllncweakx) {
        this.evAllncweakx = evAllncweakx;
    }

    /**
     * @return ev_PDPRDH
     */
    public BigDecimal getEvPdprdh() {
        return evPdprdh;
    }

    /**
     * @param evPdprdh
     */
    public void setEvPdprdh(BigDecimal evPdprdh) {
        this.evPdprdh = evPdprdh;
    }

    /**
     * @return ev_AllPDPRDH
     */
    public BigDecimal getEvAllpdprdh() {
        return evAllpdprdh;
    }

    /**
     * @param evAllpdprdh
     */
    public void setEvAllpdprdh(BigDecimal evAllpdprdh) {
        this.evAllpdprdh = evAllpdprdh;
    }

    /**
     * @return ev_PDPRX
     */
    public BigDecimal getEvPdprx() {
        return evPdprx;
    }

    /**
     * @param evPdprx
     */
    public void setEvPdprx(BigDecimal evPdprx) {
        this.evPdprx = evPdprx;
    }

    /**
     * @return ev_AllPDPRX
     */
    public BigDecimal getEvAllpdprx() {
        return evAllpdprx;
    }

    /**
     * @param evAllpdprx
     */
    public void setEvAllpdprx(BigDecimal evAllpdprx) {
        this.evAllpdprx = evAllpdprx;
    }

    /**
     * @return ev_BrucellaS2DH
     */
    public BigDecimal getEvBrucellas2dh() {
        return evBrucellas2dh;
    }

    /**
     * @param evBrucellas2dh
     */
    public void setEvBrucellas2dh(BigDecimal evBrucellas2dh) {
        this.evBrucellas2dh = evBrucellas2dh;
    }

    /**
     * @return ev_AllBrucellaS2DH
     */
    public BigDecimal getEvAllbrucellas2dh() {
        return evAllbrucellas2dh;
    }

    /**
     * @param evAllbrucellas2dh
     */
    public void setEvAllbrucellas2dh(BigDecimal evAllbrucellas2dh) {
        this.evAllbrucellas2dh = evAllbrucellas2dh;
    }

    /**
     * @return ev_BrucellaS2X
     */
    public BigDecimal getEvBrucellas2x() {
        return evBrucellas2x;
    }

    /**
     * @param evBrucellas2x
     */
    public void setEvBrucellas2x(BigDecimal evBrucellas2x) {
        this.evBrucellas2x = evBrucellas2x;
    }

    /**
     * @return ev_AllBrucellaS2X
     */
    public BigDecimal getEvAllbrucellas2x() {
        return evAllbrucellas2x;
    }

    /**
     * @param evAllbrucellas2x
     */
    public void setEvAllbrucellas2x(BigDecimal evAllbrucellas2x) {
        this.evAllbrucellas2x = evAllbrucellas2x;
    }

    /**
     * @return ev_BrucellaA19DH
     */
    public BigDecimal getEvBrucellaa19dh() {
        return evBrucellaa19dh;
    }

    /**
     * @param evBrucellaa19dh
     */
    public void setEvBrucellaa19dh(BigDecimal evBrucellaa19dh) {
        this.evBrucellaa19dh = evBrucellaa19dh;
    }

    /**
     * @return ev_AllBrucellaA19DH
     */
    public BigDecimal getEvAllbrucellaa19dh() {
        return evAllbrucellaa19dh;
    }

    /**
     * @param evAllbrucellaa19dh
     */
    public void setEvAllbrucellaa19dh(BigDecimal evAllbrucellaa19dh) {
        this.evAllbrucellaa19dh = evAllbrucellaa19dh;
    }

    /**
     * @return ev_BrucellaA19X
     */
    public BigDecimal getEvBrucellaa19x() {
        return evBrucellaa19x;
    }

    /**
     * @param evBrucellaa19x
     */
    public void setEvBrucellaa19x(BigDecimal evBrucellaa19x) {
        this.evBrucellaa19x = evBrucellaa19x;
    }

    /**
     * @return ev_AllBrucellaA19X
     */
    public BigDecimal getEvAllbrucellaa19x() {
        return evAllbrucellaa19x;
    }

    /**
     * @param evAllbrucellaa19x
     */
    public void setEvAllbrucellaa19x(BigDecimal evAllbrucellaa19x) {
        this.evAllbrucellaa19x = evAllbrucellaa19x;
    }

    /**
     * @return ev_SheepHydatidDH
     */
    public BigDecimal getEvSheephydatiddh() {
        return evSheephydatiddh;
    }

    /**
     * @param evSheephydatiddh
     */
    public void setEvSheephydatiddh(BigDecimal evSheephydatiddh) {
        this.evSheephydatiddh = evSheephydatiddh;
    }

    /**
     * @return ev_AllSheepHydatidDH
     */
    public BigDecimal getEvAllsheephydatiddh() {
        return evAllsheephydatiddh;
    }

    /**
     * @param evAllsheephydatiddh
     */
    public void setEvAllsheephydatiddh(BigDecimal evAllsheephydatiddh) {
        this.evAllsheephydatiddh = evAllsheephydatiddh;
    }

    /**
     * @return ev_SheepHydatidX
     */
    public BigDecimal getEvSheephydatidx() {
        return evSheephydatidx;
    }

    /**
     * @param evSheephydatidx
     */
    public void setEvSheephydatidx(BigDecimal evSheephydatidx) {
        this.evSheephydatidx = evSheephydatidx;
    }

    /**
     * @return ev_AllSheepHydatidX
     */
    public BigDecimal getEvAllsheephydatidx() {
        return evAllsheephydatidx;
    }

    /**
     * @param evAllsheephydatidx
     */
    public void setEvAllsheephydatidx(BigDecimal evAllsheephydatidx) {
        this.evAllsheephydatidx = evAllsheephydatidx;
    }


    public BigDecimal getEvBrucellam5dh() {
        return evBrucellam5dh;
    }

    public BigDecimal getEvAllbrucellam5dh() {
        return evAllbrucellam5dh;
    }

    public void setEvBrucellam5dh(BigDecimal evBrucellam5dh) {
        this.evBrucellam5dh = evBrucellam5dh;
    }

    public void setEvAllbrucellam5dh(BigDecimal evAllbrucellam5dh) {
        this.evAllbrucellam5dh = evAllbrucellam5dh;
    }

    public BigDecimal getEvBrucellam5x() {
        return evBrucellam5x;
    }

    public BigDecimal getEvAllbrucellam5x() {
        return evAllbrucellam5x;
    }

    public void setEvBrucellam5x(BigDecimal evBrucellam5x) {
        this.evBrucellam5x = evBrucellam5x;
    }

    public void setEvAllbrucellam5x(BigDecimal evAllbrucellam5x) {
        this.evAllbrucellam5x = evAllbrucellam5x;
    }
}