package com.topie.animald.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.topie.animald.service.INormalFillService;
import com.topie.common.service.impl.BaseService;
import com.topie.common.tools.freemarker.FreeMarkerUtil;
import com.topie.common.utils.TreeNode;
import com.topie.database.core.animald.dao.*;
import com.topie.database.core.animald.model.NormalFill;
import com.topie.database.core.animald.model.OrgInfo;
import com.topie.database.core.animald.model.Report;
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
public class NormalFillServiceImpl extends BaseService<NormalFill> implements INormalFillService {

    @Autowired
    private NormalFillMapper normalFillMapper;

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
    public PageInfo<NormalFill> selectByPage(NormalFill normalFill, int pageNum, int pageSize) {
        Example example = new Example(NormalFill.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andLike("displayTitle", '%' + normalFill.getDisplayTitle() + '%');
        PageHelper.startPage(pageNum, pageSize);
        List<NormalFill> list = normalFillMapper.selectByExample(example);
        return new PageInfo<>(list);
    }

    @Override
    public List<TreeNode> selectTreeNodes(NormalFill normalFill) {
        return normalFillMapper.selectTreeNodes(normalFill);
    }

    @Override
    public PageInfo<NormalFill> selectNormalFillByPage(NormalFill normalFill, int pageNum, int pageSize) {
        Example example = new Example(NormalFill.class);
        Example.Criteria criteria = example.createCriteria();
        Date now = new Date();
        criteria.andLessThanOrEqualTo("startTime", now);
        criteria.andGreaterThan("endTime", now);
        criteria.andLike("displayTitle", '%' + normalFill.getDisplayTitle() + '%');
        PageHelper.startPage(pageNum, pageSize);
        List<NormalFill> list = normalFillMapper.selectByExample(example);
        return new PageInfo<>(list);
    }

    @Override
    public String getNormalFillHtml(HttpServletRequest request, NormalFill normalFill, Integer userId) {
        Report report = reportMapper.selectByPrimaryKey(normalFill.getReportId());
        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(userId);
        Map params = new HashMap();
        params.put("fill", normalFill);
        params.put("user", userInfo);
        OrgInfo orgInfo = orgInfoMapper.selectByPrimaryKey(userInfo.getOrgId());
        params.put("org", orgInfo);
        switch (report.getTableName()) {
            case "d_livestock_in_out": {
                LivestockInOut livestockInOut = livestockInOutMapper
                        .selectOneByFillIdAndOrgId(normalFill.getId(), userInfo.getOrgId());
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
    public int insertOrUpdateNormalFill(String data, NormalFill normalFill, Integer userId) {
        JSONObject jsonObj = JSONObject.fromObject(data);
        Report report = reportMapper.selectByPrimaryKey(normalFill.getReportId());
        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(userId);
        switch (report.getTableName()) {
            case "d_livestock_in_out": {
                LivestockInOut livestockInOut = (LivestockInOut) JSONObject.toBean(jsonObj, LivestockInOut.class);
                livestockInOut.setFillId(normalFill.getId());
                livestockInOut.setUserId(userId);
                livestockInOut.setOrgId(userInfo.getOrgId());
                OrgInfo orgInfo = orgInfoMapper.selectByPrimaryKey(userInfo.getOrgId());
                livestockInOut.setProvince(orgInfo.getOrgCode());
                livestockInOut.setLivestockDate(new Date());
                livestockInOutMapper.deleteByFillIdAndOrgId(normalFill.getId(), userInfo.getOrgId());
                livestockInOutMapper.insertSelective(livestockInOut);
                break;
            }
            default:
                break;
        }
        return 1;
    }

    @Override
    public PageInfo<NormalFill> selectSummaryByPage(NormalFill normalFill, int pageNum, int pageSize) {
        Example example = new Example(NormalFill.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andLike("displayTitle", '%' + normalFill.getDisplayTitle() + '%');
        PageHelper.startPage(pageNum, pageSize);
        List<NormalFill> list = normalFillMapper.selectByExample(example);
        return new PageInfo<>(list);
    }

    @Override
    public String getSummaryHtml(HttpServletRequest request, NormalFill normalFill) {
        Report report = reportMapper.selectByPrimaryKey(normalFill.getReportId());
        Map params = new HashMap();
        switch (report.getTableName()) {
            case "d_livestock_in_out": {
                List<LivestockInOut> list = livestockInOutMapper.selectByFillIdGroupByOrgId(normalFill.getId());
                params.put("items", list);
                LivestockInOut livestockInOut = livestockInOutMapper.selectSumByFillId(normalFill.getId());
                params.put("sum", livestockInOut);
                break;
            }
            default:
                break;
        }
        String templatePath = request.getSession().getServletContext().getRealPath("/template");
        return FreeMarkerUtil.getHtmlStringFromTemplate(templatePath, report.getSummaryTemplateName(), params);
    }
}
