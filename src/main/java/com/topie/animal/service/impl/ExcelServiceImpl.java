package com.topie.animal.service.impl;

import com.topie.animal.constant.ReportTypeE;
import com.topie.animal.service.*;
import com.topie.animal.util.BeginTimeUtil;
import com.topie.animal.util.PeriodUtil;
import com.topie.common.tools.freemarker.FreeMarkerUtil;
import com.topie.common.utils.UUIDUtil;
import com.topie.common.utils.date.DateStyle;
import com.topie.common.utils.date.DateUtil;
import com.topie.database.core.animal.dao.RegionMapper;
import com.topie.database.core.animal.dao.WeekConfigMapper;
import com.topie.database.core.animal.model.*;
import com.topie.database.core.template.dao.*;
import com.topie.database.core.template.model.*;
import com.topie.system.service.ILogService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.entity.Example;

import javax.persistence.Column;
import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Field;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by chenguojun on 2017/2/21.
 */
@Service
public class ExcelServiceImpl implements IExcelService {

    @Autowired
    private IUserInfoService iUserInfoService;

    @Autowired
    private ITemplateService iTemplateService;

    @Autowired
    private IReportService iReportService;

    @Autowired
    private IOrgInfoService iOrgInfoService;

    @Autowired
    private RegionMapper regionMapper;

    @Autowired
    private LiveStockInOutMapper liveStockInOutMapper;

    @Autowired
    private DisinfectiondrugsMapper disinfectiondrugsMapper;

    @Autowired
    private WfootandmouthdiseaseMapper wfootandmouthdiseaseMapper;

    @Autowired
    private WlivestockinoutMapper wlivestockinoutMapper;

    @Autowired
    private WeekConfigMapper weekConfigMapper;

    @Autowired
    private AvianinfluenzaMapper avianinfluenzaMapper;

    @Autowired
    private BlueeardiseaseMapper blueeardiseaseMapper;

    @Autowired
    private BrucellosisDiseaseMapper brucellosisDiseaseMapper;

    @Autowired
    private ClassicalswinefeverMapper classicalswinefeverMapper;

    @Autowired
    private FootandmouthdiseaseMapper footandmouthdiseaseMapper;

    @Autowired
    private NewcastleMapper newcastleMapper;

    @Autowired
    private PestedespetitsruminantsMapper pestedespetitsruminantsMapper;

    @Autowired
    private VaccineorderMapper vaccineorderMapper;

    @Autowired
    private WblueeardiseaseMapper wblueeardiseaseMapper;

    @Autowired
    private WclassicalswinefeverMapper wclassicalswinefeverMapper;

    @Autowired
    private WnewcastleMapper wnewcastleMapper;

    @Autowired
    private WavianinfluenzaMapper wavianinfluenzaMapper;

    @Autowired
    private WpestedespetitsruminantsMapper wpestedespetitsruminantsMapper;

    @Autowired
    private AvianinfluenzavaccineMapper avianinfluenzavaccineMapper;

    @Autowired
    private BluevaccineMapper bluevaccineMapper;

    @Autowired
    private ClassicalswinefevervaccineMapper classicalswinefevervaccineMapper;

    @Autowired
    private FootandmouthvaccineMapper footandmouthvaccineMapper;

    @Autowired
    private KingfisherMapper kingfisherMapper;

    @Autowired
    private KingfisherNewMapper kingfisherNewMapper;

    @Autowired
    private LivestockdensityMapper livestockdensityMapper;

    @Autowired
    private NewcastlevaccineMapper newcastlevaccineMapper;

    @Autowired
    private PoultrydensityMapper poultrydensityMapper;

    @Autowired
    private SmallruminantsvaccineMapper smallruminantsvaccineMapper;

    @Autowired
    private EmergencyvaccineMapper emergencyvaccineMapper;

    @Autowired
    private WbrucellosisMapper wbrucellosisMapper;

    @Autowired
    private BrucellosisVaccineMapper brucellosisVaccineMapper;

    @Autowired
    private EchinococciasisDiseaseMapper echinococciasisDiseaseMapper;

    @Autowired
    private EchinococciasisVaccineMapper echinococciasisVaccineMapper;

    @Autowired
    private WechinococciasisMapper wechinococciasisMapper;

    public static final String B_PESTEDESPETISRUMINANTS_DATE="2018-05-31 23:59:59";
    public static final String B_AVIANINFLUENZAVACCINE_DATE="2018-06-30 23:59:59";


    @Autowired
    private ILogService iLogService;

    private Wlivestockinout getWlivestockinout(Region region, Date date) {
        Date beginTime = BeginTimeUtil.getCurrentHalfYearBeginTime(date);
        String beginTimeStr = DateUtil.DateToString(beginTime, DateStyle.HH_MM.YYYY_MM_DD_HH_MM_SS);
        Wlivestockinout wlivestockinout = new Wlivestockinout();
        wlivestockinout = this.wlivestockinoutMapper
                .selectLivestockInOutByRegionCode(region.getRegionCode(), beginTimeStr);
        return wlivestockinout;
    }

    @Override
    public String getReportHtml(HttpServletRequest request, Report report)  {
        Map params = new HashMap();

        UserInfo userInfo = iUserInfoService.selectByKey(report.getReportUserId());
        params.put("user", userInfo);
        Template template = iTemplateService.selectByKey(report.getTemplateId());
        Map<String, String> weekConfigMap = null;
        if (report.getReportType() == ReportTypeE.WEEK.getCode().intValue()) {
            weekConfigMap = new HashMap();
            List<WeekConfig> weekConfigs = weekConfigMapper.selectAll();
            for (WeekConfig weekConfig : weekConfigs) {
                weekConfigMap.put(weekConfig.getYear() + "#" + weekConfig.getType(), weekConfig.getTime());
            }
        }
        String period = PeriodUtil.build(report.getReportType(), report.getBeginTime(), weekConfigMap);
        params.put("templateName", period + " " + template.getTemplateName());
        OrgInfo orgInfo = iOrgInfoService.selectByKey(userInfo.getOrgId());
        params.put("org", orgInfo);
        params.put("report", report);
        Region region = regionMapper.selectByPrimaryKey(orgInfo.getRegionCode());
        Wlivestockinout wlivestockinout = getWlivestockinout(region, report.getBeginTime());
        if (wlivestockinout == null) {
            wlivestockinout = new Wlivestockinout();
        }
        params.put("wlivestockinout", wlivestockinout);
        Date monthBeginTime = BeginTimeUtil.getMonthBeginTime(report.getBeginTime());
        Date beginTime = BeginTimeUtil.getBeginTime(report.getBeginTime());
        Date halfYearbeginTime = BeginTimeUtil.getCurrentHalfYearBeginTime(report.getBeginTime());
        Date endTime = report.getBeginTime();

        switch (template.getTableName().toLowerCase()) {
            case "b_avianinfluenza": {
                Avianinfluenza arg = new Avianinfluenza();
                arg.setAiReportid(report.getReportId());
                List<Avianinfluenza> items = avianinfluenzaMapper.select(arg);
                Avianinfluenza item = new Avianinfluenza();
                if (items.size() > 0) {
                    item = items.get(0);
                }
                params.put("item", item);
                Avianinfluenza itemSum = avianinfluenzaMapper
                        .selectSumByReportCode(region.getRegionCode(), monthBeginTime, endTime);
                if (itemSum == null) {
                    itemSum = new Avianinfluenza();
                }
                params.put("itemSum", itemSum);
                break;
            }
            case "b_emergencyvaccine": {
                Emergencyvaccine arg = new Emergencyvaccine();
                arg.setEvReportid(report.getReportId());
                List<Emergencyvaccine> items = emergencyvaccineMapper.select(arg);
                Emergencyvaccine item = new Emergencyvaccine();
                if (items.size() > 0) {
                    item = items.get(0);
                }
                params.put("item", item);
                break;
            }
            case "b_smallruminantsvaccine": {
                Smallruminantsvaccine arg = new Smallruminantsvaccine();
                arg.setSrvReportid(report.getReportId());
                List<Smallruminantsvaccine> items = smallruminantsvaccineMapper.select(arg);
                Smallruminantsvaccine item = new Smallruminantsvaccine();
                if (items.size() > 0) {
                    item = items.get(0);
                }
                params.put("item", item);
                break;
            }
            case "b_poultrydensity": {
                Poultrydensity arg = new Poultrydensity();
                arg.setPdReportid(report.getReportId());
                List<Poultrydensity> items = poultrydensityMapper.select(arg);
                Poultrydensity item = new Poultrydensity();
                if (items.size() > 0) {
                    item = items.get(0);
                }
                params.put("item", item);
                break;
            }
            case "b_newcastlevaccine": {
                Newcastlevaccine arg = new Newcastlevaccine();
                arg.setNvReportid(report.getReportId());
                List<Newcastlevaccine> items = newcastlevaccineMapper.select(arg);
                Newcastlevaccine item = new Newcastlevaccine();
                if (items.size() > 0) {
                    item = items.get(0);
                }
                params.put("item", item);
                break;
            }
            case "b_livestockdensity": {
                Livestockdensity arg = new Livestockdensity();
                arg.setLdReportid(report.getReportId());
                List<Livestockdensity> items = livestockdensityMapper.select(arg);
                Livestockdensity item = new Livestockdensity();
                if (items.size() > 0) {
                    item = items.get(0);
                }
                params.put("item", item);
                break;
            }
            case "b_kingfisher": {
                Kingfisher arg = new Kingfisher();
                arg.setKfReportid(report.getReportId());
                List<Kingfisher> items = kingfisherMapper.select(arg);
                Kingfisher item = new Kingfisher();
                if (items.size() > 0) {
                    item = items.get(0);
                }
                params.put("item", item);
                break;
            }
            case "b_kingfisher_new": {
                KingfisherNew arg = new KingfisherNew();
                arg.setKfReportid(report.getReportId());
                List<KingfisherNew> items = kingfisherNewMapper.select(arg);
                KingfisherNew item = new KingfisherNew();
                if (items.size() > 0) {
                    item = items.get(0);
                }
                params.put("item", item);
                break;
            }
            case "b_footandmouthvaccine": {
                Footandmouthvaccine arg = new Footandmouthvaccine();
                arg.setFvReportid(report.getReportId());
                List<Footandmouthvaccine> items = footandmouthvaccineMapper.select(arg);
                Footandmouthvaccine item = new Footandmouthvaccine();
                if (items.size() > 0) {
                    item = items.get(0);
                }
                params.put("item", item);
                break;
            }
            case "b_classicalswinefevervaccine": {
                Classicalswinefevervaccine arg = new Classicalswinefevervaccine();
                arg.setCvReportid(report.getReportId());
                List<Classicalswinefevervaccine> items = classicalswinefevervaccineMapper.select(arg);
                Classicalswinefevervaccine item = new Classicalswinefevervaccine();
                if (items.size() > 0) {
                    item = items.get(0);
                }
                params.put("item", item);
                break;
            }
            case "b_bluevaccine": {
                Bluevaccine arg = new Bluevaccine();
                arg.setBvReportid(report.getReportId());
                List<Bluevaccine> items = bluevaccineMapper.select(arg);
                Bluevaccine item = new Bluevaccine();
                if (items.size() > 0) {
                    item = items.get(0);
                }
                params.put("item", item);
                break;
            }
            case "b_echinococciasisvaccine": {
                EchinococciasisVaccine arg = new EchinococciasisVaccine();
                arg.setEchReportid(report.getReportId());
                List<EchinococciasisVaccine> items = echinococciasisVaccineMapper.select(arg);
                EchinococciasisVaccine item = new EchinococciasisVaccine();
                if (items.size() > 0) {
                    item = items.get(0);
                }
                params.put("item", item);
                break;
            }
            case "b_brucellosisvaccine": {
                BrucellosisVaccine arg = new BrucellosisVaccine();
                arg.setBruReportid(report.getReportId());
                List<BrucellosisVaccine> items = brucellosisVaccineMapper.select(arg);
                BrucellosisVaccine item = new BrucellosisVaccine();
                if (items.size() > 0) {
                    item = items.get(0);
                }
                params.put("item", item);
                break;
            }
            case "b_avianinfluenzavaccine": {
                Avianinfluenzavaccine arg = new Avianinfluenzavaccine();
                arg.setAvReportid(report.getReportId());
                List<Avianinfluenzavaccine> items = avianinfluenzavaccineMapper.select(arg);
                Avianinfluenzavaccine item = new Avianinfluenzavaccine();
                if (items.size() > 0) {
                    item = items.get(0);
                }
                params.put("item", item);

                break;
            }
            case "b_wpestedespetitsruminants": {
                Wpestedespetitsruminants arg = new Wpestedespetitsruminants();
                arg.setWpdrReportid(report.getReportId());
                List<Wpestedespetitsruminants> items = wpestedespetitsruminantsMapper.select(arg);
                Wpestedespetitsruminants item = new Wpestedespetitsruminants();
                if (items.size() > 0) {
                    item = items.get(0);
                }
                params.put("item", item);
                Wpestedespetitsruminants itemSum = wpestedespetitsruminantsMapper
                        .selectSumByReportCode(region.getRegionCode(), halfYearbeginTime, endTime);
                if (itemSum == null) {
                    itemSum = new Wpestedespetitsruminants();
                }
                params.put("itemSum", itemSum);
                break;
            }
            case "b_wavianinfluenza": {
                Wavianinfluenza arg = new Wavianinfluenza();
                arg.setAiReportid(report.getReportId());
                List<Wavianinfluenza> items = wavianinfluenzaMapper.select(arg);
                Wavianinfluenza item = new Wavianinfluenza();
                if (items.size() > 0) {
                    item = items.get(0);
                }
                params.put("item", item);
                Wavianinfluenza itemSum = wavianinfluenzaMapper
                        .selectSumByReportCode(region.getRegionCode(), halfYearbeginTime, endTime);
                if (itemSum == null) {
                    itemSum = new Wavianinfluenza();
                }
                params.put("itemSum", itemSum);
                break;
            }
            case "b_wnewcastle": {
                Wnewcastle arg = new Wnewcastle();
                arg.setNcReportid(report.getReportId());
                List<Wnewcastle> items = wnewcastleMapper.select(arg);
                Wnewcastle item = new Wnewcastle();
                if (items.size() > 0) {
                    item = items.get(0);
                }
                params.put("item", item);
                Wnewcastle itemSum = wnewcastleMapper
                        .selectSumByReportCode(region.getRegionCode(), halfYearbeginTime, endTime);
                if (itemSum == null) {
                    itemSum = new Wnewcastle();
                }
                params.put("itemSum", itemSum);
                break;
            }
            case "b_wclassicalswinefever": {
                Wclassicalswinefever arg = new Wclassicalswinefever();
                arg.setCsfReportid(report.getReportId());
                List<Wclassicalswinefever> items = wclassicalswinefeverMapper.select(arg);
                Wclassicalswinefever item = new Wclassicalswinefever();
                if (items.size() > 0) {
                    item = items.get(0);
                }
                params.put("item", item);
                Wclassicalswinefever itemSum = wclassicalswinefeverMapper
                        .selectSumByReportCode(region.getRegionCode(), halfYearbeginTime, endTime);
                if (itemSum == null) {
                    itemSum = new Wclassicalswinefever();
                }
                params.put("itemSum", itemSum);
                break;
            }
            case "b_wblueeardisease": {
                Wblueeardisease arg = new Wblueeardisease();
                arg.setBedReportid(report.getReportId());
                List<Wblueeardisease> items = wblueeardiseaseMapper.select(arg);
                Wblueeardisease item = new Wblueeardisease();
                if (items.size() > 0) {
                    item = items.get(0);
                }
                params.put("item", item);
                Wblueeardisease itemSum = wblueeardiseaseMapper
                        .selectSumByReportCode(region.getRegionCode(), halfYearbeginTime, endTime);
                if (itemSum == null) {
                    itemSum = new Wblueeardisease();
                }
                params.put("itemSum", itemSum);
                break;
            }
            case "b_wechinococciasis": {
                Wechinococciasis arg = new Wechinococciasis();
                arg.setEchReportid(report.getReportId());
                List<Wechinococciasis> items = wechinococciasisMapper.select(arg);
                Wechinococciasis item = new Wechinococciasis();
                if (items.size() > 0) {
                    item = items.get(0);
                }
                params.put("item", item);
                Wechinococciasis itemSum = wechinococciasisMapper
                        .selectSumByReportCode(region.getRegionCode(), halfYearbeginTime, endTime);
                if (itemSum == null) {
                    itemSum = new Wechinococciasis();
                }
                params.put("itemSum", itemSum);
                break;
            }
            case "b_wbrucellosis": {
                Wbrucellosis arg = new Wbrucellosis();
                arg.setBruReportid(report.getReportId());
                List<Wbrucellosis> items = wbrucellosisMapper.select(arg);
                Wbrucellosis item = new Wbrucellosis();
                if (items.size() > 0) {
                    item = items.get(0);
                }
                params.put("item", item);
                Wbrucellosis itemSum = wbrucellosisMapper
                        .selectSumByReportCode(region.getRegionCode(), halfYearbeginTime, endTime);
                if (itemSum == null) {
                    itemSum = new Wbrucellosis();
                }
                params.put("itemSum", itemSum);
                break;
            }
            case "b_vaccineorder": {
                Vaccineorder arg = new Vaccineorder();
                arg.setReportid(report.getReportId());
                List<Vaccineorder> items = vaccineorderMapper.select(arg);
                Vaccineorder item = new Vaccineorder();
                if (items.size() > 0) {
                    item = items.get(0);
                }
                params.put("item", item);
                Vaccineorder itemSum = vaccineorderMapper
                        .selectSumByReportCode(region.getRegionCode(), monthBeginTime, endTime);
                if (itemSum == null) {
                    itemSum = new Vaccineorder();
                }
                params.put("itemSum", itemSum);
                break;
            }
            case "b_blueeardisease": {
                Blueeardisease arg = new Blueeardisease();
                arg.setBedReportid(report.getReportId());
                List<Blueeardisease> items = blueeardiseaseMapper.select(arg);
                Blueeardisease item = new Blueeardisease();
                if (items.size() > 0) {
                    item = items.get(0);
                }
                params.put("item", item);
                Blueeardisease itemSum = blueeardiseaseMapper
                        .selectSumByReportCode(region.getRegionCode(), monthBeginTime, endTime);
                if (itemSum == null) {
                    itemSum = new Blueeardisease();
                }
                params.put("itemSum", itemSum);
                break;
            }
            case "b_echinococciasisdisease": {
                EchinococciasisDisease arg = new EchinococciasisDisease();
                arg.setEchReportid(report.getReportId());
                List<EchinococciasisDisease> items = echinococciasisDiseaseMapper.select(arg);
                EchinococciasisDisease item = new EchinococciasisDisease();
                if (items.size() > 0) {
                    item = items.get(0);
                }
                params.put("item", item);
                EchinococciasisDisease itemSum = echinococciasisDiseaseMapper
                        .selectSumByReportCode(region.getRegionCode(), monthBeginTime, endTime);
                if (itemSum == null) {
                    itemSum = new EchinococciasisDisease();
                }
                params.put("itemSum", itemSum);
                break;
            }
            case "b_brucellosisdisease": {
                BrucellosisDisease arg = new BrucellosisDisease();
                arg.setBruReportid(report.getReportId());
                List<BrucellosisDisease> items = brucellosisDiseaseMapper.select(arg);
                BrucellosisDisease item = new BrucellosisDisease();
                if (items.size() > 0) {
                    item = items.get(0);
                }
                params.put("item", item);
                BrucellosisDisease itemSum = brucellosisDiseaseMapper
                        .selectSumByReportCode(region.getRegionCode(), monthBeginTime, endTime);
                if (itemSum == null) {
                    itemSum = new BrucellosisDisease();
                }
                params.put("itemSum", itemSum);
                break;
            }
            case "b_classicalswinefever": {
                Classicalswinefever arg = new Classicalswinefever();
                arg.setCsfReportid(report.getReportId());
                List<Classicalswinefever> items = classicalswinefeverMapper.select(arg);
                Classicalswinefever item = new Classicalswinefever();
                if (items.size() > 0) {
                    item = items.get(0);
                }
                params.put("item", item);
                Classicalswinefever itemSum = classicalswinefeverMapper
                        .selectSumByReportCode(region.getRegionCode(), monthBeginTime, endTime);
                if (itemSum == null) {
                    itemSum = new Classicalswinefever();
                }
                params.put("itemSum", itemSum);
                break;
            }
            case "b_footandmouthdisease": {
                Footandmouthdisease arg = new Footandmouthdisease();
                arg.setFmdReportid(report.getReportId());
                List<Footandmouthdisease> items = footandmouthdiseaseMapper.select(arg);
                Footandmouthdisease item = new Footandmouthdisease();
                if (items.size() > 0) {
                    item = items.get(0);
                }
                params.put("item", item);
                Footandmouthdisease itemSum = footandmouthdiseaseMapper
                        .selectSumByReportCode(region.getRegionCode(), monthBeginTime, endTime);
                if (itemSum == null) {
                    itemSum = new Footandmouthdisease();
                }
                params.put("itemSum", itemSum);
                break;
            }
            case "b_livestockinout": {
                LiveStockInOut livestockInOut = liveStockInOutMapper.selectOneByReportId(report.getReportId());
                if (livestockInOut == null) {
                    livestockInOut = new LiveStockInOut();
                }
                params.put("item", livestockInOut);
                LiveStockInOut itemSum = liveStockInOutMapper
                        .selectSumByReportCode(region.getRegionCode(), monthBeginTime, endTime);
                if (itemSum == null) {
                    itemSum = new LiveStockInOut();
                }
                params.put("itemSum", itemSum);
                break;
            }
            case "b_newcastle": {
                Newcastle arg = new Newcastle();
                arg.setNcReportid(report.getReportId());
                List<Newcastle> items = newcastleMapper.select(arg);
                Newcastle item = new Newcastle();
                if (items.size() > 0) {
                    item = items.get(0);
                }
                params.put("item", item);
                Newcastle itemSum = newcastleMapper
                        .selectSumByReportCode(region.getRegionCode(), monthBeginTime, endTime);
                if (itemSum == null) {
                    itemSum = new Newcastle();
                }
                params.put("itemSum", itemSum);
                break;
            }
            case "b_pestedespetitsruminants": {
                Pestedespetitsruminants arg = new Pestedespetitsruminants();
                arg.setPdprReportid(report.getReportId());
                List<Pestedespetitsruminants> items = pestedespetitsruminantsMapper.select(arg);
                Pestedespetitsruminants item = new Pestedespetitsruminants();
                if (items.size() > 0) {
                    item = items.get(0);
                }
                params.put("item", item);
                Pestedespetitsruminants itemSum = pestedespetitsruminantsMapper
                        .selectSumByReportCode(region.getRegionCode(), monthBeginTime, endTime);
                if (itemSum == null) {
                    itemSum = new Pestedespetitsruminants();
                }
                params.put("itemSum", itemSum);
                break;
            }
            case "b_disinfectiondrugs": {
                Disinfectiondrugs arg = new Disinfectiondrugs();
                arg.setDfReportid(report.getReportId());
                List<Disinfectiondrugs> items = disinfectiondrugsMapper.select(arg);
                Disinfectiondrugs item = new Disinfectiondrugs();
                if (items.size() > 0) {
                    item = items.get(0);
                }
                params.put("item", item);
                break;
            }
            case "b_wfootandmouthdisease": {
                Wfootandmouthdisease arg = new Wfootandmouthdisease();
                arg.setFmdReportid(report.getReportId());
                List<Wfootandmouthdisease> items = wfootandmouthdiseaseMapper.select(arg);
                Wfootandmouthdisease item = new Wfootandmouthdisease();
                if (items.size() > 0) {
                    item = items.get(0);
                }
                params.put("item", item);
                Wfootandmouthdisease itemSum = wfootandmouthdiseaseMapper
                        .selectSumByReportCode(region.getRegionCode(), halfYearbeginTime, endTime);
                if (itemSum == null) {
                    itemSum = new Wfootandmouthdisease();
                }
                params.put("itemSum", itemSum);
                break;
            }
            case "b_wlivestockinout": {
                Wlivestockinout arg = new Wlivestockinout();
                arg.setReportid(report.getReportId());
                List<Wlivestockinout> items = wlivestockinoutMapper.select(arg);
                Wlivestockinout item = new Wlivestockinout();
                if (items.size() > 0) {
                    item = items.get(0);
                }
                params.put("item", item);
                break;
            }
            default:
                return null;
        }
        String filePath="/template";
        int month = DateUtil.getMonth(report.getBeginTime()) + 1;
        if (month <=6) {
            filePath="/template/chun";
        } else {
            filePath="/template/qiu";
        }
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date xfc= null;
        Date qlg=null;
        try {
            xfc = sdf.parse(B_PESTEDESPETISRUMINANTS_DATE);
            qlg=sdf.parse(B_AVIANINFLUENZAVACCINE_DATE);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if(template.getTableName().toLowerCase().equals("b_pestedespetitsruminants")&&report.getBeginTime().after(xfc)){
            template.setNormalTemplate("b_pestedespetitsruminants_new.ftl");
        }
        if(template.getTableName().toLowerCase().equals("b_avianinfluenzavaccine")&&report.getBeginTime().after(qlg)){
            template.setNormalTemplate("b_avianinfluenzavaccine_2018qiu.ftl");
        }
        String templatePath = request.getSession().getServletContext().getRealPath(filePath);


        iLogService.insertLog("打开报表");
        return FreeMarkerUtil.getHtmlStringFromTemplate(templatePath, template.getNormalTemplate(), params);
    }

    private Map getReportSummaryHtmlUtil(Class clazz, List<String> reportIds, String reportName, Mapper mapper,
            String orderColumn) {
        Map params = new HashMap();
        Example example = new Example(clazz);
        example.setOrderByClause(orderColumn);
        Example.Criteria criteria = example.createCriteria();
        criteria.andIn(reportName, reportIds);
        List items = mapper.selectByExample(example);
        params.put("items", items);
        return params;
    }

    @Override
    public String getReportSummaryHtml(HttpServletRequest request, String templateId, String beginTime){
        Template template = iTemplateService.selectByKey(templateId);
        List<String> reportIds = iReportService.selectIdsByTemplateIdAndBeginTime(templateId, beginTime);
        String endTime = beginTime;
        //         String beginTime=DateUtil.DateToString(BeginTimeUtil.getBeginTime(beginTime), DateStyle.HH_MM.YYYY_MM_DD_HH_MM_SS);
        String halfYearbeginTime = DateUtil.DateToString(BeginTimeUtil.getCurrentHalfYearBeginTime(beginTime),
                DateStyle.HH_MM.YYYY_MM_DD_HH_MM_SS);
        String monthBeginTime = DateUtil
                .DateToString(BeginTimeUtil.getMonthBeginTime(beginTime), DateStyle.HH_MM.YYYY_MM_DD_HH_MM_SS);
        if (reportIds.size() == 0) return null;
        Map params = new HashMap();
        Map<String, String> weekConfigMap = null;
        if (template.getReportType() == ReportTypeE.WEEK.getCode().intValue()) {
            weekConfigMap = new HashMap();
            List<WeekConfig> weekConfigs = weekConfigMapper.selectAll();
            for (WeekConfig weekConfig : weekConfigs) {
                weekConfigMap.put(weekConfig.getYear() + "#" + weekConfig.getType(), weekConfig.getTime());
            }
        }
        String period = PeriodUtil
                .build(template.getReportType(), DateUtil.StringToDate(beginTime, DateStyle.YYYY_MM_DD), weekConfigMap);
        params.put("templateName", period + " " + template.getTemplateName());
        switch (template.getTableName().toLowerCase()) {
            case "b_avianinfluenza": {
                //                params=this.getReportSummaryHtmlUtil(Avianinfluenza.class,reportIds,"aiReportid",avianinfluenzaMapper,"ai_regionCode");
                List<Avianinfluenza> items = avianinfluenzaMapper.selectAllByDate(endTime, endTime);
                params.put("items", items);
                List<Avianinfluenza> cumulatives = avianinfluenzaMapper.selectAllByDate(monthBeginTime, endTime);
                params.put("cumulatives", cumulatives);
                break;
            }
            case "b_emergencyvaccine": {
                //                params=this.getReportSummaryHtmlUtil(Emergencyvaccine.class,reportIds,"evReportid",emergencyvaccineMapper,"ev_regionCode");
                List<Emergencyvaccine> items = emergencyvaccineMapper.selectAllByDate(endTime, endTime);
                params.put("items", items);
                break;
            }
            case "b_smallruminantsvaccine": {
                //                params=this.getReportSummaryHtmlUtil(Smallruminantsvaccine.class,reportIds,"srvReportid",smallruminantsvaccineMapper,"srv_regionCode");
                List<Smallruminantsvaccine> items = smallruminantsvaccineMapper.selectAllByDate(endTime, endTime);
                params.put("items", items);
                break;
            }
            case "b_poultrydensity": {
                //                params=this.getReportSummaryHtmlUtil(Poultrydensity.class,reportIds,"pdReportid",poultrydensityMapper,"pd_regionCode");
                List<Poultrydensity> items = poultrydensityMapper.selectAllByDate(endTime, endTime);
                params.put("items", items);
                break;
            }
            case "b_newcastlevaccine": {
                //                params=this.getReportSummaryHtmlUtil(Newcastlevaccine.class,reportIds,"nvReportid",newcastlevaccineMapper,"nv_regionCode");
                List<Newcastlevaccine> items = newcastlevaccineMapper.selectAllByDate(endTime, endTime);
                params.put("items", items);
                break;
            }
            case "b_livestockdensity": {
                //                params=this.getReportSummaryHtmlUtil(Livestockdensity.class,reportIds,"ldReportid",livestockdensityMapper,"ld_regionCode");
                List<Livestockdensity> items = livestockdensityMapper.selectAllByDate(endTime, endTime);
                params.put("items", items);
                break;
            }
            case "b_kingfisher": {
                //                params=this.getReportSummaryHtmlUtil(Kingfisher.class,reportIds,"kfReportid",kingfisherMapper,"kf_regionCode");
                List<Kingfisher> items = kingfisherMapper.selectAllByDate(endTime, endTime);
                params.put("items", items);
                break;
            }
            case "b_kingfisher_new": {
                //                params=this.getReportSummaryHtmlUtil(Kingfisher.class,reportIds,"kfReportid",kingfisherMapper,"kf_regionCode");
                List<KingfisherNew> items = kingfisherNewMapper.selectAllByDate(endTime, endTime);
                params.put("items", items);
                break;
            }
            case "b_footandmouthvaccine": {
                //                params=this.getReportSummaryHtmlUtil(Footandmouthvaccine.class,reportIds,"fvReportid",footandmouthvaccineMapper,"fv_regionCode");
                List<Footandmouthvaccine> items = footandmouthvaccineMapper.selectAllByDate(endTime, endTime);
                params.put("items", items);
                break;
            }
            case "b_classicalswinefevervaccine": {
                //                params=this.getReportSummaryHtmlUtil(Classicalswinefevervaccine.class,reportIds,"cvReportid",classicalswinefevervaccineMapper,"cv_regionCode");
                List<Classicalswinefevervaccine> items = classicalswinefevervaccineMapper
                        .selectAllByDate(endTime, endTime);
                params.put("items", items);
                break;
            }
            case "b_bluevaccine": {
                //                params=this.getReportSummaryHtmlUtil(Bluevaccine.class,reportIds,"bvReportid",bluevaccineMapper,"bv_regionCode");
                List<Bluevaccine> items = bluevaccineMapper.selectAllByDate(endTime, endTime);
                params.put("items", items);
                break;
            }
            case "b_echinococciasisvaccine": {
                //                params=this.getReportSummaryHtmlUtil(Bluevaccine.class,reportIds,"bvReportid",bluevaccineMapper,"bv_regionCode");
                List<EchinococciasisVaccine> items = echinococciasisVaccineMapper.selectAllByDate(endTime, endTime);
                params.put("items", items);
                break;
            }
            case "b_brucellosisvaccine": {
                //                params=this.getReportSummaryHtmlUtil(Bluevaccine.class,reportIds,"bvReportid",bluevaccineMapper,"bv_regionCode");
                List<BrucellosisVaccine> items = brucellosisVaccineMapper.selectAllByDate(endTime, endTime);
                params.put("items", items);
                break;
            }
            case "b_avianinfluenzavaccine": {
                //               params=this.getReportSummaryHtmlUtil(Avianinfluenzavaccine.class,reportIds,"avReportid",avianinfluenzavaccineMapper,"av_regionCode");
                List<Avianinfluenzavaccine> items = avianinfluenzavaccineMapper.selectAllByDate(endTime, endTime);
                params.put("items", items);
                break;
            }
            case "b_wpestedespetitsruminants": {
                //                params=this.getReportSummaryHtmlUtil(Wpestedespetitsruminants.class,reportIds,"wpdrReportid",wpestedespetitsruminantsMapper,"wpdr_regionCode");
                List<Wpestedespetitsruminants> items = wpestedespetitsruminantsMapper.selectAllByDate(endTime, endTime);
                params.put("items", items);
                List<Wpestedespetitsruminants> cumulatives = wpestedespetitsruminantsMapper
                        .selectAllByDate(halfYearbeginTime, endTime);
                params.put("cumulatives", cumulatives);
                break;
            }
            case "b_wavianinfluenza": {
                //                params=this.getReportSummaryHtmlUtil(Wavianinfluenza.class,reportIds,"aiReportid",wavianinfluenzaMapper,"ai_regionCode");
                List<Wavianinfluenza> items = wavianinfluenzaMapper.selectAllByDate(endTime, endTime);
                params.put("items", items);
                List<Wavianinfluenza> cumulatives = wavianinfluenzaMapper.selectAllByDate(halfYearbeginTime, endTime);
                params.put("cumulatives", cumulatives);
                break;
            }
            case "b_wnewcastle": {
                //                params=this.getReportSummaryHtmlUtil(Wnewcastle.class,reportIds,"ncReportid",wnewcastleMapper,"nc_regionCode");
                List<Wnewcastle> items = wnewcastleMapper.selectAllByDate(endTime, endTime);
                params.put("items", items);

                List<Wnewcastle> cumulatives = wnewcastleMapper.selectAllByDate(halfYearbeginTime, endTime);

                params.put("cumulatives", cumulatives);

                break;
            }
            case "b_wclassicalswinefever": {
                //                params=this.getReportSummaryHtmlUtil(Wclassicalswinefever.class,reportIds,"csfReportid",wclassicalswinefeverMapper,"csf_regionCode");
                List<Wclassicalswinefever> items = wclassicalswinefeverMapper.selectAllByDate(endTime, endTime);
                params.put("items", items);
                List<Wclassicalswinefever> cumulatives = wclassicalswinefeverMapper
                        .selectAllByDate(halfYearbeginTime, endTime);
                params.put("cumulatives", cumulatives);
                break;
            }
            case "b_wblueeardisease": {
                //                params=this.getReportSummaryHtmlUtil(Wblueeardisease.class,reportIds,"bedReportid",wblueeardiseaseMapper,"bed_regionCode");
                List<Wblueeardisease> items = wblueeardiseaseMapper.selectAllByDate(endTime, endTime);
                params.put("items", items);
                List<Wblueeardisease> cumulatives = wblueeardiseaseMapper.selectAllByDate(halfYearbeginTime, endTime);
                params.put("cumulatives", cumulatives);

                break;
            }
            case "b_wechinococciasis": {
                //                params=this.getReportSummaryHtmlUtil(Wblueeardisease.class,reportIds,"bedReportid",wblueeardiseaseMapper,"bed_regionCode");
                List<Wechinococciasis> items = wechinococciasisMapper.selectAllByDate(endTime, endTime);
                params.put("items", items);
                List<Wechinococciasis> cumulatives = wechinococciasisMapper.selectAllByDate(halfYearbeginTime, endTime);
                params.put("cumulatives", cumulatives);

                break;
            }
            case "b_wbrucellosis": {
                //                params=this.getReportSummaryHtmlUtil(Wblueeardisease.class,reportIds,"bedReportid",wblueeardiseaseMapper,"bed_regionCode");
                List<Wbrucellosis> items = wbrucellosisMapper.selectAllByDate(endTime, endTime);
                params.put("items", items);
                List<Wbrucellosis> cumulatives = wbrucellosisMapper.selectAllByDate(halfYearbeginTime, endTime);
                params.put("cumulatives", cumulatives);
                break;
            }
            case "b_vaccineorder": {
                //                params=this.getReportSummaryHtmlUtil(Vaccineorder.class,reportIds,"reportid",vaccineorderMapper,"regionCode");
                List<Vaccineorder> items = vaccineorderMapper.selectAllByDate(endTime, endTime);
                params.put("items", items);
                break;
            }
            case "b_blueeardisease": {
                //                params=this.getReportSummaryHtmlUtil(Blueeardisease.class,reportIds,"bedReportid",blueeardiseaseMapper,"bed_regionCode");
                List<Blueeardisease> items = blueeardiseaseMapper.selectAllByDate(endTime, endTime);
                params.put("items", items);
                List<Blueeardisease> cumulatives = blueeardiseaseMapper.selectAllByDate(monthBeginTime, endTime);
                params.put("cumulatives", cumulatives);
                break;
            }
            case "b_echinococciasisdisease": {
                //                params=this.getReportSummaryHtmlUtil(Blueeardisease.class,reportIds,"bedReportid",blueeardiseaseMapper,"bed_regionCode");
                List<EchinococciasisDisease> items = echinococciasisDiseaseMapper.selectAllByDate(endTime, endTime);
                params.put("items", items);
                List<EchinococciasisDisease> cumulatives = echinococciasisDiseaseMapper
                        .selectAllByDate(monthBeginTime, endTime);
                params.put("cumulatives", cumulatives);
                break;
            }
            case "b_brucellosisdisease": {
                //                params=this.getReportSummaryHtmlUtil(Blueeardisease.class,reportIds,"bedReportid",blueeardiseaseMapper,"bed_regionCode");
                List<BrucellosisDisease> items = brucellosisDiseaseMapper.selectAllByDate(endTime, endTime);
                params.put("items", items);
                List<BrucellosisDisease> cumulatives = brucellosisDiseaseMapper
                        .selectAllByDate(monthBeginTime, endTime);
                params.put("cumulatives", cumulatives);
                break;
            }
            case "b_classicalswinefever": {
                //                params=this.getReportSummaryHtmlUtil(Classicalswinefever.class,reportIds,"csfReportid",classicalswinefeverMapper,"csf_regionCode");
                List<Classicalswinefever> items = classicalswinefeverMapper.selectAllByDate(endTime, endTime);
                params.put("items", items);
                List<Classicalswinefever> cumulatives = classicalswinefeverMapper
                        .selectAllByDate(monthBeginTime, endTime);
                params.put("cumulatives", cumulatives);
                break;
            }
            case "b_footandmouthdisease": {
                //                params=this.getReportSummaryHtmlUtil(Footandmouthdisease.class,reportIds,"fmdReportid",footandmouthdiseaseMapper,"fmd_regionCode");
                List<Footandmouthdisease> items = footandmouthdiseaseMapper.selectAllByDate(endTime, endTime);
                params.put("items", items);
                List<Footandmouthdisease> cumulatives = footandmouthdiseaseMapper
                        .selectAllByDate(monthBeginTime, endTime);
                params.put("cumulatives", cumulatives);
                break;
            }
            case "b_newcastle": {
                //                params=this.getReportSummaryHtmlUtil(Newcastle.class,reportIds,"ncReportid",newcastleMapper,"nc_regionCode");
                List<Newcastle> items = newcastleMapper.selectAllByDate(endTime, endTime);
                params.put("items", items);
                List<Newcastle> cumulatives = newcastleMapper.selectAllByDate(monthBeginTime, endTime);
                params.put("cumulatives", cumulatives);
                break;
            }
            case "b_livestockinout": {
                //                Example example = new Example(LiveStockInOut.class);
                //                example.setOrderByClause("Liv_regionCode");
                //                Example.Criteria criteria = example.createCriteria();
                //                criteria.andIn("reportid", reportIds);
                //                List<LiveStockInOut> list = liveStockInOutMapper.selectByExample(example);
                //
                //                params.put("items", list);
                List<LiveStockInOut> items = liveStockInOutMapper.selectAllByDate(endTime, endTime);
                params.put("items", items);
                LiveStockInOut sum = liveStockInOutMapper.selectSumByReportIds(reportIds);
                params.put("sum", sum);
                break;
            }
            case "b_disinfectiondrugs": {
                //                params=this.getReportSummaryHtmlUtil(Disinfectiondrugs.class,reportIds,"dfReportid",disinfectiondrugsMapper,"df_regionCode");
                List<Disinfectiondrugs> items = disinfectiondrugsMapper.selectAllByDate(endTime, endTime);
                params.put("items", items);
                break;
            }
            case "b_pestedespetitsruminants": {
                //                params=this.getReportSummaryHtmlUtil(Pestedespetitsruminants.class,reportIds,"pdprReportid",pestedespetitsruminantsMapper,"pdpr_regionCode");
                List<Pestedespetitsruminants> items = pestedespetitsruminantsMapper.selectAllByDate(endTime, endTime);
                params.put("items", items);
                List<Pestedespetitsruminants> cumulatives = pestedespetitsruminantsMapper
                        .selectAllByDate(monthBeginTime, endTime);
                params.put("cumulatives", cumulatives);
                break;
            }
            case "b_wfootandmouthdisease": {
                //                params=this.getReportSummaryHtmlUtil(Wfootandmouthdisease.class,reportIds,"fmdReportid",wfootandmouthdiseaseMapper,"fmd_regionCode asc");
                List<Wfootandmouthdisease> items = wfootandmouthdiseaseMapper.selectAllByDate(endTime, endTime);
                params.put("items", items);
                List<Wfootandmouthdisease> cumulatives = wfootandmouthdiseaseMapper
                        .selectAllByDate(halfYearbeginTime, endTime);
                params.put("cumulatives", cumulatives);

                break;
            }
            case "b_wlivestockinout": {
                //                params=this.getReportSummaryHtmlUtil(Wlivestockinout.class,reportIds,"reportid",wlivestockinoutMapper,"Liv_regionCode asc");
                List<Wlivestockinout> items = wlivestockinoutMapper.selectAllByDate(endTime, endTime);
                params.put("items", items);
                Wlivestockinout sum = wlivestockinoutMapper.selectSumByReportIds(reportIds);
                params.put("sum", sum);
                break;
            }
            default:
                return null;
        }

        String filePath="/template";
        //判断春季还是秋季报表
        int month = DateUtil.getMonth(beginTime) + 1;
        if (month <=6) {
            filePath="/template/chun";
        } else {
            filePath="/template/qiu";
        }
        //判断填报的报表是小反刍兽疫报表修改前后
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date xfc= null;
        Date beginDate= null;
        Date qlg=null;
        try {
            xfc = sdf.parse(B_PESTEDESPETISRUMINANTS_DATE);
            qlg=sdf.parse(B_AVIANINFLUENZAVACCINE_DATE);
            beginDate=sdf.parse(beginTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        if(template.getTableName().toLowerCase().equals("b_pestedespetitsruminants")&&beginDate.after(xfc)){
            template.setSummaryTemplate("b_pestedespetitsruminants_new_sum.ftl");
        }

        if(template.getTableName().toLowerCase().equals("b_avianinfluenzavaccine")&&beginDate.after(qlg)){
            template.setNormalTemplate("b_avianinfluenzavaccine_sum_2018qiu.ftl");
        }
        String templatePath = request.getSession().getServletContext().getRealPath(filePath);
        List<Wlivestockinout> wlivestockinouts = this.wlivestockinoutMapper
                .selectLivestockInOutByDate(halfYearbeginTime);
        params.put("wlivestockinouts", wlivestockinouts);
        iLogService.insertLog("查询汇总报表");
        return FreeMarkerUtil.getHtmlStringFromTemplate(templatePath, template.getSummaryTemplate(), params);
    }

    private void changeApiJson(Class<?> clazz, JSONObject jsonObj) {
        Field[] fieldsArr = clazz.getDeclaredFields();
        for (Field field : fieldsArr) {
            Column column = field.getAnnotation(Column.class);
            String columnName = column.name();
            String fieldName = field.getName();
            jsonObj.put(fieldName, jsonObj.get(columnName));
            jsonObj.remove(columnName);
        }
    }

    @Override
    public int insertOrUpdateReportFill(String data, Report report) {
        JSONObject jsonObj = JSONObject.fromObject(data);
        UserInfo userInfo = iUserInfoService.selectByKey(report.getReportUserId());
        Template template = iTemplateService.selectByKey(report.getTemplateId());
        OrgInfo orgInfo = iOrgInfoService.selectByKey(userInfo.getOrgId());
        Region region = regionMapper.selectByPrimaryKey(orgInfo.getRegionCode());
        switch (template.getTableName().toLowerCase()) {
            case "b_avianinfluenza": {
                Avianinfluenza fill = (Avianinfluenza) JSONObject.toBean(jsonObj, Avianinfluenza.class);
                Avianinfluenza arg = new Avianinfluenza();
                arg.setAiReportid(report.getReportId());
                List<Avianinfluenza> items = avianinfluenzaMapper.select(arg);
                Avianinfluenza item = new Avianinfluenza();
                if (items.size() > 0) {
                    item = items.get(0);
                } else {
                    item = null;
                }
                boolean insert = true;
                if (item == null) {
                    item = fill;
                    item.setAiId(UUIDUtil.getUUID());
                } else {
                    fill.setAiId(item.getAiId());
                    item = fill;
                    insert = false;
                }
                item.setAiReportid(report.getReportId());
                item.setAiDate(report.getBeginTime());
                item.setAiRegioncode(region.getRegionCode());
                item.setAiRegionname(region.getRegionName());
                if (insert) {
                    avianinfluenzaMapper.insertSelective(item);
                } else {
                    avianinfluenzaMapper.updateByPrimaryKeySelective(item);
                }
                iLogService.insertLog("保存禽流感月报");
                break;
            }
            case "b_emergencyvaccine": {
                Emergencyvaccine fill = (Emergencyvaccine) JSONObject.toBean(jsonObj, Emergencyvaccine.class);
                Emergencyvaccine arg = new Emergencyvaccine();
                arg.setEvReportid(report.getReportId());
                List<Emergencyvaccine> items = emergencyvaccineMapper.select(arg);
                Emergencyvaccine item = new Emergencyvaccine();
                if (items.size() > 0) {
                    item = items.get(0);
                } else {
                    item = null;
                }
                boolean insert = true;
                if (item == null) {
                    item = fill;
                    item.setEvId(UUIDUtil.getUUID());
                } else {
                    fill.setEvId(item.getEvId());
                    item = fill;
                    insert = false;
                }
                item.setEvReportid(report.getReportId());
                item.setEvDate(report.getBeginTime());
                item.setEvRegioncode(region.getRegionCode());
                item.setEvRegionname(region.getRegionName());
                if (insert) {
                    emergencyvaccineMapper.insertSelective(item);
                } else {
                    emergencyvaccineMapper.updateByPrimaryKeySelective(item);
                }
                iLogService.insertLog("保存疫苗储备情况报表");
                break;
            }
            case "b_smallruminantsvaccine": {
                Smallruminantsvaccine fill = (Smallruminantsvaccine) JSONObject
                        .toBean(jsonObj, Smallruminantsvaccine.class);
                Smallruminantsvaccine arg = new Smallruminantsvaccine();
                arg.setSrvReportid(report.getReportId());
                List<Smallruminantsvaccine> items = smallruminantsvaccineMapper.select(arg);
                Smallruminantsvaccine item = new Smallruminantsvaccine();
                if (items.size() > 0) {
                    item = items.get(0);
                } else {
                    item = null;
                }
                boolean insert = true;
                if (item == null) {
                    item = fill;
                    item.setSrvId(UUIDUtil.getUUID());
                } else {
                    fill.setSrvId(item.getSrvId());
                    item = fill;
                    insert = false;
                }
                item.setSrvReportid(report.getReportId());
                item.setSrvDate(report.getBeginTime());
                item.setSrvRegioncode(region.getRegionCode());
                item.setSrvRegionname(region.getRegionName());
                if (insert) {
                    smallruminantsvaccineMapper.insertSelective(item);
                } else {
                    smallruminantsvaccineMapper.updateByPrimaryKeySelective(item);
                }
                iLogService.insertLog("保存小反刍兽疫春秋防汇总报表");
                break;
            }
            case "b_poultrydensity": {

                Poultrydensity fill = (Poultrydensity) JSONObject.toBean(jsonObj, Poultrydensity.class);
                Poultrydensity arg = new Poultrydensity();
                arg.setPdReportid(report.getReportId());
                List<Poultrydensity> items = poultrydensityMapper.select(arg);
                Poultrydensity item = new Poultrydensity();
                if (items.size() > 0) {
                    item = items.get(0);
                } else {
                    item = null;
                }
                boolean insert = true;
                if (item == null) {
                    item = fill;
                    item.setPdId(UUIDUtil.getUUID());
                } else {
                    fill.setPdId(item.getPdId());
                    item = fill;
                    insert = false;
                }
                item.setPdReportid(report.getReportId());
                item.setPdDate(report.getBeginTime());
                item.setPdRegioncode(region.getRegionCode());
                item.setPdRegionname(region.getRegionName());
                if (insert) {
                    poultrydensityMapper.insertSelective(item);
                } else {
                    poultrydensityMapper.updateByPrimaryKeySelective(item);
                }
                iLogService.insertLog("保存家禽免疫密度统计表");
                break;
            }
            case "b_newcastlevaccine": {
                Newcastlevaccine fill = (Newcastlevaccine) JSONObject.toBean(jsonObj, Newcastlevaccine.class);
                Newcastlevaccine arg = new Newcastlevaccine();
                arg.setNvReportid(report.getReportId());
                List<Newcastlevaccine> items = newcastlevaccineMapper.select(arg);
                Newcastlevaccine item = new Newcastlevaccine();
                if (items.size() > 0) {
                    item = items.get(0);
                } else {
                    item = null;
                }
                boolean insert = true;
                if (item == null) {
                    item = fill;
                    item.setNvId(UUIDUtil.getUUID());
                } else {
                    fill.setNvId(item.getNvId());
                    item = fill;
                    insert = false;
                }
                item.setNvReportid(report.getReportId());
                item.setNvDate(report.getBeginTime());
                item.setNvRegioncode(region.getRegionCode());
                item.setNvRegionname(region.getRegionName());
                if (insert) {
                    newcastlevaccineMapper.insertSelective(item);
                } else {
                    newcastlevaccineMapper.updateByPrimaryKeySelective(item);
                }
                iLogService.insertLog("保存新城疫疫苗使用统计表");
                break;
            }
            case "b_livestockdensity": {
                Livestockdensity fill = (Livestockdensity) JSONObject.toBean(jsonObj, Livestockdensity.class);
                Livestockdensity arg = new Livestockdensity();
                arg.setLdReportid(report.getReportId());
                List<Livestockdensity> items = livestockdensityMapper.select(arg);
                Livestockdensity item = new Livestockdensity();
                if (items.size() > 0) {
                    item = items.get(0);
                } else {
                    item = null;
                }
                boolean insert = true;

                if (item == null) {
                    item = fill;
                    item.setLdId(UUIDUtil.getUUID());
                } else {
                    fill.setLdId(item.getLdId());
                    item = fill;
                    insert = false;
                }
                item.setLdReportid(report.getReportId());
                item.setLdDate(report.getBeginTime());
                item.setLdRegioncode(region.getRegionCode());
                item.setLdRegionname(region.getRegionName());
                if (insert) {
                    livestockdensityMapper.insertSelective(item);
                } else {
                    livestockdensityMapper.updateByPrimaryKeySelective(item);
                }
                iLogService.insertLog("保存牲畜免疫密度统计表");
                break;
            }
            case "b_kingfisher": {
                Kingfisher fill = (Kingfisher) JSONObject.toBean(jsonObj, Kingfisher.class);
                Kingfisher arg = new Kingfisher();
                arg.setKfReportid(report.getReportId());
                List<Kingfisher> items = kingfisherMapper.select(arg);
                Kingfisher item = new Kingfisher();
                if (items.size() > 0) {
                    item = items.get(0);
                } else {
                    item = null;
                }
                boolean insert = true;
                if (item == null) {
                    item = fill;
                    item.setKfId(UUIDUtil.getUUID());
                } else {
                    fill.setKfId(item.getKfId());
                    item = fill;
                    insert = false;
                }
                item.setKfReportid(report.getReportId());
                item.setKfDate(report.getBeginTime());
                item.setKfRegioncode(region.getRegionCode());
                item.setKfRegionname(region.getRegionName());
                int i;
                if (insert) {
                    kingfisherMapper.insertSelective(item);
                } else {
                    i = kingfisherMapper.updateByPrimaryKeySelective(item);
                }
                iLogService.insertLog("保存经费统计表");
                break;
            }
            case "b_kingfisher_new": {
                KingfisherNew fill = (KingfisherNew) JSONObject.toBean(jsonObj, KingfisherNew.class);
                KingfisherNew arg = new KingfisherNew();
                arg.setKfReportid(report.getReportId());
                List<KingfisherNew> items = kingfisherNewMapper.select(arg);
                KingfisherNew item = new KingfisherNew();
                if (items.size() > 0) {
                    item = items.get(0);
                } else {
                    item = null;
                }
                boolean insert = true;
                if (item == null) {
                    item = fill;
                    item.setKfId(UUIDUtil.getUUID());
                } else {
                    fill.setKfId(item.getKfId());
                    item = fill;
                    insert = false;
                }
                item.setKfReportid(report.getReportId());
                item.setKfDate(report.getBeginTime());
                item.setKfRegioncode(region.getRegionCode());
                item.setKfRegionname(region.getRegionName());
                int i;
                if (insert) {
                    kingfisherNewMapper.insertSelective(item);
                } else {
                    i = kingfisherNewMapper.updateByPrimaryKeySelective(item);
                }
                iLogService.insertLog("保存经费统计表-新");
                break;
            }
            case "b_classicalswinefevervaccine": {
                Classicalswinefevervaccine fill = (Classicalswinefevervaccine) JSONObject
                        .toBean(jsonObj, Classicalswinefevervaccine.class);
                Classicalswinefevervaccine arg = new Classicalswinefevervaccine();
                arg.setCvReportid(report.getReportId());
                List<Classicalswinefevervaccine> items = classicalswinefevervaccineMapper.select(arg);
                Classicalswinefevervaccine item = new Classicalswinefevervaccine();
                if (items.size() > 0) {
                    item = items.get(0);
                } else {
                    item = null;
                }
                boolean insert = true;
                if (item == null) {
                    item = fill;
                    item.setCvId(UUIDUtil.getUUID());
                } else {
                    fill.setCvId(item.getCvId());
                    item = fill;
                    insert = false;
                }
                item.setCvReportid(report.getReportId());
                item.setCvDate(report.getBeginTime());
                item.setCvRegioncode(region.getRegionCode());
                item.setCvRegionname(region.getRegionName());
                if (insert) {
                    classicalswinefevervaccineMapper.insertSelective(item);
                } else {
                    classicalswinefevervaccineMapper.updateByPrimaryKeySelective(item);
                }
                iLogService.insertLog("保存猪瘟疫苗使用统计表");
                break;
            }
            case "b_footandmouthvaccine": {
                Footandmouthvaccine fill = (Footandmouthvaccine) JSONObject.toBean(jsonObj, Footandmouthvaccine.class);
                Footandmouthvaccine arg = new Footandmouthvaccine();
                arg.setFvReportid(report.getReportId());
                List<Footandmouthvaccine> items = footandmouthvaccineMapper.select(arg);
                Footandmouthvaccine item = new Footandmouthvaccine();
                if (items.size() > 0) {
                    item = items.get(0);
                } else {
                    item = null;
                }
                boolean insert = true;
                if (item == null) {
                    item = fill;
                    item.setFvId(UUIDUtil.getUUID());
                } else {
                    fill.setFvId(item.getFvId());
                    item = fill;
                    insert = false;
                }
                item.setFvReportid(report.getReportId());
                item.setFvDate(report.getBeginTime());
                item.setFvRegioncode(region.getRegionCode());
                item.setFvRegionname(region.getRegionName());
                if (insert) {
                    footandmouthvaccineMapper.insertSelective(item);
                } else {
                    footandmouthvaccineMapper.updateByPrimaryKeySelective(item);
                }
                iLogService.insertLog("保存口蹄疫疫苗使用统计表");
                break;
            }
            case "b_bluevaccine": {
                Bluevaccine fill = (Bluevaccine) JSONObject.toBean(jsonObj, Bluevaccine.class);
                Bluevaccine arg = new Bluevaccine();
                arg.setBvReportid(report.getReportId());
                List<Bluevaccine> items = bluevaccineMapper.select(arg);
                Bluevaccine item = new Bluevaccine();
                if (items.size() > 0) {
                    item = items.get(0);
                } else {
                    item = null;
                }
                boolean insert = true;
                if (item == null) {
                    item = fill;
                    item.setBvId(UUIDUtil.getUUID());
                } else {
                    fill.setBvId(item.getBvId());
                    item = fill;
                    insert = false;
                }
                item.setBvReportid(report.getReportId());
                item.setBvDate(report.getBeginTime());
                item.setBvRegioncode(region.getRegionCode());
                item.setBvRegionname(region.getRegionName());
                if (insert) {
                    bluevaccineMapper.insertSelective(item);
                } else {
                    bluevaccineMapper.updateByPrimaryKeySelective(item);
                }
                iLogService.insertLog("保存高致病性猪蓝耳病疫苗使用统计表");
                break;
            }
            case "b_echinococciasisvaccine": {
                EchinococciasisVaccine fill = (EchinococciasisVaccine) JSONObject
                        .toBean(jsonObj, EchinococciasisVaccine.class);
                EchinococciasisVaccine arg = new EchinococciasisVaccine();
                arg.setEchReportid(report.getReportId());
                List<EchinococciasisVaccine> items = echinococciasisVaccineMapper.select(arg);
                EchinococciasisVaccine item = new EchinococciasisVaccine();
                if (items.size() > 0) {
                    item = items.get(0);
                } else {
                    item = null;
                }
                boolean insert = true;
                if (item == null) {
                    item = fill;
                    item.setEchId(UUIDUtil.getUUID());
                } else {
                    fill.setEchId(item.getEchId());
                    item = fill;
                    insert = false;
                }
                item.setEchReportid(report.getReportId());
                item.setEchDate(report.getBeginTime());
                item.setEchRegioncode(region.getRegionCode());
                item.setEchRegionname(region.getRegionName());
                if (insert) {
                    echinococciasisVaccineMapper.insertSelective(item);
                } else {
                    echinococciasisVaccineMapper.updateByPrimaryKeySelective(item);
                }
                iLogService.insertLog("保存包虫病疫苗使用统计表");
                break;
            }
            case "b_brucellosisvaccine": {
                BrucellosisVaccine fill = (BrucellosisVaccine) JSONObject.toBean(jsonObj, BrucellosisVaccine.class);
                BrucellosisVaccine arg = new BrucellosisVaccine();
                arg.setBruReportid(report.getReportId());
                List<BrucellosisVaccine> items = brucellosisVaccineMapper.select(arg);
                BrucellosisVaccine item = new BrucellosisVaccine();
                if (items.size() > 0) {
                    item = items.get(0);
                } else {
                    item = null;
                }
                boolean insert = true;
                if (item == null) {
                    item = fill;
                    item.setBruId(UUIDUtil.getUUID());
                } else {
                    fill.setBruId(item.getBruId());
                    item = fill;
                    insert = false;
                }
                item.setBruReportid(report.getReportId());
                item.setBruDate(report.getBeginTime());
                item.setBruRegioncode(region.getRegionCode());
                item.setBruRegionname(region.getRegionName());
                if (insert) {
                    brucellosisVaccineMapper.insertSelective(item);
                } else {
                    brucellosisVaccineMapper.updateByPrimaryKeySelective(item);
                }
                iLogService.insertLog("保存布鲁氏菌病疫苗使用统计表");
                break;
            }
            case "b_avianinfluenzavaccine": {
                Avianinfluenzavaccine fill = (Avianinfluenzavaccine) JSONObject
                        .toBean(jsonObj, Avianinfluenzavaccine.class);
                Avianinfluenzavaccine arg = new Avianinfluenzavaccine();
                arg.setAvReportid(report.getReportId());
                List<Avianinfluenzavaccine> items = avianinfluenzavaccineMapper.select(arg);
                Avianinfluenzavaccine item = new Avianinfluenzavaccine();
                if (items.size() > 0) {
                    item = items.get(0);
                } else {
                    item = null;
                }
                boolean insert = true;
                if (item == null) {
                    item = fill;
                    item.setAvId(UUIDUtil.getUUID());
                } else {
                    fill.setAvId(item.getAvId());
                    item = fill;
                    insert = false;
                }
                item.setAvReportid(report.getReportId());
                item.setAvDate(report.getBeginTime());
                item.setAvRegioncode(region.getRegionCode());
                item.setAvRegionname(region.getRegionName());
                if (insert) {
                    avianinfluenzavaccineMapper.insertSelective(item);
                } else {
                    avianinfluenzavaccineMapper.updateByPrimaryKeySelective(item);
                }
                iLogService.insertLog("保存禽流感疫苗使用统计表");
                break;
            }
            case "b_wpestedespetitsruminants": {
                Wpestedespetitsruminants fill = (Wpestedespetitsruminants) JSONObject
                        .toBean(jsonObj, Wpestedespetitsruminants.class);
                Wpestedespetitsruminants arg = new Wpestedespetitsruminants();
                arg.setWpdrReportid(report.getReportId());
                List<Wpestedespetitsruminants> items = wpestedespetitsruminantsMapper.select(arg);
                Wpestedespetitsruminants item = new Wpestedespetitsruminants();
                if (items.size() > 0) {
                    item = items.get(0);
                } else {
                    item = null;
                }
                boolean insert = true;
                if (item == null) {
                    item = fill;
                    item.setWpdrId(UUIDUtil.getUUID());
                } else {
                    fill.setWpdrId(item.getWpdrId());
                    item = fill;
                    insert = false;
                }
                item.setWpdrReportid(report.getReportId());
                item.setWpdrDate(report.getBeginTime());
                item.setWpdrRegioncode(region.getRegionCode());
                item.setWpdrRegionname(region.getRegionName());
                if (insert) {
                    wpestedespetitsruminantsMapper.insertSelective(item);
                } else {
                    wpestedespetitsruminantsMapper.updateByPrimaryKeySelective(item);
                }
                iLogService.insertLog("保存小反刍兽疫疫苗使用和免疫情况周报表");
                break;
            }
            case "b_wavianinfluenza": {
                Wavianinfluenza fill = (Wavianinfluenza) JSONObject.toBean(jsonObj, Wavianinfluenza.class);
                Wavianinfluenza arg = new Wavianinfluenza();
                arg.setAiReportid(report.getReportId());
                List<Wavianinfluenza> items = wavianinfluenzaMapper.select(arg);
                Wavianinfluenza item = new Wavianinfluenza();
                if (items.size() > 0) {
                    item = items.get(0);
                } else {
                    item = null;
                }
                boolean insert = true;
                if (item == null) {
                    item = fill;
                    item.setAiId(UUIDUtil.getUUID());
                } else {
                    fill.setAiId(item.getAiId());
                    item = fill;
                    insert = false;
                }
                item.setAiReportid(report.getReportId());
                item.setAiDate(report.getBeginTime());
                item.setAiRegioncode(region.getRegionCode());
                item.setAiRegionname(region.getRegionName());
                if (insert) {
                    wavianinfluenzaMapper.insertSelective(item);
                } else {
                    wavianinfluenzaMapper.updateByPrimaryKeySelective(item);
                }
                iLogService.insertLog("保存禽流感疫苗使用和免疫情况周报表");
                break;
            }
            case "b_wnewcastle": {
                Wnewcastle fill = (Wnewcastle) JSONObject.toBean(jsonObj, Wnewcastle.class);
                Wnewcastle arg = new Wnewcastle();
                arg.setNcReportid(report.getReportId());
                List<Wnewcastle> items = wnewcastleMapper.select(arg);
                Wnewcastle item = new Wnewcastle();
                if (items.size() > 0) {
                    item = items.get(0);
                } else {
                    item = null;
                }
                boolean insert = true;
                if (item == null) {
                    item = fill;
                    item.setNcId(UUIDUtil.getUUID());
                } else {
                    fill.setNcId(item.getNcId());
                    item = fill;
                    insert = false;
                }
                item.setNcReportid(report.getReportId());
                item.setNcDate(report.getBeginTime());
                item.setNcRegioncode(region.getRegionCode());
                item.setNcRegionname(region.getRegionName());
                if (insert) {
                    wnewcastleMapper.insertSelective(item);
                } else {
                    wnewcastleMapper.updateByPrimaryKeySelective(item);
                }
                iLogService.insertLog("保存新城疫疫苗使用和免疫情况周报表");
                break;
            }
            case "b_wclassicalswinefever": {
                Wclassicalswinefever fill = (Wclassicalswinefever) JSONObject
                        .toBean(jsonObj, Wclassicalswinefever.class);
                Wclassicalswinefever arg = new Wclassicalswinefever();
                arg.setCsfReportid(report.getReportId());
                List<Wclassicalswinefever> items = wclassicalswinefeverMapper.select(arg);
                Wclassicalswinefever item = new Wclassicalswinefever();
                if (items.size() > 0) {
                    item = items.get(0);
                } else {
                    item = null;
                }
                boolean insert = true;
                if (item == null) {
                    item = fill;
                    item.setCsfId(UUIDUtil.getUUID());
                } else {
                    fill.setCsfId(item.getCsfId());
                    item = fill;
                    insert = false;
                }
                item.setCsfReportid(report.getReportId());
                item.setCsfDate(report.getBeginTime());
                item.setCsfRegioncode(region.getRegionCode());
                item.setCsfRegionname(region.getRegionName());
                if (insert) {
                    wclassicalswinefeverMapper.insertSelective(item);
                } else {
                    wclassicalswinefeverMapper.updateByPrimaryKeySelective(item);
                }
                iLogService.insertLog("保存猪瘟疫苗使用和免疫情况周报表");
                break;
            }
            case "b_wblueeardisease": {
                Wblueeardisease fill = (Wblueeardisease) JSONObject.toBean(jsonObj, Wblueeardisease.class);
                Wblueeardisease arg = new Wblueeardisease();
                arg.setBedReportid(report.getReportId());
                List<Wblueeardisease> items = wblueeardiseaseMapper.select(arg);
                Wblueeardisease item = new Wblueeardisease();
                if (items.size() > 0) {
                    item = items.get(0);
                } else {
                    item = null;
                }
                boolean insert = true;
                if (item == null) {
                    item = fill;
                    item.setBedId(UUIDUtil.getUUID());
                } else {
                    fill.setBedId(item.getBedId());
                    item = fill;
                    insert = false;
                }
                item.setBedReportid(report.getReportId());
                item.setBedDate(report.getBeginTime());
                item.setBedRegioncode(region.getRegionCode());
                item.setBedRegionname(region.getRegionName());
                if (insert) {
                    wblueeardiseaseMapper.insertSelective(item);
                } else {
                    wblueeardiseaseMapper.updateByPrimaryKeySelective(item);
                }
                iLogService.insertLog("保存高致病性猪蓝耳病疫苗使用和免疫情况周报表");
                break;
            }
            case "b_wechinococciasis": {
                Wechinococciasis fill = (Wechinococciasis) JSONObject.toBean(jsonObj, Wechinococciasis.class);
                Wechinococciasis arg = new Wechinococciasis();
                arg.setEchReportid(report.getReportId());
                List<Wechinococciasis> items = wechinococciasisMapper.select(arg);
                Wechinococciasis item = new Wechinococciasis();
                if (items.size() > 0) {
                    item = items.get(0);
                } else {
                    item = null;
                }
                boolean insert = true;
                if (item == null) {
                    item = fill;
                    item.setEchId(UUIDUtil.getUUID());
                } else {
                    fill.setEchId(item.getEchId());
                    item = fill;
                    insert = false;
                }
                item.setEchReportid(report.getReportId());
                item.setEchDate(report.getBeginTime());
                item.setEchRegioncode(region.getRegionCode());
                item.setEchRegionname(region.getRegionName());
                if (insert) {
                    wechinococciasisMapper.insertSelective(item);
                } else {
                    wechinococciasisMapper.updateByPrimaryKeySelective(item);
                }
                iLogService.insertLog("保存包虫病疫苗使用和免疫情况周报表");
                break;
            }
            case "b_wbrucellosis": {
                Wbrucellosis fill = (Wbrucellosis) JSONObject.toBean(jsonObj, Wbrucellosis.class);
                Wbrucellosis arg = new Wbrucellosis();
                arg.setBruReportid(report.getReportId());
                List<Wbrucellosis> items = wbrucellosisMapper.select(arg);
                Wbrucellosis item = new Wbrucellosis();
                if (items.size() > 0) {
                    item = items.get(0);
                } else {
                    item = null;
                }
                boolean insert = true;
                if (item == null) {
                    item = fill;
                    item.setBruId(UUIDUtil.getUUID());
                } else {
                    fill.setBruId(item.getBruId());
                    item = fill;
                    insert = false;
                }
                item.setBruReportid(report.getReportId());
                item.setBruDate(report.getBeginTime());
                item.setBruRegioncode(region.getRegionCode());
                item.setBruRegionname(region.getRegionName());
                if (insert) {
                    wbrucellosisMapper.insertSelective(item);
                } else {
                    wbrucellosisMapper.updateByPrimaryKeySelective(item);
                }
                iLogService.insertLog("保存鲁氏菌病疫苗使用和免疫情况周报表");
                break;
            }
            case "b_vaccineorder": {
                Vaccineorder fill = (Vaccineorder) JSONObject.toBean(jsonObj, Vaccineorder.class);
                Vaccineorder arg = new Vaccineorder();
                arg.setReportid(report.getReportId());
                List<Vaccineorder> items = vaccineorderMapper.select(arg);
                Vaccineorder item = new Vaccineorder();
                if (items.size() > 0) {
                    item = items.get(0);
                } else {
                    item = null;
                }
                boolean insert = true;
                if (item == null) {
                    item = fill;
                    item.setVaccineorderid(UUIDUtil.getUUID());
                } else {
                    fill.setVaccineorderid(item.getVaccineorderid());
                    item = fill;
                    insert = false;
                }
                item.setReportid(report.getReportId());
                item.setDate(report.getBeginTime());
                item.setRegioncode(region.getRegionCode());
                item.setRegionname(region.getRegionName());
                if (insert) {
                    vaccineorderMapper.insertSelective(item);
                } else {
                    vaccineorderMapper.updateByPrimaryKeySelective(item);
                }
                iLogService.insertLog("保存疫苗到货、下拨月报表");
                break;
            }
            case "b_blueeardisease": {
                Blueeardisease fill = (Blueeardisease) JSONObject.toBean(jsonObj, Blueeardisease.class);
                Blueeardisease arg = new Blueeardisease();
                arg.setBedReportid(report.getReportId());
                List<Blueeardisease> items = blueeardiseaseMapper.select(arg);
                Blueeardisease item = new Blueeardisease();
                if (items.size() > 0) {
                    item = items.get(0);
                } else {
                    item = null;
                }
                boolean insert = true;
                if (item == null) {
                    item = fill;
                    item.setBedId(UUIDUtil.getUUID());
                } else {
                    fill.setBedId(item.getBedId());
                    item = fill;
                    insert = false;
                }
                item.setBedReportid(report.getReportId());
                item.setBedDate(report.getBeginTime());
                item.setBedRegioncode(region.getRegionCode());
                item.setBedRegionname(region.getRegionName());
                if (insert) {
                    blueeardiseaseMapper.insertSelective(item);
                } else {
                    blueeardiseaseMapper.updateByPrimaryKeySelective(item);
                }
                iLogService.insertLog("保存高致病性猪蓝耳病免疫情况月报表");
                break;
            }
            case "b_echinococciasisdisease": {
                EchinococciasisDisease fill = (EchinococciasisDisease) JSONObject
                        .toBean(jsonObj, EchinococciasisDisease.class);
                EchinococciasisDisease arg = new EchinococciasisDisease();
                arg.setEchReportid(report.getReportId());
                List<EchinococciasisDisease> items = echinococciasisDiseaseMapper.select(arg);
                EchinococciasisDisease item = new EchinococciasisDisease();
                if (items.size() > 0) {
                    item = items.get(0);
                } else {
                    item = null;
                }
                boolean insert = true;
                if (item == null) {
                    item = fill;
                    item.setEchId(UUIDUtil.getUUID());
                } else {
                    fill.setEchId(item.getEchId());
                    item = fill;
                    insert = false;
                }
                item.setEchReportid(report.getReportId());
                item.setEchDate(report.getBeginTime());
                item.setEchRegioncode(region.getRegionCode());
                item.setEchRegionname(region.getRegionName());
                if (insert) {
                    echinococciasisDiseaseMapper.insertSelective(item);
                } else {
                    echinococciasisDiseaseMapper.updateByPrimaryKeySelective(item);
                }
                iLogService.insertLog("保存包虫病免疫情况月报表");
                break;
            }
            case "b_brucellosisdisease": {
                BrucellosisDisease fill = (BrucellosisDisease) JSONObject.toBean(jsonObj, BrucellosisDisease.class);
                BrucellosisDisease arg = new BrucellosisDisease();
                arg.setBruReportid(report.getReportId());
                List<BrucellosisDisease> items = brucellosisDiseaseMapper.select(arg);
                BrucellosisDisease item = new BrucellosisDisease();
                if (items.size() > 0) {
                    item = items.get(0);
                } else {
                    item = null;
                }
                boolean insert = true;
                if (item == null) {
                    item = fill;
                    item.setBruId(UUIDUtil.getUUID());
                } else {
                    fill.setBruId(item.getBruId());
                    item = fill;
                    insert = false;
                }
                item.setBruReportid(report.getReportId());
                item.setBruDate(report.getBeginTime());
                item.setBruRegioncode(region.getRegionCode());
                item.setBruRegionname(region.getRegionName());
                if (insert) {
                    brucellosisDiseaseMapper.insertSelective(item);
                } else {
                    brucellosisDiseaseMapper.updateByPrimaryKeySelective(item);
                }
                iLogService.insertLog("保存布鲁氏菌病免疫情况月报表");
                break;
            }
            case "b_classicalswinefever": {
                Classicalswinefever fill = (Classicalswinefever) JSONObject.toBean(jsonObj, Classicalswinefever.class);
                Classicalswinefever arg = new Classicalswinefever();
                arg.setCsfReportid(report.getReportId());
                List<Classicalswinefever> items = classicalswinefeverMapper.select(arg);
                Classicalswinefever item = new Classicalswinefever();
                if (items.size() > 0) {
                    item = items.get(0);
                } else {
                    item = null;
                }
                boolean insert = true;
                if (item == null) {
                    item = fill;
                    item.setCsfId(UUIDUtil.getUUID());
                } else {
                    fill.setCsfId(item.getCsfId());
                    item = fill;
                    insert = false;
                }
                item.setCsfReportid(report.getReportId());
                item.setCsfDate(report.getBeginTime());
                item.setCsfRegioncode(region.getRegionCode());
                item.setCsfRegionname(region.getRegionName());
                if (insert) {
                    classicalswinefeverMapper.insertSelective(item);
                } else {
                    classicalswinefeverMapper.updateByPrimaryKeySelective(item);
                }
                iLogService.insertLog("保存猪瘟免疫情况月报表");
                break;
            }
            case "b_footandmouthdisease": {
                Footandmouthdisease fill = (Footandmouthdisease) JSONObject.toBean(jsonObj, Footandmouthdisease.class);
                Footandmouthdisease arg = new Footandmouthdisease();
                arg.setFmdReportid(report.getReportId());
                List<Footandmouthdisease> items = footandmouthdiseaseMapper.select(arg);
                Footandmouthdisease item = new Footandmouthdisease();
                if (items.size() > 0) {
                    item = items.get(0);
                } else {
                    item = null;
                }
                boolean insert = true;
                if (item == null) {
                    item = fill;
                    item.setFmdId(UUIDUtil.getUUID());
                } else {
                    fill.setFmdId(item.getFmdId());
                    item = fill;
                    insert = false;
                }
                item.setFmdReportid(report.getReportId());
                item.setFmdDate(report.getBeginTime());
                item.setFmdRegioncode(region.getRegionCode());
                item.setFmdRegionname(region.getRegionName());
                if (insert) {
                    footandmouthdiseaseMapper.insertSelective(item);
                } else {
                    footandmouthdiseaseMapper.updateByPrimaryKeySelective(item);
                }
                iLogService.insertLog("保存口蹄疫免疫情况月报表");
                break;
            }
            case "b_newcastle": {
                Newcastle fill = (Newcastle) JSONObject.toBean(jsonObj, Newcastle.class);
                Newcastle arg = new Newcastle();
                arg.setNcReportid(report.getReportId());
                List<Newcastle> items = newcastleMapper.select(arg);
                Newcastle item = new Newcastle();
                if (items.size() > 0) {
                    item = items.get(0);
                } else {
                    item = null;
                }
                boolean insert = true;
                if (item == null) {
                    item = fill;
                    item.setNcId(UUIDUtil.getUUID());
                } else {
                    fill.setNcId(item.getNcId());
                    item = fill;
                    insert = false;
                }
                item.setNcReportid(report.getReportId());
                item.setNcDate(report.getBeginTime());
                item.setNcRegioncode(region.getRegionCode());
                item.setNcRegionname(region.getRegionName());
                if (insert) {
                    newcastleMapper.insertSelective(item);
                } else {
                    newcastleMapper.updateByPrimaryKeySelective(item);
                }
                iLogService.insertLog("保存新城疫免疫情况月报表");
                break;
            }
            case "b_pestedespetitsruminants": {
                Pestedespetitsruminants fill = (Pestedespetitsruminants) JSONObject
                        .toBean(jsonObj, Pestedespetitsruminants.class);
                Pestedespetitsruminants arg = new Pestedespetitsruminants();
                arg.setPdprReportid(report.getReportId());
                List<Pestedespetitsruminants> items = pestedespetitsruminantsMapper.select(arg);
                Pestedespetitsruminants item = new Pestedespetitsruminants();
                if (items.size() > 0) {
                    item = items.get(0);
                } else {
                    item = null;
                }
                boolean insert = true;
                if (item == null) {
                    item = fill;
                    item.setPdprId(UUIDUtil.getUUID());
                } else {
                    fill.setPdprId(item.getPdprId());
                    item = fill;
                    insert = false;
                }
                item.setPdprReportid(report.getReportId());
                item.setPdprDate(report.getBeginTime());
                item.setPdprRegioncode(region.getRegionCode());
                item.setPdprRegionname(region.getRegionName());
                if (insert) {
                    pestedespetitsruminantsMapper.insertSelective(item);
                } else {
                    pestedespetitsruminantsMapper.updateByPrimaryKeySelective(item);
                }
                iLogService.insertLog("保存小反刍兽疫免疫情况月报表");
                break;
            }
            case "b_livestockinout": {
                LiveStockInOut fill = (LiveStockInOut) JSONObject.toBean(jsonObj, LiveStockInOut.class);
                LiveStockInOut liveStockInOut = liveStockInOutMapper.selectOneByReportId(report.getReportId());
                boolean insert = true;
                if (liveStockInOut == null) {
                    liveStockInOut = fill;
                    liveStockInOut.setLivestockid(UUIDUtil.getUUID());
                } else {
                    fill.setLivestockid(liveStockInOut.getLivestockid());
                    liveStockInOut = fill;
                    insert = false;
                }
                liveStockInOut.setReportid(report.getReportId());
                liveStockInOut.setLivestockdate(report.getBeginTime());
                liveStockInOut.setLivRegioncode(region.getRegionCode());
                liveStockInOut.setLivRegionname(region.getRegionName());
                if (insert) {
                    liveStockInOutMapper.insertSelective(liveStockInOut);
                } else {
                    liveStockInOutMapper.updateByPrimaryKeySelective(liveStockInOut);
                }
                iLogService.insertLog("保存畜禽存栏和应免数量月报表");
                break;
            }
            case "b_disinfectiondrugs": {
                Disinfectiondrugs fill = (Disinfectiondrugs) JSONObject.toBean(jsonObj, Disinfectiondrugs.class);
                Disinfectiondrugs arg = new Disinfectiondrugs();
                arg.setDfReportid(report.getReportId());
                List<Disinfectiondrugs> items = disinfectiondrugsMapper.select(arg);
                Disinfectiondrugs item = new Disinfectiondrugs();
                if (items.size() > 0) {
                    item = items.get(0);
                } else {
                    item = null;
                }
                boolean insert = true;
                if (item == null) {
                    item = fill;
                    item.setDfId(UUIDUtil.getUUID());
                } else {
                    fill.setDfId(item.getDfId());
                    item = fill;
                    insert = false;
                }
                item.setDfReportid(report.getReportId());
                item.setDfDate(report.getBeginTime());
                item.setDfRegioncode(region.getRegionCode());
                item.setDfRegionname(region.getRegionName());
                if (insert) {
                    disinfectiondrugsMapper.insertSelective(item);
                } else {
                    disinfectiondrugsMapper.updateByPrimaryKeySelective(item);
                }
                iLogService.insertLog("保存消毒药品储备情况表");
                break;
            }
            case "b_wfootandmouthdisease": {
                Wfootandmouthdisease fill = (Wfootandmouthdisease) JSONObject
                        .toBean(jsonObj, Wfootandmouthdisease.class);
                Wfootandmouthdisease arg = new Wfootandmouthdisease();
                arg.setFmdReportid(report.getReportId());
                List<Wfootandmouthdisease> items = wfootandmouthdiseaseMapper.select(arg);
                Wfootandmouthdisease item = new Wfootandmouthdisease();
                if (items.size() > 0) {
                    item = items.get(0);
                } else {
                    item = null;
                }
                boolean insert = true;
                if (item == null) {
                    item = fill;
                    item.setFmdId(UUIDUtil.getUUID());
                } else {
                    fill.setFmdId(item.getFmdId());
                    item = fill;
                    insert = false;
                }
                item.setFmdReportid(report.getReportId());
                item.setFmdDate(report.getBeginTime());
                item.setFmdRegioncode(region.getRegionCode());
                item.setFmdRegionname(region.getRegionName());
                if (insert) {
                    wfootandmouthdiseaseMapper.insertSelective(item);
                } else {
                    wfootandmouthdiseaseMapper.updateByPrimaryKeySelective(item);
                }
                iLogService.insertLog("保存牲畜口蹄疫疫苗使用和免疫情况周报表");
                break;
            }
            case "b_wlivestockinout": {
                Wlivestockinout fill = (Wlivestockinout) JSONObject.toBean(jsonObj, Wlivestockinout.class);
                Wlivestockinout arg = new Wlivestockinout();
                arg.setReportid(report.getReportId());
                List<Wlivestockinout> items = wlivestockinoutMapper.select(arg);
                Wlivestockinout item = new Wlivestockinout();
                if (items.size() > 0) {
                    item = items.get(0);
                } else {
                    item = null;
                }
                boolean insert = true;
                if (item == null) {
                    item = fill;
                    item.setLivestockid(UUIDUtil.getUUID());
                } else {
                    fill.setLivestockid(item.getLivestockid());
                    item = fill;
                    insert = false;
                }
                item.setReportid(report.getReportId());
                item.setLivestockdate(report.getBeginTime());
                item.setLivRegioncode(region.getRegionCode());
                item.setLivRegionname(region.getRegionName());
                if (insert) {
                    wlivestockinoutMapper.insertSelective(item);
                } else {
                    wlivestockinoutMapper.updateByPrimaryKeySelective(item);
                }
                iLogService.insertLog("保存畜禽存栏和应免数量统计表");
                break;
            }
            default:
                break;
        }
        return 1;
    }

    @Override
    public int insertOrUpdateReportFillForApi(String data, Report report) {
        JSONObject jsonObj = JSONObject.fromObject(data);
        UserInfo userInfo = iUserInfoService.selectByKey(report.getReportUserId());
        Template template = iTemplateService.selectByKey(report.getTemplateId());
        OrgInfo orgInfo = iOrgInfoService.selectByKey(userInfo.getOrgId());
        Region region = regionMapper.selectByPrimaryKey(orgInfo.getRegionCode());
        switch (template.getTableName().toLowerCase()) {
            case "b_avianinfluenza": {
                changeApiJson(Avianinfluenza.class, jsonObj);
                Avianinfluenza fill = (Avianinfluenza) JSONObject.toBean(jsonObj, Avianinfluenza.class);
                Avianinfluenza arg = new Avianinfluenza();
                arg.setAiReportid(report.getReportId());
                List<Avianinfluenza> items = avianinfluenzaMapper.select(arg);
                Avianinfluenza item = new Avianinfluenza();
                if (items.size() > 0) {
                    item = items.get(0);
                } else {
                    item = null;
                }
                boolean insert = true;
                if (item == null) {
                    item = fill;
                    item.setAiId(UUIDUtil.getUUID());
                } else {
                    fill.setAiId(item.getAiId());
                    item = fill;
                    insert = false;
                }
                item.setAiReportid(report.getReportId());
                item.setAiDate(report.getBeginTime());
                item.setAiRegioncode(region.getRegionCode());
                item.setAiRegionname(region.getRegionName());
                if (insert) {
                    avianinfluenzaMapper.insertSelective(item);
                } else {
                    avianinfluenzaMapper.updateByPrimaryKeySelective(item);
                }
                iLogService.insertLog("保存禽流感月报");
                break;
            }
            case "b_emergencyvaccine": {
                changeApiJson(Emergencyvaccine.class, jsonObj);
                Emergencyvaccine fill = (Emergencyvaccine) JSONObject.toBean(jsonObj, Emergencyvaccine.class);
                Emergencyvaccine arg = new Emergencyvaccine();
                arg.setEvReportid(report.getReportId());
                List<Emergencyvaccine> items = emergencyvaccineMapper.select(arg);
                Emergencyvaccine item = new Emergencyvaccine();
                if (items.size() > 0) {
                    item = items.get(0);
                } else {
                    item = null;
                }
                boolean insert = true;
                if (item == null) {
                    item = fill;
                    item.setEvId(UUIDUtil.getUUID());
                } else {
                    fill.setEvId(item.getEvId());
                    item = fill;
                    insert = false;
                }
                item.setEvReportid(report.getReportId());
                item.setEvDate(report.getBeginTime());
                item.setEvRegioncode(region.getRegionCode());
                item.setEvRegionname(region.getRegionName());
                if (insert) {
                    emergencyvaccineMapper.insertSelective(item);
                } else {
                    emergencyvaccineMapper.updateByPrimaryKeySelective(item);
                }
                iLogService.insertLog("保存疫苗储备情况报表");
                break;
            }
            case "b_smallruminantsvaccine": {
                changeApiJson(Smallruminantsvaccine.class, jsonObj);
                Smallruminantsvaccine fill = (Smallruminantsvaccine) JSONObject
                        .toBean(jsonObj, Smallruminantsvaccine.class);
                Smallruminantsvaccine arg = new Smallruminantsvaccine();
                arg.setSrvReportid(report.getReportId());
                List<Smallruminantsvaccine> items = smallruminantsvaccineMapper.select(arg);
                Smallruminantsvaccine item = new Smallruminantsvaccine();
                if (items.size() > 0) {
                    item = items.get(0);
                } else {
                    item = null;
                }
                boolean insert = true;
                if (item == null) {
                    item = fill;
                    item.setSrvId(UUIDUtil.getUUID());
                } else {
                    fill.setSrvId(item.getSrvId());
                    item = fill;
                    insert = false;
                }
                item.setSrvReportid(report.getReportId());
                item.setSrvDate(report.getBeginTime());
                item.setSrvRegioncode(region.getRegionCode());
                item.setSrvRegionname(region.getRegionName());
                if (insert) {
                    smallruminantsvaccineMapper.insertSelective(item);
                } else {
                    smallruminantsvaccineMapper.updateByPrimaryKeySelective(item);
                }
                iLogService.insertLog("保存小反刍兽疫春秋防汇总报表");
                break;
            }
            case "b_poultrydensity": {
                changeApiJson(Poultrydensity.class, jsonObj);
                Poultrydensity fill = (Poultrydensity) JSONObject.toBean(jsonObj, Poultrydensity.class);
                Poultrydensity arg = new Poultrydensity();
                arg.setPdReportid(report.getReportId());
                List<Poultrydensity> items = poultrydensityMapper.select(arg);
                Poultrydensity item = new Poultrydensity();
                if (items.size() > 0) {
                    item = items.get(0);
                } else {
                    item = null;
                }
                boolean insert = true;
                if (item == null) {
                    item = fill;
                    item.setPdId(UUIDUtil.getUUID());
                } else {
                    fill.setPdId(item.getPdId());
                    item = fill;
                    insert = false;
                }
                item.setPdReportid(report.getReportId());
                item.setPdDate(report.getBeginTime());
                item.setPdRegioncode(region.getRegionCode());
                item.setPdRegionname(region.getRegionName());
                if (insert) {
                    poultrydensityMapper.insertSelective(item);
                } else {
                    poultrydensityMapper.updateByPrimaryKeySelective(item);
                }
                iLogService.insertLog("保存家禽免疫密度统计表");
                break;
            }
            case "b_newcastlevaccine": {
                changeApiJson(Newcastlevaccine.class, jsonObj);
                Newcastlevaccine fill = (Newcastlevaccine) JSONObject.toBean(jsonObj, Newcastlevaccine.class);
                Newcastlevaccine arg = new Newcastlevaccine();
                arg.setNvReportid(report.getReportId());
                List<Newcastlevaccine> items = newcastlevaccineMapper.select(arg);
                Newcastlevaccine item = new Newcastlevaccine();
                if (items.size() > 0) {
                    item = items.get(0);
                } else {
                    item = null;
                }
                boolean insert = true;
                if (item == null) {
                    item = fill;
                    item.setNvId(UUIDUtil.getUUID());
                } else {
                    fill.setNvId(item.getNvId());
                    item = fill;
                    insert = false;
                }
                item.setNvReportid(report.getReportId());
                item.setNvDate(report.getBeginTime());
                item.setNvRegioncode(region.getRegionCode());
                item.setNvRegionname(region.getRegionName());
                if (insert) {
                    newcastlevaccineMapper.insertSelective(item);
                } else {
                    newcastlevaccineMapper.updateByPrimaryKeySelective(item);
                }
                iLogService.insertLog("保存新城疫疫苗使用统计表");
                break;
            }
            case "b_livestockdensity": {
                changeApiJson(Livestockdensity.class, jsonObj);
                Livestockdensity fill = (Livestockdensity) JSONObject.toBean(jsonObj, Livestockdensity.class);
                Livestockdensity arg = new Livestockdensity();
                arg.setLdReportid(report.getReportId());
                List<Livestockdensity> items = livestockdensityMapper.select(arg);
                Livestockdensity item = new Livestockdensity();
                if (items.size() > 0) {
                    item = items.get(0);
                } else {
                    item = null;
                }
                boolean insert = true;

                if (item == null) {
                    item = fill;
                    item.setLdId(UUIDUtil.getUUID());
                } else {
                    fill.setLdId(item.getLdId());
                    item = fill;
                    insert = false;
                }
                item.setLdReportid(report.getReportId());
                item.setLdDate(report.getBeginTime());
                item.setLdRegioncode(region.getRegionCode());
                item.setLdRegionname(region.getRegionName());
                if (insert) {
                    livestockdensityMapper.insertSelective(item);
                } else {
                    livestockdensityMapper.updateByPrimaryKeySelective(item);
                }
                iLogService.insertLog("保存牲畜免疫密度统计表");
                break;
            }
            case "b_kingfisher": {
                changeApiJson(Kingfisher.class, jsonObj);
                Kingfisher fill = (Kingfisher) JSONObject.toBean(jsonObj, Kingfisher.class);
                Kingfisher arg = new Kingfisher();
                arg.setKfReportid(report.getReportId());
                List<Kingfisher> items = kingfisherMapper.select(arg);
                Kingfisher item = new Kingfisher();
                if (items.size() > 0) {
                    item = items.get(0);
                } else {
                    item = null;
                }
                boolean insert = true;
                if (item == null) {
                    item = fill;
                    item.setKfId(UUIDUtil.getUUID());
                } else {
                    fill.setKfId(item.getKfId());
                    item = fill;
                    insert = false;
                }
                item.setKfReportid(report.getReportId());
                item.setKfDate(report.getBeginTime());
                item.setKfRegioncode(region.getRegionCode());
                item.setKfRegionname(region.getRegionName());
                int i;
                if (insert) {
                    kingfisherMapper.insertSelective(item);
                } else {
                    i = kingfisherMapper.updateByPrimaryKeySelective(item);
                }
                iLogService.insertLog("保存经费统计表");
                break;
            }
            case "b_kingfisher_new": {
                changeApiJson(KingfisherNew.class, jsonObj);
                KingfisherNew fill = (KingfisherNew) JSONObject.toBean(jsonObj, KingfisherNew.class);
                KingfisherNew arg = new KingfisherNew();
                arg.setKfReportid(report.getReportId());
                List<KingfisherNew> items = kingfisherNewMapper.select(arg);
                KingfisherNew item = new KingfisherNew();
                if (items.size() > 0) {
                    item = items.get(0);
                } else {
                    item = null;
                }
                boolean insert = true;
                if (item == null) {
                    item = fill;
                    item.setKfId(UUIDUtil.getUUID());
                } else {
                    fill.setKfId(item.getKfId());
                    item = fill;
                    insert = false;
                }
                item.setKfReportid(report.getReportId());
                item.setKfDate(report.getBeginTime());
                item.setKfRegioncode(region.getRegionCode());
                item.setKfRegionname(region.getRegionName());
                int i;
                if (insert) {
                    kingfisherNewMapper.insertSelective(item);
                } else {
                    i = kingfisherNewMapper.updateByPrimaryKeySelective(item);
                }
                iLogService.insertLog("保存经费统计表-新");
                break;
            }
            case "b_classicalswinefevervaccine": {
                changeApiJson(Classicalswinefevervaccine.class, jsonObj);
                Classicalswinefevervaccine fill = (Classicalswinefevervaccine) JSONObject
                        .toBean(jsonObj, Classicalswinefevervaccine.class);
                Classicalswinefevervaccine arg = new Classicalswinefevervaccine();
                arg.setCvReportid(report.getReportId());
                List<Classicalswinefevervaccine> items = classicalswinefevervaccineMapper.select(arg);
                Classicalswinefevervaccine item = new Classicalswinefevervaccine();
                if (items.size() > 0) {
                    item = items.get(0);
                } else {
                    item = null;
                }
                boolean insert = true;
                if (item == null) {
                    item = fill;
                    item.setCvId(UUIDUtil.getUUID());
                } else {
                    fill.setCvId(item.getCvId());
                    item = fill;
                    insert = false;
                }
                item.setCvReportid(report.getReportId());
                item.setCvDate(report.getBeginTime());
                item.setCvRegioncode(region.getRegionCode());
                item.setCvRegionname(region.getRegionName());
                if (insert) {
                    classicalswinefevervaccineMapper.insertSelective(item);
                } else {
                    classicalswinefevervaccineMapper.updateByPrimaryKeySelective(item);
                }
                iLogService.insertLog("保存猪瘟疫苗使用统计表");
                break;
            }
            case "b_footandmouthvaccine": {
                changeApiJson(Footandmouthvaccine.class, jsonObj);
                Footandmouthvaccine fill = (Footandmouthvaccine) JSONObject.toBean(jsonObj, Footandmouthvaccine.class);
                Footandmouthvaccine arg = new Footandmouthvaccine();
                arg.setFvReportid(report.getReportId());
                List<Footandmouthvaccine> items = footandmouthvaccineMapper.select(arg);
                Footandmouthvaccine item = new Footandmouthvaccine();
                if (items.size() > 0) {
                    item = items.get(0);
                } else {
                    item = null;
                }
                boolean insert = true;
                if (item == null) {
                    item = fill;
                    item.setFvId(UUIDUtil.getUUID());
                } else {
                    fill.setFvId(item.getFvId());
                    item = fill;
                    insert = false;
                }
                item.setFvReportid(report.getReportId());
                item.setFvDate(report.getBeginTime());
                item.setFvRegioncode(region.getRegionCode());
                item.setFvRegionname(region.getRegionName());
                if (insert) {
                    footandmouthvaccineMapper.insertSelective(item);
                } else {
                    footandmouthvaccineMapper.updateByPrimaryKeySelective(item);
                }
                iLogService.insertLog("保存口蹄疫疫苗使用统计表");
                break;
            }
            case "b_bluevaccine": {
                changeApiJson(Bluevaccine.class, jsonObj);
                Bluevaccine fill = (Bluevaccine) JSONObject.toBean(jsonObj, Bluevaccine.class);
                Bluevaccine arg = new Bluevaccine();
                arg.setBvReportid(report.getReportId());
                List<Bluevaccine> items = bluevaccineMapper.select(arg);
                Bluevaccine item = new Bluevaccine();
                if (items.size() > 0) {
                    item = items.get(0);
                } else {
                    item = null;
                }
                boolean insert = true;
                if (item == null) {
                    item = fill;
                    item.setBvId(UUIDUtil.getUUID());
                } else {
                    fill.setBvId(item.getBvId());
                    item = fill;
                    insert = false;
                }
                item.setBvReportid(report.getReportId());
                item.setBvDate(report.getBeginTime());
                item.setBvRegioncode(region.getRegionCode());
                item.setBvRegionname(region.getRegionName());
                if (insert) {
                    bluevaccineMapper.insertSelective(item);
                } else {
                    bluevaccineMapper.updateByPrimaryKeySelective(item);
                }
                iLogService.insertLog("保存高致病性猪蓝耳病疫苗使用统计表");
                break;
            }
            case "b_echinococciasisvaccine": {
                changeApiJson(EchinococciasisVaccine.class, jsonObj);
                EchinococciasisVaccine fill = (EchinococciasisVaccine) JSONObject
                        .toBean(jsonObj, EchinococciasisVaccine.class);
                EchinococciasisVaccine arg = new EchinococciasisVaccine();
                arg.setEchReportid(report.getReportId());
                List<EchinococciasisVaccine> items = echinococciasisVaccineMapper.select(arg);
                EchinococciasisVaccine item = new EchinococciasisVaccine();
                if (items.size() > 0) {
                    item = items.get(0);
                } else {
                    item = null;
                }
                boolean insert = true;
                if (item == null) {
                    item = fill;
                    item.setEchId(UUIDUtil.getUUID());
                } else {
                    fill.setEchId(item.getEchId());
                    item = fill;
                    insert = false;
                }
                item.setEchReportid(report.getReportId());
                item.setEchDate(report.getBeginTime());
                item.setEchRegioncode(region.getRegionCode());
                item.setEchRegionname(region.getRegionName());
                if (insert) {
                    echinococciasisVaccineMapper.insertSelective(item);
                } else {
                    echinococciasisVaccineMapper.updateByPrimaryKeySelective(item);
                }
                iLogService.insertLog("保存包虫病疫苗使用统计表");
                break;
            }
            case "b_brucellosisvaccine": {
                changeApiJson(BrucellosisVaccine.class, jsonObj);
                BrucellosisVaccine fill = (BrucellosisVaccine) JSONObject.toBean(jsonObj, BrucellosisVaccine.class);
                BrucellosisVaccine arg = new BrucellosisVaccine();
                arg.setBruReportid(report.getReportId());
                List<BrucellosisVaccine> items = brucellosisVaccineMapper.select(arg);
                BrucellosisVaccine item = new BrucellosisVaccine();
                if (items.size() > 0) {
                    item = items.get(0);
                } else {
                    item = null;
                }
                boolean insert = true;
                if (item == null) {
                    item = fill;
                    item.setBruId(UUIDUtil.getUUID());
                } else {
                    fill.setBruId(item.getBruId());
                    item = fill;
                    insert = false;
                }
                item.setBruReportid(report.getReportId());
                item.setBruDate(report.getBeginTime());
                item.setBruRegioncode(region.getRegionCode());
                item.setBruRegionname(region.getRegionName());
                if (insert) {
                    brucellosisVaccineMapper.insertSelective(item);
                } else {
                    brucellosisVaccineMapper.updateByPrimaryKeySelective(item);
                }
                iLogService.insertLog("保存布鲁氏菌病疫苗使用统计表");
                break;
            }
            case "b_avianinfluenzavaccine": {
                changeApiJson(Avianinfluenzavaccine.class, jsonObj);
                Avianinfluenzavaccine fill = (Avianinfluenzavaccine) JSONObject
                        .toBean(jsonObj, Avianinfluenzavaccine.class);
                Avianinfluenzavaccine arg = new Avianinfluenzavaccine();
                arg.setAvReportid(report.getReportId());
                List<Avianinfluenzavaccine> items = avianinfluenzavaccineMapper.select(arg);
                Avianinfluenzavaccine item = new Avianinfluenzavaccine();
                if (items.size() > 0) {
                    item = items.get(0);
                } else {
                    item = null;
                }
                boolean insert = true;
                if (item == null) {
                    item = fill;
                    item.setAvId(UUIDUtil.getUUID());
                } else {
                    fill.setAvId(item.getAvId());
                    item = fill;
                    insert = false;
                }
                item.setAvReportid(report.getReportId());
                item.setAvDate(report.getBeginTime());
                item.setAvRegioncode(region.getRegionCode());
                item.setAvRegionname(region.getRegionName());
                if (insert) {
                    avianinfluenzavaccineMapper.insertSelective(item);
                } else {
                    avianinfluenzavaccineMapper.updateByPrimaryKeySelective(item);
                }
                iLogService.insertLog("保存禽流感疫苗使用统计表");
                break;
            }
            case "b_wpestedespetitsruminants": {
                changeApiJson(Wpestedespetitsruminants.class, jsonObj);
                Wpestedespetitsruminants fill = (Wpestedespetitsruminants) JSONObject
                        .toBean(jsonObj, Wpestedespetitsruminants.class);
                Wpestedespetitsruminants arg = new Wpestedespetitsruminants();
                arg.setWpdrReportid(report.getReportId());
                List<Wpestedespetitsruminants> items = wpestedespetitsruminantsMapper.select(arg);
                Wpestedespetitsruminants item = new Wpestedespetitsruminants();
                if (items.size() > 0) {
                    item = items.get(0);
                } else {
                    item = null;
                }
                boolean insert = true;
                if (item == null) {
                    item = fill;
                    item.setWpdrId(UUIDUtil.getUUID());
                } else {
                    fill.setWpdrId(item.getWpdrId());
                    item = fill;
                    insert = false;
                }
                item.setWpdrReportid(report.getReportId());
                item.setWpdrDate(report.getBeginTime());
                item.setWpdrRegioncode(region.getRegionCode());
                item.setWpdrRegionname(region.getRegionName());
                if (insert) {
                    wpestedespetitsruminantsMapper.insertSelective(item);
                } else {
                    wpestedespetitsruminantsMapper.updateByPrimaryKeySelective(item);
                }
                iLogService.insertLog("保存小反刍兽疫疫苗使用和免疫情况周报表");
                break;
            }
            case "b_wavianinfluenza": {
                changeApiJson(Wavianinfluenza.class, jsonObj);
                Wavianinfluenza fill = (Wavianinfluenza) JSONObject.toBean(jsonObj, Wavianinfluenza.class);
                Wavianinfluenza arg = new Wavianinfluenza();
                arg.setAiReportid(report.getReportId());
                List<Wavianinfluenza> items = wavianinfluenzaMapper.select(arg);
                Wavianinfluenza item = new Wavianinfluenza();
                if (items.size() > 0) {
                    item = items.get(0);
                } else {
                    item = null;
                }
                boolean insert = true;
                if (item == null) {
                    item = fill;
                    item.setAiId(UUIDUtil.getUUID());
                } else {
                    fill.setAiId(item.getAiId());
                    item = fill;
                    insert = false;
                }
                item.setAiReportid(report.getReportId());
                item.setAiDate(report.getBeginTime());
                item.setAiRegioncode(region.getRegionCode());
                item.setAiRegionname(region.getRegionName());
                if (insert) {
                    wavianinfluenzaMapper.insertSelective(item);
                } else {
                    wavianinfluenzaMapper.updateByPrimaryKeySelective(item);
                }
                iLogService.insertLog("保存禽流感疫苗使用和免疫情况周报表");
                break;
            }
            case "b_wnewcastle": {
                changeApiJson(Wnewcastle.class, jsonObj);
                Wnewcastle fill = (Wnewcastle) JSONObject.toBean(jsonObj, Wnewcastle.class);
                Wnewcastle arg = new Wnewcastle();
                arg.setNcReportid(report.getReportId());
                List<Wnewcastle> items = wnewcastleMapper.select(arg);
                Wnewcastle item = new Wnewcastle();
                if (items.size() > 0) {
                    item = items.get(0);
                } else {
                    item = null;
                }
                boolean insert = true;
                if (item == null) {
                    item = fill;
                    item.setNcId(UUIDUtil.getUUID());
                } else {
                    fill.setNcId(item.getNcId());
                    item = fill;
                    insert = false;
                }
                item.setNcReportid(report.getReportId());
                item.setNcDate(report.getBeginTime());
                item.setNcRegioncode(region.getRegionCode());
                item.setNcRegionname(region.getRegionName());
                if (insert) {
                    wnewcastleMapper.insertSelective(item);
                } else {
                    wnewcastleMapper.updateByPrimaryKeySelective(item);
                }
                iLogService.insertLog("保存新城疫疫苗使用和免疫情况周报表");
                break;
            }
            case "b_wclassicalswinefever": {
                changeApiJson(Wclassicalswinefever.class, jsonObj);
                Wclassicalswinefever fill = (Wclassicalswinefever) JSONObject
                        .toBean(jsonObj, Wclassicalswinefever.class);
                Wclassicalswinefever arg = new Wclassicalswinefever();
                arg.setCsfReportid(report.getReportId());
                List<Wclassicalswinefever> items = wclassicalswinefeverMapper.select(arg);
                Wclassicalswinefever item = new Wclassicalswinefever();
                if (items.size() > 0) {
                    item = items.get(0);
                } else {
                    item = null;
                }
                boolean insert = true;
                if (item == null) {
                    item = fill;
                    item.setCsfId(UUIDUtil.getUUID());
                } else {
                    fill.setCsfId(item.getCsfId());
                    item = fill;
                    insert = false;
                }
                item.setCsfReportid(report.getReportId());
                item.setCsfDate(report.getBeginTime());
                item.setCsfRegioncode(region.getRegionCode());
                item.setCsfRegionname(region.getRegionName());
                if (insert) {
                    wclassicalswinefeverMapper.insertSelective(item);
                } else {
                    wclassicalswinefeverMapper.updateByPrimaryKeySelective(item);
                }
                iLogService.insertLog("保存猪瘟疫苗使用和免疫情况周报表");
                break;
            }
            case "b_wblueeardisease": {
                changeApiJson(Wblueeardisease.class, jsonObj);
                Wblueeardisease fill = (Wblueeardisease) JSONObject.toBean(jsonObj, Wblueeardisease.class);
                Wblueeardisease arg = new Wblueeardisease();
                arg.setBedReportid(report.getReportId());
                List<Wblueeardisease> items = wblueeardiseaseMapper.select(arg);
                Wblueeardisease item = new Wblueeardisease();
                if (items.size() > 0) {
                    item = items.get(0);
                } else {
                    item = null;
                }
                boolean insert = true;
                if (item == null) {
                    item = fill;
                    item.setBedId(UUIDUtil.getUUID());
                } else {
                    fill.setBedId(item.getBedId());
                    item = fill;
                    insert = false;
                }
                item.setBedReportid(report.getReportId());
                item.setBedDate(report.getBeginTime());
                item.setBedRegioncode(region.getRegionCode());
                item.setBedRegionname(region.getRegionName());
                if (insert) {
                    wblueeardiseaseMapper.insertSelective(item);
                } else {
                    wblueeardiseaseMapper.updateByPrimaryKeySelective(item);
                }
                iLogService.insertLog("保存高致病性猪蓝耳病疫苗使用和免疫情况周报表");
                break;
            }
            case "b_wechinococciasis": {
                changeApiJson(Wechinococciasis.class, jsonObj);
                Wechinococciasis fill = (Wechinococciasis) JSONObject.toBean(jsonObj, Wechinococciasis.class);
                Wechinococciasis arg = new Wechinococciasis();
                arg.setEchReportid(report.getReportId());
                List<Wechinococciasis> items = wechinococciasisMapper.select(arg);
                Wechinococciasis item = new Wechinococciasis();
                if (items.size() > 0) {
                    item = items.get(0);
                } else {
                    item = null;
                }
                boolean insert = true;
                if (item == null) {
                    item = fill;
                    item.setEchId(UUIDUtil.getUUID());
                } else {
                    fill.setEchId(item.getEchId());
                    item = fill;
                    insert = false;
                }
                item.setEchReportid(report.getReportId());
                item.setEchDate(report.getBeginTime());
                item.setEchRegioncode(region.getRegionCode());
                item.setEchRegionname(region.getRegionName());
                if (insert) {
                    wechinococciasisMapper.insertSelective(item);
                } else {
                    wechinococciasisMapper.updateByPrimaryKeySelective(item);
                }
                iLogService.insertLog("保存包虫病疫苗使用和免疫情况周报表");
                break;
            }
            case "b_wbrucellosis": {
                changeApiJson(Wbrucellosis.class, jsonObj);
                Wbrucellosis fill = (Wbrucellosis) JSONObject.toBean(jsonObj, Wbrucellosis.class);
                Wbrucellosis arg = new Wbrucellosis();
                arg.setBruReportid(report.getReportId());
                List<Wbrucellosis> items = wbrucellosisMapper.select(arg);
                Wbrucellosis item = new Wbrucellosis();
                if (items.size() > 0) {
                    item = items.get(0);
                } else {
                    item = null;
                }
                boolean insert = true;
                if (item == null) {
                    item = fill;
                    item.setBruId(UUIDUtil.getUUID());
                } else {
                    fill.setBruId(item.getBruId());
                    item = fill;
                    insert = false;
                }
                item.setBruReportid(report.getReportId());
                item.setBruDate(report.getBeginTime());
                item.setBruRegioncode(region.getRegionCode());
                item.setBruRegionname(region.getRegionName());
                if (insert) {
                    wbrucellosisMapper.insertSelective(item);
                } else {
                    wbrucellosisMapper.updateByPrimaryKeySelective(item);
                }
                iLogService.insertLog("保存鲁氏菌病疫苗使用和免疫情况周报表");
                break;
            }
            case "b_vaccineorder": {
                changeApiJson(Vaccineorder.class, jsonObj);
                Vaccineorder fill = (Vaccineorder) JSONObject.toBean(jsonObj, Vaccineorder.class);
                Vaccineorder arg = new Vaccineorder();
                arg.setReportid(report.getReportId());
                List<Vaccineorder> items = vaccineorderMapper.select(arg);
                Vaccineorder item = new Vaccineorder();
                if (items.size() > 0) {
                    item = items.get(0);
                } else {
                    item = null;
                }
                boolean insert = true;
                if (item == null) {
                    item = fill;
                    item.setVaccineorderid(UUIDUtil.getUUID());
                } else {
                    fill.setVaccineorderid(item.getVaccineorderid());
                    item = fill;
                    insert = false;
                }
                item.setReportid(report.getReportId());
                item.setDate(report.getBeginTime());
                item.setRegioncode(region.getRegionCode());
                item.setRegionname(region.getRegionName());
                if (insert) {
                    vaccineorderMapper.insertSelective(item);
                } else {
                    vaccineorderMapper.updateByPrimaryKeySelective(item);
                }
                iLogService.insertLog("保存疫苗到货、下拨月报表");
                break;
            }
            case "b_blueeardisease": {
                changeApiJson(Blueeardisease.class, jsonObj);
                Blueeardisease fill = (Blueeardisease) JSONObject.toBean(jsonObj, Blueeardisease.class);
                Blueeardisease arg = new Blueeardisease();
                arg.setBedReportid(report.getReportId());
                List<Blueeardisease> items = blueeardiseaseMapper.select(arg);
                Blueeardisease item = new Blueeardisease();
                if (items.size() > 0) {
                    item = items.get(0);
                } else {
                    item = null;
                }
                boolean insert = true;
                if (item == null) {
                    item = fill;
                    item.setBedId(UUIDUtil.getUUID());
                } else {
                    fill.setBedId(item.getBedId());
                    item = fill;
                    insert = false;
                }
                item.setBedReportid(report.getReportId());
                item.setBedDate(report.getBeginTime());
                item.setBedRegioncode(region.getRegionCode());
                item.setBedRegionname(region.getRegionName());
                if (insert) {
                    blueeardiseaseMapper.insertSelective(item);
                } else {
                    blueeardiseaseMapper.updateByPrimaryKeySelective(item);
                }
                iLogService.insertLog("保存高致病性猪蓝耳病免疫情况月报表");
                break;
            }
            case "b_echinococciasisdisease": {
                changeApiJson(EchinococciasisDisease.class, jsonObj);
                EchinococciasisDisease fill = (EchinococciasisDisease) JSONObject
                        .toBean(jsonObj, EchinococciasisDisease.class);
                EchinococciasisDisease arg = new EchinococciasisDisease();
                arg.setEchReportid(report.getReportId());
                List<EchinococciasisDisease> items = echinococciasisDiseaseMapper.select(arg);
                EchinococciasisDisease item = new EchinococciasisDisease();
                if (items.size() > 0) {
                    item = items.get(0);
                } else {
                    item = null;
                }
                boolean insert = true;
                if (item == null) {
                    item = fill;
                    item.setEchId(UUIDUtil.getUUID());
                } else {
                    fill.setEchId(item.getEchId());
                    item = fill;
                    insert = false;
                }
                item.setEchReportid(report.getReportId());
                item.setEchDate(report.getBeginTime());
                item.setEchRegioncode(region.getRegionCode());
                item.setEchRegionname(region.getRegionName());
                if (insert) {
                    echinococciasisDiseaseMapper.insertSelective(item);
                } else {
                    echinococciasisDiseaseMapper.updateByPrimaryKeySelective(item);
                }
                iLogService.insertLog("保存包虫病免疫情况月报表");
                break;
            }
            case "b_brucellosisdisease": {
                changeApiJson(BrucellosisDisease.class, jsonObj);
                BrucellosisDisease fill = (BrucellosisDisease) JSONObject.toBean(jsonObj, BrucellosisDisease.class);
                BrucellosisDisease arg = new BrucellosisDisease();
                arg.setBruReportid(report.getReportId());
                List<BrucellosisDisease> items = brucellosisDiseaseMapper.select(arg);
                BrucellosisDisease item = new BrucellosisDisease();
                if (items.size() > 0) {
                    item = items.get(0);
                } else {
                    item = null;
                }
                boolean insert = true;
                if (item == null) {
                    item = fill;
                    item.setBruId(UUIDUtil.getUUID());
                } else {
                    fill.setBruId(item.getBruId());
                    item = fill;
                    insert = false;
                }
                item.setBruReportid(report.getReportId());
                item.setBruDate(report.getBeginTime());
                item.setBruRegioncode(region.getRegionCode());
                item.setBruRegionname(region.getRegionName());
                if (insert) {
                    brucellosisDiseaseMapper.insertSelective(item);
                } else {
                    brucellosisDiseaseMapper.updateByPrimaryKeySelective(item);
                }
                iLogService.insertLog("保存布鲁氏菌病免疫情况月报表");
                break;
            }
            case "b_classicalswinefever": {
                changeApiJson(Classicalswinefever.class, jsonObj);
                Classicalswinefever fill = (Classicalswinefever) JSONObject.toBean(jsonObj, Classicalswinefever.class);
                Classicalswinefever arg = new Classicalswinefever();
                arg.setCsfReportid(report.getReportId());
                List<Classicalswinefever> items = classicalswinefeverMapper.select(arg);
                Classicalswinefever item = new Classicalswinefever();
                if (items.size() > 0) {
                    item = items.get(0);
                } else {
                    item = null;
                }
                boolean insert = true;
                if (item == null) {
                    item = fill;
                    item.setCsfId(UUIDUtil.getUUID());
                } else {
                    fill.setCsfId(item.getCsfId());
                    item = fill;
                    insert = false;
                }
                item.setCsfReportid(report.getReportId());
                item.setCsfDate(report.getBeginTime());
                item.setCsfRegioncode(region.getRegionCode());
                item.setCsfRegionname(region.getRegionName());
                if (insert) {
                    classicalswinefeverMapper.insertSelective(item);
                } else {
                    classicalswinefeverMapper.updateByPrimaryKeySelective(item);
                }
                iLogService.insertLog("保存猪瘟免疫情况月报表");
                break;
            }
            case "b_footandmouthdisease": {
                changeApiJson(Footandmouthdisease.class, jsonObj);
                Footandmouthdisease fill = (Footandmouthdisease) JSONObject.toBean(jsonObj, Footandmouthdisease.class);
                Footandmouthdisease arg = new Footandmouthdisease();
                arg.setFmdReportid(report.getReportId());
                List<Footandmouthdisease> items = footandmouthdiseaseMapper.select(arg);
                Footandmouthdisease item = new Footandmouthdisease();
                if (items.size() > 0) {
                    item = items.get(0);
                } else {
                    item = null;
                }
                boolean insert = true;
                if (item == null) {
                    item = fill;
                    item.setFmdId(UUIDUtil.getUUID());
                } else {
                    fill.setFmdId(item.getFmdId());
                    item = fill;
                    insert = false;
                }
                item.setFmdReportid(report.getReportId());
                item.setFmdDate(report.getBeginTime());
                item.setFmdRegioncode(region.getRegionCode());
                item.setFmdRegionname(region.getRegionName());
                if (insert) {
                    footandmouthdiseaseMapper.insertSelective(item);
                } else {
                    footandmouthdiseaseMapper.updateByPrimaryKeySelective(item);
                }
                iLogService.insertLog("保存口蹄疫免疫情况月报表");
                break;
            }
            case "b_newcastle": {
                changeApiJson(Newcastle.class, jsonObj);
                Newcastle fill = (Newcastle) JSONObject.toBean(jsonObj, Newcastle.class);
                Newcastle arg = new Newcastle();
                arg.setNcReportid(report.getReportId());
                List<Newcastle> items = newcastleMapper.select(arg);
                Newcastle item = new Newcastle();
                if (items.size() > 0) {
                    item = items.get(0);
                } else {
                    item = null;
                }
                boolean insert = true;
                if (item == null) {
                    item = fill;
                    item.setNcId(UUIDUtil.getUUID());
                } else {
                    fill.setNcId(item.getNcId());
                    item = fill;
                    insert = false;
                }
                item.setNcReportid(report.getReportId());
                item.setNcDate(report.getBeginTime());
                item.setNcRegioncode(region.getRegionCode());
                item.setNcRegionname(region.getRegionName());
                if (insert) {
                    newcastleMapper.insertSelective(item);
                } else {
                    newcastleMapper.updateByPrimaryKeySelective(item);
                }
                iLogService.insertLog("保存新城疫免疫情况月报表");
                break;
            }
            case "b_pestedespetitsruminants": {
                changeApiJson(Pestedespetitsruminants.class, jsonObj);
                Pestedespetitsruminants fill = (Pestedespetitsruminants) JSONObject
                        .toBean(jsonObj, Pestedespetitsruminants.class);
                Pestedespetitsruminants arg = new Pestedespetitsruminants();
                arg.setPdprReportid(report.getReportId());
                List<Pestedespetitsruminants> items = pestedespetitsruminantsMapper.select(arg);
                Pestedespetitsruminants item = new Pestedespetitsruminants();
                if (items.size() > 0) {
                    item = items.get(0);
                } else {
                    item = null;
                }
                boolean insert = true;
                if (item == null) {
                    item = fill;
                    item.setPdprId(UUIDUtil.getUUID());
                } else {
                    fill.setPdprId(item.getPdprId());
                    item = fill;
                    insert = false;
                }
                item.setPdprReportid(report.getReportId());
                item.setPdprDate(report.getBeginTime());
                item.setPdprRegioncode(region.getRegionCode());
                item.setPdprRegionname(region.getRegionName());
                if (insert) {
                    pestedespetitsruminantsMapper.insertSelective(item);
                } else {
                    pestedespetitsruminantsMapper.updateByPrimaryKeySelective(item);
                }
                iLogService.insertLog("保存小反刍兽疫免疫情况月报表");
                break;
            }
            case "b_livestockinout": {
                changeApiJson(LiveStockInOut.class, jsonObj);
                LiveStockInOut fill = (LiveStockInOut) JSONObject.toBean(jsonObj, LiveStockInOut.class);
                LiveStockInOut liveStockInOut = liveStockInOutMapper.selectOneByReportId(report.getReportId());
                boolean insert = true;
                if (liveStockInOut == null) {
                    liveStockInOut = fill;
                    liveStockInOut.setLivestockid(UUIDUtil.getUUID());
                } else {
                    fill.setLivestockid(liveStockInOut.getLivestockid());
                    liveStockInOut = fill;
                    insert = false;
                }
                liveStockInOut.setReportid(report.getReportId());
                liveStockInOut.setLivestockdate(report.getBeginTime());
                liveStockInOut.setLivRegioncode(region.getRegionCode());
                liveStockInOut.setLivRegionname(region.getRegionName());
                if (insert) {
                    liveStockInOutMapper.insertSelective(liveStockInOut);
                } else {
                    liveStockInOutMapper.updateByPrimaryKeySelective(liveStockInOut);
                }
                iLogService.insertLog("保存畜禽存栏和应免数量月报表");
                break;
            }
            case "b_disinfectiondrugs": {
                changeApiJson(Disinfectiondrugs.class, jsonObj);
                Disinfectiondrugs fill = (Disinfectiondrugs) JSONObject.toBean(jsonObj, Disinfectiondrugs.class);
                Disinfectiondrugs arg = new Disinfectiondrugs();
                arg.setDfReportid(report.getReportId());
                List<Disinfectiondrugs> items = disinfectiondrugsMapper.select(arg);
                Disinfectiondrugs item = new Disinfectiondrugs();
                if (items.size() > 0) {
                    item = items.get(0);
                } else {
                    item = null;
                }
                boolean insert = true;
                if (item == null) {
                    item = fill;
                    item.setDfId(UUIDUtil.getUUID());
                } else {
                    fill.setDfId(item.getDfId());
                    item = fill;
                    insert = false;
                }
                item.setDfReportid(report.getReportId());
                item.setDfDate(report.getBeginTime());
                item.setDfRegioncode(region.getRegionCode());
                item.setDfRegionname(region.getRegionName());
                if (insert) {
                    disinfectiondrugsMapper.insertSelective(item);
                } else {
                    disinfectiondrugsMapper.updateByPrimaryKeySelective(item);
                }
                iLogService.insertLog("保存消毒药品储备情况表");
                break;
            }
            case "b_wfootandmouthdisease": {
                changeApiJson(Wfootandmouthdisease.class, jsonObj);
                Wfootandmouthdisease fill = (Wfootandmouthdisease) JSONObject
                        .toBean(jsonObj, Wfootandmouthdisease.class);
                Wfootandmouthdisease arg = new Wfootandmouthdisease();
                arg.setFmdReportid(report.getReportId());
                List<Wfootandmouthdisease> items = wfootandmouthdiseaseMapper.select(arg);
                Wfootandmouthdisease item = new Wfootandmouthdisease();
                if (items.size() > 0) {
                    item = items.get(0);
                } else {
                    item = null;
                }
                boolean insert = true;
                if (item == null) {
                    item = fill;
                    item.setFmdId(UUIDUtil.getUUID());
                } else {
                    fill.setFmdId(item.getFmdId());
                    item = fill;
                    insert = false;
                }
                item.setFmdReportid(report.getReportId());
                item.setFmdDate(report.getBeginTime());
                item.setFmdRegioncode(region.getRegionCode());
                item.setFmdRegionname(region.getRegionName());
                if (insert) {
                    wfootandmouthdiseaseMapper.insertSelective(item);
                } else {
                    wfootandmouthdiseaseMapper.updateByPrimaryKeySelective(item);
                }
                iLogService.insertLog("保存牲畜口蹄疫疫苗使用和免疫情况周报表");
                break;
            }
            case "b_wlivestockinout": {
                changeApiJson(Wlivestockinout.class, jsonObj);
                Wlivestockinout fill = (Wlivestockinout) JSONObject.toBean(jsonObj, Wlivestockinout.class);
                Wlivestockinout arg = new Wlivestockinout();
                arg.setReportid(report.getReportId());
                List<Wlivestockinout> items = wlivestockinoutMapper.select(arg);
                Wlivestockinout item = new Wlivestockinout();
                if (items.size() > 0) {
                    item = items.get(0);
                } else {
                    item = null;
                }
                boolean insert = true;
                if (item == null) {
                    item = fill;
                    item.setLivestockid(UUIDUtil.getUUID());
                } else {
                    fill.setLivestockid(item.getLivestockid());
                    item = fill;
                    insert = false;
                }
                item.setReportid(report.getReportId());
                item.setLivestockdate(report.getBeginTime());
                item.setLivRegioncode(region.getRegionCode());
                item.setLivRegionname(region.getRegionName());
                if (insert) {
                    wlivestockinoutMapper.insertSelective(item);
                } else {
                    wlivestockinoutMapper.updateByPrimaryKeySelective(item);
                }
                iLogService.insertLog("保存畜禽存栏和应免数量统计表");
                break;
            }
            default:
                break;
        }
        return 1;
    }
}
