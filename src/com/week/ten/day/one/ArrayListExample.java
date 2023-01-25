package com.week.ten.day.one;

import java.util.ArrayList;

public class ArrayListExample {

public static void main(String[] args) {
		
		ArrayList<Object> list = new ArrayList<>();
		
		list.add("Mohammad");
		list.add(10);
		list.add(10.20);
		list.add(true);
		list.add(null);
		list.add("Mohammad");
		
		for (Object obj : list) {
			System.out.println(obj);
		}
		
		//Break till 9:00 PM EST 
	}

}
