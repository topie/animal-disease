package com.topie.animal.task;

import com.topie.animal.constant.ReportTypeE;
import com.topie.animal.dto.WeekDto;
import com.topie.animal.service.IReportService;
import com.topie.animal.service.IWeekConfigService;
import com.topie.animal.util.BeginTimeUtil;
import com.topie.common.utils.date.DateStyle;
import com.topie.common.utils.date.DateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * Created by chenguojun on 2017/2/4.
 */
@Component
public class GenerateReportTask {

    private final static Logger logger = LoggerFactory.getLogger(GenerateReportTask.class);

    @Autowired
    private IReportService iReportService;

    @Autowired
    private IWeekConfigService iWeekConfigService;

    @Scheduled(cron = "10 0 0 * * ?")
    public void weekGenerate() {
        logger.info("开始生成");
        Date today = DateUtil.getToday();
        List<WeekDto> list = iWeekConfigService.getDays(today);
        for (WeekDto weekDto : list) {
            Date beginTime = DateUtil.StringToDate(weekDto.getTime(), DateStyle.YYYY_MM_DD);
            if (beginTime.equals(today)) iReportService.insertReport(ReportTypeE.WEEK.getCode(), beginTime);
        }
    }

    @Scheduled(cron = "10 0 0 1 * ?")
    public void monthGenerate() {
        logger.info("开始生成");
        Date beginTime = DateUtil.getCurrentMonthFirstDay();
        iReportService.insertReport(ReportTypeE.MONTH.getCode(), beginTime);
    }

    @Scheduled(cron = "10 0 0 1 3,6,9,12 ?")
    public void seasonGenerate() {
        logger.info("开始生成");
        Date beginTime = DateUtil.getCurrentMonthFirstDay();
        iReportService.insertReport(ReportTypeE.SEASON.getCode(), beginTime);
    }

    @Scheduled(cron = "10 0 0 1 3,9 ?")
    public void halfYearGenerate() {
        logger.info("开始生成");
        Date beginTime = BeginTimeUtil.getCurrentHalfYearBeginTime();
        iReportService.insertReport(ReportTypeE.HALF_YEAR.getCode(), beginTime);
    }
}
