package com.week.three.day.three;

public class SwitchActivity {

	public static void main(String[] args) {
		// Activity
		// base on the number of 1 to 7
		// Print the name of Day.
		// Use Switch Case statement.
		// 1 is Sunday
		byte day = 1;
		switch (day) {
		case 1:
			System.out.println("Today is Sunday");
			System.out.println("I'm Not working on Sunday");
			break;
		case 2:
			System.out.println("Today is Monday");
			break;
		case 3:
			System.out.println("Today is Tuesday");
			break;
		case 4:
			System.out.println("Today is Wednesday");
			break;
		case 5:
			System.out.println("Today is Thursday");
			break;
		case 6:
			System.out.println("Today is Friday. Fun Day");
			break;
		case 7:
			System.out.println("Today Saturday");
			break;
		default:
			System.err.println("Wrong entry Days must be 1 - 7 only.");
			break;
		}

	}

}
