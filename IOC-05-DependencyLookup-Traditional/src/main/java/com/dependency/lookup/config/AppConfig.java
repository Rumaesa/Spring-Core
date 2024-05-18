package com.dependency.lookup.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.dependency.lookup.sbeans")
public class AppConfig {

}
