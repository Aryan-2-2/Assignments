package com.question4;

import java.util.Scanner;

public class main {

	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the no of Student Details you want to add");
		s1.setNoOfStudent(scanner.nextInt());
		
		int number  = s1.getNoOfStudent();
		
	for( int i=0 ;i<number; i++) {
		
		System.out.println("Enter the Roll no: ");
		s1.setRollNumber(scanner.nextInt());
		
		System.out.println("Enter Student name: ");
		s1.setStudentName(scanner.next());
		
		scanner.nextLine();
		
		System.out.println("Enter marks: ");
		s1.setMarks(scanner.nextInt());
		
		System.out.println("Student Details: "+s1.getNoOfStudent());	
		System.out.println("Student Rollno: "+s1.getRollNumber());	
		System.out.println("Student Name: "+s1.getStudentName());	
		System.out.println("Student Marks: "+s1.getMarks());	
		
	}
		

	}
}
