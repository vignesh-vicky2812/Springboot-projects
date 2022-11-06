package com.luv2code.aopdemo.service;

import java.util.concurrent.TimeUnit;

import org.springframework.stereotype.Component;

@Component
public class TrafficFortuneService {

	public String getFortune() {
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		return "Expecting Heavy traffic this morning";
	}

	public String getFortune(boolean tripWire) {

		if(tripWire) {
			throw new RuntimeException("Major accident! Highway is closes!");
		}
		return getFortune();
	}

}
