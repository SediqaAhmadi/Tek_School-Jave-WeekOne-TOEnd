package com.week.eleven.review02;

import java.util.Scanner;


public class StudentInputWithScanner{

		
		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			
			Student student = new Student();
			
			System.out.println("Enter Student ID");
			long id = scanner.nextLong();
			System.out.println("Enter Student Name");
			String name = scanner.next(); 
			
			student.setStudentId(id);
			student.setFullname(name);
			
		}

	}
