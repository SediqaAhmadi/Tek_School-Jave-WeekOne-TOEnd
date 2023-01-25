package com.week.six.day.two;

public class CalculatorService {

	double firstNumber; 
	double secondNumber; 
	
	//Responsible to do addition
	public void doAdding() {
		double result = firstNumber + secondNumber; 
		System.out.println("Addition result " + result);
	}
	
	public void doMultiplication() {
		double mulptilicationResult = firstNumber * secondNumber; 
		System.out.println("Result for multiplication " + mulptilicationResult);
	}
	
	public void doSubtraction() {
		double subtractionResult = firstNumber - secondNumber; 
		System.out.println("Result for Subtraction " + subtractionResult);
	}
	
	public void doDivision() {
		double quotient = firstNumber / secondNumber; 
		System.out.println("Quotient for division " + quotient);
	}
	
	public void findRemained() {
		double remained = firstNumber % secondNumber; 
		System.out.println("Remained for division " + remained);
	}
	

}
