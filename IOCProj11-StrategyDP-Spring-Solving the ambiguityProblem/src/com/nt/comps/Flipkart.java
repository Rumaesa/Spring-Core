package com.nt.comps;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("fpkt")
public final class Flipkart {
	//HAS -A property
	@Autowired  //field Injection
	@Qualifier("shipment")
	private Courier courier;
	

	 
	 // b.method
	 public  String  shopping(String items[],float prices[]) {
		 // calc  bill amount
		 float  billAmt=0.0f;
		 for(int i=0;i<prices.length;++i) {
			 billAmt=billAmt+prices[i];
		 }
		 // generate the random number as the order id
		 int oid=new Random().nextInt(10000);
		 //use  the courier
		 String deliveryMsg=courier.deliver(oid);
		 
		 String  shoppingMsg=Arrays.toString(items)+"are purcharsed having prices::"+Arrays.toString(prices)+" with billAmount::"+billAmt;
		 return shoppingMsg+"...."+deliveryMsg;
	 }

}
