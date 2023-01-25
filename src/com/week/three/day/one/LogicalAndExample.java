package com.week.three.day.one;

public class LogicalAndExample {

	public static void main(String[] args) {

		int age = 70;

		// more than 16 AND less than 65 to driver.

		boolean isEligible = age > 16 && age < 65;

		System.out.println(isEligible);
	}

}