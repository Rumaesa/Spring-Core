package com.dependency.lookup.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dependency.lookup.config.AppConfig;
import com.dependency.lookup.sbeans.MobilePhone;

public class DependencyLookupTest {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		MobilePhone mobilePhone = ctx.getBean("mobilePhone",MobilePhone.class);
		mobilePhone.camera();
		mobilePhone.display();
		mobilePhone.chargerCapacity();
		System.out.println("______________________________________");
		mobilePhone.camera();
		mobilePhone.display();
		mobilePhone.chargerCapacity();
		
		ctx.close();
	}

}
