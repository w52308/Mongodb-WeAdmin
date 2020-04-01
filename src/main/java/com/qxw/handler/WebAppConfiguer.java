package com.qxw.handler;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

/**
 * 拦截器注册
 *
 * @author qxw
 * @data 2018年7月17日上午10:16:32
 */
@Configuration
public class WebAppConfiguer implements WebMvcConfigurer {
    @Resource
    private LoginInterceptor loginInterceptor;
    
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //需要拦截的方法  excludePathPatterns(不需要拦截的方法)
        registry.addInterceptor(loginInterceptor).addPathPatterns("/mongo/**").excludePathPatterns("/mongo/login");
    }
    
}
