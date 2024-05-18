package com.dependency.lookup.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dependency.lookup.config.AppConfig;
import com.dependency.lookup.sbeans.Cricketer;

public class DependencyLookupTest {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Cricketer cricketer = ctx.getBean("cricketer",Cricketer.class);
		cricketer.balling();
		cricketer.batting();
		cricketer.fielding();
	}

}
