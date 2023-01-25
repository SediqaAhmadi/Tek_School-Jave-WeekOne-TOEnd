package com.week.four.day.two;

public class RepeatThisExample {

	public static void main(String[] args) {
		// Given Array in double number
		// Find sum of All the numbers.
		double[] prices = { 3.13, 10.21, 50.0, 15.41, 12.31 };
		
		double result = 0 ; 
		
		for(int start = 0; start < prices.length ; start++) {
			result += prices[start];
		}
		
		System.out.println(result);
		

//		result += prices[0];
//		result += prices[1];
//		result += prices[2];
//		result += prices[3];
//		result += prices[4];
		
	}

}