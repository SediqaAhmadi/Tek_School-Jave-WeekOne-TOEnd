package com.week.nine.day.two;

public class Tekschool {
	
	public static void main(String[] args) {
		Instructor instructorObject = new Instructor(); 
		
		instructorObject.fullName = "Mohammad Shokriyan";
		instructorObject.responsibility();
		instructorObject.printFullName();
		
		Student student = new Student();
		student.fullName = "Mohammad Ahmadi";
		student.responsibility();
		student.printFullName();
		
		Student student1 = new Student(); 
		student1.fullName = "Zaki Akrami";
		student1.responsibility();
		student1.printFullName();
		
	}

}