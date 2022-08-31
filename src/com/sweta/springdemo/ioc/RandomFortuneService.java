package com.sweta.springdemo.ioc;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		String[] randomFortune = {"luck","bad luck","win"}; 
		
		Random random = new Random();
		int index = random.nextInt(randomFortune.length);
		String randomElement = randomFortune[index];
		return randomElement;
	}
}
