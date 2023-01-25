package com.week.five.day.one;

import java.util.Scanner;

public class RecapScannerAndArray {

public static void main(String[] args) {
		
		// Create a program take 5 value any number an sum them together
		Scanner scanner = new Scanner(System.in);
		
		double[] numbers = new double[5];
		
		//Responsible to ask user input. 
		for (int index = 0; index < numbers.length ; index ++) {
			System.out.println("Please Enter any number");
			numbers[index] = scanner.nextDouble();
		}
		
		
		double result = 0; 
		// responsible to sum values inside array
		for (int index = 0; index < numbers.length; index ++ ) {
			
		  result +=	numbers[index];
			
		}
		
		System.out.println("The result is " + result);
		scanner.close();
	}

}
