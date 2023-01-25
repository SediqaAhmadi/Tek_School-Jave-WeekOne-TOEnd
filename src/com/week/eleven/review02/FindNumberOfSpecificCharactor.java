package com.week.eleven.review02;

public class FindNumberOfSpecificCharactor {

	
	public static void main(String[] args) {
		
		String text = "afghanistan"; 
		
		// find how many a is there. 
		int count = 0; 
		char[] characters = text.toCharArray();
		
		for (int i = 0; i < characters.length; i ++) {
			if (characters[i] == 'a') {
				count ++; 
			}
		}
		System.out.println(count);
	}

}
