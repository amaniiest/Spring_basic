package com.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("config loaded");
	
		sim sim = context.getBean("sim",sim.class);
		sim.calling();
		sim.data();
		
		
	}
}
