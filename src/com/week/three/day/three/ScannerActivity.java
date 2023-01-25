package com.week.three.day.three;

import java.util.Scanner;

public class ScannerActivity {

		
		public static void main(String[] args) {
			//Activity
			// Ask User to Enter Password. 
			// If the lenght of Password is less than equal 8 Character
			// Print your password is week. 
			// else print your Password is strong.
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter your passwod:");
			String password = input.next();
			
			int passwordLength = password.length();
			if (passwordLength <= 8 ) {
				System.out.println("Your Password is Week");
			}else {
				System.out.println("Your Password is Strong");
			}
			input.close();
		} 

	}