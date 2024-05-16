package com.strategy.design.pattern.sbeans;

import org.springframework.stereotype.Component;

@Component("bluedart")
public final class BlueDart implements Courier{

	@Override
	public String delivery(int oid) {
		
		return "BlueDart";
	}

}
