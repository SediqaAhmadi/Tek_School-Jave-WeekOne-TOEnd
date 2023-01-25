package com.week.eleven.Review01;

import java.util.Scanner;

public class Selections {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("enter your age");

		int age = scanner.nextInt();
		scanner.close();
		// if , else if , and else

		if (age <= 0) {
			System.err.println("Please enter proper age should be more that zero");
		} else if (age > 0 && age < 4) {
			System.out.println("you are still a baby stay home");
		} else if (age >= 4 && age < 6) {
			System.out.println("Preschool");
		} else if (age >= 6 && age < 10) {
			System.out.println("Elementry School");
		} else if (age >= 10 && age < 14) {
			System.out.println("Middle School");
		} else if (age >= 14 && age < 18) {
			System.out.println("High School");
		} else if (age >= 18 && age < 26) {
			System.out.println("College and University");
		} else {
			System.out.println("It's never late LOL");
		}
	}
}

