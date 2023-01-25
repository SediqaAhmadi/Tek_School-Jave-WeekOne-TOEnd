package com.week.seven.day.three;



	public class ChildClass extends ParentClass{
		
		public ChildClass(String name) {
			super(name);
		}
		
		
		public void printName() {
			System.out.println("The name is " + super.name);
		}

	}