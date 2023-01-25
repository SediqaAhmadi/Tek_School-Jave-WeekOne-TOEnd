package com.week.seven.day.two;

public class Service {

	public Service(int number) {
		System.out.println("Constructor with 1 Parameter " + number);
		
	}
	
	public Service(int number, String text) {
		this(number);
		System.out.println("This is Constructor with 2 parameters and text is  " + text);
	}

}