package com.week.eleven.review02;

public class StringManipulation {

public static void main(String[] args) {
		
//		"welcome to Techschool" how do we find the index of letter second letter e?
		
		String text = "welcome to Techschool"; 
		int firstEIndex = text.indexOf("e");
		
		System.out.println(firstEIndex);
		
		int secondEindex = text.indexOf("e", firstEIndex + 1);
		
		System.out.println(secondEindex);
		
		System.out.println(text.length());
		
		char[] characters = text.toCharArray();
		for (int index = 0; index < characters.length ; index ++ ) {
			if (characters[index] == 'a') {
				System.out.println(index);
			}
		}
	}

}
