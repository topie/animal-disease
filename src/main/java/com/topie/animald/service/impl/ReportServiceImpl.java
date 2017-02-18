package com.topie.animald.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.topie.animald.service.IReportService;
import com.topie.common.service.impl.BaseService;
import com.topie.common.utils.TreeNode;
import com.topie.database.core.animald.dao.ReportMapper;
import com.topie.database.core.animald.model.Report;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * Created by chenguojun on 2017/2/16.
 */
@Service
public class ReportServiceImpl extends BaseService<Report> implements IReportService {

    @Autowired
    private ReportMapper reportMapper;

    @Override
    public PageInfo<Report> selectByPage(Report report, int pageNum, int pageSize) {
        Example example = new Example(Report.class);
        Example.Criteria criteria = example.createCriteria();
        criteria.andLike("reportName", '%' + report.getReportName() + '%');
        PageHelper.startPage(pageNum, pageSize);
        List<Report> list = reportMapper.selectByExample(example);
        return new PageInfo<>(list);
    }

    @Override
    public List<TreeNode> selectTreeNodes(Report report) {
        return reportMapper.selectTreeNodes(report);
    }
}
