package com.week.four.day.three;

import java.util.Scanner;

public class ArrayLoopScanner {



		// Activity
		// Ask User to Enter any number for 5 time.
		// then Calculate total Amount of those number enters.

		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			
			double result = 0; 
			
			for (int start = 1; start <= 5 ; start ++ ) {
				
				System.out.println("Enter Any Number: ");
				double number = scanner.nextDouble();
				
				result += number; 
			}
			
			System.out.println("The Result is " + result);
			scanner.close();
		}

	}