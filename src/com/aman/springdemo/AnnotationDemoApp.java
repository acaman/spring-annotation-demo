package com.aman.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		//read spring config file
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("applicationContext.xml");
		//getbean from spring container
		Coach theCoach =context.getBean("thatCoach",Coach.class);
		Coach theCoach2 =context.getBean("thisCoach",Coach.class);

		//call a method from bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach2.getDailyWorkout());
		System.out.println(theCoach2.getDailyFortune());
		//close config file
		context.close();
	}

}
