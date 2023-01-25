package com.week.six.day.one;

public class Human {
	
		
		String firstName; 
		
		String lastName; 
		
		//Required to pass values for firstName and last upon creating object. 
		
		public Human() {}

		public Human(String firstNameParameter, String lastNameParameter) {
			firstName = firstNameParameter ;
			lastName = lastNameParameter; 
		}
		
		public String getFullname() {
			return firstName + " " + lastName;
		} 
}


