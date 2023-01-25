package com.week.three.day.two;

public class ContainMethodIgnoreCase {

public static void main(String[] args) {
		
		String gender = "FEMALE";
		
		String genderAllInLowerCase = gender.toLowerCase();
		
		boolean check = genderAllInLowerCase.contains("female");
		
		System.out.println(check);
	}

}
