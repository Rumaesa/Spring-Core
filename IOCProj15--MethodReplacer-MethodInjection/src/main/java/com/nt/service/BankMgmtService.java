package com.nt.service;

import org.springframework.stereotype.Service;


public  class BankMgmtService {
	
	
	public static double  calculateIntrestAmount(double pamt,double rate,double time) {
		System.out.println("BankMgmtService.calculateIntrestAmount()-- compound Intrest");
		  return    (pamt*Math.pow(1+rate/100,time))-pamt;
	}

}
