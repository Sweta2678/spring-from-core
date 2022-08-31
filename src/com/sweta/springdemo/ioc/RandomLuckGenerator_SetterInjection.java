package com.sweta.springdemo.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author sweta.khatsuriya
 *
 */
public class RandomLuckGenerator_SetterInjection {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		BasketBallCoach coach = context.getBean("myBasketBallCoach",BasketBallCoach.class);
		//Coach coachForTrack  = context.getBean("trackCoach",Coach.class);
		
		System.out.println(coach.getDailyWorkOut());
		//System.out.println(coachForTrack.getDailyWorkOut());
		
		System.out.println(coach.getDailyFortune());
		//System.out.println(coachForTrack.getDailyFortune());
		System.out.println(coach.getEmail());
		System.out.println(coach.getUsername());
		
		context.close();
	}
}
