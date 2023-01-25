package com.week.three.day.two;

public class IfStatementWithIfElse {

	public static void main(String[] args) {
		//Male, Female, Other
		String gender = "Male";

		if (gender.equals("Male")) {
			//Option 1
			System.out.println("I'm a man");
			
		} else if (gender.equals("Female")) {
			//Option 2
			System.out.println("I'm a women");
			
		} else {
			//Option 3
			System.out.println("Prefer not to say");
		}
		
	}

}