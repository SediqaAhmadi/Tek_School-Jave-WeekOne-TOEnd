package com.week.two.day.three;

public class StringRealWorkExample {

	public static void main(String[] args) {
		//20221213
		//0001236
		//001
		//Date 8 length.
		//Amount 7 lenght 
		//Some code 3 length
		
		String text = "202212130001236001";
		String date = text.substring(0,8);
		String amount = text.substring(8, 15);
		String code = text.substring(15);
		
		System.out.println("Date is " + date );
		System.out.println("Amount is " + amount);
		System.out.println("Code is " + code);

	}

}