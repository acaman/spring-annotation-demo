package com.aman.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("thatCoach")
public class TennisCoach implements Coach {

	//FIELD INJECTION
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

	/*
	///CONSTRUCTOR INJECTON
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("Constructor");

	}
	*/
	/*
	///SETTER INJECTION
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("Setter");
	}
	*/

	@Override
	public String getDailyWorkout() {
		return "Tennis practice for 3 hrs" ;
	}

	@Override
	public String getDailyFortune() {
		/*ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("applicationContext.xml");
		//getbean from spring container
		FortuneService fortuneService =context.getBean("happyFortuneService",FortuneService.class);*/
		return "TENNIS : "+fortuneService.getFortune( );
	}


}
