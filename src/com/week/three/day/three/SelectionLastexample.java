package com.week.three.day.three;

public class SelectionLastexample {

	public static void main(String[] args) {

		// gender. Male, Female or Other
		// gender as Char, M, F, O

		char gender = 'H';

		if (gender == 'M') {
			System.out.println("Your are a Man");
		} else if (gender == 'F') {
			System.out.println("You are a woman");
		} else if (gender == 'O') {
			System.out.println("Prefer not to say");
		} else {
			System.err.println("Wrong input for Gender");
		}

	}

}
