//package com.rentabuddy.backend.config;
//
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//public class WebMvcConfig implements WebMvcConfigurer {
//
//    @Override
//    public void addCorsMappings(CorsRegistry registry) {
//        registry.addMapping("/**")
//                .allowedOrigins("https://rent-a-buddy.vercel.app/")
//                .allowedMethods("GET, POST, PUT, DELETE, OPTIONS");
//    }
//}