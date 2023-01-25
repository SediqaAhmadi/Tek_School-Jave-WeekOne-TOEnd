package com.week.four.day.three;

import java.util.Scanner;



public class ScannerLoopArrayExample {
	
	public static void main(String[] args) {
		
		// Activity 
		// Ask user to input 5 City name. 
		// We will store each city name in array. 
		// then lets find how many of cities start with letter F;
		Scanner scanner = new Scanner(System.in);
		
		String[] cities = new String[5];
		
		for (int index = 0 ; index < cities.length; index ++ ) {
			System.out.println("Entry A City Name");
			cities[index] = scanner.next();
		}
		
		scanner.close(); 
		int count = 0 ; 
		for (int index = 0; index < cities.length; index ++ ) {
			String city = cities[index].toUpperCase();
			
			if (!city.isEmpty() && city.startsWith("F")) {
				System.out.println("City that start with F :" + cities[index]);
				count ++;
			}
		}
		
		System.out.println("Number of cities start with F " + count);
	}

}

	