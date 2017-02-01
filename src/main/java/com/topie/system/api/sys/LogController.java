package com.topie.system.api.sys;

import com.github.pagehelper.PageInfo;
import com.topie.common.utils.PageConvertUtil;
import com.topie.common.utils.ResponseUtil;
import com.topie.common.utils.Result;
import com.topie.database.core.system.model.Log;
import com.topie.system.service.ILogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by chenguojun on 2017/2/16.
 */
@Controller
@RequestMapping("/api/sys/log")
public class LogController {

    @Autowired
    private ILogService iLogService;

    @RequestMapping(value = "/pageList", method = RequestMethod.GET)
    @ResponseBody
    public Result pageList(Log log, @RequestParam(value = "pageNum", required = false, defaultValue = "1") int pageNum,
            @RequestParam(value = "pageSize", required = false, defaultValue = "15") int pageSize) {
        PageInfo<Log> pageInfo = iLogService.selectByPage(log, pageNum, pageSize);
        return ResponseUtil.success(PageConvertUtil.grid(pageInfo));
    }

    @RequestMapping(value = "/load/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result load(@PathVariable(value = "id") String id) {
        Log log = iLogService.selectByKey(id);
        return ResponseUtil.success(log);
    }

}
