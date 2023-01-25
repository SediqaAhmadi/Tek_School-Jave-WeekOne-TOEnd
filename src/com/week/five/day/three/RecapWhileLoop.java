package com.week.five.day.three;

import java.util.Scanner;

public class RecapWhileLoop {

	
		
		public static void main(String[] args) {
			
			//Ask user enter number, 
			//Stop asking again when user entered 10; 
			Scanner scanner = new Scanner(System.in);
			
			boolean stopAskingAgain = false;
			
			while(stopAskingAgain == false) {
				int number = scanner.nextInt();
				
				if (number == 10) {
					System.out.println("User Entered value 10");
					stopAskingAgain = true; 
				} else {
					System.out.println("Try Again");
				}
			}
			
			scanner.close();
		}

	}