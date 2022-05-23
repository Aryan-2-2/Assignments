package com.question4;

public class Student {

	private int rollNumber;
	private	String studentName;
	private int marks;
	private int noOfStudent;
	
	void zeroArgumentConstructor() {
		
	}
	
	void parameterizedConstructor(int rollNumber, String studentName, int marks) {
		
	}
	

	public int getRollNumber() {
		return rollNumber;
	}
	

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public int getNoOfStudent() {
		return noOfStudent;
	}

	public void setNoOfStudent(int noOfStudent) {
		this.noOfStudent = noOfStudent;
	}
	
	
	
}
