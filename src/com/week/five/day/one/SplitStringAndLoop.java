package com.week.five.day.one;

public class SplitStringAndLoop {

	public static void main(String[] args) {

		// Split String.

		String text = "Today is monday. we have Java Class";
		// Split it with Space.

		String[] textSplitted = text.split("\\.");

		for (int index = 0; index < textSplitted.length; index++) {

			System.out.println(textSplitted[index]);

		}

	}

}
