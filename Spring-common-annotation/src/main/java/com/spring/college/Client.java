package com.spring.college;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) throws Exception {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CollegeConfig.class);
		College college =  context.getBean("college", College.class);
		System.out.println("college object is created "+ college);
		college.test();
		context.close();
	}
	
}

