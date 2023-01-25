package com.week.six.day.one;

public class ListOfItems {
	public static void main(String[] args) {
		//Instantiate an Object for Items
		Item appleObj = new Item();
		appleObj.name = "Apple";
		appleObj.price = 0.99;
		appleObj.quantity = 3.4; 
		
		//double appleTotalPrice = appleObj.price * appleObj.quantity;
		//Refer to Apple Object. print name and price and quantity
		double appleTotalPrice = appleObj.getTotalPrice();
		
		System.out.println(appleObj.name + " " + appleObj.price + " " + appleObj.quantity );
		
		System.out.println(appleObj.name + " Total Price is " + appleTotalPrice);
		
		//orange Object
		Item orangeObj = new Item();
		orangeObj.name = "Orange";
		orangeObj.price = 1.10; 
		orangeObj.quantity = 4.5; 
		
		double orangeTotalPrice = orangeObj.getTotalPrice();
		//double orangeTotalPrice = orangeObj.price * orangeObj.quantity;
		
		
		System.out.println(orangeObj.name + " " + orangeObj.price + " " + orangeObj.quantity + " Total Price is " + orangeTotalPrice);
	}

}