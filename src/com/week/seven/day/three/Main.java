package com.week.seven.day.three;

public class Main {


	public static void main(String[] args) {
		
		Calculator object = new Calculator(90 , 39);
		
		double addingResult = object.doAdding();
		
		System.out.println("Adding Result " + addingResult);
		
		double multiResult = object.doMultiplication();
		System.out.println("Multiplication result " + multiResult);
	}

}