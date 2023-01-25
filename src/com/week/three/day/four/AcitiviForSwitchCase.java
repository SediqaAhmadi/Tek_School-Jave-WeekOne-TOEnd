package com.week.three.day.four;

import java.time.LocalDate;

public class AcitiviForSwitchCase {

	public static void main(String[] args) {
		LocalDate todayDate = LocalDate.now();
		int month = todayDate.getMonthValue();
		
		// Base on the month find which season you are. 
		if (month == 3 || month == 4 || month == 5) {
			System.out.println("Its Spring");
		}else if (month == 6 || month == 7 || month == 8 ) {
			System.out.println("It's Summer");
		}else if (month == 9 || month == 10 || month == 11) {
			System.out.println("It's Fall");
		} else if (month == 12 || month == 1 || month ==2 ) {
			System.out.println("It's Winter");
		} else {
			System.err.println("Wrong entry");
		}
	}

}
