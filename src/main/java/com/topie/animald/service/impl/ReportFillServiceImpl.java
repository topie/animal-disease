package com.topie.animald.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.topie.animald.service.IReportFillService;
import com.topie.common.service.impl.BaseService;
import com.topie.common.tools.freemarker.FreeMarkerUtil;
import com.topie.common.utils.TreeNode;
import com.topie.database.core.animald.dao.*;
import com.topie.database.core.animald.model.OrgInfo;
import com.topie.database.core.animald.model.Report;
import com.topie.database.core.animald.model.ReportFill;
import com.topie.database.core.animald.model.UserInfo;
import com.topie.database.core.template.dao.LivestockInOutMapper;
import com.topie.database.core.template.model.LivestockInOut;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by chenguojun on 2017/2/16.
 */
@Service
public class ReportFillServiceImpl extends BaseService<ReportFill> implements IReportFillService {

    @Autowired
    private ReportFillMapper reportFillMapper;

    @Autowired
    private ReportMapper reportMapper;

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Autowired
    private OrgInfoMapper orgInfoMapper;

    @Autowired
    private AnimalDiseaseMapper animalDiseaseMapper;

    @Autowired
    private LivestockInOutMapper livestockInOutMapper;

    @Override
    public PageInfo<ReportFill> selectByPage(ReportFill reportFill, int pageNum, int pageSize) {
        Example example = new Example(ReportFill.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andLike("displayTitle", '%' + reportFill.getDisplayTitle() + '%');
        PageHelper.startPage(pageNum, pageSize);
        List<ReportFill> list = reportFillMapper.selectByExample(example);
        return new PageInfo<>(list);
    }

    @Override
    public List<TreeNode> selectTreeNodes(ReportFill reportFill) {
        return reportFillMapper.selectTreeNodes(reportFill);
    }

    @Override
    public PageInfo<ReportFill> selectNormalFillByPage(ReportFill reportFill, int pageNum, int pageSize) {
        Example example = new Example(ReportFill.class);
        Example.Criteria criteria = example.createCriteria();
        Date now = new Date();
        criteria.andLessThanOrEqualTo("startTime", now);
        criteria.andGreaterThan("endTime", now);
        criteria.andLike("displayTitle", '%' + reportFill.getDisplayTitle() + '%');
        PageHelper.startPage(pageNum, pageSize);
        List<ReportFill> list = reportFillMapper.selectByExample(example);
        return new PageInfo<>(list);
    }

    @Override
    public String getNormalFillHtml(HttpServletRequest request, ReportFill reportFill, Integer userId) {
        Report report = reportMapper.selectByPrimaryKey(reportFill.getReportId());
        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(userId);
        Map params = new HashMap();
        params.put("fill", reportFill);
        params.put("user", userInfo);
        OrgInfo orgInfo = orgInfoMapper.selectByPrimaryKey(userInfo.getOrgId());
        params.put("org", orgInfo);
        switch (report.getTableName()) {
            case "d_livestock_in_out": {
                LivestockInOut livestockInOut = livestockInOutMapper
                        .selectOneByFillIdAndOrgId(reportFill.getId(), userInfo.getOrgId());
                if (livestockInOut == null) {
                    livestockInOut = new LivestockInOut();
                }
                params.put("item", livestockInOut);
                break;
            }
            default:
                break;
        }
        String templatePath = request.getSession().getServletContext().getRealPath("/template");
        return FreeMarkerUtil.getHtmlStringFromTemplate(templatePath, report.getReportTemplateName(), params);
    }

    @Override
    public int insertOrUpdateNormalFill(String data, ReportFill reportFill, Integer userId) {
        JSONObject jsonObj = JSONObject.fromObject(data);
        Report report = reportMapper.selectByPrimaryKey(reportFill.getReportId());
        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(userId);
        switch (report.getTableName()) {
            case "d_livestock_in_out": {
                LivestockInOut livestockInOut = (LivestockInOut) JSONObject.toBean(jsonObj, LivestockInOut.class);
                livestockInOut.setFillId(reportFill.getId());
                livestockInOut.setUserId(userId);
                livestockInOut.setOrgId(userInfo.getOrgId());
                livestockInOut.setLivestockDate(new Date());
                livestockInOutMapper.deleteByFillIdAndOrgId(reportFill.getId(), userInfo.getOrgId());
                livestockInOutMapper.insertSelective(livestockInOut);
                break;
            }
            default:
                break;
        }
        return 1;
    }
}
