package com.sweta.springdemo.ioc;

public class BasketBallCoach implements Coach {

	private FortuneService fortuneService;
	private String username;
	private String email;
	
	
	
	public BasketBallCoach() {
	}
	public BasketBallCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}



	@Override
	public String getDailyWorkOut() {
		return "6 goal practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
