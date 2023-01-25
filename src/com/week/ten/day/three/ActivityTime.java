package com.week.ten.day.three;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ActivityTime {
	public static void main(String[] args) {
		// Return list of Students that have score above or equal 50;
		Map<String, Integer> scores = new HashMap<>();
		scores.put("John Smith", 100);
		scores.put("Emily", 70);
		scores.put("Mohammad", 65);
		scores.put("David", 49);
		scores.put("Jack", 40);
		scores.put("Chris", 51);
		scores.put("Ashley", 50);
		scores.put("Christiano", 78);
		scores.put("Bruno", 91);
		scores.put("Pual", 31);
		
		List<String> students = new ArrayList<>(); 
		
		Set<String> keys = scores.keySet();
		
		for(String key : keys) {
			int score = scores.get(key);
			if (score >= 50) {
				students.add(key);
			}
		}
		
		System.out.println(students);
		
		
	}

}

