package com.week.eleven.Review01;

public class StringManipulation2 {

	public static void main(String[] args) {
		//How to Make Only First letter Upper Case. 
		
		//Instantiate new Object of class using Constructor 
		UtilityClass utility = new UtilityClass();
		
		String firstName = "mohammad"; 
		
		utility.firstLetterToUpperCase(firstName);
		
		utility.firstLetterToUpperCase("driss");
		
		utility.firstLetterToUpperCase("waris");
		
		utility.firstLetterToUpperCase("ahem");
		
		utility.firstLetterToUpperCase("a");
		
		
		
		
		
//		char firstLetter = firstName.charAt(0);
//		
//		char firstLetterInUpperCase = Character.toUpperCase(firstLetter);
//		
//		System.out.println(firstLetterInUpperCase);
//		
//		String restOfLetters = firstName.substring(1);
//		
//		System.out.println(firstLetterInUpperCase + restOfLetters);
	}

}

