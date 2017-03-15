package com.topie.animal.api;

import com.github.pagehelper.PageInfo;
import com.topie.animal.constant.C;
import com.topie.animal.service.IOrgInfoService;
import com.topie.animal.service.ISpecFillService;
import com.topie.animal.service.IUserInfoService;
import com.topie.common.utils.PageConvertUtil;
import com.topie.common.utils.PoiUtil;
import com.topie.common.utils.ResponseUtil;
import com.topie.common.utils.Result;
import com.topie.database.core.animal.model.OrgInfo;
import com.topie.database.core.animal.model.SpecFill;
import com.topie.security.utils.SecurityUtil;
import org.apache.commons.lang3.StringUtils;
import org.jsoup.Jsoup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

/**
 * Created by chenguojun on 2017/3/14.
 */
@Controller
@RequestMapping("/api/animal/specFill")
public class SpecFillController {

    @Autowired
    private ISpecFillService iSpecFillService;

    @Autowired
    private IOrgInfoService iOrgInfoService;

    @Autowired
    private IUserInfoService iUserInfoService;

    @RequestMapping(value = "/pageList", method = RequestMethod.GET)
    @ResponseBody
    public Result pageList(SpecFill specFill,
            @RequestParam(value = "pageNum", required = false, defaultValue = "1") int pageNum,
            @RequestParam(value = "pageSize", required = false, defaultValue = "15") int pageSize) {
        String currentLoginName = SecurityUtil.getCurrentUserName();
        if (StringUtils.isEmpty(currentLoginName)) {
            return ResponseUtil.error("未登录");
        }
        OrgInfo currentOrg = iUserInfoService.selectOrgInfoByLoginName(currentLoginName);
        if (StringUtils.isEmpty(currentOrg.getOrgId())) {
            return ResponseUtil.error("当前用户没有组织机构");
        }
        if (!currentOrg.getRegionCode().equals("000000")) specFill.setOrgId(currentOrg.getOrgId());
        PageInfo<SpecFill> pageInfo = iSpecFillService.selectByPage(specFill, pageNum, pageSize);
        return ResponseUtil.success(PageConvertUtil.grid(pageInfo));
    }

    @RequestMapping(value = "/managerPageList", method = RequestMethod.GET)
    @ResponseBody
    public Result managerPageList(SpecFill specFill,
            @RequestParam(value = "pageNum", required = false, defaultValue = "1") int pageNum,
            @RequestParam(value = "pageSize", required = false, defaultValue = "15") int pageSize) {
        PageInfo<SpecFill> pageInfo = iSpecFillService.selectByPage(specFill, pageNum, pageSize);
        return ResponseUtil.success(PageConvertUtil.grid(pageInfo));
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ResponseBody
    public Result insert(SpecFill specFill, @RequestParam(value = "xlsPath", required = false) String xlsPath)
            throws ParserConfigurationException, TransformerException, IOException {
        if (StringUtils.isNotEmpty(xlsPath)) {
            String html = PoiUtil.excelToHtmlString(xlsPath);
            specFill.setTableContent(
                    "<style type=\"text/css\">" + Jsoup.parseBodyFragment(html).select("style").first().html()
                            + "</style>" + "<table class='t1'>" + Jsoup.parseBodyFragment(html).select("table").first()
                            .html() + "</table>" + C.SPEC_FILL_SCRIPT);
        }
        if (specFill.getOrgId() != null) {
            OrgInfo orgInfo = iOrgInfoService.selectByKey(specFill.getOrgId());
            if (orgInfo != null) specFill.setOrgName(orgInfo.getOrgName());
        }
        int result = iSpecFillService.saveNotNull(specFill);
        return result > 0 ? ResponseUtil.success() : ResponseUtil.error();
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public Result update(SpecFill specFill, @RequestParam(value = "xlsPath", required = false) String xlsPath)
            throws ParserConfigurationException, TransformerException, IOException {
        if (StringUtils.isNotEmpty(xlsPath)) {
            String html = PoiUtil.excelToHtmlString(xlsPath);
            specFill.setTableContent(
                    "<style type=\"text/css\">" + Jsoup.parseBodyFragment(html).select("style").first().html()
                            + "</style>" + "<table class='t1'>" + Jsoup.parseBodyFragment(html).select("table").first()
                            .html() + "</table>" + C.SPEC_FILL_SCRIPT);
        }
        if (specFill.getOrgId() != null) {
            OrgInfo orgInfo = iOrgInfoService.selectByKey(specFill.getOrgId());
            if (orgInfo != null) specFill.setOrgName(orgInfo.getOrgName());
        }
        iSpecFillService.updateNotNull(specFill);
        return ResponseUtil.success();
    }

    @RequestMapping(value = "/load/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result load(@PathVariable(value = "id") Integer id) {
        SpecFill specFill = iSpecFillService.selectByKey(id);
        return ResponseUtil.success(specFill);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public Result delete(@RequestParam(value = "id") Integer id) {
        iSpecFillService.delete(id);
        return ResponseUtil.success();
    }
}
