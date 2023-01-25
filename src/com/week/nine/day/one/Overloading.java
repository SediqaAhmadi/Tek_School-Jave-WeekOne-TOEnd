package com.week.nine.day.one;

public class Overloading {
	public void doAdding(short first, short second) {
		int result = first + second; 
		System.out.println("From short parameteres " + result);
	}
	
	public void doAdding(int first, int second) {
		int result = first + second; 
		System.out.println("From Integer parameteres " + result);
	}
	
	public void doAdding(double first, double second) {
		double result = first + second; 
		System.out.println("From double parameteres " + result);
	}
	
	public void doAdding(int first, int second, int third) {
		int result = first + second + third; 
		System.out.println("From Integer parameteres " + result);
	}
	
	public void doAdding(String first, String second) {
		double result = Double.parseDouble(first) + Double.parseDouble(second);
		System.out.println("From String parameteres " + result);
	}
	

}