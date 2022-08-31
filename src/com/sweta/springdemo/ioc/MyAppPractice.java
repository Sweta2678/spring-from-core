package com.sweta.springdemo.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author sweta.khatsuriya
 *
 */
public class MyAppPractice {
	public static void main(String[] args) {
		
		//load spring config context
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get bean
		Coach coach = context.getBean("cricketCoach", Coach.class);
		
		//display
		System.out.println(coach.getDailyWorkOut());
		
		//close context
		context.close();
		
	}
}
