package com.strategy.design.pattern.factory;

import com.strategy.design.pattern.components.BlueDart;
import com.strategy.design.pattern.components.Courier;
import com.strategy.design.pattern.components.DTDC;
import com.strategy.design.pattern.components.Flipkart;

public final class FlipkarFactory {

//	Factory Method
	public static Flipkart getInstance(String courierType) {
		
//		Creating Courier object, as per the input will create courier object.
		Courier courier = null;
		
//		Based on the input creating courier object.
		if(courierType.equalsIgnoreCase("DTDC"))
			courier =new  DTDC();
		else if(courierType.equalsIgnoreCase("BlueDart"))
			courier = new BlueDart();
		else 
			throw new IllegalArgumentException("Invalid courier type!");
		
//		Dependency Injection: Creating flipkart object so that we can set the courier type.
//		Assigning courier type (dependent class object) to the Flipkart (target class object)
		Flipkart flipkart = new Flipkart();
		flipkart.setCourier(courier);
		
		return flipkart;
	}
	
}
