package com.week.nine.day.two;

public class TestClass {

	
	public static void main(String[] args) {
//		Browser object = new Browser(); we are not allowed to create object of an interface
		
		//1 Option of instantiating
		Chrome object = new Chrome(); 
		object.openBrowser();
		
		Browser browserObject = new Chrome(); 
		browserObject.openBrowser();
		
		Browser browser = new Firefox();
		browser.openBrowser();
		
	}

}