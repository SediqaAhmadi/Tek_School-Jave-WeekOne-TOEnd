package com.week.three.day.three;

public class StringSelectionStatment {
	
public static void main(String[] args) {
		
		//Check given String is equal to "Daniel". 
		// Or the Given name is eqaul to "Ali"
		// Or the given name is equal to "Mohammad"
		// else print the names is not equal to those two;
		
		String name = "ali";  //Empty Strings 
		
		if (name.equals("Daniel")) {
			System.out.println("You are Daniel");
		} else if (name.equals("Ali")) {
			
			System.out.println("You are Ali ");
			
		} else if (name.equals("Mohammad")) {
			System.out.println("You are Mohammad");
		}else {

			System.out.println("I don't know you");

		}
		
	}

}

