package com.pmm.pickmymenu_back.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ReactConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://hhjnn92.synology.me:7051",
                                "https://hhjnn92.synology.me:7061",
                                "https://pmm.hhjnn92.synology.me",
                                "https://pmm.hhjnn92.synology.me:443",
                                "https://pickmymenu.shop",
                                "https://pickmymenu.duckdns.org",
                                "http://localhost:3000") // React 앱의 URL
                .allowedMethods("GET", "POST", "PUT", "DELETE")
                .allowCredentials(true); // 인증 정보 사용 가능

    }
}