package com.week.six.day.two;

public class Calculator {

	//Method signature with Parameterized 
		public void doAdding (double firstNumber , double secondNumber) {
			
			double result =firstNumber + secondNumber;
			System.out.println("Adding result " + result);
		}
		
		public void doAddingWith3Parameter(double firstNumber, double secondNumber, double thirdNumber) {
			double result = firstNumber + secondNumber + thirdNumber;
			System.out.println("Adding result " + result);
		}
		

	}