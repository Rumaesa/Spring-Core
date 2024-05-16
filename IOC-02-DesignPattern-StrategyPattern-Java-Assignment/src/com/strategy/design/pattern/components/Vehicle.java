package com.strategy.design.pattern.components;

public final class Vehicle {
	
//	HAS-A property
	private Engine engine;
	
//	Setting Engine based on the users choice
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
//	Business Method:
	public String journey(String startLocation, String endLocation) {
		String engineChosen = engine.chooseEngine();
		return engineChosen + " will be used to travel from " + startLocation + " to " + endLocation + ".";
	}

}
