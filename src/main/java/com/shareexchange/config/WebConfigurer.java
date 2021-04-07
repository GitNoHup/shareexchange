package com.shareexchange.config;

import com.shareexchange.intercept.AuthLoginIntercept;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

@Configuration
public class WebConfigurer implements WebMvcConfigurer {

    @Resource
    private ApplicationContext context;

    @Resource
    private AuthLoginIntercept authLoginIntercept;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(authLoginIntercept);
    }
}
