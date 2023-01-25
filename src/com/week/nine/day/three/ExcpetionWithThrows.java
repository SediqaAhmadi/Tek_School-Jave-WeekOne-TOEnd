package com.week.nine.day.three;

public class ExcpetionWithThrows {
	
	public static void main(String[] args){
		
		Utility utility = new Utility(); 
		
		try {
		utility.checkName("Ali");
		}catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		 
		
	}

}
