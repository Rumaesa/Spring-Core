package com.nt.comps;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dtdc")

public final class DTDC implements Courier {
	
	@Override
	public String deliver(int oid) {
		
		return "DTDC courier Assigned to deliver the order id::"+oid +"products";
	}

}
