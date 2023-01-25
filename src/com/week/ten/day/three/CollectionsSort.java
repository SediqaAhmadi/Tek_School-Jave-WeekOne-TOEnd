package com.week.ten.day.three;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CollectionsSort {

	public static void main(String[] args) {
		
		List<Integer> numbers = new LinkedList<>();
		
		Collections.addAll(numbers, 12, 11, 31, 44, 11, 44, 56, 100, 1 , 3, 6, 9);
		
		System.out.println("Original Order");
		System.out.println(numbers);
		
		
		//Sort the values in List only. 
		Collections.sort(numbers);
		
		System.out.println("After Sorted");
		System.out.println(numbers);
	}

}
