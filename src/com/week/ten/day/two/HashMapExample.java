package com.week.ten.day.two;

import java.util.HashMap;

public class HashMapExample {

public static void main(String[] args) {
		
		HashMap<Integer, String> citiesMap = new HashMap<>();
		
		citiesMap.put(1, "Alexandria");
		citiesMap.put(2, "Falls Church");
		
		System.out.println(citiesMap);
		
		System.out.println("=================");
		citiesMap.put(2, "Tysons Corner");
		
		System.out.println(citiesMap);
	}

}
