package com.sweta.springdemo.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {
	public static void main(String[] args) {
			
		//load the config context
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//retrieve bean
		Coach coach = context.getBean("trackerCoach",Coach.class);
		Coach alphaCoach = context.getBean("trackerCoach",Coach.class);

		//check if both the reference is same or not
		boolean result = (coach==alphaCoach);
		System.out.println("\npoinitng same object == " + result);
		System.out.println("memory location for theCoach - "+coach);
		System.out.println("memory location for alphaCoach - "+alphaCoach);

	
		//display or call method
		coach.getDailyFortune();
		
		//close context
		context.close();
	}
}
