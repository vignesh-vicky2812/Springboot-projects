package com.example.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach")
@Component
@Scope("prototype")
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println("TennisCaoch: Inside default constructor");
	}
	
	//define init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println("TennisCoach: inside of doMyStartupStuff() method");
	}
	
	//define destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("TennisCoach: inside of doMyCleanupStuff() method");
	}
	
	/*@Autowired
	public void setFortuneService(FortuneService fortuneService) {
	    System.out.println("TennisCoach: Inside setFortuneService() method");
		this.fortuneService = fortuneService;
	}*/
	/*@Autowired
	public void doSomeCrazyStuff(FortuneService fortuneService) {
	    System.out.println("TennisCoach: Inside doSomeCrazyStuff() method");
		this.fortuneService = fortuneService;
	}*/

	/*@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practise your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
