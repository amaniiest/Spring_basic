package com.spring.college;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.spring.college")
@PropertySource(value = "classpath:college-info.properties")
public class CollegeConfig {

	/*
	 * @Bean public Teacher mathbean() { return new MathTeacher(); }
	 * 
	 * @Bean public Principle principlebean() { Principle principle = new
	 * Principle(); return principle; }
	 * 
	 * @Bean public College collegebean() { // collegebean - is the bean id College
	 * college = new College(); college.setPrinciple(principlebean());
	 * college.setTeacher(mathbean()); return college; }
	 */
}
