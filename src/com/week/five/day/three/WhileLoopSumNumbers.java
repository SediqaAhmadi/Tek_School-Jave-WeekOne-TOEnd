package com.week.five.day.three;

import java.util.Scanner;

public class WhileLoopSumNumbers {


		
		public static void main(String[] args) {
			//Ask user input to input any numbers . 
			//then sum the inputs 
			//Stop asking user when sum reached to 100 or above.
			Scanner scanner = new Scanner(System.in);
			double sum = 0;
			
			while (sum < 100) {
				
				System.out.println("Enter any number");
				double number = scanner.nextDouble();
				
				sum += number;
			}
			
			System.out.println("You reached 100 or above ");
			System.out.println(sum);
			scanner.close();
		}

	}