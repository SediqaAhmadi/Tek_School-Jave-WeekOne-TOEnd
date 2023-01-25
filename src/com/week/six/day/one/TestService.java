package com.week.six.day.one;

public class TestService {
	
	public static void main(String[] args) {
		//500 here is length of the array
		Service myServiceObject = new Service(2);
		
		myServiceObject.generateRandomNumbers(100);
		
		myServiceObject.printValues();
	}

}