package com.week.ten.day.one;

import java.util.ArrayList;

public class ArrayListRemove {

public static void main(String[] args) {
		
		//Wrapper Class for Primitive data type. 
		//byte ==> Byte
		//short ==> Short
		//int ==> Integer
		//long ==> Long
		//float ==> Float
		//double ==> Double
		//char ==> Character
		//boolean ==> Boolean
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(90);
		list.add(120);
		list.add(900);
		
		int size = list.size();
		System.out.println("Size of array list " + size);
		
		list.remove(1);  //remove method to remove 1 element with using index
		
		System.out.println("Size after removing 1 element " + list.size());
		
		for(int index = 0; index < list.size(); index ++ ) {
			System.out.println("index number is " + index);
			System.out.println("Value is " + list.get(index));
		}
	}

}

