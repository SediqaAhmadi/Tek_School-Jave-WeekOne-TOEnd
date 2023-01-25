package com.week.three.day.three;

public class SwitchStatement {

	public static void main(String[] args) {
		// gender as Char, M, F, O
		char gender = 'O';

		switch (gender) {
		case 'M':
			System.out.println("You are a Man");
			break;
		case 'F':
			System.out.println("You are A Woman");
			break;
		case 'O':
			System.out.println("Prefer not to say");
			break;
		default: //Optional. Always Coming at end
			System.err.println("Wrong Entry for Gender");
			break;
		}
	

	}

}
