package com.week.ten.day.two;

import java.util.ArrayList;
import java.util.List;

public class RecapArrayList {

public static void main(String[] args) {
		
		List<String> cities = new ArrayList<>();
		
		cities.add("Falls Church");
		cities.add("Alexandria");
		
		int size = cities.size();
		
		cities.get(1);
		
		cities.remove(1);
		
		for (int i = 0 ; i < cities.size() ; i ++) {
			System.out.println(cities.get(i));
		}
		
		for (String city : cities) {
			System.out.println(city);
		}
		
		System.out.println(cities.isEmpty());
		
		cities.clear();
		
		System.out.println(cities.isEmpty());
		
		
		//Break 20 min 7:56 PM EST. 
		
		
	}

}

