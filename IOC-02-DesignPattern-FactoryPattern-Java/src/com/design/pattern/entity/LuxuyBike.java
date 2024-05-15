package com.design.pattern.entity;

public class LuxuyBike implements Bike {

	@Override
	public void manufacturing(String user) {
		System.out.println("Manufacturing Luxury Bike for "+user);
	}

}
