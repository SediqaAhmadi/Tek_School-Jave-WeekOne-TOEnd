package com.week.five.day.three;

public class CodeFromAkbar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] LotteryNumbar = new int[5];
		for (int index = 0 ; index < LotteryNumbar.length ; index ++) {

		int random = (int) (Math.random() * 57);
		LotteryNumbar[index] =random;

		}
		//System.out.println(Arrays.toString(LotteryNumbar));
		for (int index = 0 ; index < LotteryNumbar.length; index ++ ) {
			
			System.out.print(LotteryNumbar[index]);
			
			if (index < LotteryNumbar.length -1) {
				System.out.print(" , ");
			}
		}
	}
}
