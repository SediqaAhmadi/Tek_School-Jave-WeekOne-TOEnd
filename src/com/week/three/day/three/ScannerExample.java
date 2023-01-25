package com.week.three.day.three;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
	// Ask user input first and And Last Name and 
			// And Their Age and
			//print their Full name. 
			
			Scanner input = new Scanner(System.in);
			System.out.println("Please Enter Your First Name");
			String firstName = input.next();
			System.out.println("Please Enter Your last Name");
			String lastName = input.next();
			System.out.println("Please enter your Age");
			int age = input.nextInt();
			
			String fullName = firstName + " " + lastName;
			
			System.out.println("Hello " + fullName + " you are " + age + " years Old");
			
			input.close();
		}

	}

