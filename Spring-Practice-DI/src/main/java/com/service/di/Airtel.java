package com.service.di;

public class Airtel {
	
	private Service service;

	public void setService(Service service) {
		this.service = service;
	}
	
	public void airtelService() {
		service.service();
	}
}
