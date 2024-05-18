package com.spring.bean.life.cycle.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.bean.life.cycle.beans.CheckingVoterEligibility;
import com.spring.bean.life.cycle.config.AppConfig;

public class SpringBeanLifeCycleTest {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		CheckingVoterEligibility checkingVoterEligibility = ctx.getBean("checkingVoterEligibility",CheckingVoterEligibility.class);
		String voterResult = checkingVoterEligibility.checkingEligibility();
		System.out.println(voterResult);

		
//		Minus age Handle
//		Date null aari hai
		ctx.close();
	}

}
