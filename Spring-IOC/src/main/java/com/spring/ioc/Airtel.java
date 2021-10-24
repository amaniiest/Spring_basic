package com.spring.ioc;

public class Airtel implements sim{

	public Airtel() {
		System.out.println("Airtel constructor called");
	}

	@Override
	public void calling() {
		System.out.println("Calling using Airtel sim");
		
	}
	
	@Override	
	public void data() {
		System.out.println("browsing internet using Airtel sim");
		
	}

}
