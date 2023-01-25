package com.week.ten.day.two;

import java.util.HashMap;

public class IntroducingToHashMap {
public static void main(String[] args) {
		
		//Instatiate object from HashMap class. 
		HashMap<Integer, String> map = new HashMap<>();
		
		//put to add pair of key and value. 
		map.put(1, "Alexandira");
		map.put(2, "Falls Church");
		map.put(3, "Potomac");
		
		System.out.println(map.size());
		
		String city = map.get(2);
		
		System.out.println(city);
		
		map.remove(1);
		
		map.clear();
		
		map.isEmpty();
	}

}