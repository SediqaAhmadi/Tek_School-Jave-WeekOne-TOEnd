package com.week.ten.day.three;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionCopy {
	public static void main(String[] args) {
		
		List<String> fruits = new ArrayList<>();
		Collections.addAll(fruits, "Apple", "Orange", "Pineapple", "Grapes");
		
//		List<String> copy = new LinkedList<>(fruits);
//		
//		System.out.println(copy);
		
		List<String> copy = new ArrayList<>(fruits.size());
		Collections.addAll(copy, "A", "B", "B", "B");
		
		Collections.copy(copy, fruits);
		
		System.out.println(copy);
		
	}

}