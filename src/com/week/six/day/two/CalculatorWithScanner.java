package com.week.six.day.two;

import java.util.Scanner;

public class CalculatorWithScanner {


		
		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			
			//Instantiate and Object of Class. 
			CalculatorService service = new CalculatorService();
			
			System.out.println("Enter first number:");
			//Assign data to member of the class CalculatorService. 
			service.firstNumber = scanner.nextDouble();
			
			System.out.println("Enter second number:");
			service.secondNumber = scanner.nextDouble();
			
			// Calling the method doAdding from CalculatorService
			service.doAdding();
			scanner.close();
			
			
		}
	}
