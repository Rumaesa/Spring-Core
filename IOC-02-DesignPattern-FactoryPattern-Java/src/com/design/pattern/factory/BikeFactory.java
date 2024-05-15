package com.design.pattern.factory;

import com.design.pattern.entity.Bike;
import com.design.pattern.entity.ElectricBike;
import com.design.pattern.entity.LuxuyBike;
import com.design.pattern.entity.SportsBike;
import com.design.pattern.entity.StandardBike;

public class BikeFactory {

	public static Bike manufacturing(String bike) {
		
		if(bike.equalsIgnoreCase("standard"))
			return new StandardBike();
		else if(bike.equalsIgnoreCase("luxury"))
			return new LuxuyBike();
		else if(bike.equalsIgnoreCase("electric"))
			return new ElectricBike();
		else if(bike.equalsIgnoreCase("sports"))
			return new SportsBike();
		else
			throw new IllegalArgumentException("Invalid Input");
	}
	
}
