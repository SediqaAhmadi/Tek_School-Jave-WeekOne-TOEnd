package com.week.four.day.one;

public class ActivityArray {

public static void main(String[] args) {
		
		int[] numbers = new int[4];
		//Assigned value 10, 20, 30, 40; 
		// using * multiply all numbers to the result. 
		numbers[0] = 10; 
		numbers[1] = 20; 
		numbers[2] = 30; 
		numbers[3] = 40; 
		
		int result = 1; 
		result *= numbers[0];
		result *= numbers[1];
		result *= numbers[2];
		result *= numbers[3];
		int lengthOfNumbers = numbers.length;
		System.out.println(result);
		System.out.println(numbers.length);
		System.out.println(numbers[ lengthOfNumbers - 1 ]);
	}

}
