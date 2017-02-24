package com.topie.animal.api;

import com.github.pagehelper.PageInfo;
import com.topie.animal.dto.ReReportDto;
import com.topie.animal.service.IReReportService;
import com.topie.common.utils.PageConvertUtil;
import com.topie.common.utils.ResponseUtil;
import com.topie.common.utils.Result;
import com.topie.common.utils.UUIDUtil;
import com.topie.database.core.animal.model.ReReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by chenguojun on 2017/2/16.
 */
@Controller
@RequestMapping("/api/animal/reReport")
public class ReReportController {

    @Autowired
    private IReReportService iReReportService;

    @RequestMapping(value = "/pageList", method = RequestMethod.GET)
    @ResponseBody
    public Result pageList(ReReportDto reReportDto,
            @RequestParam(value = "pageNum", required = false, defaultValue = "1") int pageNum,
            @RequestParam(value = "pageSize", required = false, defaultValue = "15") int pageSize) {
        PageInfo<ReReportDto> pageInfo = iReReportService.selectByPage(reReportDto, pageNum, pageSize);
        return ResponseUtil.success(PageConvertUtil.grid(pageInfo));
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ResponseBody
    public Result insert(ReReport reReport) {
        reReport.setId(UUIDUtil.getUUID());
        int result = iReReportService.saveNotNull(reReport);
        return result > 0 ? ResponseUtil.success() : ResponseUtil.error();
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public Result update(ReReport reReport) {
        iReReportService.updateNotNull(reReport);
        return ResponseUtil.success();
    }

    @RequestMapping(value = "/load/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result load(@PathVariable(value = "id") String id) {
        ReReport reReport = iReReportService.selectByKey(id);
        return ResponseUtil.success(reReport);
    }

    @RequestMapping(value = "/close", method = RequestMethod.POST)
    @ResponseBody
    public Result close(@RequestParam(value = "id") String id) {
        iReReportService.delete(id);
        return ResponseUtil.success();
    }

}
