package com.week.four.day.three;

public class LoopExample {

	public static void main(String[] args) {
		//Activity 
		//Using loop and String contact append all character together and create one String
		char[] letters = {'G', 'o' , 'o', 'd', ' ', 'E', 'v', 'e', 'n', 'i', 'n', 'g'};
		
		String newLetter = "";
		
		for (int indexOfArray = 0; indexOfArray < letters.length ; indexOfArray ++ ) {
			
			newLetter = newLetter + (letters[indexOfArray]);
		}
		
		//Make it all Upper Case
		String letterUpperCased = newLetter.toUpperCase();
		
		System.out.println(letterUpperCased);
		
		if (letterUpperCased.contains("EVENING")) {
			System.out.println("It's evening ");
		}
		
	}

}
