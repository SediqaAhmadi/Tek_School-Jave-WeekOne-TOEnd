package com.week.nine.day.one;

public class BanksTest {

	public static void main(String[] args) {
		Bank capBank = new CapitalOne();
		float rate = capBank.getInterestRate();
		
		System.out.println(rate);
		
		//Super Class 		// referring to Subclass
		Bank wellsBank = new WellsFargo();
		float wellsRate = wellsBank.getInterestRate();
		
		System.out.println(wellsRate);
	}

}
