package com.sweta.springdemo.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifecycleDestroyForPrototype {
	public static void main(String[] args) {
			
		//load the config context
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-destory-prototype-applicationContext.xml");
		
		//retrieve bean
		Coach coach = context.getBean("trackerCoach",Coach.class);
		Coach alphaCoach = context.getBean("trackerCoach",Coach.class);


		//display or call method
		System.out.println(alphaCoach.getDailyFortune());
		System.out.println(coach.getDailyFortune());
		
		//close context
		context.close();
	}
}
