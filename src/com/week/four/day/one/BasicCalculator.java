package com.week.four.day.one;

import java.util.Scanner;

public class BasicCalculator {

		public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);
			System.out.println("Please enter your first number");
			double firstNumber = scanner.nextDouble();
			System.out.println("Please enter your second number");
			double secondNumber = scanner.nextDouble();
			System.out.println("please enter your operator");
			String operator = scanner.next();
			scanner.close();

			// + - * /
			if (operator.equals("+")) {
				double result = firstNumber + secondNumber;
				System.out.println(result);
			} else if (operator.equals("-")) {
				double result = firstNumber - secondNumber;
				System.out.println(result);
			} else if (operator.equals("*")) {
				double result = firstNumber * secondNumber;
				System.out.println(result);
			} else if (operator.equals("/")) {
				double result = firstNumber / secondNumber;
				System.out.println(result);
			} else {
				System.out.println("Wrong Operator. Use + - * / only");
			}
		}

	}