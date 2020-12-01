package com.aman.springdemo;

import org.springframework.stereotype.Component;

//import java.util.Random;
@Component
public class HappyFortuneService implements FortuneService{
	@Override
	public String getFortune()
	{
		return "Toady is Your Lucky day";
	}		
	/*
	 * FOR RANDOM FORTUNE SERVICE
	 * 	private String[] data = { 
			"Beware of the wolf in sheep's clothing",
			"Diligence is the mother of good luck",
			"The journey is the reward"
	};
	
	// create a random number generator
	private Random myRandom = new Random();
		
	@Override
	public String getFortune() {
		// pick a random string from the array
		int index = myRandom.nextInt(data.length);
		
		String theFortune = data[index];
		
		return theFortune;
	}*/
}