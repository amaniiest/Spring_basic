package com.spring.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	
	@Autowired
	@Qualifier("humanheart")
	private  Heart heart;
	

	public void startPumping() {
		if(heart != null) {
		heart.pump();
		System.out.println("name of the animal is : " + heart.getNameofAnimal());
		System.out.println("number of heart : "+ heart.getNoOfHeart());
		}
		else {
			System.out.println("Heart not pumping");
		}
	}
}
