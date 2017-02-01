package com.topie.system.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.topie.common.service.impl.BaseService;
import com.topie.database.core.system.model.Log;
import com.topie.security.security.OrangeSecurityUser;
import com.topie.security.utils.SecurityUtil;
import com.topie.system.service.ILogService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;
import java.util.List;

/**
 * Created by chenguojun on 2017/3/5.
 */
@Service
public class LogServiceImpl extends BaseService<Log> implements ILogService {

    @Override
    public int insertLog(String logInfo) {
        OrangeSecurityUser user = SecurityUtil.getCurrentSecurityUser();
        if (user != null) {
            Log log = new Log();
            log.setLoginName(user.getLoginName());
            log.setLogInfo(logInfo);
            log.setLogTime(new Date());
            log.setUserName(user.getDisplayName());
            return getMapper().insertSelective(log);
        }
        return 0;
    }

    @Override
    public PageInfo<Log> selectByPage(Log log, int pageNum, int pageSize) {
        Example example = new Example(Log.class);
        Example.Criteria criteria = example.createCriteria();
        if (StringUtils.isNotEmpty(log.getLoginName())) criteria.andLike("loginName", '%' + log.getLoginName() + '%');
        if (StringUtils.isNotEmpty(log.getUserName())) criteria.andLike("userName", '%' + log.getUserName() + '%');
        example.setOrderByClause("log_time desc");
        PageHelper.startPage(pageNum, pageSize);
        List<Log> list = getMapper().selectByExample(example);
        return new PageInfo<>(list);
    }
}
