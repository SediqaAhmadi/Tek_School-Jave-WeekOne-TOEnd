package com.week.four.day.one;

public class ActivityForTwoDArray {

	public static void main(String[] args) {

		int[][] numbers = { { 12, 32, 43 }, { 61, 87, 21 }, { 7, 44, 91 }, };

		// Find the value in position index 1,1
		// then Find out is the number odd or even?
		int number =numbers[1][0];
		
		if (number % 2 == 0) {
			System.out.println(number + " Is Even");
		} else {
			System.out.println(number + " is odd");
		}

	}

}
