package com.week.two.day.four;

public class ShortcutExample {

	public static void main(String[] args) {
		//Activity
		
		double appleTotalPrice = 10.45;  // Primitive Data type 
		double orangeTotalPrice = 20.12; // Primitive Data type 
		double sodaTotalPrice  = 30.56; // Primitive Data type 
		
		double totalToPay = 0; 
		
		//shortcut operator += find out how much to pay. 
		
		totalToPay += appleTotalPrice; //Shortcut assignment operations 
		totalToPay += orangeTotalPrice; //Shortcut assignment operations 
		totalToPay += sodaTotalPrice; //Shortcut assignment operations 
		
		System.out.println("Total To Pay Before Tax $" + totalToPay );  // Concatenation of String using plus sign
		
		// 6% Tax to your total
		
		double tax = (totalToPay * 6) / 100; //Precedence, Mathematics 
		System.out.println("Tax Amount is $" + tax );
		
		totalToPay += tax; //Shortcut assignment operations 
		
		System.out.println("Payable after Tax $" + totalToPay );
		
	}

}