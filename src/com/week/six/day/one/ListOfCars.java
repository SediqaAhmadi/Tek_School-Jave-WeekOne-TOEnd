package com.week.six.day.one;

public class ListOfCars {

public static void main(String[] args) {
		
		//Mohammad's Car
		//Instantiate and Object
		Car mohammadsCar = new Car();
		
		//Assigning values to each property 
		mohammadsCar.make = "Toyota";
		mohammadsCar.model = "Camry";
		mohammadsCar.year = 2018;
		mohammadsCar.color = "Black";
		mohammadsCar.price  = 21310.59;
		
		Car aliCar = new Car();
		aliCar.make = "Maskavitch";
		aliCar.model = "Vans";
		aliCar.color = "Dark Green Blue";
		aliCar.year = 1987;
		aliCar.price = 100.99;
		
		//Instantiate Objects
		Car carObject = new Car();
		carObject.make = "Tesla";
		carObject.model = "M3";
		carObject.year = 2022; 
		carObject.color = "White";
		carObject.price = 38000; 
	}
	
	

}

