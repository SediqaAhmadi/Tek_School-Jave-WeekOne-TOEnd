package com.week.three.day.four;

import java.time.LocalDate;

public class ActivityFromJalal {

	public static void main(String[] args) {
		LocalDate todayDate = LocalDate.now();
		int month = 11;//todayDate.getMonthValue();
		switch (month) {
		case 1:
		case 2:
		case 3:
			System.out.println("It is winter");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("It is Spring ");
			break;
		case 7:
		case 8:
		case 9:
			System.out.println("It is Summer");
			break;
		case 10:
		case 11:
		case 12:
			System.out.println("It is Fall");
			break;
		default:
			System.out.println("Wrong entery");
			break;
		}

	}

}

