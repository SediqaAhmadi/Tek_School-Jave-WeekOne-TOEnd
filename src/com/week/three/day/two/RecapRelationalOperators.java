package com.week.three.day.two;

public class RecapRelationalOperators {

public static void main(String[] args) {
		
		double numberA = 10.20; 
		
		double numberB = 20.10;
		
		boolean isEqual = numberA == numberB; 
		System.out.println("Is Two number equal " + isEqual);
		
		boolean isNotEqual = numberA != numberB; 
		System.out.println("Is Two number Not Equal " + isNotEqual);
		
		boolean isALessThanB = numberA < numberB; 
		System.out.println("Is Number A less than Number B " + isALessThanB);
		
		boolean isAGreaterThanB = numberA > numberB; 
		System.out.println("Is Number A greater than Number B " + isAGreaterThanB);
		
		boolean isALessThanEqualB = numberA <= numberB; 
		System.out.println("Is Number A Less than Equal Number B " + isALessThanEqualB);
		
		boolean isAGreaterThanEqualB = numberA >= numberB; 
		System.out.println("Is Number A Greater than equal number B " + isAGreaterThanEqualB);
		
	}

}
