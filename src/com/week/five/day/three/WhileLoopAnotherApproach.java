package com.week.five.day.three;

import java.util.Scanner;

public class WhileLoopAnotherApproach {

		public static void main(String[] args) {
			// Ask user enter number,
			// Stop asking again when user entered 10;
			Scanner scanner = new Scanner(System.in);
			int number = 0;
		
			while (number != 10) {
				 number = scanner.nextInt();
				
				if (number == 10) {
					System.out.println("User entered 10");
				}else {
					System.out.println("Try Again");
				}
			}
			scanner.close();
		}

	}
