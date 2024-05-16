package com.singleton.ston;

public class Printer {

	private static Printer INSTANCE;
	
	private Printer() {
		System.out.println("Printer.Printer() :: 0 - Param Constructor");
	}
	
	public static Printer getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new Printer();
		}
		return INSTANCE;
	}
	
//	business method:
	public void printMessage(String msg) {
		System.out.println(msg);
	}
	
}
