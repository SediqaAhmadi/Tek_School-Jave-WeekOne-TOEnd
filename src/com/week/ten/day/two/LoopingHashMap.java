package com.week.ten.day.two;

import java.util.HashMap;
import java.util.Set;

public class LoopingHashMap {

public static void main(String[] args) {
		
		HashMap<String, Integer> values = new HashMap<>();
		
		values.put("Mohammad", 40);
		values.put("Waris", 100);
		values.put("Farshaid", 99);
		values.put("Zahal", 99);
		values.put("Hadia", 70);
		values.put("Hadia", 100);
		
		System.out.println(values.isEmpty());
		
		Set<String> keys = values.keySet();
		
		for(String key: keys) {	
			int score = values.get(key);
			
			if (score >= 50 ) {
				System.out.println("Good Job " + key);
			}else {
				System.out.println("Practice more");
			}
			
		}
		
	
}
}
