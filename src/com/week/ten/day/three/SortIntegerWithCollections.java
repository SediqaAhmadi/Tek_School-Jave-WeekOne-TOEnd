package com.week.ten.day.three;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortIntegerWithCollections {

	public static void main(String[] args) {

		List<Integer> numbers = new LinkedList<>();

		Collections.addAll(numbers, 12, 11, 31, 44, 11, 44, 56, 100, 1, 3, 6, 9);

		// Sort the values in List only.
		Collections.sort(numbers);
		
		System.out.println(numbers);
		
		Collections.reverse(numbers);
		
		System.out.println(numbers);
		

	}

}
