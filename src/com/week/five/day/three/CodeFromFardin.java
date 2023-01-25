package com.week.five.day.three;

import java.util.Scanner;

public class CodeFromFardin {

	public static void main(String[] args) {

		// Java will pick a random number between 1-50
		// then we have to guess
		// gives you random number between 0-1

		double random = Math.random() * 50;

		int randomInteger = (int) random;

		Scanner scanner = new Scanner(System.in);

		int guessedNumber = 0;

		while (guessedNumber != randomInteger) {
			System.out.println("Guess a number");
			guessedNumber = scanner.nextInt();

			if (guessedNumber == randomInteger) {
				System.out.println("Hoorraaaayy you got it!");
			} else if (guessedNumber < randomInteger) {
				System.out.println("Almost there go higher");
			} else if (guessedNumber > randomInteger)
				;
			{
				System.out.println("Try lower number");
			}

		}
		scanner.close();
	}

}

