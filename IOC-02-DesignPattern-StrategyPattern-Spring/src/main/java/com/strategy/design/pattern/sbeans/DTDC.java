package com.strategy.design.pattern.sbeans;

import org.springframework.stereotype.Component;

@Component("dtdc")
public final class DTDC implements Courier{

	@Override
	public String delivery(int oid) {
		
		return "DTDC";
	}

}
