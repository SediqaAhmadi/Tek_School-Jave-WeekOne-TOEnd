package com.week.eleven.review02;

import java.util.Scanner;

public class WhileLoopWithScanner {

	
		
		public static void main(String[] args) {
			//Continue asking user input until use entered 20;
			
			Scanner scanner = new Scanner(System.in);
			
			int number = 0; 
			
			while (number != 20) {
				System.out.println("Enter any number");
				number = scanner.nextInt(); 
				
				if (number == 20) {
					System.out.println("Yes you entered 20");
				}
			}
			
			scanner.close();
		}

	}
