package com.jsb.amd.sales.salesforce.api.config;


import com.jsb.amd.sales.salesforce.api.permit.AuthnHandlerInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMVCConfig implements WebMvcConfigurer {

    private final AuthnHandlerInterceptor authnHandlerInterceptor;


    @Autowired
    public WebMVCConfig(AuthnHandlerInterceptor authnHandlerInterceptor) {
        this.authnHandlerInterceptor = authnHandlerInterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(authnHandlerInterceptor).order(1);
    }
}
