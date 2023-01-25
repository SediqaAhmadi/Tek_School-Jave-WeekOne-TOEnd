package com.week.three.day.four;

import java.time.LocalDate;

public class WorkWithDates {

public static void main(String[] args) {
		
		LocalDate todayDate = LocalDate.now();
		System.out.println(todayDate);
		System.out.println(todayDate.getYear());
		System.out.println(todayDate.getDayOfWeek());
		
		System.out.println(todayDate.getMonthValue());
	}

}
