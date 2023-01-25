package com.week.eight.Alldays;

import java.text.DateFormatSymbols;

public class PrintDaysOfWAndMonthOfY {


			//How print days of week
			//first we create object of DateFormatSymbols and import the class form java.text package
			DateFormatSymbols dfs = new DateFormatSymbols();
			String[] daysOfWeek = dfs.getWeekdays();
				
			for(String dayName : daysOfWeek) {
				System.out.println(dayName);
			}
			System.out.println("\n");
			//if we have already created object of DateFormatSymbols, we don't need to do it again
			//we can use the same object
			String[] monthsOfYear = dfs.getMonths();
			for(String mOfy : monthsOfYear) {
				System.out.println(mOfy);
			}
}

}


