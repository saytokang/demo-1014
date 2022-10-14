package com.example.demojdbc.config;

import javax.activation.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demojdbc.service.MemberService;

@Configuration
public class BeanConfig {
    
    @Bean
    public MemberService memberService() {
        return new MemberService();
    }
}
