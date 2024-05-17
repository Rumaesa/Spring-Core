package com.nt.comps;

import org.springframework.stereotype.Component;

@Component("bDart")
  
public final class BlueDart implements Courier {
	
	@Override
	public String deliver(int oid) {
		
		return "BlueDart courier is Assigned to deliver the order id::"+oid +"products";
	}

}
