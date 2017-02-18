package com.topie.animald.api;

import com.github.pagehelper.PageInfo;
import com.topie.animald.service.IReportFillService;
import com.topie.animald.service.IReportService;
import com.topie.common.utils.PageConvertUtil;
import com.topie.common.utils.ResponseUtil;
import com.topie.common.utils.Result;
import com.topie.database.core.animald.model.ReportFill;
import com.topie.security.utils.SecurityUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by chenguojun on 2017/2/18.
 */
@Controller
@RequestMapping("/api/animalDisease/reportData")
public class ReportDataController {

    @Autowired
    private IReportFillService iReportFillService;

    @Autowired
    private IReportService iReportService;

    @RequestMapping(value = "/normalFill", method = RequestMethod.GET)
    @ResponseBody
    public Result normalFill(ReportFill reportFill,
            @RequestParam(value = "pageNum", required = false, defaultValue = "1") int pageNum,
            @RequestParam(value = "pageSize", required = false, defaultValue = "15") int pageSize) {
        PageInfo<ReportFill> pageInfo = iReportFillService.selectNormalFillByPage(reportFill, pageNum, pageSize);
        return ResponseUtil.success(PageConvertUtil.grid(pageInfo));
    }

    @RequestMapping(value = "/normalFill/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result normalFillLoad(HttpServletRequest request, @PathVariable(value = "id") Integer id) {
        ReportFill reportFill = iReportFillService.selectByKey(id);
        if (reportFill == null) {
            return ResponseUtil.error("填报规则不存在");
        }
        Integer userId = SecurityUtil.getCurrentUserId();
        if (userId == null) {
            return ResponseUtil.error("用户未登录");
        }
        String excelHtml = iReportFillService.getNormalFillHtml(request, reportFill, userId);
        Map result = new HashMap<>();
        result.put("html", excelHtml);
        return ResponseUtil.success(result);
    }

    @RequestMapping(value = "/normalFill/upsert", method = RequestMethod.POST)
    @ResponseBody
    public Result normalFillUpsert(@RequestParam("data") String data, @RequestParam("id") Integer id) {
        ReportFill reportFill = iReportFillService.selectByKey(id);
        if (reportFill == null) {
            return ResponseUtil.error("填报规则不存在");
        }
        Integer userId = SecurityUtil.getCurrentUserId();
        if (userId == null) {
            return ResponseUtil.error("用户未登录");
        }
        int result = iReportFillService.insertOrUpdateNormalFill(data,reportFill, userId);
        return ResponseUtil.success();
    }

}
