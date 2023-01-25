package com.week.eleven.Review01;

public class TwoDimensionArray {

public static void main(String[] args) {
		
		String[][] information = {
				{"Mohammad" , "Aexandria"} , 
				{"John" , "New York "} , 
				{"Alex" , "LA"} , 
				{"Will" , "California"}
		};
		
		//using for each for 2D 
		for (String[] rows : information) {
			for (String value : rows) {
				System.out.println(value);
			}
			
		}
		
		System.out.println(information[2][0]);
		
		System.out.println(information[3][1]);
		
		for(int row = 0 ; row < information.length ; row ++ ) {
			
			for (int col = 0 ; col < information[row].length ; col ++) {
				
				System.out.println(information[row][col]);
				
			}
		}
		
	}

}

