package com.week.ten.day.one;

import java.util.ArrayList;

public class ArrayListIntroduction {

public static void main(String[] args) {
		
		//Instantiate an object of ArrayList. Specify the type of list. 
		ArrayList<String> nameList = new ArrayList<>();
		
		nameList.add("Mazyar");  //Add method to add value 
		nameList.add("Mohammad");
		nameList.add("Driss");
		nameList.add("Yahya");
		
		int listSize = nameList.size(); // size method return size of list
		System.out.println("This list size is " + listSize);
		
//		System.out.println("Value in index 0 is " + nameList.get(0));
//		
//		//How to get last value in list dynamically
//		
//		System.out.println("Last value in this array " + nameList.get(listSize - 1));
		
		for (int i = 0 ; i <  nameList.size() ; i ++ ) {
			String name = nameList.get(i);
			System.out.println(name);
		}
		
		System.out.println("========================");
		
		for (String name : nameList) {
			System.out.println(name);
		}
		
	}

}

