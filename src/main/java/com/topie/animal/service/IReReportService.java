package com.topie.animal.service;

import com.github.pagehelper.PageInfo;
import com.topie.animal.dto.ReReportDto;
import com.topie.common.service.IService;
import com.topie.database.core.animal.model.ReReport;
import com.topie.database.core.animal.model.Report;

import java.util.List;

/**
 * Created by chenguojun on 2017/2/16.
 */
public interface IReReportService extends IService<ReReport> {

    PageInfo<ReReportDto> selectByPage(ReReportDto reReport, int pageNum, int pageSize);

    int updateToClose(String id);

    List<ReReport> selectByReport(Report report);
}
