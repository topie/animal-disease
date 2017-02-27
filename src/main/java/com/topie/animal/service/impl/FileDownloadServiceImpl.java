package com.topie.animal.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.topie.animal.service.IFileDownloadService;
import com.topie.common.service.impl.BaseService;
import com.topie.database.core.template.dao.FileDownloadMapper;
import com.topie.database.core.template.model.FileDownload;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * Created by chenguojun on 2017/2/27.
 */
@Service
public class FileDownloadServiceImpl extends BaseService<FileDownload> implements IFileDownloadService {

    @Autowired
    private FileDownloadMapper fileDownloadMapper;

    @Override
    public PageInfo<FileDownload> selectByPage(FileDownload fileDownload, int pageNum, int pageSize) {
        Example example = new Example(FileDownload.class);
        Example.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotEmpty(fileDownload.getFilename()))
            criteria.andLike("filename", '%' + fileDownload.getFilename() + '%');
        example.setOrderByClause("FileTime desc");
        PageHelper.startPage(pageNum, pageSize);
        List<FileDownload> list = fileDownloadMapper.selectByExample(example);
        return new PageInfo<>(list);
    }
}
