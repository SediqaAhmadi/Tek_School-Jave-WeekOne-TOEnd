package com.week.eleven.Review01;

public class UtilityClass {

		
		
		public void firstLetterToUpperCase (String name) {
			
			char firstChar = name.charAt(0);
			
			String firstCharInString = String.valueOf(firstChar).toUpperCase();
			
			String restOfLetter = name.substring(1);
			
			System.out.println(firstCharInString + restOfLetter);
		}
		
		

	}