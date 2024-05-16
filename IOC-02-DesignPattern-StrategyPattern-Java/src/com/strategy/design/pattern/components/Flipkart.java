package com.strategy.design.pattern.components;

import java.util.Arrays;
import java.util.Random;

public final class Flipkart {

//	HAS-A property:
	private Courier courier;
	
//	To set value in Courier Object:
	public void setCourier(Courier courier) {
		this.courier = courier;
	}
	
//	Business Method:
	public String shopping(String[] items, float[] price) {
		
		float billAmount = 0.0f;
		
//		Calculating Bill Amount:
		for(int i=0; i<price.length;i++) {
			billAmount = billAmount + price[i];
		}
		
//		Generating Order ID:
		int orderId = new Random().nextInt(1000);
		String courierMessage = courier.delivery(orderId);
		
//		Final Delivery Message:
		String deliveryMessage = "Order "+ orderId + " containing " + Arrays.toString(items)+ " with total cost " +billAmount+ " will be delivered by " + courierMessage+ ".";
		
		return deliveryMessage;
	}
	
	
}
