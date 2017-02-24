package com.topie.animal.api;

import com.github.pagehelper.PageInfo;
import com.topie.animal.constant.ReportTypeE;
import com.topie.animal.dto.ReReportDto;
import com.topie.animal.dto.ReportDto;
import com.topie.animal.handler.PeriodBuilder;
import com.topie.animal.service.IReReportService;
import com.topie.animal.service.IReportService;
import com.topie.animal.service.ITemplateService;
import com.topie.animal.service.IUserInfoService;
import com.topie.common.utils.PageConvertUtil;
import com.topie.common.utils.ResponseUtil;
import com.topie.common.utils.Result;
import com.topie.common.utils.date.DateStyle;
import com.topie.common.utils.date.DateUtil;
import com.topie.database.core.animal.model.OrgInfo;
import com.topie.database.core.animal.model.Template;
import com.topie.security.utils.SecurityUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by chenguojun on 2017/2/21.
 */
@Controller
@RequestMapping("/api/animal/report/month")
public class ReportMonthController {

    @Autowired
    private IReportService iReportService;

    @Autowired
    private ITemplateService iTemplateService;

    @Autowired
    private IUserInfoService iUserInfoService;

    @Autowired
    private IReReportService iReReportService;

    @RequestMapping(value = "/history", method = RequestMethod.GET)
    @ResponseBody
    public Result history(@RequestParam(value = "templateId", required = false) String templateId,
            @RequestParam(value = "period") String period,
            @RequestParam(value = "status", required = false) Integer status,
            @RequestParam(value = "pageNum", required = false, defaultValue = "1") int pageNum,
            @RequestParam(value = "pageSize", required = false, defaultValue = "15") int pageSize) {
        String currentLoginName = SecurityUtil.getCurrentUserName();
        if (StringUtils.isEmpty(currentLoginName)) {
            return ResponseUtil.error("未登录");
        }
        OrgInfo currentOrg = iUserInfoService.selectOrgInfoByLoginName(currentLoginName);
        if (StringUtils.isEmpty(currentOrg.getOrgId())) {
            return ResponseUtil.error("当前用户没有组织机构");
        }
        Map argMap = new HashMap();
        argMap.put("reportType", ReportTypeE.MONTH.getCode());
        if (!currentOrg.getRegionCode().equals("000000")) argMap.put("orgId", currentOrg.getOrgId());
        if (StringUtils.isNotEmpty(templateId)) argMap.put("templateId", templateId);
        if (StringUtils.isNotEmpty(period)) {
            String d = period.replace(",", "-") + "-01";
            argMap.put("beginTime", DateUtil.StringToString(d, DateStyle.YYYY_MM_DD));
        }
        if (status != null) argMap.put("status", status);
        PageInfo<ReportDto> pageInfo = iReportService.selectByPageByArg(argMap, pageNum, pageSize);
        return ResponseUtil.success(PageConvertUtil.grid(pageInfo));
    }

    @RequestMapping(value = "/summary", method = RequestMethod.GET)
    @ResponseBody
    public Result summary(@RequestParam(value = "templateId", required = false) String templateId,
            @RequestParam(value = "period") String period) {
        String currentLoginName = SecurityUtil.getCurrentUserName();
        if (StringUtils.isEmpty(currentLoginName)) {
            return ResponseUtil.error("未登录");
        }
        OrgInfo currentOrg = iUserInfoService.selectOrgInfoByLoginName(currentLoginName);
        if (StringUtils.isEmpty(currentOrg.getOrgId())) {
            return ResponseUtil.error("当前用户没有组织机构");
        }
        Map argMap = new HashMap();
        argMap.put("reportType", ReportTypeE.MONTH.getCode());
        if (!currentOrg.getRegionCode().equals("000000")) {
            return ResponseUtil.error("没有查看汇总权限");
        }
        Template template = iTemplateService.selectByKey(templateId);
        ReportDto reportDto = new ReportDto();
        reportDto.setTemplateId(templateId);
        reportDto.setTemplateName(template.getTemplateName());
        String d = period.replace(",", "-") + "-01";
        reportDto.setBeginTime(DateUtil.StringToDate(d, DateStyle.YYYY_MM_DD));
        reportDto.setReportPeriod(PeriodBuilder.buildMonth(reportDto.getBeginTime()));
        reportDto.setOrgName("汇总");
        Map map = new HashMap();
        map.put("total", 1);
        map.put("data", Collections.singletonList(reportDto));
        return ResponseUtil.success(map);
    }

    @RequestMapping(value = "/fill", method = RequestMethod.GET)
    @ResponseBody
    public Result fill(@RequestParam(value = "templateId", required = false) String templateId,
            @RequestParam(value = "pageNum", required = false, defaultValue = "1") int pageNum,
            @RequestParam(value = "pageSize", required = false, defaultValue = "15") int pageSize) {
        Date begin = DateUtil.getCurrentMonthFirstDay();
        Date end = DateUtil.addDay(begin, 30);
        Date now = new Date();
        if (now.after(end)) {
            return ResponseUtil.success(PageConvertUtil.grid(null));
        }
        String currentLoginName = SecurityUtil.getCurrentUserName();
        if (StringUtils.isEmpty(currentLoginName)) {
            return ResponseUtil.error("未登录");
        }
        OrgInfo currentOrg = iUserInfoService.selectOrgInfoByLoginName(currentLoginName);
        if (StringUtils.isEmpty(currentOrg.getOrgId())) {
            return ResponseUtil.error("当前用户没有组织机构");
        }
        Map argMap = new HashMap();
        argMap.put("reportType", ReportTypeE.MONTH.getCode());
        argMap.put("orgId", currentOrg.getOrgId());
        if (StringUtils.isNotEmpty(templateId)) argMap.put("templateId", templateId);
        argMap.put("beginTime", begin);
        PageInfo<ReportDto> pageInfo = iReportService.selectByPageByArg(argMap, pageNum, pageSize);
        return ResponseUtil.success(PageConvertUtil.grid(pageInfo));
    }

    @RequestMapping(value = "/reFill", method = RequestMethod.GET)
    @ResponseBody
    public Result reFill(@RequestParam(value = "templateId", required = false) String templateId,
            @RequestParam(value = "pageNum", required = false, defaultValue = "1") int pageNum,
            @RequestParam(value = "pageSize", required = false, defaultValue = "15") int pageSize) {
        ReReportDto reReportDto = new ReReportDto();
        String currentLoginName = SecurityUtil.getCurrentUserName();
        if (StringUtils.isEmpty(currentLoginName)) {
            return ResponseUtil.error("未登录");
        }
        OrgInfo currentOrg = iUserInfoService.selectOrgInfoByLoginName(currentLoginName);
        if (StringUtils.isEmpty(currentOrg.getOrgId())) {
            return ResponseUtil.error("当前用户没有组织机构");
        }
        reReportDto.setOrgId(currentOrg.getOrgId());
        reReportDto.setReIsOpen(true);
        reReportDto.setReportType(ReportTypeE.MONTH.getCode());
        if (StringUtils.isNotEmpty(templateId)) reReportDto.setTemplateId(templateId);
        PageInfo<ReReportDto> pageInfo = iReReportService.selectByPage(reReportDto, pageNum, pageSize);
        return ResponseUtil.success(PageConvertUtil.grid(pageInfo));
    }
}
