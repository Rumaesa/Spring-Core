package com.nt.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.comps.Flipkart;
import com.nt.config.AppConfig;


public class StrategyDPTest {

	public static void main(String[] args) {
	   //  create the IOC container
		  AnnotationConfigApplicationContext ctx=
				   new AnnotationConfigApplicationContext(AppConfig.class);
		  //get Target spring bean class obj
		  Flipkart fpkt=ctx.getBean("fpkt",Flipkart.class);
		  // invoke the B.methods
		  String resultMsg=fpkt.shopping(new String[] {"shirt","trouser"}, new float[] {60000.0f,70000.0f });
		  System.out.println(resultMsg);
		  
		  //close the container
		   ctx.close();

	}

}
