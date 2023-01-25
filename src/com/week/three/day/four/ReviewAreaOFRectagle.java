package com.week.three.day.four;

import java.util.Scanner;

public class ReviewAreaOFRectagle {

	public static void main(String[] args) {
		// Area = width * height; Activity. Ask user to input width and height; 
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter width of rectangle");
		double width = scanner.nextDouble(); 
		
		System.out.println("Please enter height of rectangle");
		double height = scanner.nextDouble(); 
		scanner.close();
		
		if (width > 0 && height > 0) {
			double area = width * height;
			System.out.println("Area of Rectangle is " + area);
		} else {
			System.err.println("Numbers should be positive and more than 0");
		}
	}

}
