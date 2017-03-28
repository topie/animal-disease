package com.topie.common.handler;

import com.topie.common.exception.BusinessException;
import com.topie.common.utils.ResponseUtil;
import com.topie.common.utils.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

/**
 * 工程：os-app 创建人 : ChenGJ 创建时间： 2015/9/6 说明：
 */
@ControllerAdvice
public class ControllerExceptionHandler {

    private final static Logger logger = LoggerFactory.getLogger(ControllerExceptionHandler.class);

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result handleAllException(Exception e) {
        if (e instanceof BusinessException) {
            logger.error(e.getMessage());
        } else {
            e.printStackTrace();
        }
        return ResponseUtil.error(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "服务器内部错误");
    }
}
