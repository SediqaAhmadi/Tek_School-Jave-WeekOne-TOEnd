package com.week.six.day.four;

public class PurchaseBill {
	public static void main(String[] args) {
	//How much we have to pay with 6% tax
	
			Item[] items = new Item[2];
			
			// Two Items orange and apple.
			Item item1 = new Item();
			item1.setName("Apple");
			item1.setPrice(12.32);
			item1.setQuantity(4.21);
			
			Item item2 = new Item();
			item2.setName("Strawberry");
			item2.setPrice(5.12);
			item2.setQuantity(3);
			
			items[0] = item1;
			items[1] = item2;
			
			Calculator cal = new Calculator();
			//Find out the subtotal you have to pay
			double totalToPay = 0;
			
			for (Item item: items) {
				double price = item.getPrice();
				double quantity = item.getQuantity();
				
				double result = cal.multiplication(price, quantity);
				
				double tax = (result * 6) / 100;
				
				totalToPay += result + tax; 
			}
			
			System.out.println("Total To Pay " + totalToPay);
		}

	}
