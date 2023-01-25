package com.week.eleven.Review01;

public class ArrayDeclaration {

public static void main(String[] args) {
		
		int[] numbers = {111, 321, 34, 5,67, 32, 15};
		
		// find even and odd numbers
		
		for (int index = 0; index < numbers.length ; index ++) {
			
			if (numbers[index] % 2 == 0) {
				System.out.println("Number is even " + numbers[index]);
			}else {
				System.out.println("Number is odd " + numbers[index]);
			}
		}
		
	}

}
