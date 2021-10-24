package com.spring.di.objective;

public class Student2 {
	private MathCheat cheat;
	
	public void startcheating() {
		cheat.mathcheat();
	}

	public void setCheat(MathCheat cheat) {
		this.cheat = cheat;
	}

}
