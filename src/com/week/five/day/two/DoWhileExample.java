package com.week.five.day.two;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		// Check password Length. it should be 8 or more.
		// Ask User to enter new password.
		// check the length if it's less than 8 ask user again.
		// String.length();
		
		Scanner scanner = new Scanner(System.in);
		String password = "";
		do {
			//Do execute this code at least 1 time
			System.out.println("Please Enter a password");
			password = scanner.next();
			
			//Check condition to give output to user.
			if (password.length() >= 8) {
				System.out.println("User Entered a password more that 8 character");
			}else {
				System.out.println("Password is less than 8 character and try again");
			}
			
		} while (password.length() < 8);
		
		
		scanner.close();
	}

}

