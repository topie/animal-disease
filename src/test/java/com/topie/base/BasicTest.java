package com.topie.base;

import com.topie.animal.constant.ReportTypeE;
import com.topie.animal.dto.WeekDto;
import com.topie.animal.service.IReportService;
import com.topie.animal.service.IWeekConfigService;
import com.topie.animal.util.BeginTimeUtil;
import com.topie.common.tools.cache.RedisCache;
import com.topie.common.utils.date.DateStyle;
import com.topie.common.utils.date.DateUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration("classpath:config/spring.xml")
public class BasicTest extends Assert {

    @Autowired
    private RedisCache redisCache;

    @Autowired
    private IReportService iReportService;

    @Autowired
    private IWeekConfigService iWeekConfigService;

    @Test
    public void testRedis() {
        redisCache.set("user", "chen", 10);
        System.out.println(redisCache.get("user"));
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(redisCache.get("user"));
    }

    @Test
    public void testDelByPattern() {
        redisCache.delByPattern("topie_animal_disease_*");

    }

    @Test
    public void generateMonth() throws Exception {
        Date beginTime = DateUtil.getCurrentMonthFirstDay();
        iReportService.insertReport(ReportTypeE.MONTH.getCode(), beginTime);
    }

    @Test
    public void generateSeason() throws Exception {
        Date beginTime = BeginTimeUtil.getCurrentSeasonBeginTime();
        iReportService.insertReport(ReportTypeE.SEASON.getCode(), beginTime);
    }

    @Test
    public void generateHalfYear() throws Exception {
        Date beginTime = BeginTimeUtil.getCurrentHalfYearBeginTime();
        iReportService.insertReport(ReportTypeE.HALF_YEAR.getCode(), beginTime);
    }

    @Test
    public void generateWeek() throws Exception {
        List<WeekDto> list = iWeekConfigService.getDays(new Date());
        for (WeekDto weekDto : list) {
            Date beginTime = DateUtil.StringToDate(weekDto.getTime(), DateStyle.YYYY_MM_DD);
            iReportService.insertReport(ReportTypeE.WEEK.getCode(), beginTime);
        }
    }
}
