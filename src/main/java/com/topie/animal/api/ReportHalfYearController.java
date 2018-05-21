package com.topie.animal.api;

import com.github.pagehelper.PageInfo;
import com.topie.animal.constant.ReportTypeE;
import com.topie.animal.dto.ReReportDto;
import com.topie.animal.dto.ReportDto;
import com.topie.animal.dto.WeekDto;
import com.topie.animal.service.*;
import com.topie.animal.util.BeginTimeUtil;
import com.topie.animal.util.PeriodUtil;
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

import java.util.*;

/**
 * Created by chenguojun on 2017/2/21.
 */
@Controller
@RequestMapping("/api/animal/report/halfYear")
public class ReportHalfYearController {

    @Autowired
    private IReportService iReportService;

    @Autowired
    private ITemplateService iTemplateService;

    @Autowired
    private IUserInfoService iUserInfoService;

    @Autowired
    private IReReportService iReReportService;

    @Autowired
    private IWeekConfigService iWeekConfigService;

    @Autowired
    private IOtherConfigService iOtherConfigService;

    @RequestMapping(value = "/history", method = RequestMethod.GET)
    @ResponseBody
    public Result history(@RequestParam(value = "templateId", required = false) String templateId,
            @RequestParam(value = "period") String period,
            @RequestParam(value = "status", required = false) Integer status,
            @RequestParam(value = "orgId", required = false) String orgId,
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
        argMap.put("reportType", ReportTypeE.HALF_YEAR.getCode());
        if (!currentOrg.getRegionCode().equals("000000")) {
            argMap.put("orgId", currentOrg.getOrgId());
        } else {
            if (StringUtils.isNotEmpty(orgId)) argMap.put("orgId", orgId);
        }
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
        argMap.put("reportType", ReportTypeE.HALF_YEAR.getCode());
        if (!currentOrg.getRegionCode().equals("000000")) {
            return ResponseUtil.error("没有查看汇总权限");
        }
        Template template = iTemplateService.selectByKey(templateId);
        ReportDto reportDto = new ReportDto();
        reportDto.setTemplateId(templateId);
        reportDto.setTemplateName(template.getTemplateName());
        String d = period.replace(",", "-") + "-01";
        reportDto.setBeginTime(DateUtil.StringToDate(d, DateStyle.YYYY_MM_DD));
        reportDto.setReportPeriod(PeriodUtil.build(ReportTypeE.HALF_YEAR.getCode(), reportDto.getBeginTime(), null));
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
        String currentLoginName = SecurityUtil.getCurrentUserName();
        if (StringUtils.isEmpty(currentLoginName)) {
            return ResponseUtil.error("未登录");
        }
        OrgInfo currentOrg = iUserInfoService.selectOrgInfoByLoginName(currentLoginName);
        if (StringUtils.isEmpty(currentOrg.getOrgId())) {
            return ResponseUtil.error("当前用户没有组织机构");
        }
        Map argMap = new HashMap();
        Date begin = DateUtil.getToday();
        List<WeekDto> days = iWeekConfigService.getDays(begin);
        Date b2 = null;
        if (days.size() > 0) {
            b2 = DateUtil.StringToDate(days.get(0).getTime(), DateStyle.YYYY_MM_DD);
            begin = DateUtil.StringToDate(days.get(days.size() - 1).getTime(), DateStyle.YYYY_MM_DD);
        } else {
            return ResponseUtil.error("未检测到周填报规则，无法确定汇总开始时间");
        }
        Date end = DateUtil.addDay(begin, 7);
        Date now = new Date();
        begin= DateUtil.addDay(begin, -7);
        if (now.before(begin) || now.after(end)) {
            if (now.after(b2) && now.before(end)) {
                argMap.put("reportType", ReportTypeE.HALF_YEAR.getCode());
                argMap.put("orgId", currentOrg.getOrgId());
                argMap.put("beginTime", BeginTimeUtil.getCurrentHalfYearBeginTime(begin));
                argMap.put("templateId", "2664786F-FD92-4838-B492-4617D21C4D75");
                PageInfo<ReportDto> pageInfo = iReportService.selectByPageByArg(argMap, pageNum, pageSize);
                return ResponseUtil.success(PageConvertUtil.grid(pageInfo));
            }
            return ResponseUtil.success(PageConvertUtil.grid(null));
        }

        argMap.put("reportType", ReportTypeE.HALF_YEAR.getCode());
        argMap.put("orgId", currentOrg.getOrgId());
        if (StringUtils.isNotEmpty(templateId)) argMap.put("templateId", templateId);
        argMap.put("beginTime", BeginTimeUtil.getCurrentHalfYearBeginTime(begin));
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
        reReportDto.setReportType(ReportTypeE.HALF_YEAR.getCode());
        if (StringUtils.isNotEmpty(templateId)) reReportDto.setTemplateId(templateId);
        PageInfo<ReReportDto> pageInfo = iReReportService.selectByPage(reReportDto, pageNum, pageSize);
        return ResponseUtil.success(PageConvertUtil.grid(pageInfo));
    }
}
