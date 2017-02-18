package com.topie.animald.api;

import com.github.pagehelper.PageInfo;
import com.topie.animald.service.INormalFillService;
import com.topie.animald.service.IReFillService;
import com.topie.animald.service.IUserInfoService;
import com.topie.common.utils.PageConvertUtil;
import com.topie.common.utils.ResponseUtil;
import com.topie.common.utils.Result;
import com.topie.database.core.animald.model.NormalFill;
import com.topie.database.core.animald.model.ReFill;
import com.topie.database.core.animald.model.UserInfo;
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
    private INormalFillService iNormalFillService;

    @Autowired
    private IReFillService iReFillService;

    @Autowired
    private IUserInfoService iUserInfoService;

    @RequestMapping(value = "/normalFill", method = RequestMethod.GET)
    @ResponseBody
    public Result normalFill(NormalFill normalFill,
            @RequestParam(value = "pageNum", required = false, defaultValue = "1") int pageNum,
            @RequestParam(value = "pageSize", required = false, defaultValue = "15") int pageSize) {
        PageInfo<NormalFill> pageInfo = iNormalFillService.selectNormalFillByPage(normalFill, pageNum, pageSize);
        return ResponseUtil.success(PageConvertUtil.grid(pageInfo));
    }

    @RequestMapping(value = "/normalFill/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result normalFillLoad(HttpServletRequest request, @PathVariable(value = "id") Integer id) {
        NormalFill normalFill = iNormalFillService.selectByKey(id);
        if (normalFill == null) {
            return ResponseUtil.error("填报规则不存在");
        }
        Integer userId = SecurityUtil.getCurrentUserId();
        if (userId == null) {
            return ResponseUtil.error("用户未登录");
        }
        String excelHtml = iNormalFillService.getNormalFillHtml(request, normalFill, userId);
        Map result = new HashMap<>();
        result.put("html", excelHtml);
        return ResponseUtil.success(result);
    }

    @RequestMapping(value = "/normalFill/insertOrUpdate", method = RequestMethod.POST)
    @ResponseBody
    public Result normalFillInsertOrUpdate(@RequestParam("data") String data, @RequestParam("id") Integer id) {
        NormalFill normalFill = iNormalFillService.selectByKey(id);
        if (normalFill == null) {
            return ResponseUtil.error("填报规则不存在");
        }
        Integer userId = SecurityUtil.getCurrentUserId();
        if (userId == null) {
            return ResponseUtil.error("用户未登录");
        }
        int result = iNormalFillService.insertOrUpdateNormalFill(data, normalFill, userId);
        return ResponseUtil.success();
    }

    @RequestMapping(value = "/reFill", method = RequestMethod.GET)
    @ResponseBody
    public Result reFill(ReFill reFill,
            @RequestParam(value = "pageNum", required = false, defaultValue = "1") int pageNum,
            @RequestParam(value = "pageSize", required = false, defaultValue = "15") int pageSize) {
        Integer userId = SecurityUtil.getCurrentUserId();
        if (userId == null) {
            return ResponseUtil.error("用户未登录");
        }
        UserInfo userInfo = iUserInfoService.selectByKey(userId);
        reFill.setOrgId(userInfo.getOrgId());
        PageInfo<ReFill> pageInfo = iReFillService.selectByPage(reFill, pageNum, pageSize);
        return ResponseUtil.success(PageConvertUtil.grid(pageInfo));
    }

    @RequestMapping(value = "/reFill/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result reFillLoad(HttpServletRequest request, @PathVariable(value = "id") Integer id) {
        ReFill reFill = iReFillService.selectByKey(id);
        if (reFill == null) return ResponseUtil.error("没有补填资格");
        NormalFill normalFill = iNormalFillService.selectByKey(reFill.getFillId());
        if (normalFill == null) return ResponseUtil.error("填报规则不存在");
        Integer userId = SecurityUtil.getCurrentUserId();
        if (userId == null) return ResponseUtil.error("用户未登录");
        String excelHtml = iNormalFillService.getNormalFillHtml(request, normalFill, userId);
        Map result = new HashMap<>();
        result.put("html", excelHtml);
        return ResponseUtil.success(result);
    }

    @RequestMapping(value = "/reFill/insertOrUpdate", method = RequestMethod.POST)
    @ResponseBody
    public Result reFillInsertOrUpdate(@RequestParam("data") String data, @RequestParam("id") Integer id) {
        ReFill reFill = iReFillService.selectByKey(id);
        if (reFill == null) return ResponseUtil.error("没有补填资格");
        NormalFill normalFill = iNormalFillService.selectByKey(reFill.getFillId());
        if (normalFill == null) {
            return ResponseUtil.error("填报规则不存在");
        }
        Integer userId = SecurityUtil.getCurrentUserId();
        if (userId == null) {
            return ResponseUtil.error("用户未登录");
        }
        iNormalFillService.insertOrUpdateNormalFill(data, normalFill, userId);
        return ResponseUtil.success();
    }

}
