package com.topie.animal.api;

import com.topie.animal.service.IExcelService;
import com.topie.animal.service.IReportService;
import com.topie.common.utils.ResponseUtil;
import com.topie.common.utils.Result;
import com.topie.database.core.animal.model.Report;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by chenguojun on 2017/2/21.
 */
@Controller
@RequestMapping("/api/animal/excel")
public class ExcelController {

    @Autowired
    private IReportService iReportService;

    @Autowired
    private IExcelService iExcelService;

    @RequestMapping(value = "/load/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result load(HttpServletRequest request, @PathVariable(value = "id") String reportId) {
        Report report = iReportService.selectByKey(reportId);
        if (report == null) {
            return ResponseUtil.error("填报不存在");
        }
        String excelHtml = iExcelService.getReportHtml(request, report);
        Map result = new HashMap<>();
        result.put("html", excelHtml);
        return ResponseUtil.success(result);
    }

}
