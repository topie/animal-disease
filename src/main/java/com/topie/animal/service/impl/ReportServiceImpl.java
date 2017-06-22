package com.topie.animal.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.topie.animal.dto.ReportDto;
import com.topie.animal.service.IOrgInfoService;
import com.topie.animal.service.IReportService;
import com.topie.animal.service.ITemplateService;
import com.topie.animal.service.IUserInfoService;
import com.topie.animal.util.PeriodUtil;
import com.topie.common.service.impl.BaseService;
import com.topie.common.utils.UUIDUtil;
import com.topie.common.utils.date.DateStyle;
import com.topie.common.utils.date.DateUtil;
import com.topie.database.core.animal.dao.ReportMapper;
import com.topie.database.core.animal.dao.WeekConfigMapper;
import com.topie.database.core.animal.model.OrgInfo;
import com.topie.database.core.animal.model.Report;
import com.topie.database.core.animal.model.UserInfo;
import com.topie.database.core.animal.model.WeekConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by chenguojun on 2017/2/21.
 */
@Service
public class ReportServiceImpl extends BaseService<Report> implements IReportService {

    @Autowired
    private ReportMapper reportMapper;

    @Autowired
    private IOrgInfoService iOrgInfoService;

    @Autowired
    private IUserInfoService iUserInfoService;

    @Autowired
    private ITemplateService iTemplateService;

    @Autowired
    private WeekConfigMapper weekConfigMapper;

    @Override
    public PageInfo<ReportDto> selectByPageByArg(Map argMap, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<ReportDto> list = reportMapper.selectByPageByArg(argMap);
        List<WeekConfig> weekConfigs = weekConfigMapper.selectAll();
        Map<String, String> weekConfigMap = new HashMap();
        for (WeekConfig weekConfig : weekConfigs) {
            weekConfigMap.put(weekConfig.getYear() + "#" + weekConfig.getType(), weekConfig.getTime());
        }
        for (ReportDto reportDto : list) {
            reportDto.setReportPeriod(
                    PeriodUtil.build(reportDto.getReportType(), reportDto.getBeginTime(), weekConfigMap));
        }
        return new PageInfo<>(list);
    }

    @Override
    public List<String> selectIdsByTemplateIdAndBeginTime(String templateId, String beginTime) {
        return reportMapper.selectIdsByTemplateIdAndBeginTime(templateId, beginTime);
    }

    @Override
    public int insertReport(Integer reportType, Date beginTime) {
        List<OrgInfo> orgInfoList = iOrgInfoService.selectAll();
        List<String> userIdList = new ArrayList<>();
        for (OrgInfo orgInfo : orgInfoList) {
            if (!orgInfo.getRegionCode().equals("000000")) {
                UserInfo userInfo = iUserInfoService.selectByOrgId(orgInfo.getOrgId());
                if (userInfo != null) userIdList.add(userInfo.getUserId());
            }
        }
        List<String> templateIdList = iTemplateService.selectIdsByReportType(reportType);
        for (String templateId : templateIdList) {
            for (String reportUserId : userIdList) {
                Report report = new Report();
                report.setTemplateId(templateId);
                report.setBeginTime(beginTime);
                report.setReportUserId(reportUserId);
                List<Report> cnt = reportMapper.select(report);
                if (cnt.size() == 0) {
                    Report fR = new Report();
                    fR.setTemplateId(templateId);
                    fR.setReportType(reportType);
                    fR.setBeginTime(beginTime);
                    fR.setReportUserId(reportUserId);
                    fR.setStatus(0);
                    fR.setEndTime(DateUtil.addDay(beginTime, 9));
                    fR.setReportId(UUIDUtil.getUUID());
                    reportMapper.insertSelective(fR);
                }
            }
        }
        return 1;
    }

    @Override
    public Report selectOneByOrgIdAndTemplateIdAndBeginTime(String orgId, String templateId, Date beginTime) {
        UserInfo userInfo = iUserInfoService.selectByOrgId(orgId);
        if (userInfo == null) return null;
        Report report = new Report();
        report.setReportUserId(userInfo.getUserId());
        report.setTemplateId(templateId);
        report.setBeginTime(beginTime);
        return reportMapper.selectOne(report);
    }

    @Override
    public Report selectOneByOrgIdAndTemplateIdAndBeginTime(String orgId, String templateId, String beginTime) {
        Date bTime = DateUtil.StringToDate(beginTime, DateStyle.YYYY_MM_DD_HH_MM_SS);
        return selectOneByOrgIdAndTemplateIdAndBeginTime(orgId, templateId, bTime);
    }
}
