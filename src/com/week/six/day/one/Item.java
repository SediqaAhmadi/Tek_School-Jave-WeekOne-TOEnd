package com.week.six.day.one;

public class Item {

	
		//Properties for Items.
		String name;
		double price;
		double quantity; 
		
		//Create Method to get total price. 
		
		//Method signature. 
		public double getTotalPrice() {
			//Method Body
			double totalPrice = price * quantity;
			
			// can not have code after this line
			return totalPrice;
		}
		

	}
