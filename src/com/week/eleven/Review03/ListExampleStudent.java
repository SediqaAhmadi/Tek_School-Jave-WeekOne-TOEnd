package com.week.eleven.Review03;

import java.util.ArrayList;

import com.week.eleven.review02.Student;

public class ListExampleStudent {

	
		
		public static void main(String[] args) {
			
			ArrayList<Student> list = new ArrayList<>();
			
			Student student1 = new Student(1231, "Alex Morgan"); 
			
			list.add(student1);
			Student student2 = new Student(1321, "Tom Hanks");
			list.add(student2);
			Student student3 = new Student(43121, "John Smith");
			list.add(student3);
			
			System.out.println(list.size());
			
			for (Student student : list) {
				System.out.println(student.getStudentId() + " " + student.getFullname());
			}
			
		}

	}
