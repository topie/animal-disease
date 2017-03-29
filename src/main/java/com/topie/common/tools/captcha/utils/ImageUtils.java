package com.topie.common.tools.captcha.utils;

import com.topie.common.tools.captcha.background.SingleColorBackgroundFactory;
import com.topie.common.tools.captcha.color.SingleColorFactory;
import com.topie.common.tools.captcha.filter.predefined.CurvesRippleFilterFactory;
import com.topie.common.tools.captcha.service.Captcha;
import com.topie.common.tools.captcha.service.ConfigurableCaptchaService;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.io.IOException;

/**
 * Created by cgj on 2016/4/11.
 */
public class ImageUtils {

    public static Captcha getCaptcha(HttpServletResponse response) throws IOException {
        response.setHeader("Pragma", "No-cache");
        response.setHeader("Cache-Control", "No-cache");
        response.setDateHeader("Expires", 0);
        response.setContentType("image/jpeg");
        ConfigurableCaptchaService cs = new ConfigurableCaptchaService();
        cs.setColorFactory(new SingleColorFactory(new Color(25, 60, 170)));
        cs.setFilterFactory(new CurvesRippleFilterFactory(cs.getColorFactory()));
        cs.setBackgroundFactory(new SingleColorBackgroundFactory(new Color(221, 227, 236)));
        Captcha captcha = cs.getCaptcha();
        ImageIO.write(captcha.getImage(), "png", response.getOutputStream());
        return captcha;
    }
}
