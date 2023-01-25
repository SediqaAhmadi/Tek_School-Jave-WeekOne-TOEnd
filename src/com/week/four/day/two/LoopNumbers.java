package com.week.four.day.two;

public class LoopNumbers {

public static void main(String[] args) {
		
		//Find all even numbers from 0 - 20; 
		
		for (int start = 0; start <= 20 ; start ++) {
			System.out.println(start );
			
			if (start % 2 == 0) {
				System.out.println("This is Even " + start );
			}else {
				System.out.println("This is Odd " + start );
			}
		}
		
	}

}
