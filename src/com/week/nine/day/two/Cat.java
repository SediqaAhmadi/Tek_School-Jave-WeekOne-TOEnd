package com.week.nine.day.two;

public class Cat extends Animal{

	@Override
	public void eating() {
		System.out.println("Cat eat mouse");	
	}

	@Override
	public void makingNoise() {
		System.out.println("Meow");
	}

}