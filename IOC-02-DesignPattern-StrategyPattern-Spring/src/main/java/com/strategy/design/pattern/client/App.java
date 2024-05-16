package com.strategy.design.pattern.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.strategy.design.pattern.configuration.AppConfig;
import com.strategy.design.pattern.sbeans.Flipkart;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    	AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
    	Flipkart flipkart = ctx.getBean("flipkart", Flipkart.class);
    	String shoppingMsg = flipkart.shopping(new String[] {"Bag", "Tshirt"}, new float[] {400,9000});
    	System.out.println(shoppingMsg);
    }
}
