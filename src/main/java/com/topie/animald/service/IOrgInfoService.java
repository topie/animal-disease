package com.topie.animald.service;

import com.github.pagehelper.PageInfo;
import com.topie.common.service.IService;
import com.topie.common.utils.TreeNode;
import com.topie.database.core.animald.model.OrgInfo;

import java.util.List;

/**
 * Created by chenguojun on 2017/2/16.
 */
public interface IOrgInfoService extends IService<OrgInfo> {

    PageInfo<OrgInfo> selectByPage(OrgInfo userInfo, int pageNum, int pageSize);

    List<TreeNode> selectTreeNodes(OrgInfo orgInfo);
}
