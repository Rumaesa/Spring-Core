package com.nt.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.service.BankMgmtService;

public class MethodReplacerTest {

	public static void main(String[] args) {
		//create  the IOC container
		AnnotationConfigApplicationContext  ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		//get target spring bean class obj ref
		BankMgmtService  service=ctx.getBean("bankService",BankMgmtService.class);
		System.out.println("proxy obj class ::"+service.getClass()+"......"+service.getClass().getSuperclass());
		//invoke b.method
		try {
			double amount=service.calculateIntrestAmount(100000.0, 2.0, 12.0);
			System.out.println("The Intrest amount is ::"+amount);
		}
		catch(Exception e) {
			e.printStackTrace();
		}

		//close the container
		  ctx.close();
	}//main

}//class
