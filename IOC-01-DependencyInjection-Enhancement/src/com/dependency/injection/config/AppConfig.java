package com.dependency.injection.config;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.dependency.injection.sbeans")
public class AppConfig {
	
	public AppConfig() {
		System.out.println("AppConfig.AppConfig() : 0-Parameter Constructor");
	}

	@Bean(name="dt")
	public LocalDateTime createLdt() {
		System.out.println("AppConfig.createLdt()");
		return LocalDateTime.now();
	}
	
	@Bean(name="ct")
	public Date createTime() {
		System.out.println("AppConfig.createTime()");
		return new Date();
	}
	
}
