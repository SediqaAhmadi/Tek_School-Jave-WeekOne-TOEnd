package com.week.four.day.two;

public class ActivityForLoop {

public static void main(String[] args) {
		
		// Find all odd numbers from 300 to 267 decrement it; 
		
		for(int start = 300 ; start >= 267 ; start --) {
			
			if(start % 2 != 0) {
				System.out.println(start);
			}
		}
		
	}

}
