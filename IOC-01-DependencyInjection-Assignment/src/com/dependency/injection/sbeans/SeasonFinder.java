package com.dependency.injection.sbeans;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeasonFinder {
	
	@Autowired
	private LocalDateTime ldt;
	
	public String findSeason(String user) {
				
		int month = ldt.getMonthValue();
		
		System.out.println(month);
		
		if(month<4)
			return "Hey " +user+" Its Summer Season";
		else if(month<8)
			return "Hey " +user+" Its Rainy Season";
		else 
			return "Hey " +user+" Its Winter Season";
				
	
	}
	
	

	

}
