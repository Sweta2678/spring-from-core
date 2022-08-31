package com.sweta.springdemo.ioc;

public class TrackCoach implements Coach {

	public TrackCoach() {
	}

	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService thefortuneService) {
		fortuneService = thefortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		return "Run a hard five meter";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it " + fortuneService.getFortune();
	}

}
