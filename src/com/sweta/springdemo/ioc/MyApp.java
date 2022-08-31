package com.sweta.springdemo.ioc;

/**
 * @author sweta.khatsuriya
 *
 */
public class MyApp {
	public static void main(String[] args) {
		
		//create coach object
		//Coach baseBallCoach = new BaseBallCoach();
		
		Coach trackCoach = new TrackCoach();

		//use the object
		//baseBallCoach.getDailyWorkOut();
		
		//display
		System.out.println(trackCoach.getDailyWorkOut());
		
	}
}
