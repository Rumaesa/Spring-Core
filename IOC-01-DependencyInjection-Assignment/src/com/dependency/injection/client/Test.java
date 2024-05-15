package com.dependency.injection.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dependency.injection.config.AppConfig;
import com.dependency.injection.sbeans.SeasonFinder;

public class Test {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		SeasonFinder seasonFinder= ctx.getBean("sf", SeasonFinder.class);
		String message = seasonFinder.findSeason("Rumi");
		System.out.println(message);
	}

}
