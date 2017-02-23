package com.topie.animal.api;

import com.github.pagehelper.PageInfo;
import com.topie.animal.service.INewsService;
import com.topie.common.utils.PageConvertUtil;
import com.topie.common.utils.ResponseUtil;
import com.topie.common.utils.Result;
import com.topie.common.utils.UUIDUtil;
import com.topie.database.core.animal.model.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by chenguojun on 2017/2/16.
 */
@Controller
@RequestMapping("/api/animal/news")
public class NewsController {

    @Autowired
    private INewsService iNewsService;

    @RequestMapping(value = "/pageList", method = RequestMethod.GET)
    @ResponseBody
    public Result pageList(News news,
            @RequestParam(value = "pageNum", required = false, defaultValue = "1") int pageNum,
            @RequestParam(value = "pageSize", required = false, defaultValue = "15") int pageSize) {
        PageInfo<News> pageInfo = iNewsService.selectByPage(news, pageNum, pageSize);
        return ResponseUtil.success(PageConvertUtil.grid(pageInfo));
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ResponseBody
    public Result insert(News news) {
        news.setNewId(UUIDUtil.getUUID());
        int result = iNewsService.saveNotNull(news);
        return result > 0 ? ResponseUtil.success() : ResponseUtil.error();
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public Result update(News news) {
        iNewsService.updateNotNull(news);
        return ResponseUtil.success();
    }

    @RequestMapping(value = "/load/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Result load(@PathVariable(value = "id") String id) {
        News news = iNewsService.selectByKey(id);
        return ResponseUtil.success(news);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public Result delete(@RequestParam(value = "id") String id) {
        iNewsService.delete(id);
        return ResponseUtil.success();
    }

}
