package com.week.eleven.review02;

public class GrandParent {

	
		
		public String someString; 
		
		public GrandParent(String someString) {
			this.someString = someString;
		}
		
		public void fromGrandParent() {
			System.out.println("This is from Grand parent " + this.someString);
		}

	}
