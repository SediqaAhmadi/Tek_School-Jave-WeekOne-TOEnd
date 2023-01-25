package com.week.four.day.three;

public class CounterApplicaion {

	public static void main(String[] args) throws InterruptedException {
		// Count Down form 10 to 1 ;//new year. 
		
		for (int start = 10 ; start >= 0 ; start --) {
			
			Thread.sleep(1000);
			System.out.println(start);
			
			if(start == 0) {
				System.out.println("Happy New Year !!!! ");
			}
			
		}
	}

}
