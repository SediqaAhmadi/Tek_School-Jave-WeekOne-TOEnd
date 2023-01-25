package com.week.three.day.two;

public class StringEquality {

public static void main(String[] args) {
		
		String name = "Mohammad"; 
		
		String secondName = "MohammaD";
		
		//to check the equality of String you can not use ==  
		// to check the equality you have to use equal method. 
		
		//introducing to equal method. 
		
		boolean equalityCheck = name.equals(secondName);
		
		System.out.println(equalityCheck);
		
		boolean checkIgnoreCase = name.equalsIgnoreCase(secondName);
		System.out.println(checkIgnoreCase);
	}

}

