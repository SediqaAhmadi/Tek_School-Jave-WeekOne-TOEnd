package com.week.eleven.review02;

public class TestInheritance {

	public static void main(String[] args) {
		
		FirstChild object = new FirstChild("This is from implementation"); 
		
		object.fromGrandParent();
		
		object.fromParent();
		
		object.fromFristChild(); 
		
		SecondChild obj = new SecondChild("This is from implementation"); 
		obj.fromGrandParent();
		
	}

}
