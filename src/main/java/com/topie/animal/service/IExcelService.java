package com.topie.animal.service;

import com.topie.database.core.animal.model.Report;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by chenguojun on 2017/2/21.
 */
public interface IExcelService {

    String getReportHtml(HttpServletRequest request, Report report);
}
