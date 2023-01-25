package com.week.eleven.Review03;

import java.util.TreeSet;

public class SetExample {

	
		
		public static void main(String[] args) {
			
			//HashSet<Integer> numbers = new HashSet<>(); 
			TreeSet<Integer> numbers = new TreeSet<>();
			numbers.add(1100012); 
			numbers.add(100);
			numbers.add(10000);
			numbers.add(113);
			
			System.out.println(numbers.size());
			
			for (int number : numbers) {
				System.out.println(number);
			}
			
		
		}

	}