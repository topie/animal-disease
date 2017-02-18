package com.topie.database.core.animald.dao;

import com.topie.common.utils.TreeNode;
import com.topie.database.core.animald.model.OrgInfo;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface OrgInfoMapper extends Mapper<OrgInfo> {

    List<TreeNode> selectTreeNodes(OrgInfo orgInfo);
}
