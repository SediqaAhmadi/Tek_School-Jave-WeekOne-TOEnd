package com.week.nine.day.three;

public class TestingVehicle {
	public static void main(String[] args) {
		Toyota camry = new Toyota();
		camry.name = "Camry Super XSE"; 
		camry.speed();
		camry.printName();
		
		Ford mustang = new Ford();
		mustang.name = "Mustang GT";
		mustang.speed();
		mustang.printName();
	}

}