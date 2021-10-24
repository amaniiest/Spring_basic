package com.spring.college;

import org.springframework.stereotype.Component;

@Component
public class ScienceTeacher implements Teacher {

	@Override
	public void teach() {
		System.out.println("Teaching Science");
		System.out.println("My name is Prasad");
	}

}
