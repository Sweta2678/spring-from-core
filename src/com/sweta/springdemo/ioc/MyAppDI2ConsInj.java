package com.sweta.springdemo.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author sweta.khatsuriya
 *
 */
public class MyAppDI2ConsInj {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Coach coach = context.getBean("trackerCoach",Coach.class);
		
		System.out.println(coach.getDailyWorkOut());
		
		System.out.println(coach.getDailyFortune());
		
		context.close();
	}
}
