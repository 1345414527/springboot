package com.atguigu.springboot04webrestfulcrud.component;

import org.springframework.web.servlet.LocaleResolver;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * 可以再连接上携带区域信息
 */
public class MyLocaleResolver implements LocaleResolver {

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {

    }

    @Override
    public Locale resolveLocale(HttpServletRequest httpServletRequest) {
        String l=httpServletRequest.getParameter("l");
        Locale locale=Locale.getDefault();
        if(!StringUtils.isEmpty(l)){
            String[] split=l.split("_");
            locale=new Locale(split[0],split[1]);
        }
            return locale;


        }
}