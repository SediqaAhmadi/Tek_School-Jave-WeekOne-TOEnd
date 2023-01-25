package com.week.ten.day.three;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsAdd {

	public static void main(String[] args) {
		
		//Collections.addAll(); 
		
		ArrayList<String> students = new ArrayList<>(); 
		
		students.add("Mohammad");
		students.add("Waris");
		students.add("Ali");
		
		Collections.addAll(students, "Hadia", "Yahya", "Driss", "Zahal");
		
		Collections.addAll(students, "Latifa", "Shoaib", "Aisha");
		
		System.out.println(students);
		
		
	}

}