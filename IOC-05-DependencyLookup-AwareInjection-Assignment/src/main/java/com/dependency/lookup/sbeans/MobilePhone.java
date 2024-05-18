package com.dependency.lookup.sbeans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;


//This will be the Target Class
@Component("mobilePhone")
public class MobilePhone implements ApplicationContextAware {
	
	ApplicationContext applicationContext;
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
		
	}
	
//	Default Constructor:
	public MobilePhone() {
		System.out.println("MobilePhone.MobilePhone():: 0 - Param Constructor");
	}

	
	public void camera() {
		System.out.println("Mobile is having 25 Mega pixel Camera");
	}
	
	public void display() {
		System.out.println("Mobile is having Amoled Display");
	}
	
	public void chargerCapacity() {
		MobileCharger mobileCharger =  applicationContext.getBean("mobileCharger", MobileCharger.class);
		String chargerCapacity =  mobileCharger.chargerCapacity();
		System.out.println("Mobile uses "+ chargerCapacity + " charger");
	}

	

}
