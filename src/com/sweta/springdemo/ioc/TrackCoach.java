package com.sweta.springdemo.ioc;


public class TrackCoach implements Coach{ //,DisposableBean {

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
	
	//add init method - bean lifecycle
	public void doMyStartupStuff() {
		System.out.println("TrackCoach :: Inside method :: startup demo");
	}
	
	//add destory method -  bean lifecycle
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach :: Inside method :: destroy demo");
	}

//	@Override
//	public void destroy() throws Exception {
//		System.out.println("TrackCoach :: Inside method :: destroy demo for prototype");
//	}

}
