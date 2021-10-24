package com.spring.di.objective;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("beans.xml file laoded");
		Student student = context.getBean("stu", Student.class);
		student.cheating();
		
		Student2 student2 = context.getBean("stu2", Student2.class);
		student2.startcheating();
	}

}