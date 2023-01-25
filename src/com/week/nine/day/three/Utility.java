package com.week.nine.day.three;

import java.io.FileNotFoundException;

public class Utility {
		
		
		public void doSomething() throws FileNotFoundException, ArrayIndexOutOfBoundsException {
			System.out.println("This Method will throws Exceptions");
		}
		
		
		public void checkName(String name) {
			
			if (name.contains("Ali")) {
				System.out.println("Name contains ali");
			}
			else {
				throw new RuntimeException("Name is not contain Ali");
			}
		}

	}
