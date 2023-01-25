package com.week.three.day.three;

import java.util.Scanner;

public class ScannerEvenOrOdd {

		
		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please Enter any number ");
			
			long number = scanner.nextLong();
			
			if (number % 2 == 0) {
				System.out.println(number + " Is even");
			}else {
				System.out.println(number + " Is odd");
			}
			scanner.close();
		}

	}