package com.week.six.day.two;

public class TestAnotherPerson {


	public static void main(String[] args) {
		
		//Create a person Object then provide first name and last name 
		// with using getFullname method 
		//then print the fullname in all lower case; 
		
		Person personObject = new Person();
		
		personObject.firstName = "John";
		personObject.lastName = "Smith";
		
		String fullname = personObject.getFullname();
		
		System.out.println(fullname.toLowerCase());
	}

}
