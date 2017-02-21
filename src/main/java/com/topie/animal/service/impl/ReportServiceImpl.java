package com.topie.animal.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.topie.animal.dto.ReportDto;
import com.topie.animal.handler.PeriodBuilder;
import com.topie.animal.service.IReportService;
import com.topie.common.service.impl.BaseService;
import com.topie.database.core.animal.dao.ReportMapper;
import com.topie.database.core.animal.model.Report;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by chenguojun on 2017/2/21.
 */
@Service
public class ReportServiceImpl extends BaseService<Report> implements IReportService {

    @Autowired
    private ReportMapper reportMapper;


    @Override
    public PageInfo<ReportDto> selectByPageByArg(Map argMap, int pageNum, int pageSize) {

        PageHelper.startPage(pageNum, pageSize);
        List<ReportDto> list = reportMapper.selectByPageByArg(argMap);
        for (ReportDto reportDto : list) {
            reportDto.setReportPeriod(PeriodBuilder.buildMonth(reportDto.getBeginTime()));
        }
        return new PageInfo<>(list);
    }

    @Override
    public List<String> selectIdsByTemplateIdAndBeginTime(String templateId, String beginTime) {
        return reportMapper.selectIdsByTemplateIdAndBeginTime(templateId,beginTime);
    }
}
