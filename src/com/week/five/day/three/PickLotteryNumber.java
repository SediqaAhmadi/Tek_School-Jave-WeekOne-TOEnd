package com.week.five.day.three;

public class PickLotteryNumber {


	public static void main(String[] args) {
		// Lottery 5 numbers between 1 and 57 and it should not be repeated
		int[] lotteryNumbers = new int[5];
		
		for (int index = 0 ; index < lotteryNumbers.length ; index ++) {
			
			int random = (int) (Math.random() * 57);
			
			lotteryNumbers[index] = random;
		}
		
		
		for (int index = 0 ; index < lotteryNumbers.length; index ++) {
			System.out.print(lotteryNumbers[index] + " , ");
		}
	}

}
