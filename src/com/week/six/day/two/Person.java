package com.week.six.day.two;

public class Person {

	String firstName; 
	String lastName;
	
	//Constructor is used to initialize an object of any class
	// similar to method but don't return type. 
	//and it's the same name of the class name
	// Constructor contain a block of codes. 
	
	public Person() {
		System.out.println("This is a construction");
	}
	
	
	//Create a method to return Full name
	public String getFullname() {
		String fullName =  firstName + " " + lastName;
		return fullName; 
	} 
}

