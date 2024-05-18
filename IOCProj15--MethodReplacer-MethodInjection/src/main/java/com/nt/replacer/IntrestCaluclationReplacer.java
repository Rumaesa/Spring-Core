package com.nt.replacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;
import org.springframework.stereotype.Component;

@Component("icReplacer")
public class IntrestCaluclationReplacer implements MethodReplacer {

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("IntrestCaluclationReplacer.reimplement()-- simple intreset amount");
		//get  b.method arg values
		double  p=(double)args[0];
		double  t=(double)args[1];
		double r=(double)args[2];
		
		//calculate simple intrest amount
		double amount=p*t*r/100.0;
		
		
		return amount;
	}

}
