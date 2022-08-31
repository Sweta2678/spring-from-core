package com.sweta.springdemo.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author sweta.khatsuriya
 *
 */
public class MyAppDiUsingSetterInjection {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		CricketCoach coach = context.getBean("myCricketCoach",CricketCoach.class);
		//Coach coachForTrack  = context.getBean("trackCoach",Coach.class);
		
		System.out.println(coach.getDailyWorkOut());
		//System.out.println(coachForTrack.getDailyWorkOut());
		
		System.out.println(coach.getDailyFortune());
		//System.out.println(coachForTrack.getDailyFortune());
		System.out.println(coach.getEmailAddress());
		System.out.println(coach.getTeam());
		
		context.close();
	}
}
