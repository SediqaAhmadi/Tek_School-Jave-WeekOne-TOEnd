package com.week.eleven.review02;

public class OverloadMethods {

	
		
		public void doAdd(int first, int second) {
			System.out.println(first+ second);
		}
		
		public void doAdd(double first, double second) {
			System.out.println(first+ second);
		}
		
		public void doAdd(int first) {
			System.out.println(first + 10);
		}

	}
