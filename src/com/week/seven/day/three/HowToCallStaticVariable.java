package com.week.seven.day.three;

public class HowToCallStaticVariable {

	public static void main(String[] args) {
		
		System.out.println(Constants.googleUrl);
		
		System.out.println(Constants.number);
		
		System.out.println(Constants.secretText);
		
		
		Constants.number = 100; 
		
		if (Constants.number == 100) {
			System.out.println("Number is 100");
		}
		
		Constants.printSomething();
		
	}

}