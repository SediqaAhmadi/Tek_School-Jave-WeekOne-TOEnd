package com.week.eleven.review02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerInputMisMatch {

	public static void main(String[] args) {

		// how to handle user input.

		// You ask enter and should provide integer if not handle it.
		
		//TODO Find a solution for infinite loop. 
		
		boolean flag = false; 
		Scanner scanner = null; 
		while(!flag) {
			try {
				scanner = new Scanner(System.in);
				System.out.println("Enter any number");
				int number = scanner.nextInt();
				System.out.println(number);
				flag = true;
			} catch (InputMismatchException e) {
				System.err.println("Please provie numbers ");
				flag = false;
			} finally {
				scanner.close();
			}
		}
	}

}

