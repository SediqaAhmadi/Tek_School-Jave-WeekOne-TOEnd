package com.week.six.day.two;

public class BasicCalculator {

public static void main(String[] args) {
		
		// Create 2 numbers and do adding, multiplication subctraction and division
		
		CalculatorService service = new CalculatorService();
		
		service.firstNumber = 10.21;
		service.secondNumber = 2.31;
		
		//do adding
		service.doAdding();
		
		//do multiplication 
		service.doMultiplication();
		
		//do subtraction 
		service.doSubtraction();
		
		service.doDivision();
		
		service.findRemained();
	
//		double firstNumber = 10.21; 
//		double secondNumber = 2.31; 
//		
//		double additionResult = firstNumber + secondNumber; 
//		System.out.println("Result for Adddition " + additionResult);
//		
//		double mulptilicationResult = firstNumber * secondNumber; 
//		System.out.println("Result for multiplication " + mulptilicationResult);
//		
//		double subtractionResult = firstNumber - secondNumber; 
//		System.out.println("Result for Subtraction " + subtractionResult);
//		
//		double quotient = firstNumber / secondNumber; 
//		System.out.println("Quotient for division " + quotient);
//		
//		double remained = firstNumber % secondNumber; 
//		System.out.println("Remained for division " + remained);
	}

}

