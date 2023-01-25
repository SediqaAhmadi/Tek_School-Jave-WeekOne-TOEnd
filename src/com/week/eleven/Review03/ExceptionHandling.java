package com.week.eleven.Review03;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
		System.out.println("Enter First Number");
		int first = scanner.nextInt(); 
		System.out.println("Enter First Number");
		int second = scanner.nextInt(); 
		
		int result = first / second; 
		
		System.out.println(result);
		
		} catch (Exception e) {
			System.err.println("Wrong input " + e.getMessage());
		} finally {
			scanner.close();
		}
		
		
		System.out.println("End of Application");
	}

}
