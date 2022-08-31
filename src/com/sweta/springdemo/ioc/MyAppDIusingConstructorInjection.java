package com.sweta.springdemo.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author sweta.khatsuriya
 *
 */
public class MyAppDIusingConstructorInjection {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Coach coach = context.getBean("baseBallCoach",Coach.class);
		//Coach coachForTrack  = context.getBean("trackCoach",Coach.class);
		
		System.out.println(coach.getDailyWorkOut());
		//System.out.println(coachForTrack.getDailyWorkOut());
		
	
		System.out.println(coach.getDailyFortune());
		//System.out.println(coachForTrack.getDailyFortune());
		
		context.close();
	}
}
