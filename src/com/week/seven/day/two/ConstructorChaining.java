package com.week.seven.day.two;

public class ConstructorChaining {

	public ConstructorChaining() {
		System.out.println("This is Default Constructor");	
	}
	
	public ConstructorChaining(String text) {
		this();
		System.out.println("This is Constructor with Text Parameter " + text);
	}
	
	public ConstructorChaining(String text, int number) {
		this(text);
		System.out.println("This is constructor with 2 parameters " + text + " " + number);
	}
	
	public ConstructorChaining(String text, int number, String anotherText) {
		this("SOme Text", 190);
	}

}
