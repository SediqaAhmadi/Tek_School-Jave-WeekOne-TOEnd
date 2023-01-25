package com.week.six.day.one;

public class BreakExample {
	
	public static void main(String[] args) {
		// Find number 22 in this array. 
		// Stop the loop as soon as have found 2 of 22s inside this array. 
		int[] numbers = {10 , 22, 43 , 45  , 54 , 22 , 120 , 12 , 22 , 22 };
		
		int counter = 0; 
		
		for (int index = 0 ; index < numbers.length ; index ++) {
			
			if (numbers[index] == 22) {
				System.out.println("Found 22 on index " + index);
				counter ++; 
			}
			
			if (counter == 2) {
				break;
			}	
		}
	}

}
