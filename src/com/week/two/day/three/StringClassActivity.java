package com.week.two.day.three;

public class StringClassActivity {

public static void main(String[] args) {
		
		String fullName = "John Smith";
		
		//substring first name and last name 
		String firstName = fullName.substring(0, 4);
		String lastName = fullName.substring(5);
		
		System.out.println("First name is " + firstName);
		System.out.println("Last name is " + lastName);
	}

}
