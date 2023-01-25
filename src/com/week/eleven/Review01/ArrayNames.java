package com.week.eleven.Review01;

public class ArrayNames {

public static void main(String[] args) {
		
		String[] names = new String[5];
		
		names[0] = "mohammad";
		names[1] = "ali";
		names[2] = "Jan Ali";
		names[3] = "yahya"; 
		names[4] = "john";
		
		UtilityClass utility = new UtilityClass(); 
		
		for (int i = 0 ; i < names.length; i ++) {
			
			utility.firstLetterToUpperCase(names[i]);
			
		}
		
	}

}
