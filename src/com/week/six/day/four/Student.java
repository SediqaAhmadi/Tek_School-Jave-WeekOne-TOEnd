package com.week.six.day.four;

public class Student {

	
		
		private String firstName; 
		private String lastName; 
		private int age ; 
		private char grade; 
		
		//Getters and Setter for FirstName
		public void setFirstName(String firstNameParam) {
			firstName = firstNameParam;
		}
		
		public String getFirstName() {
			return firstName;
		}
		
		public void setLastName(String lastNameParam) {
			lastName = lastNameParam;
		}
		
		public String getLastName() {
			return lastName;
		}
		
		public void setAge(int ageParam) {
			age = ageParam;
		}
		
		public int getAge() {
			return age; 
		}
		
		public void setGrade(char gradeParam) {
			grade = gradeParam;
		}

		public char getGrade() {
			return grade;
		}
		
		public String printValues() {
			return firstName + " " + lastName + " " + age + " " + grade;
		}
	}