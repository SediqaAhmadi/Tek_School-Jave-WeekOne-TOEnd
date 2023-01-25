package com.week.two.day.four;

public class StringReview {

	public static void main(String[] args) {
		// Activity , separate firstName and Last name
		// This code works for this Format Only
		String fullName = "Waris Hotak";
		
		int indexOfSpace = fullName.indexOf(" ");  // To index 
		//Looking for FirstName
		String firstName = fullName.substring(0 , indexOfSpace);  // with help of space index with substring
		String lastName = fullName.substring(indexOfSpace + 1);
		
		System.out.println("First Name is ::: " + firstName);
		System.out.println("Last Name is ::: " + lastName);
	}

}