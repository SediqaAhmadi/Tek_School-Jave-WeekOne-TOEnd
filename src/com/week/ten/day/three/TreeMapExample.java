package com.week.ten.day.three;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

			
		public static void main(String[] args) {
			
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
			
			System.out.println(scores);
			
			System.out.println("======================================");
			
			Map<String, Integer> treemap = new TreeMap<>();
			treemap.put("John Smith", 100);
			treemap.put("Emily", 70);
			treemap.put("Mohammad", 65);
			treemap.put("David", 49);
			treemap.put("Jack", 40);
			treemap.put("Chris", 51);
			treemap.put("Ashley", 50);
			treemap.put("Christiano", 78);
			treemap.put("Bruno", 91);
			treemap.put("Pual", 31);
			
			System.out.println(treemap);
			
		}

	}

