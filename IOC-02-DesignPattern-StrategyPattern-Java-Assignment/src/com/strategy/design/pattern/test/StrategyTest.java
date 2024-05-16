package com.strategy.design.pattern.test;

import com.strategy.design.pattern.components.Engine;
import com.strategy.design.pattern.components.Vehicle;
import com.strategy.design.pattern.factory.EngineFactory;

public class StrategyTest {

	public static void main(String[] args) {

		Vehicle vehicle = EngineFactory.getInstance("electric");
		String vehicleMessage = vehicle.journey("Mumbai", "Kashmir");
		System.out.println(vehicleMessage);
	}
}
