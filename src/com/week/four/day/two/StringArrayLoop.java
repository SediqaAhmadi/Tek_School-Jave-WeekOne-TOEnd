package com.week.four.day.two;

public class StringArrayLoop {

public static void main(String[] args) {
		
		String[] words = {"Hello" , "Everyone", "Today" , "is" , "Wednesday"};
		
		String sentence = ""; 
		
		for (int index = 0; index < words.length ; index ++ ) {
			
			sentence = sentence + words[index] + " ";
		}
		
		System.out.println(sentence);
		
	}

}
