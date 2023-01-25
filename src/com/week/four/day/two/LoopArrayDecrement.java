package com.week.four.day.two;

public class LoopArrayDecrement {

	public static void main(String[] args) {
		/// Decrement end to start 
				int[] numbers = { 1, 11, 12, 13, 14, 42, 42, 41, 32, 13 , 1231 , 921 , 31};
				
				for (int index = numbers.length -1 ; index >= 0 ; index --) {
					
					System.out.println(numbers[index]);
				}

			}

		}