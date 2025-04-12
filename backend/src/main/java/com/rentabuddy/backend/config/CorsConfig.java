package com.rentabuddy.backend.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Configuration
public class CorsConfig implements WebMvcConfigurer {
    private static final Logger logger = LoggerFactory.getLogger(CorsConfig.class);

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        logger.info("CORS configuration applied for origins: https://www.rent-a-buddy.vercel.app, http://localhost:3000");
        registry.addMapping("/**")
                .allowedOrigins("https://www.rent-a-buddy.vercel.app", "http://localhost:3000", "https://rent-a-buddy-tkqnlbl5e-jay-sagars-projects.vercel.app/", "https://rent-a-buddy-jay-sagars-projects.vercel.app/")
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                .allowedHeaders("*")
                .allowCredentials(true);
    }
}   