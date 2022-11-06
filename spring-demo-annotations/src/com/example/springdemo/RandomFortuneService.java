package com.example.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	//create an array of strings
	private String[] data={"Beware of wolf","The Diligence is the mother of luck","The journey is reward"};
	
	private Random myRandom=new Random();
	
	@Override
	public String getFortune() {
		// pick a random string from the array
		int index=myRandom.nextInt(data.length);
		
		String theFortune = data[index];
		return theFortune;
	}

}
