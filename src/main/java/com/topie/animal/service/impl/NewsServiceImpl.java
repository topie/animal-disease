package com.topie.animal.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.topie.animal.service.INewsService;
import com.topie.common.service.impl.BaseService;
import com.topie.database.core.animal.dao.NewsMapper;
import com.topie.database.core.animal.model.News;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * Created by chenguojun on 2017/2/16.
 */
@Service
public class NewsServiceImpl extends BaseService<News> implements INewsService {

    @Autowired
    private NewsMapper newsMapper;

    @Override
    public PageInfo<News> selectByPage(News news, int pageNum, int pageSize) {
        Example example = new Example(News.class);
        Example.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotEmpty(news.getNewTitle())) criteria.andLike("newTitle", '%' + news.getNewTitle() + '%');
        example.setOrderByClause("new_date desc");
        PageHelper.startPage(pageNum, pageSize);
        List<News> list = newsMapper.selectByExample(example);
        return new PageInfo<>(list);
    }

    @Override
    public int updateToIncreaseCount(String id) {
        return newsMapper.updateToIncreaseCount(id);
    }

}
