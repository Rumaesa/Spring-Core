package com.dependency.lookup.sbeans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
//@Lazy(true)
public class Cricketer implements ApplicationContextAware{

	ApplicationContext ctx;
	
	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		this.ctx = ctx;
		System.out.println("Cricketer.setApplicationContext() :: - Instead of creating a new Container .... Using the Already created IOC Container....");
	}
	
	public Cricketer(){
	System.out.println("Cricketer.Cricketer() :: 0 - Param Constructor");
	}
	
	public void balling() {
		System.out.println("Cricketer is Balling");
	}
	
	public void fielding() {
		System.out.println("Cricketer is Fielding");
	}
	
	public void batting() {
//		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(CricketBat.class);
		CricketBat cricketBat= ctx.getBean("cricketBat", CricketBat.class);
		int runs = cricketBat.scoreRun();
		System.out.println("Cricketer have made "+runs+" runs.");
		
		
	}
}
