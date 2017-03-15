package com.topie.animal.service.impl;

import com.topie.animal.constant.ReportTypeE;
import com.topie.animal.service.*;
import com.topie.animal.util.PeriodUtil;
import com.topie.common.tools.freemarker.FreeMarkerUtil;
import com.topie.common.utils.UUIDUtil;
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
        switch (template.getTableName().toLowerCase()) {
            case "b_avianinfluenza": {
                Avianinfluenza arg =new Avianinfluenza();
                arg.setAiReportid(report.getReportId());
                Avianinfluenza item =  avianinfluenzaMapper.selectOne(arg);
                if (item == null) {
                    item = new Avianinfluenza();
                }
                params.put("item", item);
                break;
            }
            case "b_smallruminantsvaccine": {
                Smallruminantsvaccine arg =new Smallruminantsvaccine();
                arg.setSrvReportid(report.getReportId());
                Smallruminantsvaccine item =  smallruminantsvaccineMapper.selectOne(arg);
                if (item == null) {
                    item = new Smallruminantsvaccine();
                }
                params.put("item", item);
                break;
            }
            case "b_poultrydensity": {
                Poultrydensity arg =new Poultrydensity();
                arg.setPdReportid(report.getReportId());
                Poultrydensity item =  poultrydensityMapper.selectOne(arg);
                if (item == null) {
                    item = new Poultrydensity();
                }
                params.put("item", item);
                break;
            }
            case "b_newcastlevaccine": {
                Newcastlevaccine arg =new Newcastlevaccine();
                arg.setNvReportid(report.getReportId());
                Newcastlevaccine item =  newcastlevaccineMapper.selectOne(arg);
                if (item == null) {
                    item = new Newcastlevaccine();
                }
                params.put("item", item);
                break;
            }
            case "b_livestockdensity": {
                Livestockdensity arg =new Livestockdensity();
                arg.setLdReportid(report.getReportId());
                Livestockdensity item =  livestockdensityMapper.selectOne(arg);
                if (item == null) {
                    item = new Livestockdensity();
                }
                params.put("item", item);
                break;
            }
            case "b_kingfisher": {
                Kingfisher arg =new Kingfisher();
                arg.setKfReportid(report.getReportId());
                Kingfisher item =  kingfisherMapper.selectOne(arg);
                if (item == null) {
                    item = new Kingfisher();
                }
                params.put("item", item);
                break;
            }
            case "b_footandmouthvaccine": {
                Footandmouthvaccine arg =new Footandmouthvaccine();
                arg.setFvReportid(report.getReportId());
                Footandmouthvaccine item =  footandmouthvaccineMapper.selectOne(arg);
                if (item == null) {
                    item = new Footandmouthvaccine();
                }
                params.put("item", item);
                break;
            }
            case "b_classicalswinefevervaccine": {
                Classicalswinefevervaccine arg =new Classicalswinefevervaccine();
                arg.setCvReportid(report.getReportId());
                Classicalswinefevervaccine item =  classicalswinefevervaccineMapper.selectOne(arg);
                if (item == null) {
                    item = new Classicalswinefevervaccine();
                }
                params.put("item", item);
                break;
            }
            case "b_bluevaccine": {
                Bluevaccine arg =new Bluevaccine();
                arg.setBvReportid(report.getReportId());
                Bluevaccine item =  bluevaccineMapper.selectOne(arg);
                if (item == null) {
                    item = new Bluevaccine();
                }
                params.put("item", item);
                break;
            }
            case "b_avianinfluenzavaccine": {
                Avianinfluenzavaccine arg =new Avianinfluenzavaccine();
                arg.setAvReportid(report.getReportId());
                Avianinfluenzavaccine item =  avianinfluenzavaccineMapper.selectOne(arg);
                if (item == null) {
                    item = new Avianinfluenzavaccine();
                }
                params.put("item", item);
                break;
            }
            case "b_wpestedespetitsruminants": {
                Wpestedespetitsruminants arg =new Wpestedespetitsruminants();
                arg.setWpdrReportid(report.getReportId());
                Wpestedespetitsruminants item =  wpestedespetitsruminantsMapper.selectOne(arg);
                if (item == null) {
                    item = new Wpestedespetitsruminants();
                }
                params.put("item", item);
                break;
            }
            case "b_wavianinfluenza": {
                Wavianinfluenza arg =new Wavianinfluenza();
                arg.setAiReportid(report.getReportId());
                Wavianinfluenza item =  wavianinfluenzaMapper.selectOne(arg);
                if (item == null) {
                    item = new Wavianinfluenza();
                }
                params.put("item", item);
                break;
            }
            case "b_wnewcastle": {
                Wnewcastle arg =new Wnewcastle();
                arg.setNcReportid(report.getReportId());
                Wnewcastle item =  wnewcastleMapper.selectOne(arg);
                if (item == null) {
                    item = new Wnewcastle();
                }
                params.put("item", item);
                break;
            }
            case "b_wclassicalswinefever": {
                Wclassicalswinefever arg =new Wclassicalswinefever();
                arg.setCsfReportid(report.getReportId());
                Wclassicalswinefever item =  wclassicalswinefeverMapper.selectOne(arg);
                if (item == null) {
                    item = new Wclassicalswinefever();
                }
                params.put("item", item);
                break;
            }
            case "b_wblueeardisease": {
                Wblueeardisease arg =new Wblueeardisease();
                arg.setBedId(report.getReportId());
                Wblueeardisease item =  wblueeardiseaseMapper.selectOne(arg);
                if (item == null) {
                    item = new Wblueeardisease();
                }
                params.put("item", item);
                break;
            }
            case "b_vaccineorder": {
                Vaccineorder arg =new Vaccineorder();
                arg.setReportid(report.getReportId());
                Vaccineorder item =  vaccineorderMapper.selectOne(arg);
                if (item == null) {
                    item = new Vaccineorder();
                }
                params.put("item", item);
                break;
            }
            case "b_blueeardisease": {
                Blueeardisease arg =new Blueeardisease();
                arg.setBedReportid(report.getReportId());
                Blueeardisease item =  blueeardiseaseMapper.selectOne(arg);
                if (item == null) {
                    item = new Blueeardisease();
                }
                params.put("item", item);
                break;
            }
            case "b_classicalswinefever": {
                Classicalswinefever arg =new Classicalswinefever();
                arg.setCsfReportid(report.getReportId());
                Classicalswinefever item =  classicalswinefeverMapper.selectOne(arg);
                if (item == null) {
                    item = new Classicalswinefever();
                }
                params.put("item", item);
                break;
            }
            case "b_footandmouthdisease": {
                Footandmouthdisease arg =new Footandmouthdisease();
                arg.setFmdReportid(report.getReportId());
                Footandmouthdisease item = footandmouthdiseaseMapper.selectOne(arg);
                if (item == null) {
                    item = new Footandmouthdisease();
                }
                params.put("item", item);
                break;
            }
            case "b_livestockinout": {
                LiveStockInOut livestockInOut = liveStockInOutMapper.selectOneByReportId(report.getReportId());
                if (livestockInOut == null) {
                    livestockInOut = new LiveStockInOut();
                }
                params.put("item", livestockInOut);
                break;
            }
            case "b_newcastle": {
                Newcastle arg =new Newcastle();
                arg.setNcReportid(report.getReportId());
                Newcastle item = newcastleMapper.selectOne(arg);
                if (item == null) {
                    item = new Newcastle();
                }
                params.put("item", item);
                break;
            }
            case "b_pestedespetitsruminants": {
                Pestedespetitsruminants arg =new Pestedespetitsruminants();
                arg.setPdprReportid(report.getReportId());
                Pestedespetitsruminants item = pestedespetitsruminantsMapper.selectOne(arg);
                if (item == null) {
                    item = new Pestedespetitsruminants();
                }
                params.put("item", item);
                break;
            }
            case "b_disinfectiondrugs": {
                Disinfectiondrugs arg = new Disinfectiondrugs();
                arg.setDfReportid(report.getReportId());
                Disinfectiondrugs item = disinfectiondrugsMapper.selectOne(arg);
                if (item == null) {
                    item = new Disinfectiondrugs();
                }
                params.put("item", item);
                break;
            }
            case "b_wfootandmouthdisease": {
                Wfootandmouthdisease arg = new Wfootandmouthdisease();
                arg.setFmdReportid(report.getReportId());
                Wfootandmouthdisease item = wfootandmouthdiseaseMapper.selectOne(arg);
                if (item == null) {
                    item = new Wfootandmouthdisease();
                }
                params.put("item", item);
                break;
            }
            case "b_wlivestockinout": {
                Wlivestockinout arg = new Wlivestockinout();
                arg.setReportid(report.getReportId());
                Wlivestockinout item = wlivestockinoutMapper.selectOne(arg);
                if (item == null) {
                    item = new Wlivestockinout();
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
private Map getReportSummaryHtmlUtil(Class clazz,List<String> reportIds,String reportName,Mapper mapper){
    Map params = new HashMap();
    Example example = new Example(clazz);
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
        if (reportIds.size() == 0) return null;
        Map params = new HashMap();
        switch (template.getTableName().toLowerCase()) {
            case "b_avianinfluenza": {
                params=this.getReportSummaryHtmlUtil(Avianinfluenza.class,reportIds,"aiReportid",avianinfluenzaMapper);
                break;
            }
            case "b_smallruminantsvaccine": {
                params=this.getReportSummaryHtmlUtil(Smallruminantsvaccine.class,reportIds,"srvReportid",smallruminantsvaccineMapper);
                break;
            }
            case "b_poultrydensity": {
                params=this.getReportSummaryHtmlUtil(Poultrydensity.class,reportIds,"pdReportid",poultrydensityMapper);
                break;
            }
             case "b_newcastlevaccine": {
                params=this.getReportSummaryHtmlUtil(Newcastlevaccine.class,reportIds,"nvReportid",newcastlevaccineMapper);
                break;
            }
             case "b_livestockdensity": {
                params=this.getReportSummaryHtmlUtil(Livestockdensity.class,reportIds,"ldReportid",livestockdensityMapper);
                break;
            }
             case "b_kingfisher": {
                params=this.getReportSummaryHtmlUtil(Kingfisher.class,reportIds,"kfReportid",kingfisherMapper);
                break;
            }
            case "b_footandmouthvaccine": {
                params=this.getReportSummaryHtmlUtil(Footandmouthvaccine.class,reportIds,"fvReportid",footandmouthvaccineMapper);
                break;
            }
            case "b_classicalswinefevervaccine": {
                params=this.getReportSummaryHtmlUtil(Classicalswinefevervaccine.class,reportIds,"cvReportid",classicalswinefevervaccineMapper);
                break;
            }
            case "b_bluevaccine": {
                params=this.getReportSummaryHtmlUtil(Bluevaccine.class,reportIds,"bvReportid",bluevaccineMapper);
                break;
            }
            case "b_avianinfluenzavaccine": {
                params=this.getReportSummaryHtmlUtil(Avianinfluenzavaccine.class,reportIds,"avReportid",avianinfluenzavaccineMapper);
                break;
            }
            case "b_wpestedespetitsruminants": {
                params=this.getReportSummaryHtmlUtil(Wpestedespetitsruminants.class,reportIds,"wpdrReportid",wpestedespetitsruminantsMapper);
                break;
            }
            case "b_wavianinfluenza": {
                params=this.getReportSummaryHtmlUtil(Wavianinfluenza.class,reportIds,"aiReportid",wavianinfluenzaMapper);
                break;
            }
            case "b_wnewcastle": {
                params=this.getReportSummaryHtmlUtil(Wnewcastle.class,reportIds,"ncReportid",wnewcastleMapper);
                break;
            }
            case "b_wclassicalswinefever": {
                params=this.getReportSummaryHtmlUtil(Wclassicalswinefever.class,reportIds,"csfReportid",wclassicalswinefeverMapper);
                break;
            }
            case "b_wblueeardisease": {
                params=this.getReportSummaryHtmlUtil(Wblueeardisease.class,reportIds,"bedReportid",wblueeardiseaseMapper);
                break;
            }
            case "b_vaccineorder": {
                params=this.getReportSummaryHtmlUtil(Vaccineorder.class,reportIds,"reportid",vaccineorderMapper);
                break;
            }
            case "b_blueeardisease": {
                params=this.getReportSummaryHtmlUtil(Blueeardisease.class,reportIds,"bedReportid",blueeardiseaseMapper);
                break;
            }
            case "b_classicalswinefever": {
                params=this.getReportSummaryHtmlUtil(Classicalswinefever.class,reportIds,"csfReportid",classicalswinefeverMapper);
                break;
            }
            case "b_footandmouthdisease": {
                params=this.getReportSummaryHtmlUtil(Footandmouthdisease.class,reportIds,"fmdReportid",footandmouthdiseaseMapper);
                break;
            }
            case "b_newcastle": {
                params=this.getReportSummaryHtmlUtil(Newcastle.class,reportIds,"ncReportid",newcastleMapper);
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
                params=this.getReportSummaryHtmlUtil(Disinfectiondrugs.class,reportIds,"dfReportid",disinfectiondrugsMapper);
                break;
            }
            case "b_pestedespetitsruminants": {
                params=this.getReportSummaryHtmlUtil(Pestedespetitsruminants.class,reportIds,"pdprReportid",pestedespetitsruminantsMapper);
                break;
            }
            case "b_wfootandmouthdisease": {
                params=this.getReportSummaryHtmlUtil(Wfootandmouthdisease.class,reportIds,"fmdReportid",wfootandmouthdiseaseMapper);
                break;
            }
            case "b_wlivestockinout": {
                Example example = new Example(Wlivestockinout.class);
                Example.Criteria criteria = example.createCriteria();
                criteria.andIn("reportid", reportIds);
                List<Wlivestockinout> items = wlivestockinoutMapper.selectByExample(example);
                params.put("items", items);
                Wlivestockinout sum = wlivestockinoutMapper.selectSumByReportIds(reportIds);
                params.put("sum", sum);
                break;
            }
            default:
                return null;
        }
        String templatePath = request.getSession().getServletContext().getRealPath("/template");
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
                Avianinfluenza avianinfluenza = avianinfluenzaMapper.selectOne(arg);
                boolean insert = true;
                if (avianinfluenza == null) {
                    avianinfluenza = fill;
                    avianinfluenza.setAiId(UUIDUtil.getUUID());
                } else {
                    fill.setAiId(avianinfluenza.getAiId());
                    avianinfluenza = fill;
                    insert = false;
                }
                avianinfluenza.setAiReportid(report.getReportId());
                avianinfluenza.setAiDate(report.getBeginTime());
                avianinfluenza.setAiRegioncode(region.getRegionCode());
                avianinfluenza.setAiRegionname(region.getRegionName());
                if (insert) {
                    avianinfluenzaMapper.insertSelective(avianinfluenza);
                } else {
                    avianinfluenzaMapper.updateByPrimaryKeySelective(avianinfluenza);
                }
                break;
            }
            case "b_smallruminantsvaccine": {
                Smallruminantsvaccine fill = (Smallruminantsvaccine) JSONObject.toBean(jsonObj, Smallruminantsvaccine.class);
                Smallruminantsvaccine arg = new Smallruminantsvaccine();
                arg.setSrvReportid(report.getReportId());
                Smallruminantsvaccine smallruminantsvaccine = smallruminantsvaccineMapper.selectOne(arg);
                boolean insert = true;
                if (smallruminantsvaccine == null) {
                    smallruminantsvaccine = fill;
                    smallruminantsvaccine.setSrvId(UUIDUtil.getUUID());
                } else {
                    fill.setSrvId(smallruminantsvaccine.getSrvId());
                    smallruminantsvaccine = fill;
                    insert = false;
                }
                smallruminantsvaccine.setSrvReportid(report.getReportId());
                smallruminantsvaccine.setSrvDate(report.getBeginTime());
                smallruminantsvaccine.setSrvRegioncode(region.getRegionCode());
                smallruminantsvaccine.setSrvRegionname(region.getRegionName());
                if (insert) {
                    smallruminantsvaccineMapper.insertSelective(smallruminantsvaccine);
                } else {
                    smallruminantsvaccineMapper.updateByPrimaryKeySelective(smallruminantsvaccine);
                }
                break;
            }
            case "b_poultrydensity": {
                Poultrydensity fill = (Poultrydensity) JSONObject.toBean(jsonObj, Poultrydensity.class);
                Poultrydensity arg = new Poultrydensity();
                arg.setPdReportid(report.getReportId());
                Poultrydensity poultrydensity = poultrydensityMapper.selectOne(arg);
                boolean insert = true;
                if (poultrydensity == null) {
                    poultrydensity = fill;
                    poultrydensity.setPdId(UUIDUtil.getUUID());
                } else {
                    fill.setPdId(poultrydensity.getPdId());
                    poultrydensity = fill;
                    insert = false;
                }
                poultrydensity.setPdReportid(report.getReportId());
                poultrydensity.setPdDate(report.getBeginTime());
                poultrydensity.setPdRegioncode(region.getRegionCode());
                poultrydensity.setPdRegionname(region.getRegionName());
                if (insert) {
                    poultrydensityMapper.insertSelective(poultrydensity);
                } else {
                    poultrydensityMapper.updateByPrimaryKeySelective(poultrydensity);
                }
                break;
            }
            case "b_newcastlevaccine": {
                Newcastlevaccine fill = (Newcastlevaccine) JSONObject.toBean(jsonObj, Newcastlevaccine.class);
                Newcastlevaccine arg = new Newcastlevaccine();
                arg.setNvReportid(report.getReportId());
                Newcastlevaccine newcastlevaccine = newcastlevaccineMapper.selectOne(arg);
                boolean insert = true;
                if (newcastlevaccine == null) {
                    newcastlevaccine = fill;
                    newcastlevaccine.setNvId(UUIDUtil.getUUID());
                } else {
                    fill.setNvId(newcastlevaccine.getNvId());
                    newcastlevaccine = fill;
                    insert = false;
                }
                newcastlevaccine.setNvReportid(report.getReportId());
                newcastlevaccine.setNvDate(report.getBeginTime());
                newcastlevaccine.setNvRegioncode(region.getRegionCode());
                newcastlevaccine.setNvRegionname(region.getRegionName());
                if (insert) {
                    newcastlevaccineMapper.insertSelective(newcastlevaccine);
                } else {
                    newcastlevaccineMapper.updateByPrimaryKeySelective(newcastlevaccine);
                }
                break;
            }
            case "b_livestockdensity": {
                Livestockdensity fill = (Livestockdensity) JSONObject.toBean(jsonObj, Livestockdensity.class);
                Livestockdensity arg = new Livestockdensity();
                arg.setLdReportid(report.getReportId());
                Livestockdensity livestockdensity = livestockdensityMapper.selectOne(arg);
                boolean insert = true;
                if (livestockdensity == null) {
                    livestockdensity = fill;
                    livestockdensity.setLdId(UUIDUtil.getUUID());
                } else {
                    fill.setLdId(livestockdensity.getLdId());
                    livestockdensity = fill;
                    insert = false;
                }
                livestockdensity.setLdReportid(report.getReportId());
                livestockdensity.setLdDate(report.getBeginTime());
                livestockdensity.setLdRegioncode(region.getRegionCode());
                livestockdensity.setLdRegionname(region.getRegionName());
                if (insert) {
                    livestockdensityMapper.insertSelective(livestockdensity);
                } else {
                    livestockdensityMapper.updateByPrimaryKeySelective(livestockdensity);
                }
                break;
            }
            case "b_kingfisher": {
                Kingfisher fill = (Kingfisher) JSONObject.toBean(jsonObj, Kingfisher.class);
                Kingfisher arg = new Kingfisher();
                arg.setKfReportid(report.getReportId());
                Kingfisher kingfisher = kingfisherMapper.selectOne(arg);
                boolean insert = true;
                if (kingfisher == null) {
                    kingfisher = fill;
                    kingfisher.setKfId(UUIDUtil.getUUID());
                } else {
                    fill.setKfId(kingfisher.getKfId());
                    kingfisher = fill;
                    insert = false;
                }
                kingfisher.setKfReportid(report.getReportId());
                kingfisher.setKfDate(report.getBeginTime());
                kingfisher.setKfRegioncode(region.getRegionCode());
                kingfisher.setKfRegionname(region.getRegionName());
                if (insert) {
                    kingfisherMapper.insertSelective(kingfisher);
                } else {
                    kingfisherMapper.updateByPrimaryKeySelective(kingfisher);
                }
                break;
            }
            case "b_classicalswinefevervaccine": {
                Classicalswinefevervaccine fill = (Classicalswinefevervaccine) JSONObject.toBean(jsonObj, Classicalswinefevervaccine.class);
                Classicalswinefevervaccine arg = new Classicalswinefevervaccine();
                arg.setCvReportid(report.getReportId());
                Classicalswinefevervaccine classicalswinefevervaccine = classicalswinefevervaccineMapper.selectOne(arg);
                boolean insert = true;
                if (classicalswinefevervaccine == null) {
                    classicalswinefevervaccine = fill;
                    classicalswinefevervaccine.setCvId(UUIDUtil.getUUID());
                } else {
                    fill.setCvId(classicalswinefevervaccine.getCvId());
                    classicalswinefevervaccine = fill;
                    insert = false;
                }
                classicalswinefevervaccine.setCvReportid(report.getReportId());
                classicalswinefevervaccine.setCvDate(report.getBeginTime());
                classicalswinefevervaccine.setCvRegioncode(region.getRegionCode());
                classicalswinefevervaccine.setCvRegionname(region.getRegionName());
                if (insert) {
                    classicalswinefevervaccineMapper.insertSelective(classicalswinefevervaccine);
                } else {
                    classicalswinefevervaccineMapper.updateByPrimaryKeySelective(classicalswinefevervaccine);
                }
                break;
            }
            case "b_footandmouthvaccine": {
                Footandmouthvaccine fill = (Footandmouthvaccine) JSONObject.toBean(jsonObj, Footandmouthvaccine.class);
                Footandmouthvaccine arg = new Footandmouthvaccine();
                arg.setFvReportid(report.getReportId());
                Footandmouthvaccine footandmouthvaccine = footandmouthvaccineMapper.selectOne(arg);
                boolean insert = true;
                if (footandmouthvaccine == null) {
                    footandmouthvaccine = fill;
                    footandmouthvaccine.setFvId(UUIDUtil.getUUID());
                } else {
                    fill.setFvId(footandmouthvaccine.getFvId());
                    footandmouthvaccine = fill;
                    insert = false;
                }
                footandmouthvaccine.setFvReportid(report.getReportId());
                footandmouthvaccine.setFvDate(report.getBeginTime());
                footandmouthvaccine.setFvRegioncode(region.getRegionCode());
                footandmouthvaccine.setFvRegionname(region.getRegionName());
                if (insert) {
                    footandmouthvaccineMapper.insertSelective(footandmouthvaccine);
                } else {
                    footandmouthvaccineMapper.updateByPrimaryKeySelective(footandmouthvaccine);
                }
                break;
            }
            case "b_bluevaccine": {
                Bluevaccine fill = (Bluevaccine) JSONObject.toBean(jsonObj, Bluevaccine.class);
                Bluevaccine arg = new Bluevaccine();
                arg.setBvReportid(report.getReportId());
                Bluevaccine bluevaccine = bluevaccineMapper.selectOne(arg);
                boolean insert = true;
                if (bluevaccine == null) {
                    bluevaccine = fill;
                    bluevaccine.setBvId(UUIDUtil.getUUID());
                } else {
                    fill.setBvId(bluevaccine.getBvId());
                    bluevaccine = fill;
                    insert = false;
                }
                bluevaccine.setBvReportid(report.getReportId());
                bluevaccine.setBvDate(report.getBeginTime());
                bluevaccine.setBvRegioncode(region.getRegionCode());
                bluevaccine.setBvRegionname(region.getRegionName());
                if (insert) {
                    bluevaccineMapper.insertSelective(bluevaccine);
                } else {
                    bluevaccineMapper.updateByPrimaryKeySelective(bluevaccine);
                }
                break;
            }
            case "b_avianinfluenzavaccine": {
                Avianinfluenzavaccine fill = (Avianinfluenzavaccine) JSONObject.toBean(jsonObj, Avianinfluenzavaccine.class);
                Avianinfluenzavaccine arg = new Avianinfluenzavaccine();
                arg.setAvReportid(report.getReportId());
                Avianinfluenzavaccine avianinfluenzavaccine = avianinfluenzavaccineMapper.selectOne(arg);
                boolean insert = true;
                if (avianinfluenzavaccine == null) {
                    avianinfluenzavaccine = fill;
                    avianinfluenzavaccine.setAvId(UUIDUtil.getUUID());
                } else {
                    fill.setAvId(avianinfluenzavaccine.getAvId());
                    avianinfluenzavaccine = fill;
                    insert = false;
                }
                avianinfluenzavaccine.setAvReportid(report.getReportId());
                avianinfluenzavaccine.setAvDate(report.getBeginTime());
                avianinfluenzavaccine.setAvRegioncode(region.getRegionCode());
                avianinfluenzavaccine.setAvRegionname(region.getRegionName());
                if (insert) {
                    avianinfluenzavaccineMapper.insertSelective(avianinfluenzavaccine);
                } else {
                    avianinfluenzavaccineMapper.updateByPrimaryKeySelective(avianinfluenzavaccine);
                }
                break;
            }
            case "b_wpestedespetitsruminants": {
                Wpestedespetitsruminants fill = (Wpestedespetitsruminants) JSONObject.toBean(jsonObj, Wpestedespetitsruminants.class);
                Wpestedespetitsruminants arg = new Wpestedespetitsruminants();
                arg.setWpdrReportid(report.getReportId());
                Wpestedespetitsruminants wpestedespetitsruminants = wpestedespetitsruminantsMapper.selectOne(arg);
                boolean insert = true;
                if (wpestedespetitsruminants == null) {
                    wpestedespetitsruminants = fill;
                    wpestedespetitsruminants.setWpdrId(UUIDUtil.getUUID());
                } else {
                    fill.setWpdrId(wpestedespetitsruminants.getWpdrId());
                    wpestedespetitsruminants = fill;
                    insert = false;
                }
                wpestedespetitsruminants.setWpdrReportid(report.getReportId());
                wpestedespetitsruminants.setWpdrDate(report.getBeginTime());
                wpestedespetitsruminants.setWpdrRegioncode(region.getRegionCode());
                wpestedespetitsruminants.setWpdrRegionname(region.getRegionName());
                if (insert) {
                    wpestedespetitsruminantsMapper.insertSelective(wpestedespetitsruminants);
                } else {
                    wpestedespetitsruminantsMapper.updateByPrimaryKeySelective(wpestedespetitsruminants);
                }
                break;
            }
            case "b_wavianinfluenza": {
                Wavianinfluenza fill = (Wavianinfluenza) JSONObject.toBean(jsonObj, Wavianinfluenza.class);
                Wavianinfluenza arg = new Wavianinfluenza();
                arg.setAiReportid(report.getReportId());
                Wavianinfluenza wavianinfluenza = wavianinfluenzaMapper.selectOne(arg);
                boolean insert = true;
                if (wavianinfluenza == null) {
                    wavianinfluenza = fill;
                    wavianinfluenza.setAiId(UUIDUtil.getUUID());
                } else {
                    fill.setAiId(wavianinfluenza.getAiId());
                    wavianinfluenza = fill;
                    insert = false;
                }
                wavianinfluenza.setAiReportid(report.getReportId());
                wavianinfluenza.setAiDate(report.getBeginTime());
                wavianinfluenza.setAiRegioncode(region.getRegionCode());
                wavianinfluenza.setAiRegionname(region.getRegionName());
                if (insert) {
                    wavianinfluenzaMapper.insertSelective(wavianinfluenza);
                } else {
                    wavianinfluenzaMapper.updateByPrimaryKeySelective(wavianinfluenza);
                }
                break;
            }
            case "b_wnewcastle": {
                Wnewcastle fill = (Wnewcastle) JSONObject.toBean(jsonObj, Wnewcastle.class);
                Wnewcastle arg = new Wnewcastle();
                arg.setNcReportid(report.getReportId());
                Wnewcastle wnewcastle = wnewcastleMapper.selectOne(arg);
                boolean insert = true;
                if (wnewcastle == null) {
                    wnewcastle = fill;
                    wnewcastle.setNcId(UUIDUtil.getUUID());
                } else {
                    fill.setNcId(wnewcastle.getNcId());
                    wnewcastle = fill;
                    insert = false;
                }
                wnewcastle.setNcReportid(report.getReportId());
                wnewcastle.setNcDate(report.getBeginTime());
                wnewcastle.setNcRegioncode(region.getRegionCode());
                wnewcastle.setNcRegionname(region.getRegionName());
                if (insert) {
                    wnewcastleMapper.insertSelective(wnewcastle);
                } else {
                    wnewcastleMapper.updateByPrimaryKeySelective(wnewcastle);
                }
                break;
            }
            case "b_wclassicalswinefever": {
                Wclassicalswinefever fill = (Wclassicalswinefever) JSONObject.toBean(jsonObj, Wclassicalswinefever.class);
                Wclassicalswinefever arg = new Wclassicalswinefever();
                arg.setCsfReportid(report.getReportId());
                Wclassicalswinefever wclassicalswinefever = wclassicalswinefeverMapper.selectOne(arg);
                boolean insert = true;
                if (wclassicalswinefever == null) {
                    wclassicalswinefever = fill;
                    wclassicalswinefever.setCsfId(UUIDUtil.getUUID());
                } else {
                    fill.setCsfId(wclassicalswinefever.getCsfId());
                    wclassicalswinefever = fill;
                    insert = false;
                }
                wclassicalswinefever.setCsfReportid(report.getReportId());
                wclassicalswinefever.setCsfDate(report.getBeginTime());
                wclassicalswinefever.setCsfRegioncode(region.getRegionCode());
                wclassicalswinefever.setCsfRegionname(region.getRegionName());
                if (insert) {
                    wclassicalswinefeverMapper.insertSelective(wclassicalswinefever);
                } else {
                    wclassicalswinefeverMapper.updateByPrimaryKeySelective(wclassicalswinefever);
                }
                break;
            }
            case "b_wblueeardisease": {
                Wblueeardisease fill = (Wblueeardisease) JSONObject.toBean(jsonObj, Wblueeardisease.class);
                Wblueeardisease arg = new Wblueeardisease();
                arg.setBedReportid(report.getReportId());
                Wblueeardisease wblueeardisease = wblueeardiseaseMapper.selectOne(arg);
                boolean insert = true;
                if (wblueeardisease == null) {
                    wblueeardisease = fill;
                    wblueeardisease.setBedId(UUIDUtil.getUUID());
                } else {
                    fill.setBedId(wblueeardisease.getBedId());
                    wblueeardisease = fill;
                    insert = false;
                }
                wblueeardisease.setBedReportid(report.getReportId());
                wblueeardisease.setBedDate(report.getBeginTime());
                wblueeardisease.setBedRegioncode(region.getRegionCode());
                wblueeardisease.setBedRegionname(region.getRegionName());
                if (insert) {
                    wblueeardiseaseMapper.insertSelective(wblueeardisease);
                } else {
                    wblueeardiseaseMapper.updateByPrimaryKeySelective(wblueeardisease);
                }
                break;
            }
            case "b_vaccineorder": {
                Vaccineorder fill = (Vaccineorder) JSONObject.toBean(jsonObj, Vaccineorder.class);
                Vaccineorder arg = new Vaccineorder();
                arg.setReportid(report.getReportId());
                Vaccineorder vaccineorder = vaccineorderMapper.selectOne(arg);
                boolean insert = true;
                if (vaccineorder == null) {
                    vaccineorder = fill;
                    vaccineorder.setVaccineorderid(UUIDUtil.getUUID());
                } else {
                    fill.setVaccineorderid(vaccineorder.getVaccineorderid());
                    vaccineorder = fill;
                    insert = false;
                }
                vaccineorder.setReportid(report.getReportId());
                vaccineorder.setDate(report.getBeginTime());
                vaccineorder.setRegioncode(region.getRegionCode());
                vaccineorder.setRegionname(region.getRegionName());
                if (insert) {
                    vaccineorderMapper.insertSelective(vaccineorder);
                } else {
                    vaccineorderMapper.updateByPrimaryKeySelective(vaccineorder);
                }
                break;
            }
            case "b_blueeardisease": {
                Blueeardisease fill = (Blueeardisease) JSONObject.toBean(jsonObj, Blueeardisease.class);
                Blueeardisease arg = new Blueeardisease();
                arg.setBedReportid(report.getReportId());
                Blueeardisease blueeardisease =blueeardiseaseMapper.selectOne(arg);
                boolean insert = true;
                if (blueeardisease == null) {
                    blueeardisease = fill;
                    blueeardisease.setBedId(UUIDUtil.getUUID());
                } else {
                    fill.setBedId(blueeardisease.getBedId());
                    blueeardisease = fill;
                    insert = false;
                }
                blueeardisease.setBedReportid(report.getReportId());
                blueeardisease.setBedDate(report.getBeginTime());
                blueeardisease.setBedRegioncode(region.getRegionCode());
                blueeardisease.setBedRegionname(region.getRegionName());
                if (insert) {
                    blueeardiseaseMapper.insertSelective(blueeardisease);
                } else {
                    blueeardiseaseMapper.updateByPrimaryKeySelective(blueeardisease);
                }
                break;
            }
            case "b_classicalswinefever": {
                Classicalswinefever fill = (Classicalswinefever) JSONObject.toBean(jsonObj, Classicalswinefever.class);
                Classicalswinefever arg = new Classicalswinefever();
                arg.setCsfReportid(report.getReportId());
                Classicalswinefever classicalswinefever =classicalswinefeverMapper.selectOne(arg);
                boolean insert = true;
                if (classicalswinefever == null) {
                    classicalswinefever = fill;
                    classicalswinefever.setCsfId(UUIDUtil.getUUID());
                } else {
                    fill.setCsfId(classicalswinefever.getCsfId());
                    classicalswinefever = fill;
                    insert = false;
                }
                classicalswinefever.setCsfReportid(report.getReportId());
                classicalswinefever.setCsfDate(report.getBeginTime());
                classicalswinefever.setCsfRegioncode(region.getRegionCode());
                classicalswinefever.setCsfRegionname(region.getRegionName());
                if (insert) {
                    classicalswinefeverMapper.insertSelective(classicalswinefever);
                } else {
                    classicalswinefeverMapper.updateByPrimaryKeySelective(classicalswinefever);
                }
                break;
            }
            case "b_footandmouthdisease": {
                Footandmouthdisease fill = (Footandmouthdisease) JSONObject.toBean(jsonObj, Footandmouthdisease.class);
                Footandmouthdisease arg = new Footandmouthdisease();
                arg.setFmdReportid(report.getReportId());
                Footandmouthdisease footandmouthdisease =footandmouthdiseaseMapper.selectOne(arg);
                boolean insert = true;
                if (footandmouthdisease == null) {
                    footandmouthdisease = fill;
                    footandmouthdisease.setFmdId(UUIDUtil.getUUID());
                } else {
                    fill.setFmdId(footandmouthdisease.getFmdId());
                    footandmouthdisease = fill;
                    insert = false;
                }
                footandmouthdisease.setFmdReportid(report.getReportId());
                footandmouthdisease.setFmdDate(report.getBeginTime());
                footandmouthdisease.setFmdRegioncode(region.getRegionCode());
                footandmouthdisease.setFmdRegionname(region.getRegionName());
                if (insert) {
                    footandmouthdiseaseMapper.insertSelective(footandmouthdisease);
                } else {
                    footandmouthdiseaseMapper.updateByPrimaryKeySelective(footandmouthdisease);
                }
                break;
            }
            case "b_newcastle": {
                Newcastle fill = (Newcastle) JSONObject.toBean(jsonObj, Newcastle.class);
                Newcastle arg = new Newcastle();
                arg.setNcReportid(report.getReportId());
                Newcastle newcastle =newcastleMapper.selectOne(arg);
                boolean insert = true;
                if (newcastle == null) {
                    newcastle = fill;
                    newcastle.setNcId(UUIDUtil.getUUID());
                } else {
                    fill.setNcId(newcastle.getNcId());
                    newcastle = fill;
                    insert = false;
                }
                newcastle.setNcReportid(report.getReportId());
                newcastle.setNcDate(report.getBeginTime());
                newcastle.setNcRegioncode(region.getRegionCode());
                newcastle.setNcRegionname(region.getRegionName());
                if (insert) {
                    newcastleMapper.insertSelective(newcastle);
                } else {
                    newcastleMapper.updateByPrimaryKeySelective(newcastle);
                }
                break;
            }
            case "b_pestedespetitsruminants": {
                Pestedespetitsruminants fill = (Pestedespetitsruminants) JSONObject.toBean(jsonObj, Pestedespetitsruminants.class);
                Pestedespetitsruminants arg = new Pestedespetitsruminants();
                arg.setPdprReportid(report.getReportId());
                Pestedespetitsruminants pestedespetitsruminants =pestedespetitsruminantsMapper.selectOne(arg);
                boolean insert = true;
                if (pestedespetitsruminants == null) {
                    pestedespetitsruminants = fill;
                    pestedespetitsruminants.setPdprId(UUIDUtil.getUUID());
                } else {
                    fill.setPdprId(pestedespetitsruminants.getPdprId());
                    pestedespetitsruminants = fill;
                    insert = false;
                }
                pestedespetitsruminants.setPdprReportid(report.getReportId());
                pestedespetitsruminants.setPdprDate(report.getBeginTime());
                pestedespetitsruminants.setPdprRegioncode(region.getRegionCode());
                pestedespetitsruminants.setPdprRegionname(region.getRegionName());
                if (insert) {
                    pestedespetitsruminantsMapper.insertSelective(pestedespetitsruminants);
                } else {
                    pestedespetitsruminantsMapper.updateByPrimaryKeySelective(pestedespetitsruminants);
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
                Disinfectiondrugs disinfectiondrugs = disinfectiondrugsMapper.selectOne(arg);
                boolean insert = true;
                if (disinfectiondrugs == null) {
                    disinfectiondrugs = fill;
                    disinfectiondrugs.setDfId(UUIDUtil.getUUID());
                } else {
                    fill.setDfId(disinfectiondrugs.getDfId());
                    disinfectiondrugs = fill;
                    insert = false;
                }
                disinfectiondrugs.setDfReportid(report.getReportId());
                disinfectiondrugs.setDfDate(report.getBeginTime());
                disinfectiondrugs.setDfRegioncode(region.getRegionCode());
                disinfectiondrugs.setDfRegionname(region.getRegionName());
                if (insert) {
                    disinfectiondrugsMapper.insertSelective(disinfectiondrugs);
                } else {
                    disinfectiondrugsMapper.updateByPrimaryKeySelective(disinfectiondrugs);
                }
                break;
            }
            case "b_wfootandmouthdisease": {
                Wfootandmouthdisease fill = (Wfootandmouthdisease) JSONObject
                        .toBean(jsonObj, Wfootandmouthdisease.class);
                Wfootandmouthdisease arg = new Wfootandmouthdisease();
                arg.setFmdReportid(report.getReportId());
                Wfootandmouthdisease item = wfootandmouthdiseaseMapper.selectOne(arg);
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
                Wlivestockinout item = wlivestockinoutMapper.selectOne(arg);
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
