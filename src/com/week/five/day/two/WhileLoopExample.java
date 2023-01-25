package com.week.five.day.two;

import java.util.Scanner;

public class WhileLoopExample {



	public static void main(String[] args) {
		// Ask user repeatedly to enter a number (int) until user enter 10;
		Scanner scanner = new Scanner(System.in);
		boolean flag = true; 
		
		while(flag == true) {
			System.out.println("Enter a number");
			int userInput = scanner.nextInt();
			
			if (userInput == 10) {
				flag = false;
			}
		}
		
		System.out.println("user entered 10 finally");
		scanner.close();

	}

}
