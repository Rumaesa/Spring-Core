package com.strategy.design.pattern.factory;

import com.strategy.design.pattern.components.Diesel;
import com.strategy.design.pattern.components.Electric;
import com.strategy.design.pattern.components.Engine;
import com.strategy.design.pattern.components.Petrol;
import com.strategy.design.pattern.components.Vehicle;

public final class EngineFactory {
	
//	Factory Method: Generating Engine Implementation Object based on the users choice.
	public static Vehicle getInstance(String engineChoice) {
		
		Engine engine = null;
		if(engineChoice.equalsIgnoreCase("petrol"))
			engine = new Petrol();
		else if(engineChoice.equalsIgnoreCase("electric"))
			engine = new Electric();
		else if(engineChoice.equalsIgnoreCase("diesel"))
			engine = new Diesel();
		else 
			throw new IllegalArgumentException("Invalid engine choice!");
		
//		Creating target class object.
		Vehicle vehicle = new Vehicle();
//		Injecting dependent object to target.
		vehicle.setEngine(engine);
		
//		Returning Target Object.
		return vehicle;
		
	}
	
}
