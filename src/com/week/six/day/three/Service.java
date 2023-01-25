package com.week.six.day.three;

public class Service {

	//to Generate random numbers between 0 and any range and for any length;
	
	int[] numbers; //property OR State
	
	public Service(int length) {
		numbers = new int[length];
	}
	
	//Generate random numbers between 0 and any range
	public void generateRandomNumbers(int range) {
		
		for (int i = 0 ; i < numbers.length ; i ++) {
			int number = (int) (Math.random() * range);
			numbers[i] = number; 
		}	
	}
	
	//Print all values inside array
	public void printValues() {
		for (int number : numbers) {
			System.out.println(number);
		}
	}

}
