package com.week.two.day.one;

public class ShoppingCart {

	public static void main(String[] args) {
		//Solve this problem. 
		// apple 2 lb * 2.31$ /lb
		// orange 3 lb * 4.23$ /lb
		// Found how much you have to pay
		//Create Variables for Apple
		double applePrice = 2.31; 
		int appleWeight = 2; 
		
		//Create Variables for Orange
		double orangePrice = 4.23;
		int orangeWeight = 3; 
		
		//Create Variable for totalPay; 
		double totalPay = 0.00; 
		
		double appleTotal = applePrice * appleWeight; 
		double orangeTotal = orangePrice * orangeWeight; 
		
		totalPay = appleTotal + orangeTotal; 
		
		System.out.println(totalPay);
	}

}
