package com.dependency.lookup.sbeans;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component("mobileCharger")
public class MobileCharger {

//	This is the Dependent Class
	
//	Default Constructor
	public MobileCharger() {
		System.out.println("MobileCharger.MobileCharger():: 0 - Param Constructor");
	}
	
//	Business Method:
	public String chargerCapacity() {
		int volt = new Random().nextInt(150);
		return volt + " volts";
}

}
