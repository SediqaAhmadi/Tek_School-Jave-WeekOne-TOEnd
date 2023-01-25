package com.week.three.day.three;

import java.util.Scanner;

public class GetUserInput {

	public static void main(String[] args) {

		// To get user Input from their Keyboard user Scanner Class with System.in
		// Instantiate a Scanner Object (Copy of Class)
		Scanner inputFromUser = new Scanner(System.in);
		System.out.println("Please Enter your Name: ");
		String firstName = inputFromUser.next();

		System.out.println("Your name is " + firstName);
		
		//Close Scanner 
		inputFromUser.close();
	}

}
