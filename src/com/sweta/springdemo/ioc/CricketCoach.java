package com.sweta.springdemo.ioc;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	private String emailAddress;
	private String team;
	
	//no -arg construstor
	public CricketCoach() {
		System.out.println("cricketCoach :Inside default constructor");
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("cricketCoach :Inside setFortuneService");
		this.fortuneService = fortuneService;
	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		this.team = team;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	@Override
	public String getDailyWorkOut() {
		return "target 100 runs";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	} 

}
