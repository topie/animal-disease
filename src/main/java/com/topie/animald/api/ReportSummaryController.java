package com.topie.animald.api;

import com.github.pagehelper.PageInfo;
import com.topie.animald.service.INormalFillService;
import com.topie.common.utils.PageConvertUtil;
import com.topie.common.utils.ResponseUtil;
import com.topie.common.utils.Result;
import com.topie.database.core.animald.model.NormalFill;
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
@RequestMapping("/api/animalDisease/reportSummary")
public class ReportSummaryController {

    @Autowired
    private INormalFillService iNormalFillService;

    @RequestMapping(value = "/pageList", method = RequestMethod.GET)
    @ResponseBody
    public Result pageList(NormalFill normalFill,
            @RequestParam(value = "pageNum", required = false, defaultValue = "1") int pageNum,
            @RequestParam(value = "pageSize", required = false, defaultValue = "15") int pageSize) {
        PageInfo<NormalFill> pageInfo = iNormalFillService.selectSummaryByPage(normalFill, pageNum, pageSize);
        return ResponseUtil.success(PageConvertUtil.grid(pageInfo));
    }

    @RequestMapping(value = "/load/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result load(HttpServletRequest request, @PathVariable(value = "id") Integer id) {
        NormalFill normalFill = iNormalFillService.selectByKey(id);
        if (normalFill == null) {
            return ResponseUtil.error("填报规则不存在");
        }
        Integer userId = SecurityUtil.getCurrentUserId();
        if (userId == null) {
            return ResponseUtil.error("用户未登录");
        }
        String excelHtml = iNormalFillService.getSummaryHtml(request, normalFill);
        Map result = new HashMap<>();
        result.put("html", excelHtml);
        return ResponseUtil.success(result);
    }
}
