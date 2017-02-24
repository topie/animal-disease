package com.topie.animal.service.impl;

import com.topie.animal.service.*;
import com.topie.common.tools.freemarker.FreeMarkerUtil;
import com.topie.common.utils.UUIDUtil;
import com.topie.database.core.animal.dao.RegionMapper;
import com.topie.database.core.animal.model.*;
import com.topie.database.core.template.dao.DisinfectiondrugsMapper;
import com.topie.database.core.template.dao.LiveStockInOutMapper;
import com.topie.database.core.template.model.Disinfectiondrugs;
import com.topie.database.core.template.model.LiveStockInOut;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
                Disinfectiondrugs disinfectiondrugs = disinfectiondrugsMapper.selectOne(arg);
                if (disinfectiondrugs == null) {
                    disinfectiondrugs = new Disinfectiondrugs();
                }
                params.put("item", disinfectiondrugs);
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
                List<LiveStockInOut> list = liveStockInOutMapper.selectByReportIds(reportIds);
                params.put("items", list);
                break;
            }
            case "b_disinfectiondrugs": {
                List<Disinfectiondrugs> list = disinfectiondrugsMapper.selectByReportIds(reportIds);
                params.put("items", list);
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
            default:
                break;
        }
        return 1;
    }
}
