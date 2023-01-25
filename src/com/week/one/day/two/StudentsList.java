package com.week.one.day.two;

import com.week.six.day.four.Student;

public class StudentsList {

	public static void main(String[] args) {

		// We are going to Create Object of 2 Students.
		Student firstStudent = new Student();
		
		firstStudent.setFirstName("Waris");
		firstStudent.setLastName("Hotak");
		firstStudent.setAge(21);
		firstStudent.setGrade('B');
		
		System.out.println(firstStudent.printValues());

	}

}
