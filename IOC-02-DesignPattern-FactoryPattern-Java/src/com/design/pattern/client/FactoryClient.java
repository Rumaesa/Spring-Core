package com.design.pattern.client;

import com.design.pattern.entity.Bike;
import com.design.pattern.factory.BikeFactory;

public class FactoryClient {

	public static void main(String[] args) {

		Bike sportsbike =BikeFactory.manufacturing("sports");
		sportsbike.manufacturing("Rumaesa");
		System.out.println("---------------------------");
		
		Bike luxuryBike = BikeFactory.manufacturing("luxury");
		luxuryBike.manufacturing("Rumi");
		
	}

}
