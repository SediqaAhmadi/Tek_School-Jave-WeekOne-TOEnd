package com.week.nine.day.one;

public class Car {

	private String make;

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	} 
	
	@Override
	public String toString() {
		return "Car Make " +  make; 
	}

}
