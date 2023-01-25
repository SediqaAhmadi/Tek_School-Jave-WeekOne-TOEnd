package com.week.seven.day.three;

public class IntroductionToFinalKeyword {

public final String name = "Some name";
	
	
	public IntroductionToFinalKeyword() {
		//Can not change value after it's assigned for final variables.
		//this.name = "John Smith";
		
	}
	
	
	public void functionMethod() {
		
		final String schoolName = "TekSchool";
		
		//schoolName = "Another School";
	}

}
