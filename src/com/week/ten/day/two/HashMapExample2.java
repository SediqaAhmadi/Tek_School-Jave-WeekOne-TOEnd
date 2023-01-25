package com.week.ten.day.two;

import java.util.HashMap;

public class HashMapExample2 {

public static void main(String[] args) {
		
		HashMap<String, Integer> values = new HashMap<>();
		values.put("Mohammad", 100);
		values.put("Waris", 100);
		values.put("Farshaid", 99);
		values.put("Zahal", 99);
		values.put("Hadia", 70);
		values.put("Hadia", 100);
		
		System.out.println(values.size());
		System.out.println(values);
		
	}

}