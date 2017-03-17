package com.topie.animal.api;

import com.github.pagehelper.PageInfo;
import com.topie.animal.constant.ReportTypeE;
import com.topie.animal.dto.ReReportDto;
import com.topie.animal.dto.ReportDto;
import com.topie.animal.dto.WeekDto;
import com.topie.animal.service.*;
import com.topie.animal.util.PeriodUtil;
import com.topie.common.utils.Option;
import com.topie.common.utils.PageConvertUtil;
import com.topie.common.utils.ResponseUtil;
import com.topie.common.utils.Result;
import com.topie.common.utils.date.DateStyle;
import com.topie.common.utils.date.DateUtil;
import com.topie.database.core.animal.model.OrgInfo;
import com.topie.database.core.animal.model.Template;
import com.topie.database.core.animal.model.WeekConfig;
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
@RequestMapping("/api/animal/report/week")
public class ReportWeekController {

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

    @RequestMapping(value = "/history", method = RequestMethod.GET)
    @ResponseBody
    public Result history(@RequestParam(value = "templateId", required = false) String templateId,
            @RequestParam(value = "period", required = false) String period,
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
        argMap.put("reportType", ReportTypeE.WEEK.getCode());
        if (!currentOrg.getRegionCode().equals("000000")) argMap.put("orgId", currentOrg.getOrgId());
        if (StringUtils.isNotEmpty(templateId)) argMap.put("templateId", templateId);
        if (StringUtils.isNotEmpty(period)) {
            argMap.put("beginTime", DateUtil.StringToString(period, DateStyle.YYYY_MM_DD));
        } else {
            return ResponseUtil.success(PageConvertUtil.grid(null));
        }
        if (status != null) argMap.put("status", status);
        PageInfo<ReportDto> pageInfo = iReportService.selectByPageByArg(argMap, pageNum, pageSize);
        return ResponseUtil.success(PageConvertUtil.grid(pageInfo));
    }

    @RequestMapping(value = "/summary", method = RequestMethod.GET)
    @ResponseBody
    public Result summary(@RequestParam(value = "templateId", required = false) String templateId,
            @RequestParam(value = "period", required = false) String period) {
        String currentLoginName = SecurityUtil.getCurrentUserName();
        if (StringUtils.isEmpty(period)) {
            return ResponseUtil.error("请选择上报日期");
        }
        if (StringUtils.isEmpty(currentLoginName)) {
            return ResponseUtil.error("未登录");
        }
        OrgInfo currentOrg = iUserInfoService.selectOrgInfoByLoginName(currentLoginName);
        if (StringUtils.isEmpty(currentOrg.getOrgId())) {
            return ResponseUtil.error("当前用户没有组织机构");
        }
        Map argMap = new HashMap();
        argMap.put("reportType", ReportTypeE.WEEK.getCode());
        if (!currentOrg.getRegionCode().equals("000000")) {
            return ResponseUtil.error("没有查看汇总权限");
        }
        Template template = iTemplateService.selectByKey(templateId);
        ReportDto reportDto = new ReportDto();
        reportDto.setTemplateId(templateId);
        reportDto.setTemplateName(template.getTemplateName());
        reportDto.setBeginTime(DateUtil.StringToDate(period, DateStyle.YYYY_MM_DD));
        Map<String, String> weekConfigMap = new HashMap();
        List<WeekConfig> weekConfigs = iWeekConfigService.selectAll();
        for (WeekConfig weekConfig : weekConfigs) {
            weekConfigMap.put(weekConfig.getYear() + "#" + weekConfig.getType(), weekConfig.getTime());
        }
        reportDto
                .setReportPeriod(PeriodUtil.build(ReportTypeE.WEEK.getCode(), reportDto.getBeginTime(), weekConfigMap));
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
        Date begin = DateUtil.getToday();
        List<WeekDto> days = iWeekConfigService.getDays(begin);
        Boolean flag = false;
        for (WeekDto weekDto : days) {
            if (weekDto.getTime().equals(DateUtil.DateToString(begin, DateStyle.YYYY_MM_DD))) {
                flag = true;
            }
        }
        if (!flag) return ResponseUtil.success(PageConvertUtil.grid(null));
        String currentLoginName = SecurityUtil.getCurrentUserName();
        if (StringUtils.isEmpty(currentLoginName)) {
            return ResponseUtil.error("未登录");
        }
        OrgInfo currentOrg = iUserInfoService.selectOrgInfoByLoginName(currentLoginName);
        if (StringUtils.isEmpty(currentOrg.getOrgId())) {
            return ResponseUtil.error("当前用户没有组织机构");
        }
        Map argMap = new HashMap();
        argMap.put("reportType", ReportTypeE.WEEK.getCode());
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
        reReportDto.setReportType(ReportTypeE.WEEK.getCode());
        if (StringUtils.isNotEmpty(templateId)) reReportDto.setTemplateId(templateId);
        PageInfo<ReReportDto> pageInfo = iReReportService.selectByPage(reReportDto, pageNum, pageSize);
        return ResponseUtil.success(PageConvertUtil.grid(pageInfo));
    }

    @RequestMapping(value = "/options", method = { RequestMethod.GET, RequestMethod.POST })
    @ResponseBody
    public List<Option> options(@RequestParam("year") int year, @RequestParam("type") int type) {
        List<WeekDto> days = iWeekConfigService.getDays(year, type);
        List<Option> optionList = new ArrayList<>();
        for (WeekDto day : days) {
            Option option = new Option();
            option.setText(day.getPeriod());
            option.setValue(day.getTime());
            optionList.add(option);
        }
        return optionList;
    }
}
