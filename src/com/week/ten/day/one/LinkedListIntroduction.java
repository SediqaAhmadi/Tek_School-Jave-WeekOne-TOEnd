package com.week.ten.day.one;

import java.util.LinkedList;

public class LinkedListIntroduction {

public static void main(String[] args) {
		
		//Instantiate and object LinkedList
		LinkedList<String> list = new LinkedList<>();
		
		list.add("Mohammad");
		list.add("Driss");
		list.add("Asif");
		list.add("Abdul");
		
		String firstElement = list.getFirst();
		System.out.println("First Element " + firstElement);
		 
		String lastElement = list.getLast();
		System.out.println("Last Element " + lastElement);
		
		System.out.println(list.get(2));
		System.out.println(list.get(1));
		
		System.out.println(list.size());
		
		list.remove(1);
		
		for (String name : list) {
			System.out.println(name);
		}
		
	} 

}
