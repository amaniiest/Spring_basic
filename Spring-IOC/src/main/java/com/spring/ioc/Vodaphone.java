package com.spring.ioc;

public class Vodaphone implements sim{

	@Override
	public void calling() {
		System.out.println("Calling using Vodaphone sim");
		
	}

	@Override
	public void data() {
		System.out.println("browsing internet using Vodaphone sim");
		
	}

}
