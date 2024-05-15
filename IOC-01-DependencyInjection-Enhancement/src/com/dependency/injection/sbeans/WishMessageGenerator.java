package com.dependency.injection.sbeans;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {

//	Field Injection: @Autowire on top of Variable/Field
//	@Autowired
	private LocalDateTime ldt;
	
//	Setter Injection: @Autowired on top of Setter Method
	/*@Autowired
	public void setLdt(LocalDateTime ldt){
		System.out.println("WishMessageGenerator.setLdt()");
		this.ldt = ldt;		
	}
	*/
	
//	Constructor Injection: @Autowired on top of Parameterized Constructor	
	/*
	@Autowired
	public WishMessageGenerator(LocalDateTime ldt) {
		System.out.println("WishMessageGenerator.WishMessageGenerator(): Parameterized Constructor");
		this.ldt = ldt;
	}
	
	@Autowired
	public WishMessageGenerator(LocalDateTime ldt, Date ct) {
		System.out.println("WishMessageGenerator.WishMessageGenerator(): 2 - Parameter Constructor");
		this.ldt = ldt;
	}
	*/
	
//	Arbitrary Method Injection: @Autowired on top of a method with any name
	@Autowired
	public void assign(LocalDateTime ldt) {
		System.out.println("WishMessageGenerator.assign()");
		this.ldt = ldt;
	}
	
	
	public String showWishMessage(String user) {
		int hour = ldt.getHour();
		if(hour<12)
			return "Good Morning " + user;
		else if(hour<16)
			return "Good Afternoon " + user;
		else if(hour<20)
			return "Good Evening " + user;
		else
			return "Good Night " + user;
	}
}
