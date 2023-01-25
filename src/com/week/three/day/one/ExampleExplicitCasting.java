package com.week.three.day.one;

public class ExampleExplicitCasting {

		
		public static void main(String[] args) {
			
			double numberA = 40.3; 
			
			double numberB = 10.3; 
			
			double result = numberA * numberB; 
			
			System.out.println(result);
			
			long resultInInt = (long) result;
			
			System.out.println(resultInInt);
		}

	}