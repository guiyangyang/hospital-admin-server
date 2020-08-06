package com.space.alzheimer.common.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @ClassName MyWebAppConfigurer
 * @Description: TODO
 * @Author ljh
 * @Date 2020/5/23
 **/
@Configuration
public class MyWebAppConfigurer implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/uploadPic/**").addResourceLocations("file:D:/aaaa/");
        registry.addResourceHandler("/uploadPic/**").addResourceLocations("file:/project/uploadPic/");
    }
}
