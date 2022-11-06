package com.example.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
    
	private String emailAddress;
	private String team;
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("inside setter method setEmailaddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("inside setter method setteam");
		this.team = team;
	}

	// create no-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach: inside no arg constructor");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("inside setter method setFortuneService");
		this.fortuneService = fortuneService;
	}


	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Pracice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}