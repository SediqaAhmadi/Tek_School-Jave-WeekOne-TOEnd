package com.week.four.day.three;

public class LoopScannerExample {

public static void main(String[] args) {
		
		int[] numbersArray = new int[100];
		
		//100-200;
		
		int number = 100; 
		
		for (int index = 0 ; index < numbersArray.length; index ++ ) {
			numbersArray[index] = number;
			number ++; 
		}
		
		for (int index = 0 ; index < numbersArray.length; index ++ ) {
			System.out.println(numbersArray[index]);
		}
		
		//System.out.println(Arrays.toString(numbersArray));
	}

}
