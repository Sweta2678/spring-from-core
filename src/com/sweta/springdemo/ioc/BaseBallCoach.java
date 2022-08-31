package com.sweta.springdemo.ioc;

public class BaseBallCoach implements Coach{
	
	//private field for dependency
	private FortuneService FortuneService;
	
	//define construction for dependency injection
	public BaseBallCoach(FortuneService theFortuneService) {
		FortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkOut() {
		return "Spend 30 minutes for workout";
	}

	@Override
	public String getDailyFortune() {
		return FortuneService.getFortune();
	}
}
