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
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.entity.Example;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.util.*;

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
    private LivestockdensityMapper livestockdensityMapper;

     @Autowired
    private NewcastlevaccineMapper newcastlevaccineMapper;

     @Autowired
    private PoultrydensityMapper poultrydensityMapper;

    @Autowired
    private SmallruminantsvaccineMapper smallruminantsvaccineMapper;

     @Autowired
    private EmergencyvaccineMapper emergencyvaccineMapper;

    private Wlivestockinout getWlivestockinout(Region region,Date date){
        Date beginTime= BeginTimeUtil.getCurrentHalfYearBeginTime(date);
        String beginTimeStr= DateUtil.DateToString(beginTime, DateStyle.HH_MM.YYYY_MM_DD_HH_MM_SS);
        Wlivestockinout wlivestockinout=new Wlivestockinout();
        wlivestockinout=this.wlivestockinoutMapper.selectLivestockInOutByRegionCode(region.getRegionCode(),beginTimeStr);
        return wlivestockinout;
    }



    @Override
    public String getReportHtml(HttpServletRequest request, Report report) {
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
        Wlivestockinout wlivestockinout=getWlivestockinout(region,report.getBeginTime());
        params.put("wlivestockinout", wlivestockinout);

        Date beginTime=BeginTimeUtil.getBeginTime(report.getBeginTime());
        Date halfYearbeginTime=BeginTimeUtil.getCurrentHalfYearBeginTime(report.getBeginTime());
        Date endTime=report.getBeginTime();

        switch (template.getTableName().toLowerCase()) {
            case "b_avianinfluenza": {
                Avianinfluenza arg =new Avianinfluenza();
                arg.setAiReportid(report.getReportId());
                List<Avianinfluenza> items=avianinfluenzaMapper.select(arg);
                Avianinfluenza item =new Avianinfluenza();
                if(items.size()>0) {
                    item = items.get(0);
                }
                params.put("item", item);
                Avianinfluenza  itemSum = avianinfluenzaMapper.selectSumByReportCode(region.getRegionCode(), beginTime, endTime);
                params.put("itemSum",itemSum);
                break;
            }
           case "b_emergencyvaccine": {
               Emergencyvaccine arg =new Emergencyvaccine();
                arg.setEvReportid(report.getReportId());
               List<Emergencyvaccine> items=emergencyvaccineMapper.select(arg);
               Emergencyvaccine item =new Emergencyvaccine();
               if(items.size()>0) {
                   item = items.get(0);
               }
                params.put("item", item);
                break;
            }
            case "b_smallruminantsvaccine": {
                Smallruminantsvaccine arg =new Smallruminantsvaccine();
                arg.setSrvReportid(report.getReportId());
                List<Smallruminantsvaccine> items=smallruminantsvaccineMapper.select(arg);
                Smallruminantsvaccine item =new Smallruminantsvaccine();
                if(items.size()>0) {
                    item = items.get(0);
                }
                params.put("item", item);
                break;
            }
            case "b_poultrydensity": {
                Poultrydensity arg =new Poultrydensity();
                arg.setPdReportid(report.getReportId());
                List<Poultrydensity> items=poultrydensityMapper.select(arg);
                Poultrydensity item =new Poultrydensity();
                if(items.size()>0) {
                    item = items.get(0);
                }
                params.put("item", item);
                break;
            }
            case "b_newcastlevaccine": {
                Newcastlevaccine arg =new Newcastlevaccine();
                arg.setNvReportid(report.getReportId());
                List<Newcastlevaccine> items=newcastlevaccineMapper.select(arg);
                Newcastlevaccine item =new Newcastlevaccine();
                if(items.size()>0) {
                    item = items.get(0);
                }
                params.put("item", item);
                break;
            }
            case "b_livestockdensity": {
                Livestockdensity arg =new Livestockdensity();
                arg.setLdReportid(report.getReportId());
                List<Livestockdensity> items=livestockdensityMapper.select(arg);
                Livestockdensity item =new Livestockdensity();
                if(items.size()>0) {
                    item = items.get(0);
                }
                params.put("item", item);
                break;
            }
            case "b_kingfisher": {
                Kingfisher arg =new Kingfisher();
                arg.setKfReportid(report.getReportId());
                List<Kingfisher> items=kingfisherMapper.select(arg);
                Kingfisher item =new Kingfisher();
                if(items.size()>0) {
                    item = items.get(0);
                }
                params.put("item", item);
                break;
            }
            case "b_footandmouthvaccine": {
                Footandmouthvaccine arg =new Footandmouthvaccine();
                arg.setFvReportid(report.getReportId());
                List<Footandmouthvaccine> items=footandmouthvaccineMapper.select(arg);
                Footandmouthvaccine item =new Footandmouthvaccine();
                if(items.size()>0) {
                    item = items.get(0);
                }
                params.put("item", item);
                break;
            }
            case "b_classicalswinefevervaccine": {
                Classicalswinefevervaccine arg =new Classicalswinefevervaccine();
                arg.setCvReportid(report.getReportId());
                List<Classicalswinefevervaccine> items=classicalswinefevervaccineMapper.select(arg);
                Classicalswinefevervaccine item =new Classicalswinefevervaccine();
                if(items.size()>0) {
                    item = items.get(0);
                }
                params.put("item", item);
                break;
            }
            case "b_bluevaccine": {
                Bluevaccine arg =new Bluevaccine();
                arg.setBvReportid(report.getReportId());
                List<Bluevaccine> items=bluevaccineMapper.select(arg);
                Bluevaccine item =new Bluevaccine();
                if(items.size()>0) {
                    item = items.get(0);
                }
                params.put("item", item);
                break;
            }
            case "b_avianinfluenzavaccine": {
                Avianinfluenzavaccine arg =new Avianinfluenzavaccine();
                arg.setAvReportid(report.getReportId());
                List<Avianinfluenzavaccine> items=avianinfluenzavaccineMapper.select(arg);
                Avianinfluenzavaccine item =new Avianinfluenzavaccine();
                if(items.size()>0) {
                    item = items.get(0);
                }
                params.put("item", item);

                break;
            }
            case "b_wpestedespetitsruminants": {
                Wpestedespetitsruminants arg =new Wpestedespetitsruminants();
                arg.setWpdrReportid(report.getReportId());
                List<Wpestedespetitsruminants> items=wpestedespetitsruminantsMapper.select(arg);
                Wpestedespetitsruminants item =new Wpestedespetitsruminants();
                if(items.size()>0) {
                    item = items.get(0);
                }
                params.put("item", item);
                Wpestedespetitsruminants  itemSum = wpestedespetitsruminantsMapper.selectSumByReportCode(region.getRegionCode(), halfYearbeginTime, endTime);
                params.put("itemSum",itemSum);
                break;
            }
            case "b_wavianinfluenza": {
                Wavianinfluenza arg =new Wavianinfluenza();
                arg.setAiReportid(report.getReportId());
                List<Wavianinfluenza> items=wavianinfluenzaMapper.select(arg);
                Wavianinfluenza item =new Wavianinfluenza();
                if(items.size()>0) {
                    item = items.get(0);
                }
                params.put("item", item);
                Wavianinfluenza  itemSum = wavianinfluenzaMapper.selectSumByReportCode(region.getRegionCode(), halfYearbeginTime, endTime);
                params.put("itemSum",itemSum);
                break;
            }
            case "b_wnewcastle": {
                Wnewcastle arg =new Wnewcastle();
                arg.setNcReportid(report.getReportId());
                List<Wnewcastle> items=wnewcastleMapper.select(arg);
                Wnewcastle item =new Wnewcastle();
                if(items.size()>0) {
                    item = items.get(0);
                }
                params.put("item", item);
                Wnewcastle  itemSum = wnewcastleMapper.selectSumByReportCode(region.getRegionCode(), halfYearbeginTime, endTime);
                params.put("itemSum",itemSum);
                break;
            }
            case "b_wclassicalswinefever": {
                Wclassicalswinefever arg =new Wclassicalswinefever();
                arg.setCsfReportid(report.getReportId());
                List<Wclassicalswinefever> items=wclassicalswinefeverMapper.select(arg);
                Wclassicalswinefever item =new Wclassicalswinefever();
                if(items.size()>0) {
                    item = items.get(0);
                }
                params.put("item", item);
                Wclassicalswinefever  itemSum = wclassicalswinefeverMapper.selectSumByReportCode(region.getRegionCode(), halfYearbeginTime, endTime);
                params.put("itemSum",itemSum);
                break;
            }
            case "b_wblueeardisease": {
                Wblueeardisease arg =new Wblueeardisease();
                arg.setBedReportid(report.getReportId());
                List<Wblueeardisease> items=wblueeardiseaseMapper.select(arg);
                Wblueeardisease item =new Wblueeardisease();
                if(items.size()>0) {
                    item = items.get(0);
                }
                params.put("item", item);
                Wblueeardisease  itemSum = wblueeardiseaseMapper.selectSumByReportCode(region.getRegionCode(), halfYearbeginTime, endTime);
                params.put("itemSum",itemSum);
                break;
            }
            case "b_vaccineorder": {
                Vaccineorder arg =new Vaccineorder();
                arg.setReportid(report.getReportId());
                List<Vaccineorder> items=vaccineorderMapper.select(arg);
                Vaccineorder item =new Vaccineorder();
                if(items.size()>0) {
                    item = items.get(0);
                }
                params.put("item", item);
                Vaccineorder  itemSum = vaccineorderMapper.selectSumByReportCode(region.getRegionCode(), beginTime, endTime);
                params.put("itemSum",itemSum);
                break;
            }
            case "b_blueeardisease": {
                Blueeardisease arg =new Blueeardisease();
                arg.setBedReportid(report.getReportId());
                List<Blueeardisease> items=blueeardiseaseMapper.select(arg);
                Blueeardisease item =new Blueeardisease();
                if(items.size()>0) {
                    item = items.get(0);
                }
                params.put("item", item);
                Blueeardisease  itemSum = blueeardiseaseMapper.selectSumByReportCode(region.getRegionCode(), beginTime, endTime);
                params.put("itemSum",itemSum);
                break;
            }
            case "b_classicalswinefever": {
                Classicalswinefever arg =new Classicalswinefever();
                arg.setCsfReportid(report.getReportId());
                List<Classicalswinefever> items=classicalswinefeverMapper.select(arg);
                Classicalswinefever item =new Classicalswinefever();
                if(items.size()>0) {
                    item = items.get(0);
                }
                params.put("item", item);
                Classicalswinefever  itemSum = classicalswinefeverMapper.selectSumByReportCode(region.getRegionCode(), beginTime, endTime);
                params.put("itemSum",itemSum);
                break;
            }
            case "b_footandmouthdisease": {
                Footandmouthdisease arg =new Footandmouthdisease();
                arg.setFmdReportid(report.getReportId());
                List<Footandmouthdisease> items=footandmouthdiseaseMapper.select(arg);
                Footandmouthdisease item =new Footandmouthdisease();
                if(items.size()>0) {
                    item = items.get(0);
                }
                params.put("item", item);
                Footandmouthdisease  itemSum = footandmouthdiseaseMapper.selectSumByReportCode(region.getRegionCode(), beginTime, endTime);
                params.put("itemSum",itemSum);
                break;
            }
            case "b_livestockinout": {
                LiveStockInOut livestockInOut = liveStockInOutMapper.selectOneByReportId(report.getReportId());
                if (livestockInOut == null) {
                    livestockInOut = new LiveStockInOut();
                }
                params.put("item", livestockInOut);
                LiveStockInOut  itemSum =liveStockInOutMapper.selectSumByReportCode(region.getRegionCode(),beginTime,endTime);
                params.put("itemSum",itemSum);
                break;
            }
            case "b_newcastle": {
                Newcastle arg =new Newcastle();
                arg.setNcReportid(report.getReportId());
                List<Newcastle> items=newcastleMapper.select(arg);
                Newcastle item =new Newcastle();
                if(items.size()>0) {
                    item = items.get(0);
                }
                params.put("item", item);
                Newcastle  itemSum = newcastleMapper.selectSumByReportCode(region.getRegionCode(), beginTime, endTime);
                params.put("itemSum",itemSum);
                break;
            }
            case "b_pestedespetitsruminants": {
                Pestedespetitsruminants arg =new Pestedespetitsruminants();
                arg.setPdprReportid(report.getReportId());
                List<Pestedespetitsruminants> items=pestedespetitsruminantsMapper.select(arg);
                Pestedespetitsruminants item =new Pestedespetitsruminants();
                if(items.size()>0) {
                    item = items.get(0);
                }
                params.put("item", item);
                Pestedespetitsruminants  itemSum = pestedespetitsruminantsMapper.selectSumByReportCode(region.getRegionCode(), beginTime, endTime);
                params.put("itemSum",itemSum);
                break;
            }
            case "b_disinfectiondrugs": {
                Disinfectiondrugs arg = new Disinfectiondrugs();
                arg.setDfReportid(report.getReportId());
                List<Disinfectiondrugs> items=disinfectiondrugsMapper.select(arg);
                Disinfectiondrugs item =new Disinfectiondrugs();
                if(items.size()>0) {
                    item = items.get(0);
                }
                params.put("item", item);
                break;
            }
            case "b_wfootandmouthdisease": {
                Wfootandmouthdisease arg = new Wfootandmouthdisease();
                arg.setFmdReportid(report.getReportId());
                List<Wfootandmouthdisease> items=wfootandmouthdiseaseMapper.select(arg);
                Wfootandmouthdisease item =new Wfootandmouthdisease();
                if(items.size()>0) {
                    item = items.get(0);
                }
                params.put("item", item);
                Wfootandmouthdisease  itemSum = wfootandmouthdiseaseMapper.selectSumByReportCode(region.getRegionCode(), halfYearbeginTime, endTime);
                params.put("itemSum",itemSum);
                break;
            }
            case "b_wlivestockinout": {
                Wlivestockinout arg = new Wlivestockinout();
                arg.setReportid(report.getReportId());
                List<Wlivestockinout> items=wlivestockinoutMapper.select(arg);
                Wlivestockinout item =new Wlivestockinout();
                if(items.size()>0) {
                    item = items.get(0);
                }
                params.put("item", item);
                break;
            }
            default:
                return null;
        }

        String templatePath = request.getSession().getServletContext().getRealPath("/template");
        return FreeMarkerUtil.getHtmlStringFromTemplate(templatePath, template.getNormalTemplate(), params);
    }
private Map getReportSummaryHtmlUtil(Class clazz,List<String> reportIds,String reportName,Mapper mapper,String orderColumn){
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
    public String getReportSummaryHtml(HttpServletRequest request, String templateId, String beginTime) {
        Template template = iTemplateService.selectByKey(templateId);
        List<String> reportIds = iReportService.selectIdsByTemplateIdAndBeginTime(templateId, beginTime);
        String endTime=beginTime;

//         String beginTime=DateUtil.DateToString(BeginTimeUtil.getBeginTime(beginTime), DateStyle.HH_MM.YYYY_MM_DD_HH_MM_SS);
        String halfYearbeginTime=DateUtil.DateToString(BeginTimeUtil.getCurrentHalfYearBeginTime(beginTime), DateStyle.HH_MM.YYYY_MM_DD_HH_MM_SS);

        if (reportIds.size() == 0) return null;
        Map params = new HashMap();

        switch (template.getTableName().toLowerCase()) {
            case "b_avianinfluenza": {
                params=this.getReportSummaryHtmlUtil(Avianinfluenza.class,reportIds,"aiReportid",avianinfluenzaMapper,"ai_regionCode");

                break;
            }
            case "b_emergencyvaccine": {
                params=this.getReportSummaryHtmlUtil(Emergencyvaccine.class,reportIds,"evReportid",emergencyvaccineMapper,"ev_regionCode");
                break;
            }
            case "b_smallruminantsvaccine": {
                params=this.getReportSummaryHtmlUtil(Smallruminantsvaccine.class,reportIds,"srvReportid",smallruminantsvaccineMapper,"srv_regionCode");
                break;
            }
            case "b_poultrydensity": {
                params=this.getReportSummaryHtmlUtil(Poultrydensity.class,reportIds,"pdReportid",poultrydensityMapper,"pd_regionCode");
                break;
            }
             case "b_newcastlevaccine": {
                params=this.getReportSummaryHtmlUtil(Newcastlevaccine.class,reportIds,"nvReportid",newcastlevaccineMapper,"nv_regionCode");

                break;
            }
             case "b_livestockdensity": {
                params=this.getReportSummaryHtmlUtil(Livestockdensity.class,reportIds,"ldReportid",livestockdensityMapper,"ld_regionCode");
                break;
            }
             case "b_kingfisher": {
                params=this.getReportSummaryHtmlUtil(Kingfisher.class,reportIds,"kfReportid",kingfisherMapper,"kf_regionCode");
                break;
            }
            case "b_footandmouthvaccine": {
                params=this.getReportSummaryHtmlUtil(Footandmouthvaccine.class,reportIds,"fvReportid",footandmouthvaccineMapper,"fv_regionCode");
                break;
            }
            case "b_classicalswinefevervaccine": {
                params=this.getReportSummaryHtmlUtil(Classicalswinefevervaccine.class,reportIds,"cvReportid",classicalswinefevervaccineMapper,"cv_regionCode");
                break;
            }
            case "b_bluevaccine": {
                params=this.getReportSummaryHtmlUtil(Bluevaccine.class,reportIds,"bvReportid",bluevaccineMapper,"bv_regionCode");
                break;
            }
            case "b_avianinfluenzavaccine": {
                params=this.getReportSummaryHtmlUtil(Avianinfluenzavaccine.class,reportIds,"avReportid",avianinfluenzavaccineMapper,"av_regionCode");
                break;
            }
            case "b_wpestedespetitsruminants": {
                params=this.getReportSummaryHtmlUtil(Wpestedespetitsruminants.class,reportIds,"wpdrReportid",wpestedespetitsruminantsMapper,"wpdr_regionCode");
                List<Wpestedespetitsruminants>  cumulatives = wpestedespetitsruminantsMapper.selectAllByDate(halfYearbeginTime, endTime);
                Wpestedespetitsruminants xizang = new Wpestedespetitsruminants();
                xizang.setWpdrRegionname("西藏");
                xizang.setWpdrRegioncode("540000");
                if(cumulatives.size()==36) {
                    cumulatives.add(30, xizang);
                }
                params.put("cumulatives",cumulatives);
                List<Wpestedespetitsruminants> items= (List<Wpestedespetitsruminants>) params.get("items");
                if(items.size()==36) {
                    items.add(30, xizang);
                    params.put("items", items);
                }
                break;
            }
            case "b_wavianinfluenza": {
                params=this.getReportSummaryHtmlUtil(Wavianinfluenza.class,reportIds,"aiReportid",wavianinfluenzaMapper,"ai_regionCode");
                List<Wavianinfluenza>  cumulatives = wavianinfluenzaMapper.selectAllByDate(halfYearbeginTime, endTime);
                Wavianinfluenza xizang = new Wavianinfluenza();
                xizang.setAiRegionname("西藏");
                xizang.setAiRegioncode("540000");
                if(cumulatives.size()==36) {
                    cumulatives.add(30, xizang);
                }
                params.put("cumulatives",cumulatives);
                List<Wavianinfluenza> items= (List<Wavianinfluenza>) params.get("items");
                if(items.size()==36) {
                    items.add(30, xizang);
                    params.put("items", items);
                }
                break;
            }
            case "b_wnewcastle": {
                params=this.getReportSummaryHtmlUtil(Wnewcastle.class,reportIds,"ncReportid",wnewcastleMapper,"nc_regionCode");
                List<Wnewcastle> items= (List<Wnewcastle>) params.get("items");
                Wnewcastle xizang = new Wnewcastle();
                xizang.setNcRegionname("西藏");
                xizang.setNcRegioncode("540000");
                if(items.size()==36) {
                    items.add(30, xizang);
                    params.put("items", items);
                }
                List<Wnewcastle>  cumulatives = wnewcastleMapper.selectAllByDate(halfYearbeginTime, endTime);
                if(cumulatives.size()==36) {
                    cumulatives.add(30, xizang);
                }
                params.put("cumulatives",cumulatives);

                break;
            }
            case "b_wclassicalswinefever": {
                params=this.getReportSummaryHtmlUtil(Wclassicalswinefever.class,reportIds,"csfReportid",wclassicalswinefeverMapper,"csf_regionCode");
                List<Wclassicalswinefever>  cumulatives = wclassicalswinefeverMapper.selectAllByDate(halfYearbeginTime, endTime);
                Wclassicalswinefever xizang = new Wclassicalswinefever();
                xizang.setCsfRegionname("西藏");
                xizang.setCsfRegioncode("540000");
                if(cumulatives.size()==36) {
                    cumulatives.add(30, xizang);
                }
                params.put("cumulatives",cumulatives);
                List<Wclassicalswinefever> items= (List<Wclassicalswinefever>) params.get("items");
                if(items.size()==36) {
                    items.add(30, xizang);
                    params.put("items", items);
                }
                break;
            }
            case "b_wblueeardisease": {
                params=this.getReportSummaryHtmlUtil(Wblueeardisease.class,reportIds,"bedReportid",wblueeardiseaseMapper,"bed_regionCode");
                List<Wblueeardisease>  cumulatives = wblueeardiseaseMapper.selectAllByDate(halfYearbeginTime, endTime);
                Wblueeardisease xizang = new Wblueeardisease();
                xizang.setBedRegionname("西藏");
                xizang.setBedRegioncode("540000");
                if(cumulatives.size()==36) {
                    cumulatives.add(30, xizang);
                }
                params.put("cumulatives",cumulatives);
                List<Wblueeardisease> items= (List<Wblueeardisease>) params.get("items");
                if(items.size()==36) {
                    items.add(30, xizang);
                    params.put("items", items);
                }
                break;
            }
            case "b_vaccineorder": {
                params=this.getReportSummaryHtmlUtil(Vaccineorder.class,reportIds,"reportid",vaccineorderMapper,"regionCode");
                break;
            }
            case "b_blueeardisease": {
                params=this.getReportSummaryHtmlUtil(Blueeardisease.class,reportIds,"bedReportid",blueeardiseaseMapper,"bed_regionCode");
                break;
            }
            case "b_classicalswinefever": {
                params=this.getReportSummaryHtmlUtil(Classicalswinefever.class,reportIds,"csfReportid",classicalswinefeverMapper,"csf_regionCode");
                break;
            }
            case "b_footandmouthdisease": {
                params=this.getReportSummaryHtmlUtil(Footandmouthdisease.class,reportIds,"fmdReportid",footandmouthdiseaseMapper,"fmd_regionCode");
                break;
            }
            case "b_newcastle": {
                params=this.getReportSummaryHtmlUtil(Newcastle.class,reportIds,"ncReportid",newcastleMapper,"nc_regionCode");
                break;
            }
            case "b_livestockinout": {
                Example example = new Example(LiveStockInOut.class);
                Example.Criteria criteria = example.createCriteria();
                criteria.andIn("reportid", reportIds);
                List<LiveStockInOut> list = liveStockInOutMapper.selectByExample(example);
                params.put("items", list);
                LiveStockInOut sum = liveStockInOutMapper.selectSumByReportIds(reportIds);
                params.put("sum", sum);
                break;
            }
            case "b_disinfectiondrugs": {
                params=this.getReportSummaryHtmlUtil(Disinfectiondrugs.class,reportIds,"dfReportid",disinfectiondrugsMapper,"df_regionCode");
                break;
            }
            case "b_pestedespetitsruminants": {
                params=this.getReportSummaryHtmlUtil(Pestedespetitsruminants.class,reportIds,"pdprReportid",pestedespetitsruminantsMapper,"pdpr_regionCode");
                break;
            }
            case "b_wfootandmouthdisease": {
                params=this.getReportSummaryHtmlUtil(Wfootandmouthdisease.class,reportIds,"fmdReportid",wfootandmouthdiseaseMapper,"fmd_regionCode asc");
                List<Wfootandmouthdisease>  cumulatives = wfootandmouthdiseaseMapper.selectAllByDate(halfYearbeginTime, endTime);
                Wfootandmouthdisease xizang = new Wfootandmouthdisease();
                xizang.setFmdRegionname("西藏");
                xizang.setFmdRegioncode("540000");
                if(cumulatives.size()==36) {
                    cumulatives.add(30, xizang);
                }
                params.put("cumulatives",cumulatives);
                List<Wfootandmouthdisease> items= (List<Wfootandmouthdisease>) params.get("items");
                if(items.size()==36) {
                    items.add(30, xizang);
                    params.put("items", items);
                }
                break;
            }
            case "b_wlivestockinout": {
                params=this.getReportSummaryHtmlUtil(Wlivestockinout.class,reportIds,"reportid",wlivestockinoutMapper,"Liv_regionCode asc");
                Wlivestockinout sum = wlivestockinoutMapper.selectSumByReportIds(reportIds);
                params.put("sum", sum);
                break;
            }
            default:
                return null;
        }
        String templatePath = request.getSession().getServletContext().getRealPath("/template");
        List<Wlivestockinout> wlivestockinouts=this.wlivestockinoutMapper.selectLivestockInOutByDate(halfYearbeginTime);
        params.put("wlivestockinouts", wlivestockinouts);

        return FreeMarkerUtil.getHtmlStringFromTemplate(templatePath, template.getSummaryTemplate(), params);
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
                List<Avianinfluenza> items=avianinfluenzaMapper.select(arg);
                Avianinfluenza item =new Avianinfluenza();
                if(items.size()>0) {
                    item = items.get(0);
                }else{
                    item=null;
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
                break;
            }
            case "b_emergencyvaccine": {
                Emergencyvaccine fill = (Emergencyvaccine) JSONObject.toBean(jsonObj, Emergencyvaccine.class);
                Emergencyvaccine arg = new Emergencyvaccine();
                arg.setEvReportid(report.getReportId());
                List<Emergencyvaccine> items=emergencyvaccineMapper.select(arg);
                Emergencyvaccine item =new Emergencyvaccine();
                if(items.size()>0) {
                    item = items.get(0);
                }else{
                    item=null;
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
                break;
            }
            case "b_smallruminantsvaccine": {
                Smallruminantsvaccine fill = (Smallruminantsvaccine) JSONObject.toBean(jsonObj, Smallruminantsvaccine.class);
                Smallruminantsvaccine arg = new Smallruminantsvaccine();
                arg.setSrvReportid(report.getReportId());
                List<Smallruminantsvaccine> items=smallruminantsvaccineMapper.select(arg);
                Smallruminantsvaccine item =new Smallruminantsvaccine();
                if(items.size()>0) {
                    item = items.get(0);
                }else{
                    item=null;
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
                break;
            }
            case "b_poultrydensity": {
                Poultrydensity fill = (Poultrydensity) JSONObject.toBean(jsonObj, Poultrydensity.class);
                Poultrydensity arg = new Poultrydensity();
                arg.setPdReportid(report.getReportId());
                List<Poultrydensity> items=poultrydensityMapper.select(arg);
                Poultrydensity item =new Poultrydensity();
                if(items.size()>0) {
                    item = items.get(0);
                }else{
                    item=null;
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
                break;
            }
            case "b_newcastlevaccine": {
                Newcastlevaccine fill = (Newcastlevaccine) JSONObject.toBean(jsonObj, Newcastlevaccine.class);
                Newcastlevaccine arg = new Newcastlevaccine();
                arg.setNvReportid(report.getReportId());
                List<Newcastlevaccine> items=newcastlevaccineMapper.select(arg);
                Newcastlevaccine item =new Newcastlevaccine();
                if(items.size()>0) {
                    item = items.get(0);
                }else{
                    item=null;
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
                break;
            }
            case "b_livestockdensity": {
                Livestockdensity fill = (Livestockdensity) JSONObject.toBean(jsonObj, Livestockdensity.class);
                Livestockdensity arg = new Livestockdensity();
                arg.setLdReportid(report.getReportId());
                List<Livestockdensity> items=livestockdensityMapper.select(arg);
                Livestockdensity item =new Livestockdensity();
                if(items.size()>0) {
                    item = items.get(0);
                }else{
                    item=null;
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
                break;
            }
            case "b_kingfisher": {
                Kingfisher fill = (Kingfisher) JSONObject.toBean(jsonObj, Kingfisher.class);
                Kingfisher arg = new Kingfisher();
                arg.setKfReportid(report.getReportId());
                List<Kingfisher> items=kingfisherMapper.select(arg);
                Kingfisher item =new Kingfisher();
                if(items.size()>0) {
                    item = items.get(0);
                }else{
                    item=null;
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
                if (insert) {
                    kingfisherMapper.insertSelective(item);
                } else {
                    kingfisherMapper.updateByPrimaryKeySelective(item);
                }
                break;
            }
            case "b_classicalswinefevervaccine": {
                Classicalswinefevervaccine fill = (Classicalswinefevervaccine) JSONObject.toBean(jsonObj, Classicalswinefevervaccine.class);
                Classicalswinefevervaccine arg = new Classicalswinefevervaccine();
                arg.setCvReportid(report.getReportId());
                List<Classicalswinefevervaccine> items=classicalswinefevervaccineMapper.select(arg);
                Classicalswinefevervaccine item =new Classicalswinefevervaccine();
                if(items.size()>0) {
                    item = items.get(0);
                }else{
                    item=null;
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
                break;
            }
            case "b_footandmouthvaccine": {
                Footandmouthvaccine fill = (Footandmouthvaccine) JSONObject.toBean(jsonObj, Footandmouthvaccine.class);
                Footandmouthvaccine arg = new Footandmouthvaccine();
                arg.setFvReportid(report.getReportId());
                List<Footandmouthvaccine> items=footandmouthvaccineMapper.select(arg);
                Footandmouthvaccine item =new Footandmouthvaccine();
                if(items.size()>0) {
                    item = items.get(0);
                }else{
                    item=null;
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
                break;
            }
            case "b_bluevaccine": {
                Bluevaccine fill = (Bluevaccine) JSONObject.toBean(jsonObj, Bluevaccine.class);
                Bluevaccine arg = new Bluevaccine();
                arg.setBvReportid(report.getReportId());
                List<Bluevaccine> items=bluevaccineMapper.select(arg);
                Bluevaccine item =new Bluevaccine();
                if(items.size()>0) {
                    item = items.get(0);
                }else{
                    item=null;
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
                break;
            }
            case "b_avianinfluenzavaccine": {
                Avianinfluenzavaccine fill = (Avianinfluenzavaccine) JSONObject.toBean(jsonObj, Avianinfluenzavaccine.class);
                Avianinfluenzavaccine arg = new Avianinfluenzavaccine();
                arg.setAvReportid(report.getReportId());
                List<Avianinfluenzavaccine> items=avianinfluenzavaccineMapper.select(arg);
                Avianinfluenzavaccine item =new Avianinfluenzavaccine();
                if(items.size()>0) {
                    item = items.get(0);
                }else{
                    item=null;
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
                break;
            }
            case "b_wpestedespetitsruminants": {
                Wpestedespetitsruminants fill = (Wpestedespetitsruminants) JSONObject.toBean(jsonObj, Wpestedespetitsruminants.class);
                Wpestedespetitsruminants arg = new Wpestedespetitsruminants();
                arg.setWpdrReportid(report.getReportId());
                List<Wpestedespetitsruminants> items=wpestedespetitsruminantsMapper.select(arg);
                Wpestedespetitsruminants item =new Wpestedespetitsruminants();
                if(items.size()>0) {
                    item = items.get(0);
                }else{
                    item=null;
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
                break;
            }
            case "b_wavianinfluenza": {
                Wavianinfluenza fill = (Wavianinfluenza) JSONObject.toBean(jsonObj, Wavianinfluenza.class);
                Wavianinfluenza arg = new Wavianinfluenza();
                arg.setAiReportid(report.getReportId());
                List<Wavianinfluenza> items=wavianinfluenzaMapper.select(arg);
                Wavianinfluenza item =new Wavianinfluenza();
                if(items.size()>0) {
                    item = items.get(0);
                }else{
                    item=null;
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
                break;
            }
            case "b_wnewcastle": {
                Wnewcastle fill = (Wnewcastle) JSONObject.toBean(jsonObj, Wnewcastle.class);
                Wnewcastle arg = new Wnewcastle();
                arg.setNcReportid(report.getReportId());
                List<Wnewcastle> items=wnewcastleMapper.select(arg);
                Wnewcastle item =new Wnewcastle();
                if(items.size()>0) {
                    item = items.get(0);
                }else{
                    item=null;
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
                break;
            }
            case "b_wclassicalswinefever": {
                Wclassicalswinefever fill = (Wclassicalswinefever) JSONObject.toBean(jsonObj, Wclassicalswinefever.class);
                Wclassicalswinefever arg = new Wclassicalswinefever();
                arg.setCsfReportid(report.getReportId());
                List<Wclassicalswinefever> items=wclassicalswinefeverMapper.select(arg);
                Wclassicalswinefever item =new Wclassicalswinefever();
                if(items.size()>0) {
                    item = items.get(0);
                }else{
                    item=null;
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
                break;
            }
            case "b_wblueeardisease": {
                Wblueeardisease fill = (Wblueeardisease) JSONObject.toBean(jsonObj, Wblueeardisease.class);
                Wblueeardisease arg = new Wblueeardisease();
                arg.setBedReportid(report.getReportId());
                List<Wblueeardisease> items=wblueeardiseaseMapper.select(arg);
                Wblueeardisease item =new Wblueeardisease();
                if(items.size()>0) {
                    item = items.get(0);
                }else{
                    item=null;
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
                break;
            }
            case "b_vaccineorder": {
                Vaccineorder fill = (Vaccineorder) JSONObject.toBean(jsonObj, Vaccineorder.class);
                Vaccineorder arg = new Vaccineorder();
                arg.setReportid(report.getReportId());
                List<Vaccineorder> items=vaccineorderMapper.select(arg);
                Vaccineorder item =new Vaccineorder();
                if(items.size()>0) {
                    item = items.get(0);
                }else{
                    item=null;
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
                break;
            }
            case "b_blueeardisease": {
                Blueeardisease fill = (Blueeardisease) JSONObject.toBean(jsonObj, Blueeardisease.class);
                Blueeardisease arg = new Blueeardisease();
                arg.setBedReportid(report.getReportId());
                List<Blueeardisease> items=blueeardiseaseMapper.select(arg);
                Blueeardisease item =new Blueeardisease();
                if(items.size()>0) {
                    item = items.get(0);
                }else{
                    item=null;
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
                break;
            }
            case "b_classicalswinefever": {
                Classicalswinefever fill = (Classicalswinefever) JSONObject.toBean(jsonObj, Classicalswinefever.class);
                Classicalswinefever arg = new Classicalswinefever();
                arg.setCsfReportid(report.getReportId());
                List<Classicalswinefever> items=classicalswinefeverMapper.select(arg);
                Classicalswinefever item =new Classicalswinefever();
                if(items.size()>0) {
                    item = items.get(0);
                }else{
                    item=null;
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
                break;
            }
            case "b_footandmouthdisease": {
                Footandmouthdisease fill = (Footandmouthdisease) JSONObject.toBean(jsonObj, Footandmouthdisease.class);
                Footandmouthdisease arg = new Footandmouthdisease();
                arg.setFmdReportid(report.getReportId());
                List<Footandmouthdisease> items=footandmouthdiseaseMapper.select(arg);
                Footandmouthdisease item =new Footandmouthdisease();
                if(items.size()>0) {
                    item = items.get(0);
                }else{
                    item=null;
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
                break;
            }
            case "b_newcastle": {
                Newcastle fill = (Newcastle) JSONObject.toBean(jsonObj, Newcastle.class);
                Newcastle arg = new Newcastle();
                arg.setNcReportid(report.getReportId());
                List<Newcastle> items=newcastleMapper.select(arg);
                Newcastle item =new Newcastle();
                if(items.size()>0) {
                    item = items.get(0);
                }else{
                    item=null;
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
                break;
            }
            case "b_pestedespetitsruminants": {
                Pestedespetitsruminants fill = (Pestedespetitsruminants) JSONObject.toBean(jsonObj, Pestedespetitsruminants.class);
                Pestedespetitsruminants arg = new Pestedespetitsruminants();
                arg.setPdprReportid(report.getReportId());
                List<Pestedespetitsruminants> items=pestedespetitsruminantsMapper.select(arg);
                Pestedespetitsruminants item =new Pestedespetitsruminants();
                if(items.size()>0) {
                    item = items.get(0);
                }else{
                    item=null;
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
                break;
            }
            case "b_disinfectiondrugs": {
                Disinfectiondrugs fill = (Disinfectiondrugs) JSONObject.toBean(jsonObj, Disinfectiondrugs.class);
                Disinfectiondrugs arg = new Disinfectiondrugs();
                arg.setDfReportid(report.getReportId());
                List<Disinfectiondrugs> items=disinfectiondrugsMapper.select(arg);
                Disinfectiondrugs item =new Disinfectiondrugs();
                if(items.size()>0) {
                    item = items.get(0);
                }else{
                    item=null;
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
                break;
            }
            case "b_wfootandmouthdisease": {
                Wfootandmouthdisease fill = (Wfootandmouthdisease) JSONObject
                        .toBean(jsonObj, Wfootandmouthdisease.class);
                Wfootandmouthdisease arg = new Wfootandmouthdisease();
                arg.setFmdReportid(report.getReportId());
                List<Wfootandmouthdisease> items=wfootandmouthdiseaseMapper.select(arg);
                Wfootandmouthdisease item =new Wfootandmouthdisease();
                if(items.size()>0) {
                    item = items.get(0);
                }else{
                    item=null;
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
                break;
            }
            case "b_wlivestockinout": {
                Wlivestockinout fill = (Wlivestockinout) JSONObject.toBean(jsonObj, Wlivestockinout.class);
                Wlivestockinout arg = new Wlivestockinout();
                arg.setReportid(report.getReportId());
                List<Wlivestockinout> items=wlivestockinoutMapper.select(arg);
                Wlivestockinout item =new Wlivestockinout();
                if(items.size()>0) {
                    item = items.get(0);
                }else{
                    item=null;
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
                break;
            }
            default:
                break;
        }
        return 1;
    }
}
