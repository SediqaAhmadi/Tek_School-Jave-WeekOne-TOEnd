package com.week.four.day.one;

public class DoubleArraysNumbers {

	public static void main(String[] args) {
		
		//Declare and array of type double.
		double[] numbers = new double[3];
		//Assigned values. 
		numbers[0] = 31.23;
		numbers[1] = 56.21;
		numbers[2] = 100.00;
		
		//Find sum of all elements in the arrays. 
		double result = 0;
		
		result += numbers[0];
		result += numbers[1];
		result += numbers[2];
		
		System.out.println("Total is " + result);
	}

}
