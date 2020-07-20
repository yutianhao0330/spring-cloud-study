package com.yutianhao.scgoodsprovider2.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * web相关配置
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {
    //日志对象
    private Logger logger = LoggerFactory.getLogger(WebConfig.class);

    /**
     * 统一跨域访问配置
     * @param registry
     */
    /*@Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
            .allowedOrigins("*")
            .allowedMethods("*")
            .maxAge(3600)
            .allowCredentials(true);
    }*/
}
