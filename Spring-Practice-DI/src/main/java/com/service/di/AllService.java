package com.service.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AllService {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Airtel src = context.getBean("Airtel", Airtel.class);
		src.airtelService();
	}
}
