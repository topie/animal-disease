package com.topie.animal.api;

import com.github.pagehelper.PageInfo;
import com.topie.animal.dto.ReReportDto;
import com.topie.animal.service.IReReportService;
import com.topie.animal.service.IReportService;
import com.topie.common.utils.PageConvertUtil;
import com.topie.common.utils.ResponseUtil;
import com.topie.common.utils.Result;
import com.topie.common.utils.UUIDUtil;
import com.topie.common.utils.date.DateStyle;
import com.topie.common.utils.date.DateUtil;
import com.topie.database.core.animal.model.ReReport;
import com.topie.database.core.animal.model.Report;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * Created by chenguojun on 2017/2/16.
 */
@Controller
@RequestMapping("/api/animal/reReport")
public class ReReportController {

    @Autowired
    private IReReportService iReReportService;

    @Autowired
    private IReportService iReportService;

    @RequestMapping(value = "/pageList", method = RequestMethod.GET)
    @ResponseBody
    public Result pageList(ReReportDto reReportDto,
            @RequestParam(value = "pageNum", required = false, defaultValue = "1") int pageNum,
            @RequestParam(value = "pageSize", required = false, defaultValue = "15") int pageSize) {
        reReportDto.setReIsOpen(true);
        PageInfo<ReReportDto> pageInfo = iReReportService.selectByPage(reReportDto, pageNum, pageSize);
        return ResponseUtil.success(PageConvertUtil.grid(pageInfo));
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ResponseBody
    public Result insert(ReReport reReport, @RequestParam(value = "period", required = false) String period) {
        if (StringUtils.isNotEmpty(period)) {
            Date beginTime;
            switch (reReport.getReportType()) {
                case 3: {
                    String d = period.replace(",", "-") + "-01";
                    beginTime = DateUtil.StringToDate(d, DateStyle.YYYY_MM_DD);
                    break;
                }
                case 2: {
                    beginTime = DateUtil.StringToDate(period, DateStyle.YYYY_MM_DD);
                    break;
                }
                case 4: {
                    String d = period.replace(",", "-") + "-01";
                    beginTime = DateUtil.StringToDate(d, DateStyle.YYYY_MM_DD);
                    break;
                }
                case 7: {
                    String d = period.replace(",", "-") + "-01";
                    beginTime = DateUtil.StringToDate(d, DateStyle.YYYY_MM_DD);
                    break;
                }
                default: {
                    return ResponseUtil.error("错误的模块类型！");
                }
            }
            reReport.setBeginTime(beginTime);
        } else {
            return ResponseUtil.error("上报周期不能为空！");
        }
        Report report = iReportService
                .selectOneByOrgIdAndTemplateIdAndBeginTime(reReport.getOrgId(), reReport.getTemplateId(),
                        reReport.getBeginTime());
        if (report == null) {
            return ResponseUtil.error("填报不存在无法补填报！");
        }
        List<ReReport> reReportList = iReReportService.selectByReport(report);
        if (reReportList.size() > 0) {
            return ResponseUtil.error("已存在补填报记录，不能重复添加!");
        }
        report.setStatus(0);
        iReportService.updateNotNull(report);
        reReport.setId(UUIDUtil.getUUID());
        reReport.setReIsOpen(1);
        int result = iReReportService.saveNotNull(reReport);
        return result > 0 ? ResponseUtil.success() : ResponseUtil.error();
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public Result update(ReReport reReport) {
        iReReportService.updateNotNull(reReport);
        return ResponseUtil.success();
    }

    @RequestMapping(value = "/load/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result load(@PathVariable(value = "id") String id) {
        ReReport reReport = iReReportService.selectByKey(id);
        return ResponseUtil.success(reReport);
    }

    @RequestMapping(value = "/close", method = RequestMethod.POST)
    @ResponseBody
    public Result close(@RequestParam(value = "id") String id) {
        iReReportService.updateToClose(id);
        return ResponseUtil.success();
    }

}
