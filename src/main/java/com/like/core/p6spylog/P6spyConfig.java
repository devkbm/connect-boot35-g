package com.like.core.p6spylog;

import jakarta.annotation.PostConstruct;

import org.springframework.context.annotation.Configuration;

import com.p6spy.engine.spy.P6SpyOptions;

// https://github.com/gavlyukovskiy/spring-boot-data-source-decorator

@Configuration
public class P6spyConfig {

	@PostConstruct
    public void setLogMessageFormat() {
        P6SpyOptions.getActiveInstance().setLogMessageFormat(P6spyPrettySqlFormatter.class.getName());               
    }   
}
