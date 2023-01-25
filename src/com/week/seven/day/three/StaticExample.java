package com.week.seven.day.three;

public class StaticExample {

	public static void main(String[] args) {

		Constants object1 = new Constants();
		object1.number = 12345678;

		System.out.println("Object one number " + object1.number);

		Constants object2 = new Constants();

		System.out.println("Object two number " + object2.number);

		Constants object3 = new Constants();
		object3.number = 987654321;
		System.out.println("Object three number " + object3.number);
		
		Constants object4 = new Constants();
		System.out.println("Object four number " + object4.number);
		
		Constants object5 = new Constants();
		System.out.println("Object five number " + object5.number);
	}

}