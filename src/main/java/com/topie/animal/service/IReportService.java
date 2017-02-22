package com.topie.animal.service;

import com.github.pagehelper.PageInfo;
import com.topie.animal.dto.ReportDto;
import com.topie.common.service.IService;
import com.topie.database.core.animal.model.Report;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by chenguojun on 2017/2/21.
 */
public interface IReportService extends IService<Report> {

    PageInfo<ReportDto> selectByPageByArg(Map argMap, int pageNum, int pageSize);

    List<String> selectIdsByTemplateIdAndBeginTime(String templateId, String beginTime);

    int insertReport(Integer reportType, Date beginTime);

}
