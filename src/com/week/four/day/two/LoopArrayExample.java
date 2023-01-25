package com.week.four.day.two;

public class LoopArrayExample {

	

		public static void main(String[] args) {
			// Given Array in double number
			// Find sum of All the numbers.
			double[] prices = { 3.13, 10.21, 50.0, 15.41, 12.31 };
			
			double result = 0; 
			
			for(int index = 0; index < prices.length ; index ++ ) {
				
				result += prices[index]; 
			}
			
			System.out.println(result);
		}

	}
