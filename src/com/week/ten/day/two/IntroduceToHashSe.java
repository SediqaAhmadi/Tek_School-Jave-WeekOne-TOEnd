package com.week.ten.day.two;

import java.util.HashSet;

public class IntroduceToHashSe {
public static void main(String[] args) {
		
		//Instantiate an object of HashSet. 
		
		HashSet<String> set = new HashSet<>();
		
		set.add("Mohammad");
		set.add("Waris");
		set.add("Ali");
		set.add("Mohammad");
		set.add("Matin");
		
		System.out.println(set.size());
		
		for (String name : set) {
			System.out.println(name);
		}
		
		boolean isEmpty = set.isEmpty();

		set.remove("Mohammad");
		
		System.out.println(set.size());
		
	}

}
