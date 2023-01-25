package com.week.two.day.three;

public class StringRecap {

	public static void main(String[] args) {

		String greeting = "Hello World !!";

		// Find the length of string;
		int lengthOfGreeting = greeting.length();
		System.out.println("Length is " + lengthOfGreeting);

		// Make All letter upper case
		String greetingInUpperCase = greeting.toUpperCase();
		System.out.println(greetingInUpperCase);

		// Make all letter to lower case
		String greetingInLowerCase = greeting.toLowerCase();
		System.out.println(greetingInLowerCase);

		// Finding the of a given character.
		int indexOfLetterL = greeting.indexOf('l');
		System.out.println("Index of letter L is " + indexOfLetterL);

		// Find the Character of Specific Index.
		char characterInIndex6 = greeting.charAt(6);
		System.out.println("The Character on Idex 6 " + characterInIndex6);
	}

}

