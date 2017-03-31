package com.topie.system.api.common;

import com.topie.common.tools.cache.RedisCache;
import com.topie.common.tools.captcha.service.Captcha;
import com.topie.common.tools.captcha.utils.ImageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by chenguojun on 8/31/16.
 */
@Controller
@RequestMapping("/api/noneAuth")
public class NoneAuthController {

    @Autowired
    private RedisCache redisCache;

    @RequestMapping("/captcha")
    public void captcha(@RequestParam("vkey") String vkey, HttpServletRequest httpServletRequest,
            HttpServletResponse httpServletResponse) throws IOException {
        Captcha captcha = ImageUtils.getCaptcha(httpServletResponse);
        redisCache.set("animal_vkey_" + vkey, captcha.getChallenge(), 120);
        System.out.println(captcha.getChallenge());
    }
}
