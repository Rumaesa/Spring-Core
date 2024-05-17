package com.properties.file.client;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.properties.file.config.AppConfig;

public class I18Test {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Language Code:: ");
		String language = sc.next();
		System.out.println("Enter the Country Code:: ");
		String country = sc.next();
		
		Locale locale = new Locale(language,country);
		String welcomeMsg = ctx.getMessage("welcome.msg", new Object[] {"Rumi"}, locale);
		String goodbyeMsg = ctx.getMessage("goodbye.msg", new Object[] {}, locale);
		String applicationTitle = ctx.getMessage("application.title", new Object[] {}, locale);
		String wishMsg = ctx.getMessage("wish.msg", new Object[] {}, locale);
		
		System.out.println(welcomeMsg + "....." + goodbyeMsg + "....." + applicationTitle + "....." + wishMsg);

		
	}

}
