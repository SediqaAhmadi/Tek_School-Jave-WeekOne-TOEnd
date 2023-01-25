package com.week.three.day.two;

public class LogicalOperationRecap2 {

public static void main(String[] args) {
		
		int age = 67; 
		
		// age should be more than equal 16
		// and 
		// age should be less than equal 65 
		// to be able to drive. 
		
		boolean eligibleForDrive = age >= 16 && age <= 65; 
		
		System.out.println("Is eligible for drive ::: " + eligibleForDrive);
	}

}
