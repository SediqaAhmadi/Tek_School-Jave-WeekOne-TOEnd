package com.week.three.day.three;

public class RecapSelectionIf {
	
	public static void main(String[] args) {

		// find out that given number is odd or even.
		// if Odd print the number and say it's odd.
		// if even print the number and say it's even.

		int number = 24;

		// if remainder of division by 2 is equal to 0 the number is even.

		int remainder = number % 2;
		System.out.println("Remained for division is " + remainder);

		if (remainder == 0) {
			System.out.println("This Number " + number + " is Even");
		} else {
			System.out.println("This number " + number + " is Odd");
		}

	}

}