package com.week.eleven.Review01;

import java.time.LocalDate;

public class SwitchCases {

	public static void main(String[] args) {

//		Scanner scanner = new Scanner(System.in);
//		int day = scanner.nextInt();
//		scanner.close();
		
		LocalDate today = LocalDate.now(); 
		
		int day =today.getDayOfWeek().getValue() + 1;

		switch (day) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.err.println("Days in not valid");
			break;
		}

		System.out.println("printing after switch case");
	}

}

