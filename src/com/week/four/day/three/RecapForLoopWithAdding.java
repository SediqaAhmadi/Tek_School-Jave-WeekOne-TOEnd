package com.week.four.day.three;

public class RecapForLoopWithAdding {

	
	public static void main(String[] args) {
		
		double[] prices = {12.31, 13.32, 54.10, 100 , 20.89 , 12.21};
		
		// Sum all the numbers in the array; 
		
		double result = 0 ; //Declare a variable to store total Amount 
		
		for (int index = 0 ; index < prices.length; index ++ ) {
			System.out.println("Index is " + index);
			System.out.println("Value of the index is " + prices[index]);
			result +=  prices[index];
		}
		
		System.out.println("Total Amount " + result);
		
	}

}
