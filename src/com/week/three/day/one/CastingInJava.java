package com.week.three.day.one;

public class CastingInJava {

	public static void main(String[] args) {
		// Casting java is date type conversion .
		// 1) Implicit casting.
		// example.
		// byte > short > int > long > float > double
		short numberA = 200;
		short numberB = 300;

		int result = numberA + numberB;

		System.out.println(result);

		byte age = 34;

		short ageNumber = age;

		System.out.println(ageNumber);

		float numberFloat = 22.43F;

		double doubleNumber = numberFloat;

		// examples
		double resultInDouble = result;
		System.out.println(resultInDouble);
	}

}