package com.week.five.day.three;

import java.util.Scanner;

public class GuessingGame {

		
		public static void main(String[] args) {
			//Java will pick a random number between 1 - 50; 
			//then we have to guess
			//Gives you random double number between 0 - 1;
			
			double random = Math.random() * 50; 
			int randomInterger = (int) random; 
			
			Scanner scanner = new Scanner(System.in);
			
			int guessedNumber = 0; 
			
			while (guessedNumber != randomInterger) {
				System.out.println("Guess a number");
				guessedNumber = scanner.nextInt();
				
				if (guessedNumber == randomInterger) {
					System.out.println("Hoorraaaayy you guessed it");
				}else if (guessedNumber < randomInterger) {
					System.out.println("Almost there go higher");
				}else if (guessedNumber > randomInterger) {
					System.out.println("Try Lower number");
				}
			}
			
			scanner.close();
		}

	}
