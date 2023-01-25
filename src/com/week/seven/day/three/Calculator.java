package com.week.seven.day.three;

public class Calculator {

	public double firstNumber; 
	public double secondNumber; 
	
	
	public Calculator(double firstNumber, double secondNumber) {
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}
	
	
	public double doAdding() {
		return this.firstNumber + this.secondNumber;
	}
	
	
	public double doSubtraction() {
		return this.firstNumber - this.secondNumber;
	}
	
	public double doMultiplication() {
		return this.firstNumber * this.secondNumber;
	}

}