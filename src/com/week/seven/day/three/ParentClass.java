package com.week.seven.day.three;

public class ParentClass {
public String name; 
	
	public ParentClass() {
		System.out.println("Parent Class Constructor without parameter");
	}
	
	public ParentClass(String name) {
		this();
		this.name  = name; 
	}
	
}