package com.week.ten.day.two;

import java.util.TreeSet;

public class TreeSetIntroduction {

	public static void main(String[] args) {
		
		TreeSet<String> set = new TreeSet<>();
		
		set.add("100");
		set.add("Hello");
		set.add("1");
		set.add("4");
		set.add("World");
		
		for(String value : set) {
			System.out.println(value);
		}
	}

}
