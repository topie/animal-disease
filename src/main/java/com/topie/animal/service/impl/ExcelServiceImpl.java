package com.topie.animal.service.impl;

import com.topie.animal.service.*;
import com.topie.common.service.IService;
import com.topie.common.tools.freemarker.FreeMarkerUtil;
import com.topie.common.utils.UUIDUtil;
import com.topie.database.core.animal.dao.RegionMapper;
import com.topie.database.core.animal.model.*;
import com.topie.database.core.template.dao.DisinfectiondrugsMapper;
import com.topie.database.core.template.dao.LiveStockInOutMapper;
import com.topie.database.core.template.dao.WfootandmouthdiseaseMapper;
import com.topie.database.core.template.model.Disinfectiondrugs;
import com.topie.database.core.template.model.LiveStockInOut;
import com.topie.database.core.template.model.Wfootandmouthdisease;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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

    @Override
    public String getReportHtml(HttpServletRequest request, Report report) {
        Map params = new HashMap();
        UserInfo userInfo = iUserInfoService.selectByKey(report.getReportUserId());
        params.put("user", userInfo);
        Template template = iTemplateService.selectByKey(report.getTemplateId());
        params.put("templateName", template.getTemplateName());
        OrgInfo orgInfo = iOrgInfoService.selectByKey(userInfo.getOrgId());
        params.put("org", orgInfo);
        params.put("report", report);
        switch (template.getTableName().toLowerCase()) {
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
            default:
                return null;
        }
        String templatePath = request.getSession().getServletContext().getRealPath("/template");
        return FreeMarkerUtil.getHtmlStringFromTemplate(templatePath, template.getNormalTemplate(), params);
    }

    @Override
    public String getReportSummaryHtml(HttpServletRequest request, String templateId, String beginTime) {
        Template template = iTemplateService.selectByKey(templateId);
        List<String> reportIds = iReportService.selectIdsByTemplateIdAndBeginTime(templateId, beginTime);
        if (reportIds.size() == 0) return null;
        Map params = new HashMap();
        switch (template.getTableName().toLowerCase()) {
            case "b_livestockinout": {
                Example example = new Example(LiveStockInOut.class);
                Example.Criteria criteria = example.createCriteria();
                criteria.andIn("reportid", reportIds);
                List<LiveStockInOut> list = liveStockInOutMapper.selectByExample(example);
                params.put("items", list);
                break;
            }
            case "b_disinfectiondrugs": {
                Example example = new Example(Disinfectiondrugs.class);
                Example.Criteria criteria = example.createCriteria();
                criteria.andIn("dfReportid", reportIds);
                List<Disinfectiondrugs> items = disinfectiondrugsMapper.selectByExample(example);
                params.put("items", items);
                break;
            }
            case "b_wfootandmouthdisease": {
                Example example = new Example(Wfootandmouthdisease.class);
                Example.Criteria criteria = example.createCriteria();
                criteria.andIn("fmdReportid", reportIds);
                List<Wfootandmouthdisease> items = wfootandmouthdiseaseMapper.selectByExample(example);
                params.put("item", items);
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
            default:
                break;
        }
        return 1;
    }
}
