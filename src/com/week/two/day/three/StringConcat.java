package com.week.two.day.three;

public class StringConcat {

public static void main(String[] args) {
		
		//String Concat method. is used to append a string to end of other string. 
		
		String firstName = "Mohammad";
		String lastName = "Shokriyan";
		
		// using + sign 
		String fullName = firstName + " " + lastName + "Some more Test" + "Some other test"; 
		System.out.println(fullName);
		
		// use concat method. 
		String fullNameWithConcat = firstName.concat(lastName);
		System.out.println(fullNameWithConcat);
		
		String text = firstName.concat(" ");
		String fullNameWithSpace = text.concat(lastName);
		System.out.println(fullNameWithSpace);
	}

}