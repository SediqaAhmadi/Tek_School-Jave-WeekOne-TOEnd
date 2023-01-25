package com.week.six.day.two;

public class TestPersons {

	public static void main(String[] args) {
		
		Person mohammad = new Person();
		mohammad.firstName = "Mohammad";
		mohammad.lastName = "Shokriyan";
		
		String fullname = mohammad.getFullname();
		
		
		System.out.println(fullname);
		
	}

}
