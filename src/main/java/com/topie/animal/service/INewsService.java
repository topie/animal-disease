package com.topie.animal.service;

import com.github.pagehelper.PageInfo;
import com.topie.common.service.IService;
import com.topie.common.utils.TreeNode;
import com.topie.database.core.animal.model.News;

import java.util.List;

/**
 * Created by chenguojun on 2017/2/16.
 */
public interface INewsService extends IService<News> {

    PageInfo<News> selectByPage(News userInfo, int pageNum, int pageSize);

}
