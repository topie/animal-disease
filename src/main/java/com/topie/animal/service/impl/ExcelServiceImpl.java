package com.topie.animal.service.impl;

import com.topie.animal.service.IExcelService;
import com.topie.animal.service.IOrgInfoService;
import com.topie.animal.service.ITemplateService;
import com.topie.animal.service.IUserInfoService;
import com.topie.common.tools.freemarker.FreeMarkerUtil;
import com.topie.database.core.animal.model.OrgInfo;
import com.topie.database.core.animal.model.Report;
import com.topie.database.core.animal.model.Template;
import com.topie.database.core.animal.model.UserInfo;
import com.topie.database.core.template.dao.LiveStockInOutMapper;
import com.topie.database.core.template.model.LiveStockInOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
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
    private IOrgInfoService iOrgInfoService;

    @Autowired
    private LiveStockInOutMapper liveStockInOutMapper;

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
            default:
                break;
        }
        String templatePath = request.getSession().getServletContext().getRealPath("/template");
        return FreeMarkerUtil.getHtmlStringFromTemplate(templatePath, template.getNormalTemplate(), params);
    }
}
