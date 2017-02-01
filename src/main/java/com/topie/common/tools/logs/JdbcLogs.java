package com.topie.common.tools.logs;

import com.topie.system.service.ILogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by chenguojun on 2017/3/5.
 */
@Component
public class JdbcLogs {

    @Autowired
    private ILogService iLogService;

}
