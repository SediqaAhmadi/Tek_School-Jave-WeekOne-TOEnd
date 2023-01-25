package com.week.ten.day.one;

import java.util.ArrayList;

public class StudentListPractice {

		public static void main(String[] args) {
			
			ArrayList<Student> studentsList = new ArrayList<>(); 
			
			Student first = new Student("Mohammad", "Shokriyan", 70);
			studentsList.add(first);
			
			Student second = new Student("Zaki", "Akrami", 100);
			studentsList.add(second);
			
			Student third = new Student("Matin", "Bahrami", 90);
			studentsList.add(third);
			
			
			System.out.println(studentsList.size());
			
			
			for(Student student : studentsList) {
				System.out.println("Student First Name " + student.getFirstName() 
				+ " Student Last Name " + student.getLastName()
				+ " Student score " + student.getScore());
				
			}
		}}

		