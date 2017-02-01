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
            case "b_livestockinout": {
                LiveStockInOut livestockInOut = liveStockInOutMapper.selectOneByReportId(report.getReportId());
                if (livestockInOut == null) {
                    livestockInOut = new LiveStockInOut();
                }
                params.put("item", livestockInOut);
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
