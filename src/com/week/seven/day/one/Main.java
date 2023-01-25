package com.week.seven.day.one;

import week.seven.day.one.inheritance.Service;

public class Main {
	public static void main(String[] args) {

		int[] numbers = { 10, 20, 30, 40, 50, 60, 66, 78, 542 };

		Service object = new Service();

		int sum = object.getSum(numbers);

		System.out.println(sum);
	}

}