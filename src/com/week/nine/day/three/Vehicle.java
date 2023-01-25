package com.week.nine.day.three;

public abstract class Vehicle {
	
	String name; 
	
	
	public abstract void speed();
	
	public void printName() {
		System.out.println("Vehicle Name is " + name);
	}

}