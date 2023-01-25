package com.week.seven.day.four;



public class Main {

	
	public static void main(String[] args) {
		
		Service service = new Service();  // instantiating new Object
		
		service.print(Constant.greet); // Constant is a class Name. greet is a static final variable
		
		double result = service.utility.adding(10, 30);  // adding coming from Utility Class
		
		service.print(String.valueOf(result)); // print is from Service class 
		
	}

}