package com.question2;

import java.util.Scanner;

public class Course {

	
	
int courseId;
String courseName;
int courseFee;



public int getCourseId() {
	return courseId;
}

public void setCourseId(int courseId) {
	this.courseId = courseId;
}

public String getCourseName() {
	return courseName;
}

public void setCourseName(String courseName) {
	this.courseName = courseName;
}

public int getCourseFee() {
	return courseFee;
}

public void setCourseFee(int courseFee) {
	this.courseFee = courseFee;
}

void displayCourseDetails() {
	System.out.println("course id:  "+getCourseId());
	System.out.println("course Name:  "+getCourseName());
	System.out.println("course Fee:  "+getCourseFee());
	
}

static void authenticate(String Username,String Password) {
	
	if(Username == "Admin" && Password == "1234") {
		Scanner scanner = new Scanner(System.in);
		
		Course c1 = new Course();
		
		System.out.println("Enter Course Id");
		c1.setCourseId(scanner.nextInt());
		
		System.out.println("Enter Course Name");
		c1.setCourseName(scanner.next());
		
		scanner.nextLine();
		
		System.out.println("Enter Course Fee");
		c1.setCourseFee(scanner.nextInt());
		
		c1.displayCourseDetails();
		
	}
	else {
		System.out.println("Invalid Username or password");
	}
}

public static void main(String[] args) {
	
	//authenticate("Admin","1234");
	authenticate("user","578");
}
}
