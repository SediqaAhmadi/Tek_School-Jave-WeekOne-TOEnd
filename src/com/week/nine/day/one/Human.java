package com.week.nine.day.one;

public class Human extends BaseClass{
	
	private String firstName; 
	private String LastName;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	} 
	
	@Override
	public void print() {
		System.out.println("First name: " + this.firstName + " LastName: " + this.LastName);
	}

}