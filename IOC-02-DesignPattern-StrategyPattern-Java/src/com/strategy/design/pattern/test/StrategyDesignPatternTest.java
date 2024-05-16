package com.strategy.design.pattern.test;

import com.strategy.design.pattern.components.Flipkart;
import com.strategy.design.pattern.factory.FlipkarFactory;

public class StrategyDesignPatternTest {

	public static void main(String[] args) {

		Flipkart flipkart = FlipkarFactory.getInstance("DTDC");
		String shopping = flipkart.shopping(new String[] {"Bag","Tshirt"},
							new float[] {500,900});
		System.out.println(shopping);
		
		
	}

}
