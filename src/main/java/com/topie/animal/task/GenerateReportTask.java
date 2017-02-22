package com.topie.animal.task;

import com.topie.animal.constant.ReportTypeE;
import com.topie.animal.service.IReportService;
import com.topie.common.utils.date.DateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by chenguojun on 2017/2/4.
 */
@Component
public class GenerateReportTask {

    private final static Logger logger = LoggerFactory.getLogger(GenerateReportTask.class);

    @Autowired
    private IReportService iReportService;

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
}
