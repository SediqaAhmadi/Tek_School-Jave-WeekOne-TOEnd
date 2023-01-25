package com.week.eleven.review02;

public class Student {
	
	private long studentId; 
	private String fullname; 
	
	public Student() {}
	
	public Student(long studentId, String fullname) {
		this.studentId = studentId; 
		this.fullname = fullname; 
	}
	
	public void setStudentId(long studentId) {
		this.studentId = studentId; 
	}
	
	public long getStudentId() {
		return this.studentId; 
	}
	
	public void setFullname(String fullname) {
		this.fullname = fullname; 
	}
	
	public String getFullname() {
		return this.fullname; 
	}
	
}