package com.topie.animal.api;

import com.topie.animal.constant.ReportTypeE;
import com.topie.animal.dto.WeekDto;
import com.topie.animal.service.IReportService;
import com.topie.animal.service.IWeekConfigService;
import com.topie.common.utils.ResponseUtil;
import com.topie.common.utils.Result;
import com.topie.common.utils.date.DateStyle;
import com.topie.common.utils.date.DateUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

/**
 * Created by chenguojun on 2017/2/4.
 */
@Controller
@RequestMapping("/api/animal/generateReport")
public class GenerateReportController {

    @Autowired
    private IReportService iReportService;

    @Autowired
    private IWeekConfigService iWeekConfigService;

    @RequestMapping(value = "/do", method = RequestMethod.POST)
    @ResponseBody
    public Result insert(Integer reportType, @RequestParam(value = "period", required = false) String period) {
        if (StringUtils.isNotEmpty(period)) {
            Date beginTime;
            switch (reportType) {
                case 3: {
                    String d = period.replace(",", "-") + "-01";
                    beginTime = DateUtil.StringToDate(d, DateStyle.YYYY_MM_DD);
                    return monthGenerate(beginTime);
                }
                case 2: {
                    beginTime = DateUtil.StringToDate(period, DateStyle.YYYY_MM_DD);
                    return weekGenerate(beginTime);
                }
                case 4: {
                    String d = period.replace(",", "-") + "-01";
                    beginTime = DateUtil.StringToDate(d, DateStyle.YYYY_MM_DD);
                    return seasonGenerate(beginTime);
                }
                case 7: {
                    String d = period.replace(",", "-") + "-01";
                    beginTime = DateUtil.StringToDate(d, DateStyle.YYYY_MM_DD);
                    return halfYearGenerate(beginTime);
                }
                default: {
                    return ResponseUtil.error("错误的模块类型！");
                }
            }
        } else {
            return ResponseUtil.error("上报周期不能为空！");
        }
    }

    public Result weekGenerate(Date day) {
        List<WeekDto> list = iWeekConfigService.getDays(day);
        for (WeekDto weekDto : list) {
            Date beginTime = DateUtil.StringToDate(weekDto.getTime(), DateStyle.YYYY_MM_DD);
            if (beginTime.equals(day)) iReportService.insertReport(ReportTypeE.WEEK.getCode(), beginTime);
        }
        return ResponseUtil.success();
    }

    public Result monthGenerate(Date beginTime) {
        iReportService.insertReport(ReportTypeE.MONTH.getCode(), beginTime);
        return ResponseUtil.success();
    }

    public Result seasonGenerate(Date beginTime) {
        iReportService.insertReport(ReportTypeE.SEASON.getCode(), beginTime);
        return ResponseUtil.success();
    }

    public Result halfYearGenerate(Date beginTime) {
        iReportService.insertReport(ReportTypeE.HALF_YEAR.getCode(), beginTime);
        return ResponseUtil.success();
    }
}
