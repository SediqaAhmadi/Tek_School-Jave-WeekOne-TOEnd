package com.week.six.day.two;

public class BasicCalculator2 {

	public static void main(String[] args) {
		
		CalculatorService calculator = new CalculatorService();
		calculator.firstNumber = 120321; 
		calculator.secondNumber = 341.21; 
		
		calculator.doAdding();
		calculator.doSubtraction();
		calculator.doMultiplication();
		calculator.doDivision();
		calculator.findRemained();
		
	}

}
