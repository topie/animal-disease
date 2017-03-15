package com.topie.database.core.template.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "b_emergencyvaccine")
public class Emergencyvaccine {
    @Id
    @Column(name = "ev_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String evId;

    @Column(name = "ev_reportId")
    private String evReportid;

    @Column(name = "ev_regionCode")
    private String evRegioncode;

    @Column(name = "ev_regionName")
    private String evRegionname;

    @Column(name = "ev_date")
    private Date evDate;

    @Column(name = "ev_FMOInactivated")
    private BigDecimal evFmoinactivated;

    @Column(name = "ev_FMOSynthetic")
    private BigDecimal evFmosynthetic;

    @Column(name = "ev_FMOSInactivated")
    private BigDecimal evFmosinactivated;

    @Column(name = "ev_FMOAS")
    private BigDecimal evFmoas;

    @Column(name = "ev_FMOA")
    private BigDecimal evFmoa;

    @Column(name = "ev_AIRLH5")
    private BigDecimal evAirlh5;

    @Column(name = "ev_AIH5N1Re5Re4")
    private BigDecimal evAih5n1re5re4;

    @Column(name = "ev_AIH5N1Re4")
    private BigDecimal evAih5n1re4;

    @Column(name = "ev_AIH5N1Re5")
    private BigDecimal evAih5n1re5;

    @Column(name = "ev_AIH5H9")
    private BigDecimal evAih5h9;

    @Column(name = "ev_BE")
    private BigDecimal evBe;

    @Column(name = "ev_BEInactivated")
    private BigDecimal evBeinactivated;

    @Column(name = "ev_CS")
    private BigDecimal evCs;

    @Column(name = "ev_CSPassage")
    private BigDecimal evCspassage;

    @Column(name = "ev_NCInactivated")
    private BigDecimal evNcinactivated;

    @Column(name = "ev_NCWeak")
    private BigDecimal evNcweak;

    @Column(name = "ev_AllFMOInactivated")
    private BigDecimal evAllfmoinactivated;

    @Column(name = "ev_AllFMOSynthetic")
    private BigDecimal evAllfmosynthetic;

    @Column(name = "ev_AllFMOSInactivated")
    private BigDecimal evAllfmosinactivated;

    @Column(name = "ev_AllFMOAS")
    private BigDecimal evAllfmoas;

    @Column(name = "ev_AllFMOA")
    private BigDecimal evAllfmoa;

    @Column(name = "ev_AllAIRLH5")
    private BigDecimal evAllairlh5;

    @Column(name = "ev_AllAIH5N1Re5Re4")
    private BigDecimal evAllaih5n1re5re4;

    @Column(name = "ev_AllAIH5N1Re4")
    private BigDecimal evAllaih5n1re4;

    @Column(name = "ev_AllAIH5N1Re5")
    private BigDecimal evAllaih5n1re5;

    @Column(name = "ev_AllAIH5H9")
    private BigDecimal evAllaih5h9;

    @Column(name = "ev_AllBE")
    private BigDecimal evAllbe;

    @Column(name = "ev_AllBEInactivated")
    private BigDecimal evAllbeinactivated;

    @Column(name = "ev_AllCS")
    private BigDecimal evAllcs;

    @Column(name = "ev_AllCSPassage")
    private BigDecimal evAllcspassage;

    @Column(name = "ev_AllNCInactivated")
    private BigDecimal evAllncinactivated;

    @Column(name = "ev_AllNCWeak")
    private BigDecimal evAllncweak;

    @Column(name = "ev_FMOAAIT")
    private BigDecimal evFmoaait;

    @Column(name = "ev_AllFMOAAIT")
    private BigDecimal evAllfmoaait;

    @Column(name = "ev_AIH5N1Re6")
    private BigDecimal evAih5n1re6;

    @Column(name = "ev_AllAIH5N1Re6")
    private BigDecimal evAllaih5n1re6;

    @Column(name = "ev_AIH5N1Re7")
    private BigDecimal evAih5n1re7;

    @Column(name = "ev_AllAIH5N1Re7")
    private BigDecimal evAllaih5n1re7;

    @Column(name = "ev_AIH5N1Re6Re7")
    private BigDecimal evAih5n1re6re7;

    @Column(name = "ev_AllAIH5N1Re6Re7")
    private BigDecimal evAllaih5n1re6re7;

    @Column(name = "ev_AIH5N1Re6Re8")
    private BigDecimal evAih5n1re6re8;

    @Column(name = "ev_AllAIH5N1Re6Re8")
    private BigDecimal evAllaih5n1re6re8;

    @Column(name = "ev_AIH5N1Re6Re7Re8")
    private BigDecimal evAih5n1re6re7re8;

    @Column(name = "ev_AllAIH5N1Re6Re7Re8")
    private BigDecimal evAllaih5n1re6re7re8;

    @Column(name = "ev_AIH5N2D7")
    private BigDecimal evAih5n2d7;

    @Column(name = "ev_AllAIH5N2D7")
    private BigDecimal evAllaih5n2d7;

    @Column(name = "ev_PDPR")
    private BigDecimal evPdpr;

    @Column(name = "ev_AllPDPR")
    private BigDecimal evAllpdpr;

    @Column(name = "ev_BrucellaS2")
    private BigDecimal evBrucellas2;

    @Column(name = "ev_AllBrucellaS2")
    private BigDecimal evAllbrucellas2;

    @Column(name = "ev_BrucellaA19")
    private BigDecimal evBrucellaa19;

    @Column(name = "ev_AllBrucellaA19")
    private BigDecimal evAllbrucellaa19;

    @Column(name = "ev_SheepHydatid")
    private BigDecimal evSheephydatid;

    @Column(name = "ev_AllSheepHydatid")
    private BigDecimal evAllsheephydatid;

    /**
     * @return ev_id
     */
    public String getEvId() {
        return evId;
    }

    /**
     * @param evId
     */
    public void setEvId(String evId) {
        this.evId = evId;
    }

    /**
     * @return ev_reportId
     */
    public String getEvReportid() {
        return evReportid;
    }

    /**
     * @param evReportid
     */
    public void setEvReportid(String evReportid) {
        this.evReportid = evReportid;
    }

    /**
     * @return ev_regionCode
     */
    public String getEvRegioncode() {
        return evRegioncode;
    }

    /**
     * @param evRegioncode
     */
    public void setEvRegioncode(String evRegioncode) {
        this.evRegioncode = evRegioncode;
    }

    /**
     * @return ev_regionName
     */
    public String getEvRegionname() {
        return evRegionname;
    }

    /**
     * @param evRegionname
     */
    public void setEvRegionname(String evRegionname) {
        this.evRegionname = evRegionname;
    }

    /**
     * @return ev_date
     */
    public Date getEvDate() {
        return evDate;
    }

    /**
     * @param evDate
     */
    public void setEvDate(Date evDate) {
        this.evDate = evDate;
    }

    /**
     * @return ev_FMOInactivated
     */
    public BigDecimal getEvFmoinactivated() {
        return evFmoinactivated;
    }

    /**
     * @param evFmoinactivated
     */
    public void setEvFmoinactivated(BigDecimal evFmoinactivated) {
        this.evFmoinactivated = evFmoinactivated;
    }

    /**
     * @return ev_FMOSynthetic
     */
    public BigDecimal getEvFmosynthetic() {
        return evFmosynthetic;
    }

    /**
     * @param evFmosynthetic
     */
    public void setEvFmosynthetic(BigDecimal evFmosynthetic) {
        this.evFmosynthetic = evFmosynthetic;
    }

    /**
     * @return ev_FMOSInactivated
     */
    public BigDecimal getEvFmosinactivated() {
        return evFmosinactivated;
    }

    /**
     * @param evFmosinactivated
     */
    public void setEvFmosinactivated(BigDecimal evFmosinactivated) {
        this.evFmosinactivated = evFmosinactivated;
    }

    /**
     * @return ev_FMOAS
     */
    public BigDecimal getEvFmoas() {
        return evFmoas;
    }

    /**
     * @param evFmoas
     */
    public void setEvFmoas(BigDecimal evFmoas) {
        this.evFmoas = evFmoas;
    }

    /**
     * @return ev_FMOA
     */
    public BigDecimal getEvFmoa() {
        return evFmoa;
    }

    /**
     * @param evFmoa
     */
    public void setEvFmoa(BigDecimal evFmoa) {
        this.evFmoa = evFmoa;
    }

    /**
     * @return ev_AIRLH5
     */
    public BigDecimal getEvAirlh5() {
        return evAirlh5;
    }

    /**
     * @param evAirlh5
     */
    public void setEvAirlh5(BigDecimal evAirlh5) {
        this.evAirlh5 = evAirlh5;
    }

    /**
     * @return ev_AIH5N1Re5Re4
     */
    public BigDecimal getEvAih5n1re5re4() {
        return evAih5n1re5re4;
    }

    /**
     * @param evAih5n1re5re4
     */
    public void setEvAih5n1re5re4(BigDecimal evAih5n1re5re4) {
        this.evAih5n1re5re4 = evAih5n1re5re4;
    }

    /**
     * @return ev_AIH5N1Re4
     */
    public BigDecimal getEvAih5n1re4() {
        return evAih5n1re4;
    }

    /**
     * @param evAih5n1re4
     */
    public void setEvAih5n1re4(BigDecimal evAih5n1re4) {
        this.evAih5n1re4 = evAih5n1re4;
    }

    /**
     * @return ev_AIH5N1Re5
     */
    public BigDecimal getEvAih5n1re5() {
        return evAih5n1re5;
    }

    /**
     * @param evAih5n1re5
     */
    public void setEvAih5n1re5(BigDecimal evAih5n1re5) {
        this.evAih5n1re5 = evAih5n1re5;
    }

    /**
     * @return ev_AIH5H9
     */
    public BigDecimal getEvAih5h9() {
        return evAih5h9;
    }

    /**
     * @param evAih5h9
     */
    public void setEvAih5h9(BigDecimal evAih5h9) {
        this.evAih5h9 = evAih5h9;
    }

    /**
     * @return ev_BE
     */
    public BigDecimal getEvBe() {
        return evBe;
    }

    /**
     * @param evBe
     */
    public void setEvBe(BigDecimal evBe) {
        this.evBe = evBe;
    }

    /**
     * @return ev_BEInactivated
     */
    public BigDecimal getEvBeinactivated() {
        return evBeinactivated;
    }

    /**
     * @param evBeinactivated
     */
    public void setEvBeinactivated(BigDecimal evBeinactivated) {
        this.evBeinactivated = evBeinactivated;
    }

    /**
     * @return ev_CS
     */
    public BigDecimal getEvCs() {
        return evCs;
    }

    /**
     * @param evCs
     */
    public void setEvCs(BigDecimal evCs) {
        this.evCs = evCs;
    }

    /**
     * @return ev_CSPassage
     */
    public BigDecimal getEvCspassage() {
        return evCspassage;
    }

    /**
     * @param evCspassage
     */
    public void setEvCspassage(BigDecimal evCspassage) {
        this.evCspassage = evCspassage;
    }

    /**
     * @return ev_NCInactivated
     */
    public BigDecimal getEvNcinactivated() {
        return evNcinactivated;
    }

    /**
     * @param evNcinactivated
     */
    public void setEvNcinactivated(BigDecimal evNcinactivated) {
        this.evNcinactivated = evNcinactivated;
    }

    /**
     * @return ev_NCWeak
     */
    public BigDecimal getEvNcweak() {
        return evNcweak;
    }

    /**
     * @param evNcweak
     */
    public void setEvNcweak(BigDecimal evNcweak) {
        this.evNcweak = evNcweak;
    }

    /**
     * @return ev_AllFMOInactivated
     */
    public BigDecimal getEvAllfmoinactivated() {
        return evAllfmoinactivated;
    }

    /**
     * @param evAllfmoinactivated
     */
    public void setEvAllfmoinactivated(BigDecimal evAllfmoinactivated) {
        this.evAllfmoinactivated = evAllfmoinactivated;
    }

    /**
     * @return ev_AllFMOSynthetic
     */
    public BigDecimal getEvAllfmosynthetic() {
        return evAllfmosynthetic;
    }

    /**
     * @param evAllfmosynthetic
     */
    public void setEvAllfmosynthetic(BigDecimal evAllfmosynthetic) {
        this.evAllfmosynthetic = evAllfmosynthetic;
    }

    /**
     * @return ev_AllFMOSInactivated
     */
    public BigDecimal getEvAllfmosinactivated() {
        return evAllfmosinactivated;
    }

    /**
     * @param evAllfmosinactivated
     */
    public void setEvAllfmosinactivated(BigDecimal evAllfmosinactivated) {
        this.evAllfmosinactivated = evAllfmosinactivated;
    }

    /**
     * @return ev_AllFMOAS
     */
    public BigDecimal getEvAllfmoas() {
        return evAllfmoas;
    }

    /**
     * @param evAllfmoas
     */
    public void setEvAllfmoas(BigDecimal evAllfmoas) {
        this.evAllfmoas = evAllfmoas;
    }

    /**
     * @return ev_AllFMOA
     */
    public BigDecimal getEvAllfmoa() {
        return evAllfmoa;
    }

    /**
     * @param evAllfmoa
     */
    public void setEvAllfmoa(BigDecimal evAllfmoa) {
        this.evAllfmoa = evAllfmoa;
    }

    /**
     * @return ev_AllAIRLH5
     */
    public BigDecimal getEvAllairlh5() {
        return evAllairlh5;
    }

    /**
     * @param evAllairlh5
     */
    public void setEvAllairlh5(BigDecimal evAllairlh5) {
        this.evAllairlh5 = evAllairlh5;
    }

    /**
     * @return ev_AllAIH5N1Re5Re4
     */
    public BigDecimal getEvAllaih5n1re5re4() {
        return evAllaih5n1re5re4;
    }

    /**
     * @param evAllaih5n1re5re4
     */
    public void setEvAllaih5n1re5re4(BigDecimal evAllaih5n1re5re4) {
        this.evAllaih5n1re5re4 = evAllaih5n1re5re4;
    }

    /**
     * @return ev_AllAIH5N1Re4
     */
    public BigDecimal getEvAllaih5n1re4() {
        return evAllaih5n1re4;
    }

    /**
     * @param evAllaih5n1re4
     */
    public void setEvAllaih5n1re4(BigDecimal evAllaih5n1re4) {
        this.evAllaih5n1re4 = evAllaih5n1re4;
    }

    /**
     * @return ev_AllAIH5N1Re5
     */
    public BigDecimal getEvAllaih5n1re5() {
        return evAllaih5n1re5;
    }

    /**
     * @param evAllaih5n1re5
     */
    public void setEvAllaih5n1re5(BigDecimal evAllaih5n1re5) {
        this.evAllaih5n1re5 = evAllaih5n1re5;
    }

    /**
     * @return ev_AllAIH5H9
     */
    public BigDecimal getEvAllaih5h9() {
        return evAllaih5h9;
    }

    /**
     * @param evAllaih5h9
     */
    public void setEvAllaih5h9(BigDecimal evAllaih5h9) {
        this.evAllaih5h9 = evAllaih5h9;
    }

    /**
     * @return ev_AllBE
     */
    public BigDecimal getEvAllbe() {
        return evAllbe;
    }

    /**
     * @param evAllbe
     */
    public void setEvAllbe(BigDecimal evAllbe) {
        this.evAllbe = evAllbe;
    }

    /**
     * @return ev_AllBEInactivated
     */
    public BigDecimal getEvAllbeinactivated() {
        return evAllbeinactivated;
    }

    /**
     * @param evAllbeinactivated
     */
    public void setEvAllbeinactivated(BigDecimal evAllbeinactivated) {
        this.evAllbeinactivated = evAllbeinactivated;
    }

    /**
     * @return ev_AllCS
     */
    public BigDecimal getEvAllcs() {
        return evAllcs;
    }

    /**
     * @param evAllcs
     */
    public void setEvAllcs(BigDecimal evAllcs) {
        this.evAllcs = evAllcs;
    }

    /**
     * @return ev_AllCSPassage
     */
    public BigDecimal getEvAllcspassage() {
        return evAllcspassage;
    }

    /**
     * @param evAllcspassage
     */
    public void setEvAllcspassage(BigDecimal evAllcspassage) {
        this.evAllcspassage = evAllcspassage;
    }

    /**
     * @return ev_AllNCInactivated
     */
    public BigDecimal getEvAllncinactivated() {
        return evAllncinactivated;
    }

    /**
     * @param evAllncinactivated
     */
    public void setEvAllncinactivated(BigDecimal evAllncinactivated) {
        this.evAllncinactivated = evAllncinactivated;
    }

    /**
     * @return ev_AllNCWeak
     */
    public BigDecimal getEvAllncweak() {
        return evAllncweak;
    }

    /**
     * @param evAllncweak
     */
    public void setEvAllncweak(BigDecimal evAllncweak) {
        this.evAllncweak = evAllncweak;
    }

    /**
     * @return ev_FMOAAIT
     */
    public BigDecimal getEvFmoaait() {
        return evFmoaait;
    }

    /**
     * @param evFmoaait
     */
    public void setEvFmoaait(BigDecimal evFmoaait) {
        this.evFmoaait = evFmoaait;
    }

    /**
     * @return ev_AllFMOAAIT
     */
    public BigDecimal getEvAllfmoaait() {
        return evAllfmoaait;
    }

    /**
     * @param evAllfmoaait
     */
    public void setEvAllfmoaait(BigDecimal evAllfmoaait) {
        this.evAllfmoaait = evAllfmoaait;
    }

    /**
     * @return ev_AIH5N1Re6
     */
    public BigDecimal getEvAih5n1re6() {
        return evAih5n1re6;
    }

    /**
     * @param evAih5n1re6
     */
    public void setEvAih5n1re6(BigDecimal evAih5n1re6) {
        this.evAih5n1re6 = evAih5n1re6;
    }

    /**
     * @return ev_AllAIH5N1Re6
     */
    public BigDecimal getEvAllaih5n1re6() {
        return evAllaih5n1re6;
    }

    /**
     * @param evAllaih5n1re6
     */
    public void setEvAllaih5n1re6(BigDecimal evAllaih5n1re6) {
        this.evAllaih5n1re6 = evAllaih5n1re6;
    }

    /**
     * @return ev_AIH5N1Re7
     */
    public BigDecimal getEvAih5n1re7() {
        return evAih5n1re7;
    }

    /**
     * @param evAih5n1re7
     */
    public void setEvAih5n1re7(BigDecimal evAih5n1re7) {
        this.evAih5n1re7 = evAih5n1re7;
    }

    /**
     * @return ev_AllAIH5N1Re7
     */
    public BigDecimal getEvAllaih5n1re7() {
        return evAllaih5n1re7;
    }

    /**
     * @param evAllaih5n1re7
     */
    public void setEvAllaih5n1re7(BigDecimal evAllaih5n1re7) {
        this.evAllaih5n1re7 = evAllaih5n1re7;
    }

    /**
     * @return ev_AIH5N1Re6Re7
     */
    public BigDecimal getEvAih5n1re6re7() {
        return evAih5n1re6re7;
    }

    /**
     * @param evAih5n1re6re7
     */
    public void setEvAih5n1re6re7(BigDecimal evAih5n1re6re7) {
        this.evAih5n1re6re7 = evAih5n1re6re7;
    }

    /**
     * @return ev_AllAIH5N1Re6Re7
     */
    public BigDecimal getEvAllaih5n1re6re7() {
        return evAllaih5n1re6re7;
    }

    /**
     * @param evAllaih5n1re6re7
     */
    public void setEvAllaih5n1re6re7(BigDecimal evAllaih5n1re6re7) {
        this.evAllaih5n1re6re7 = evAllaih5n1re6re7;
    }

    /**
     * @return ev_AIH5N1Re6Re8
     */
    public BigDecimal getEvAih5n1re6re8() {
        return evAih5n1re6re8;
    }

    /**
     * @param evAih5n1re6re8
     */
    public void setEvAih5n1re6re8(BigDecimal evAih5n1re6re8) {
        this.evAih5n1re6re8 = evAih5n1re6re8;
    }

    /**
     * @return ev_AllAIH5N1Re6Re8
     */
    public BigDecimal getEvAllaih5n1re6re8() {
        return evAllaih5n1re6re8;
    }

    /**
     * @param evAllaih5n1re6re8
     */
    public void setEvAllaih5n1re6re8(BigDecimal evAllaih5n1re6re8) {
        this.evAllaih5n1re6re8 = evAllaih5n1re6re8;
    }

    /**
     * @return ev_AIH5N1Re6Re7Re8
     */
    public BigDecimal getEvAih5n1re6re7re8() {
        return evAih5n1re6re7re8;
    }

    /**
     * @param evAih5n1re6re7re8
     */
    public void setEvAih5n1re6re7re8(BigDecimal evAih5n1re6re7re8) {
        this.evAih5n1re6re7re8 = evAih5n1re6re7re8;
    }

    /**
     * @return ev_AllAIH5N1Re6Re7Re8
     */
    public BigDecimal getEvAllaih5n1re6re7re8() {
        return evAllaih5n1re6re7re8;
    }

    /**
     * @param evAllaih5n1re6re7re8
     */
    public void setEvAllaih5n1re6re7re8(BigDecimal evAllaih5n1re6re7re8) {
        this.evAllaih5n1re6re7re8 = evAllaih5n1re6re7re8;
    }

    /**
     * @return ev_AIH5N2D7
     */
    public BigDecimal getEvAih5n2d7() {
        return evAih5n2d7;
    }

    /**
     * @param evAih5n2d7
     */
    public void setEvAih5n2d7(BigDecimal evAih5n2d7) {
        this.evAih5n2d7 = evAih5n2d7;
    }

    /**
     * @return ev_AllAIH5N2D7
     */
    public BigDecimal getEvAllaih5n2d7() {
        return evAllaih5n2d7;
    }

    /**
     * @param evAllaih5n2d7
     */
    public void setEvAllaih5n2d7(BigDecimal evAllaih5n2d7) {
        this.evAllaih5n2d7 = evAllaih5n2d7;
    }

    /**
     * @return ev_PDPR
     */
    public BigDecimal getEvPdpr() {
        return evPdpr;
    }

    /**
     * @param evPdpr
     */
    public void setEvPdpr(BigDecimal evPdpr) {
        this.evPdpr = evPdpr;
    }

    /**
     * @return ev_AllPDPR
     */
    public BigDecimal getEvAllpdpr() {
        return evAllpdpr;
    }

    /**
     * @param evAllpdpr
     */
    public void setEvAllpdpr(BigDecimal evAllpdpr) {
        this.evAllpdpr = evAllpdpr;
    }

    /**
     * @return ev_BrucellaS2
     */
    public BigDecimal getEvBrucellas2() {
        return evBrucellas2;
    }

    /**
     * @param evBrucellas2
     */
    public void setEvBrucellas2(BigDecimal evBrucellas2) {
        this.evBrucellas2 = evBrucellas2;
    }

    /**
     * @return ev_AllBrucellaS2
     */
    public BigDecimal getEvAllbrucellas2() {
        return evAllbrucellas2;
    }

    /**
     * @param evAllbrucellas2
     */
    public void setEvAllbrucellas2(BigDecimal evAllbrucellas2) {
        this.evAllbrucellas2 = evAllbrucellas2;
    }

    /**
     * @return ev_BrucellaA19
     */
    public BigDecimal getEvBrucellaa19() {
        return evBrucellaa19;
    }

    /**
     * @param evBrucellaa19
     */
    public void setEvBrucellaa19(BigDecimal evBrucellaa19) {
        this.evBrucellaa19 = evBrucellaa19;
    }

    /**
     * @return ev_AllBrucellaA19
     */
    public BigDecimal getEvAllbrucellaa19() {
        return evAllbrucellaa19;
    }

    /**
     * @param evAllbrucellaa19
     */
    public void setEvAllbrucellaa19(BigDecimal evAllbrucellaa19) {
        this.evAllbrucellaa19 = evAllbrucellaa19;
    }

    /**
     * @return ev_SheepHydatid
     */
    public BigDecimal getEvSheephydatid() {
        return evSheephydatid;
    }

    /**
     * @param evSheephydatid
     */
    public void setEvSheephydatid(BigDecimal evSheephydatid) {
        this.evSheephydatid = evSheephydatid;
    }

    /**
     * @return ev_AllSheepHydatid
     */
    public BigDecimal getEvAllsheephydatid() {
        return evAllsheephydatid;
    }

    /**
     * @param evAllsheephydatid
     */
    public void setEvAllsheephydatid(BigDecimal evAllsheephydatid) {
        this.evAllsheephydatid = evAllsheephydatid;
    }
}