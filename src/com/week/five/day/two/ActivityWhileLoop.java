package com.week.five.day.two;

import java.util.Scanner;

public class ActivityWhileLoop {

public static void main(String[] args) {
		
		//Check password Length. it should be 8 or more. 
		//Ask User to enter new password. 
		//check the length if it's less than 8 ask user again. 
		//String.length();
		Scanner scanner = new Scanner(System.in);
		
		String password = "";
		
		while (password.length() <= 8 ) {
			
			System.out.println("Enter Your password");
			password = scanner.next();
			
			int length = password.length();
			
			if (length >= 8) {
				System.out.println("Use entered password more that 8 in lenght");
			}else {
				System.err.println("Length of Password should be more that 8 try again");
			}
		}
		scanner.close();
		
	}

}