package com.properties.file.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import com.properties.file.config.AppConfig;
import com.properties.file.sbeans.Person;

public class PropertiesTest {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Person person = ctx.getBean("person", Person.class);
		
		String personInfo = person.toString();
		System.out.println(personInfo);
		
		Environment env = ctx.getEnvironment();
		System.out.println("os.name :: "+env.getProperty("os.name"));
		
		ctx.close();
	}

}
