package com.luv2code.aopdemo;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.luv2code.aopdemo.service.TrafficFortuneService;

public class AroundHandleExceptionDemoApp {

	private static Logger myLogger = Logger.getLogger(AroundHandleExceptionDemoApp.class.getName());
	public static void main(String[] args) {

		//read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

		//get the bean from the spring container 
		TrafficFortuneService theFortuneService = context.getBean("trafficFortuneService",TrafficFortuneService.class);

		myLogger.info("\n Main program: AroundDemoApp");
		
		myLogger.info("Calling getFortune");
		
		boolean tripWire = true;

		String data =  theFortuneService.getFortune(tripWire);
		
		myLogger.info("\n My fortune is "+data);
		
		myLogger.info("Finished");

		//close the context
		context.close();

	}

}
