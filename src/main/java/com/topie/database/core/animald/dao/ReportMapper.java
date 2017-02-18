package com.topie.database.core.animald.dao;

import com.topie.common.utils.TreeNode;
import com.topie.database.core.animald.model.Report;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface ReportMapper extends Mapper<Report> {

    List<TreeNode> selectTreeNodes(Report report);
}
