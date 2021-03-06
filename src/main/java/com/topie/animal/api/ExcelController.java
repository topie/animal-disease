package com.topie.animal.api;

import com.topie.animal.constant.ReportTypeE;
import com.topie.animal.service.IExcelService;
import com.topie.animal.service.IReReportService;
import com.topie.animal.service.IReportService;
import com.topie.animal.service.ITemplateService;
import com.topie.animal.util.PeriodUtil;
import com.topie.common.tools.excel.ExcelFileUtil;
import com.topie.common.tools.tabletoxls.TableToXls;
import com.topie.common.utils.ResponseUtil;
import com.topie.common.utils.Result;
import com.topie.database.core.animal.dao.WeekConfigMapper;
import com.topie.database.core.animal.model.ReReport;
import com.topie.database.core.animal.model.Report;
import com.topie.database.core.animal.model.Template;
import com.topie.database.core.animal.model.WeekConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by chenguojun on 2017/2/21.
 */
@Controller
@RequestMapping("/api/animal/excel")
public class ExcelController {

    @Autowired
    private IReportService iReportService;

    @Autowired
    private IReReportService iReReportService;

    @Autowired
    private ITemplateService iTemplateService;

    @Autowired
    private IExcelService iExcelService;

    @Autowired
    private WeekConfigMapper weekConfigMapper;

    @Value("${temp.folder}")
    private String tempFolder;

    @RequestMapping(value = "/load/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result load(HttpServletRequest request, @PathVariable(value = "id") String reportId) {
        Report report = iReportService.selectByKey(reportId);
        if (report == null) {
            return ResponseUtil.error("填报不存在");
        }
        String excelHtml = iExcelService.getReportHtml(request, report);
        if (excelHtml == null) return ResponseUtil.error("还没有模板");
        Map result = new HashMap<>();
        result.put("html", excelHtml);
        return ResponseUtil.success(result);
    }

    @RequestMapping(value = "/insertOrUpdate", method = RequestMethod.POST)
    @ResponseBody
    public Result insertOrUpdate(@RequestParam("data") String data, @RequestParam("reportId") String reportId,
            @RequestParam(value = "reportStatus", required = false) Integer reportStatus) {
        Report report = iReportService.selectByKey(reportId);
        if (report == null) {
            return ResponseUtil.error("填报不存在");
        }
        int result = iExcelService.insertOrUpdateReportFill(data, report);
        if (reportStatus != null) {
            report.setStatus(reportStatus);
            report.setReportTime(new Date());
        }
        iReportService.updateNotNull(report);
        if (reportStatus != null && reportStatus == 1) {
            List<ReReport> reReportList = iReReportService.selectByReport(report);
            for (ReReport reReport : reReportList) {
                reReport.setReIsOpen(0);
                iReReportService.updateNotNull(reReport);
            }
        }
        return result > 0 ? ResponseUtil.success() : ResponseUtil.error();
    }

    @RequestMapping(value = "/download/{id}", method = RequestMethod.GET)
    public void download(HttpServletRequest request, HttpServletResponse response,
            @PathVariable(value = "id") String reportId) throws Exception {
        Report report = iReportService.selectByKey(reportId);
        if (report == null) {
            ResponseUtil.writeJson(response, "填报不存在");
        }
        System.out.println("计算HTML开始");
        String excelHtml = iExcelService.getReportHtml(request, report);
        System.out.println("计算HTML结束");
        String filePath = tempFolder + "/export.xls";
        FileOutputStream fileOutputStream = new FileOutputStream(filePath);
        System.out.println("生成XLS开始");
        TableToXls.process(excelHtml, fileOutputStream);
        System.out.println("生成HTML结束");
        fileOutputStream.close();
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
        ExcelFileUtil.download(response, filePath,
                (template != null ? (period + " " + template.getTemplateName()) : "未命名") + ".xls");
    }

    @RequestMapping(value = "/summary", method = RequestMethod.GET)
    @ResponseBody
    public Result summary(HttpServletRequest request, @RequestParam(value = "templateId") String templateId,
            @RequestParam(value = "beginTime") String beginTime) {
        String excelHtml = iExcelService.getReportSummaryHtml(request, templateId, beginTime);
        if (excelHtml == null) return ResponseUtil.error("还没有汇总");
        Map result = new HashMap<>();
        result.put("html", excelHtml);
        return ResponseUtil.success(result);
    }

    @RequestMapping(value = "/downloadSummary", method = RequestMethod.GET)
    public void downloadSummary(HttpServletRequest request, HttpServletResponse response,
            @RequestParam(value = "templateId") String templateId, @RequestParam(value = "beginTime") String beginTime)
            throws Exception {
        String excelHtml = iExcelService.getReportSummaryHtml(request, templateId, beginTime);
        String filePath = tempFolder + "/export.xls";
        FileOutputStream fileOutputStream = new FileOutputStream(filePath);
        TableToXls.process(excelHtml, fileOutputStream);
        fileOutputStream.close();
        Template template = iTemplateService.selectByKey(templateId);
        ExcelFileUtil.download(response, filePath, template.getTemplateName() + "汇总.xls");
    }

}
