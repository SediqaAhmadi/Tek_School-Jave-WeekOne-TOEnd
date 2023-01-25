package com.week.five.day.one;

public class ForEachWithInteger {

		

		public static void main(String[] args) {
			//Sum all the numbers
			int[] numbers = {10, 30 , 320 , 20 , 10 , 40};
			
			int result = 0; 
			for (int value : numbers) {
				result += value; 
			}
			
			System.out.println(result);
			
		}
		
		

	}