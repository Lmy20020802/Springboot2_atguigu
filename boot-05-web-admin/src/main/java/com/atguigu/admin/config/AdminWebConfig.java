package com.atguigu.admin.config;

import com.atguigu.admin.interceptor.Logininterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @ClassName AdminWebConfig
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/20 11:38
 **/
//@EnableWebMvc
@Configuration
public class AdminWebConfig implements WebMvcConfigurer {

//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/aa/**")
//                .addResourceLocations("classpath:/static/");
//
//    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new Logininterceptor()).addPathPatterns("/**") //所有请求都被拦截包括静态资源
                .excludePathPatterns("/","/login","/css/**","/fonts/**","/images/**","/js/**","/sql/city"); //放行的请求
    }
}
