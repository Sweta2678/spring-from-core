package com.sweta.springdemo.ioc;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is lucky day!!";
	}

}
