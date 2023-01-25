package com.week.five.day.three;

import java.util.Scanner;

public class DoWhileExample {


	public static void main(String[] args) {
		// Ask user input to input any numbers .
		// then sum the inputs
		// Stop asking user when sum reached to 100 or above.
		Scanner scanner = new Scanner(System.in);
		double result = 0;

		do {
			System.out.println("Enter any number");
			double number = scanner.nextDouble();
			result += number;
		} while (result < 100);
		
		System.out.println("You reached 100 or above ");
		System.out.println(result);
		scanner.close();
	}

}
