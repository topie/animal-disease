package com.topie.animal.api;

import com.github.pagehelper.PageInfo;
import com.topie.animal.service.IWeekConfigService;
import com.topie.common.utils.PageConvertUtil;
import com.topie.common.utils.ResponseUtil;
import com.topie.common.utils.Result;
import com.topie.common.utils.UUIDUtil;
import com.topie.database.core.animal.model.WeekConfig;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by chenguojun on 2017/3/15.
 */
@Controller
@RequestMapping("/api/animal/weekConfig")
public class WeekConfigController {

    @Autowired
    private IWeekConfigService iWeekConfigService;

    @RequestMapping(value = "/pageList", method = RequestMethod.GET)
    @ResponseBody
    public Result pageList(WeekConfig weekConfig,
            @RequestParam(value = "pageNum", required = false, defaultValue = "1") int pageNum,
            @RequestParam(value = "pageSize", required = false, defaultValue = "15") int pageSize) {
        PageInfo<WeekConfig> pageInfo = iWeekConfigService.selectByPage(weekConfig, pageNum, pageSize);
        return ResponseUtil.success(PageConvertUtil.grid(pageInfo));
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ResponseBody
    public Result insert(WeekConfig weekConfig) {
        weekConfig.setId(UUIDUtil.getUUID());
        weekConfig.setTime(weekConfig.getPart1() + ";" + weekConfig.getPart2());
        int result = iWeekConfigService.saveNotNull(weekConfig);
        return result > 0 ? ResponseUtil.success() : ResponseUtil.error();
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public Result update(WeekConfig weekConfig) {
        weekConfig.setTime(weekConfig.getPart1() + ";" + weekConfig.getPart2());
        iWeekConfigService.updateNotNull(weekConfig);
        return ResponseUtil.success();
    }

    @RequestMapping(value = "/load/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result load(@PathVariable(value = "id") String id) {
        WeekConfig weekConfig = iWeekConfigService.selectByKey(id);
        String time = weekConfig.getTime();
        if (StringUtils.isNotEmpty(time)) {
            weekConfig.setPart1(time.split(";")[0]);
            weekConfig.setPart2(time.split(";")[1]);
        }
        return ResponseUtil.success(weekConfig);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public Result delete(@RequestParam(value = "id") String id) {
        iWeekConfigService.delete(id);
        return ResponseUtil.success();
    }
}
