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
        logger.info("Testing CORS with wildcard");
        registry.addMapping("/**")
                .allowedOrigins("*") // Temporary, insecure test
                .allowedMethods("GET", "OPTIONS")
                .allowedHeaders("*");
    }
}