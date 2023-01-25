package com.week.eleven.Review03;

import java.util.Set;
import java.util.TreeMap;

public class MapExamples {

	
		
		public static void main(String[] args) {
			
			TreeMap<Integer, String> cityMap = new TreeMap<>();
			
			cityMap.put(1, "Dallas");
			cityMap.put(2, "Arlington");
			cityMap.put(3, "Richmond");
			cityMap.put(4, "Seattle");
			
			Set<Integer> keys = cityMap.keySet();
			
			for (int id : keys) {
				System.out.println(id);
				System.out.println(cityMap.get(id));
			}
			
			
			cityMap.clear();
		}

	}