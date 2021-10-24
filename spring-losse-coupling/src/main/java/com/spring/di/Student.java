package com.spring.di;

public class Student {

	private cheat cheat;

	public void setCheat(cheat cheat) {
		this.cheat = cheat;
	}

	public void cheating() {
		cheat.cheat();
	}
}
