package com.topie.animald.api;

import com.github.pagehelper.PageInfo;
import com.topie.animald.service.IReFillService;
import com.topie.animald.service.IReportFillService;
import com.topie.common.utils.PageConvertUtil;
import com.topie.common.utils.ResponseUtil;
import com.topie.common.utils.Result;
import com.topie.database.core.animald.model.ReFill;
import com.topie.database.core.animald.model.ReportFill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * Created by chenguojun on 2017/2/16.
 */
@Controller
@RequestMapping("/api/animalDisease/reFill")
public class ReFillController {

    @Autowired
    private IReFillService iReFillService;

    @Autowired
    private IReportFillService iReportFillService;

    @RequestMapping(value = "/pageList", method = RequestMethod.GET)
    @ResponseBody
    public Result pageList(ReFill reFill,
            @RequestParam(value = "pageNum", required = false, defaultValue = "1") int pageNum,
            @RequestParam(value = "pageSize", required = false, defaultValue = "15") int pageSize) {
        PageInfo<ReFill> pageInfo = iReFillService.selectByPage(reFill, pageNum, pageSize);
        return ResponseUtil.success(PageConvertUtil.grid(pageInfo));
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ResponseBody
    public Result insert(ReFill reFill) {
        ReportFill reportFill = iReportFillService.selectByKey(reFill.getFillId());
        if (reportFill == null) {
            return ResponseUtil.error("申请补填报的填报规则不存在！");
        }
        if (reportFill.getEndTime().after(new Date())) {
            return ResponseUtil.error("申请补填报的填报规则未过期！");
        }
        reFill.setDisplayTitle(reportFill.getDisplayTitle() + "[补填报]");
        int result = iReFillService.saveNotNull(reFill);
        return result > 0 ? ResponseUtil.success() : ResponseUtil.error();
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public Result update(ReFill reFill) {
        ReportFill reportFill = iReportFillService.selectByKey(reFill.getFillId());
        if (reportFill == null) {
            return ResponseUtil.error("申请补填报的填报规则不存在！");
        }
        if (reportFill.getEndTime().after(new Date())) {
            return ResponseUtil.error("申请补填报的填报规则未过期！");
        }
        reFill.setDisplayTitle(reportFill.getDisplayTitle() + "[补填报]");
        iReFillService.updateNotNull(reFill);
        return ResponseUtil.success();
    }

    @RequestMapping(value = "/load/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result load(@PathVariable(value = "id") Integer id) {
        ReFill reFill = iReFillService.selectByKey(id);
        return ResponseUtil.success(reFill);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public Result delete(@RequestParam(value = "id") Integer id) {
        iReFillService.delete(id);
        return ResponseUtil.success();
    }

}
