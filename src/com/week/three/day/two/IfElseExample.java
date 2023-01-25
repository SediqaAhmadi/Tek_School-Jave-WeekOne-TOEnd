package com.week.three.day.two;

public class IfElseExample {


		public static void main(String[] args) {
			double item1 = 10.10;
			double item2 = 30.31;
			double item3 = 40.50;

			// Find the sum of all items item1 + item2 + item3;
			double subTotal = item1 + item2 + item3;
			System.out.println("Subtotal is " + subTotal);
			// if greater than equal 100 tax 3 % else 2%

			if (subTotal >= 100) {
				System.out.println("Calculate Tax with 3%");
				double tax = (subTotal * 3) / 100;
				double totalPay = subTotal + tax;
				System.out.println("Total to Pay " + totalPay);
			} else {
				System.out.println("Calculate Tax with 2%");
				double tax = (subTotal * 2) / 100;
				double totalPay = subTotal + tax;

				System.out.println("Total to Pay " + totalPay);
			}
		}

}