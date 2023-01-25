package com.week.six.day.one;

public class BreakTheStatements {

public static void main(String[] args) {
		
		// Find number 12 in this array. Stop the loop as soon as you find 12
		int[] numbers = {10 , 22, 43 , 45  , 54 , 12 , 120 , 12};
		
		for (int index = 0 ; index < numbers.length ; index ++ ) {
			
			if (numbers[index] == 12) {
				System.out.println("Found 12 on index " + index);
				break;
			}
		}
		
		
		
	}

}
