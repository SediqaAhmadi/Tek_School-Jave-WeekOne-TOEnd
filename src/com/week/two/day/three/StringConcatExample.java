package com.week.two.day.three;

public class StringConcatExample {

	public static void main(String[] args) {

		String address1 = "1234 Lee Highway ";
		String address2 = "suite 234";

		// USPS format is All UpperCase in Line

		String fullAddress = address1.concat(address2);
		System.out.println(fullAddress);

		String addressInUSPSFormat = fullAddress.toUpperCase();
		System.out.println(addressInUSPSFormat);
	}

}