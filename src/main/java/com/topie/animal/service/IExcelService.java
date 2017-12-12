package com.topie.animal.service;

import com.topie.database.core.animal.model.Report;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by chenguojun on 2017/2/21.
 */
public interface IExcelService {

    String getReportHtml(HttpServletRequest request, Report report);

    String getReportSummaryHtml(HttpServletRequest request, String templateId, String beginTime);

    int insertOrUpdateReportFill(String data, Report report);

    int insertOrUpdateReportFillForApi(String data, Report report);
}
