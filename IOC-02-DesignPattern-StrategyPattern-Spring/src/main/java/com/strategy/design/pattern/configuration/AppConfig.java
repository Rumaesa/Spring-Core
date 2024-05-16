package com.strategy.design.pattern.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


// Configuration Class
@Configuration
@ComponentScan(basePackages = "com.strategy.design.pattern.sbeans")
public class AppConfig {

//	Will Create a bean for this class and also it will scan for the @Component annotation 
//	in "com.strategy.design.pattern.sbeans" package and create a bean for all the classes 
//	that are configured with the @Component annotation.
	
}
