package com.week.five.day.one;

public interface NestedLoopWith2DArray {
public static void main(String[] args) {
		
		int[][] numbers = {
				{10, 20 , 30 , 40} , 
				{50, 60 , 70 , 80}
		};
		System.out.println("Row Length is " + numbers.length);
		
		
		for (int row = 0 ; row < numbers.length ; row ++ ) {
			
			System.out.println("Column Length is " + numbers[row].length);
			
			for (int col = 0; col < numbers[row].length ; col ++) {
				
				System.out.println(row + " " + col + " " + numbers[row][col]);
				
			}
			
		}
		
	}

}
