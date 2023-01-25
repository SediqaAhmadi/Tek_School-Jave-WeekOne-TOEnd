package com.week.nine.day.four;

public class Main {

	public static void main(String[] args) {
		
		HeapAndStack object = new HeapAndStack();
		object.name = "Mohammad"; 
		
		object.number = 12; 
		
		
		object.printName();
		
		int newNumber = object.getNumberMultiplyByTen();
		
		System.out.println("New Number is " + newNumber);
		
	}

}