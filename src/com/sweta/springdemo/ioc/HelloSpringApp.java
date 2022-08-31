package com.sweta.springdemo.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
	public static void main(String[] args) {
		
		//load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean
		Coach coach = context.getBean("trackCoach",Coach.class);
		
		//call methos of bean
		System.out.println(coach.getDailyWorkOut());
		
		//close context 
		context.close();
	}
}
