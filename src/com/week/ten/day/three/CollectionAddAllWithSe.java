package com.week.ten.day.three;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CollectionAddAllWithSe {

	public static void main(String[] args) {
		
		Set<Integer> numbers = new HashSet<>();
		
		Collections.addAll(numbers, 12, 11, 31, 44, 11, 44, 56, 100);
		
		System.out.println(numbers);
		
		numbers.remove(12);
		
		System.out.println(numbers);
		
		
	}

}

