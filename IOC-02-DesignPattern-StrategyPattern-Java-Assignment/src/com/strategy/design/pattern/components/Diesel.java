package com.strategy.design.pattern.components;

public final class Diesel implements Engine{

	@Override
	public String chooseEngine() {
		
		return "Diesel Engine";
	}

}
