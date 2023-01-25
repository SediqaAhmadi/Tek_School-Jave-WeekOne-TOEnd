package com.week.ten.day.three;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayAndList {

		
		public static void main(String[] args) {
			
			Integer[] numbers = {50, 20, 30, 10, 23, 10};
			
			List<Integer> listNumbers = Arrays.asList(numbers);
			
			System.out.println(listNumbers);
			
			Collections.sort(listNumbers);
			
			System.out.println(listNumbers);
			
		}

	}