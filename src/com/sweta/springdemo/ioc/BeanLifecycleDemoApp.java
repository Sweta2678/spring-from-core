package com.sweta.springdemo.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleDemoApp {
	public static void main(String[] args) {
			
		//load the config context
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		//retrieve bean
		Coach coach = context.getBean("trackerCoach",Coach.class);

		//display or call method
		System.out.println(coach.getDailyFortune());
		
		//close context
		context.close();
	}
}
