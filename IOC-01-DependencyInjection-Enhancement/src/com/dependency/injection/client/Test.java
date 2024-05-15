package com.dependency.injection.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dependency.injection.config.AppConfig;
import com.dependency.injection.sbeans.WishMessageGenerator;

public class Test {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		WishMessageGenerator wishMessageGenerator= ctx.getBean("wmg", WishMessageGenerator.class);
		String wishMessage = wishMessageGenerator.showWishMessage("Rumi");
		System.out.println(wishMessage);
	}

}
