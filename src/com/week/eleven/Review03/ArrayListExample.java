package com.week.eleven.Review03;

import java.util.ArrayList;

public class ArrayListExample {
public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>(); 
		
		list.add("Alexandria");
		list.add("Tysons Corner");
		list.add("Vienna");
		list.add("Charlotte");
		list.add("Dallas");
		int size = list.size();
		System.out.println("Size of This array " + size);
		
		//System.out.println(list.get(1));
		
//		for (int i = 0; i < list.size(); i ++) {
//			System.out.println(list.get(i));
//		}
		
		for (String value : list) {
			
			String valueUpperCase = value.toUpperCase();
			
			System.out.println(valueUpperCase);
			
//			if (value.startsWith("D")) {
//				System.out.println(value);
//			}
			
		}
		
	}
	

}
