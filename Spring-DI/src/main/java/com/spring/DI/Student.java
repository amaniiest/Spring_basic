package com.spring.DI;

public class Student {
	
	private String studentname;
	private int rollNumber;
	
	public Student(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	
	public Student(String studentname, int rollNumber) {
		this.studentname = studentname;
		this.rollNumber = rollNumber;
	}

	public void displaystudentinfo() {
		System.out.println("Student name is "+ studentname);
		System.out.println("Student rollnumber "+ rollNumber);
	}
	
}
