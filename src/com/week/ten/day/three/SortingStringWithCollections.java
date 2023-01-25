package com.week.ten.day.three;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingStringWithCollections {
	
public static void main(String[] args) {
		
		List<String> students = new ArrayList<>(); 
		
		Collections.addAll(students, "John", "Bob", "David", "Alex","Amanda", "Jim");
		
		System.out.println(students);
		
		Collections.sort(students);
		
		System.out.println(students);
		
		Collections.reverse(students);
		
		System.out.println(students);
		
		//Break till 9:00 PM EST 
	}

}
