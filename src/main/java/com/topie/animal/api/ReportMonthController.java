package com.topie.animal.api;

import com.github.pagehelper.PageInfo;
import com.topie.animal.constant.ReportTypeE;
import com.topie.animal.dto.ReportDto;
import com.topie.animal.service.IReportService;
import com.topie.animal.service.IUserInfoService;
import com.topie.common.utils.PageConvertUtil;
import com.topie.common.utils.ResponseUtil;
import com.topie.common.utils.Result;
import com.topie.common.utils.date.DateStyle;
import com.topie.common.utils.date.DateUtil;
import com.topie.database.core.animal.model.OrgInfo;
import com.topie.security.utils.SecurityUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by chenguojun on 2017/2/21.
 */
@Controller
@RequestMapping("/api/animal/report/month")
public class ReportMonthController {

    @Autowired
    private IReportService iReportService;

    @Autowired
    private IUserInfoService iUserInfoService;

    @RequestMapping(value = "/history", method = RequestMethod.GET)
    @ResponseBody
    public Result history(@RequestParam(value = "templateId", required = false) String templateId,
            @RequestParam(value = "period") String period,
            @RequestParam(value = "status", required = false) Integer status,
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
        Map argMap = new HashMap();
        argMap.put("reportType", ReportTypeE.MONTH.getCode());
        if (!currentOrg.getRegionCode().equals("000000")) argMap.put("orgId", currentOrg.getOrgId());
        if (StringUtils.isNotEmpty(templateId)) argMap.put("templateId", templateId);
        if (StringUtils.isNotEmpty(period)) {
            String d = period.replace(",", "-") + "-01";
            argMap.put("beginTime", DateUtil.StringToString(d, DateStyle.YYYY_MM_DD));
        }
        if (status != null) argMap.put("status", status);
        PageInfo<ReportDto> pageInfo = iReportService.selectByPageByArg(argMap, pageNum, pageSize);
        return ResponseUtil.success(PageConvertUtil.grid(pageInfo));
    }
}
