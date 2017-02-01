package com.topie.animal.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.topie.animal.dto.ReReportDto;
import com.topie.animal.service.IReReportService;
import com.topie.animal.service.IReportService;
import com.topie.animal.util.PeriodUtil;
import com.topie.common.service.impl.BaseService;
import com.topie.database.core.animal.dao.ReReportMapper;
import com.topie.database.core.animal.dao.WeekConfigMapper;
import com.topie.database.core.animal.model.ReReport;
import com.topie.database.core.animal.model.Report;
import com.topie.database.core.animal.model.WeekConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by chenguojun on 2017/2/16.
 */
@Service
public class ReReportServiceImpl extends BaseService<ReReport> implements IReReportService {

    @Autowired
    private ReReportMapper reReportMapper;

    @Autowired
    private WeekConfigMapper weekConfigMapper;

    @Autowired
    private IReportService iReportService;

    @Override
    public PageInfo<ReReportDto> selectByPage(ReReportDto reReport, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<ReReportDto> list = reReportMapper.selectByReReportDto(reReport);
        Map<String, String> weekConfigMap = new HashMap();
        List<WeekConfig> weekConfigs = weekConfigMapper.selectAll();
        for (WeekConfig weekConfig : weekConfigs) {
            weekConfigMap.put(weekConfig.getYear() + "#" + weekConfig.getType(), weekConfig.getTime());
        }
        for (ReReportDto reReportDto : list) {
            reReportDto.setReportPeriod(
                    PeriodUtil.build(reReportDto.getReportType(), reReportDto.getBeginTime(), weekConfigMap));
            Report report = iReportService
                    .selectOneByOrgIdAndTemplateIdAndBeginTime(reReportDto.getOrgId(), reReportDto.getTemplateId(),
                            reReportDto.getBeginTime());
            if(report!=null){
                reReportDto.setReportStatus(report.getStatus());
                reReportDto.setReportId(report.getReportId());
            }
        }
        return new PageInfo<>(list);
    }

    @Override
    public int updateToClose(String id) {
        return reReportMapper.updateToClose(id);
    }

}
