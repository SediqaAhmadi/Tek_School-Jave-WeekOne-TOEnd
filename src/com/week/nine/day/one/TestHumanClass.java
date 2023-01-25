package com.week.nine.day.one;

public class TestHumanClass {

public static void main(String[] args) {
		
		Human object = new Human();
		object.setFirstName("Mohammad");
		object.setLastName("Shokriyan");
		
		object.print();
		
		BaseClass obj = new Human();
		obj.print();
		
		BaseClass parent = new BaseClass();
		parent.print();
		
		//Break till 8:46 PM EST 
		
	}

}
