package com.week.three.day.four;

import java.util.Scanner;

public class RecapSwitchCase {

public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		// Activity
		System.out.println("Enter Day of Week");
		String weekday = scanner.next();
		
		scanner.close();
		
		switch (weekday) {
		case "Sunday":
			System.out.println(1);
			break;
		case "Monday":
			System.out.println(2);
			break;
		case "Tuesday":
			System.out.println(3);
			break;
		case "Wednesday":
			System.out.println(4);
			break;
		case "Thursday":
			System.out.println(5);
			break;
		case "Friday":
			System.out.println(6);
			break;
		case "Saturday":
			System.out.println(7);
			break;
		default:
			System.out.println("wrong entry");
			break;
		}

	}

}
