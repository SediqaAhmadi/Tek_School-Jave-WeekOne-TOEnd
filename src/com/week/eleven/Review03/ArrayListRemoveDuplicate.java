package com.week.eleven.Review03;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRemoveDuplicate {

	public static void main(String[] args) {
		//how do we remove all duplicates from ArrayList?
		
		List<String> originalList = new ArrayList<>();
		originalList.add("Alexandria");
		originalList.add("Tysons Corner");
		originalList.add("Vienna");
		originalList.add("Charlotte");
		originalList.add("Dallas");
		originalList.add("Vienna");
		originalList.add("Charlotte");
		originalList.add("Dallas");
		
		List<String> listToKeep = new ArrayList<>(); 
		List<String> duplicateList = new ArrayList<>(); 
		int countOfDuplicate = 0; 
		
		for (String value : originalList) {
			if (listToKeep.contains(value)) {
				countOfDuplicate ++; 
				duplicateList.add(value);
			}else {
				listToKeep.add(value);
			}
		}
		
		System.out.println("Number of duplicates " + countOfDuplicate);
		System.out.println(listToKeep);
		System.out.println(duplicateList);
		
		
		
//		Set<String> set = new HashSet<>(originalList);
//		
//		for (String value : set) {
//			System.out.println(value);
//		}
		
	}

}

