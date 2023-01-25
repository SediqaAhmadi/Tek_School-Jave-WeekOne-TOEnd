package com.week.three.day.three;

public class SwitchCaseWithString {

	public static void main(String[] args) {

		String gender = "MALE";
		
		String genderInLowerCase = gender.toLowerCase();
		
		switch (genderInLowerCase) {
		case "male":
			System.out.println("You are a Man");
			break;
		case "female":
			System.out.println("You are Woman");
			break;
		case "other":
			System.out.println("Prefer Not to say");
			break;
		default:
			System.out.println("Wrong Entry");
			break;
		}

	}

}
