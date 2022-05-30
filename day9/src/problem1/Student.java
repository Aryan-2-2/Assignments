package problem1;

import java.util.Scanner;

public class Student {

private int roll;
private String name;
private int marks;
private char grade;




public int getRoll() {
	return roll;
}

public void setRoll(int roll) {
	this.roll = roll;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getMarks() {
	return marks;
}

public void setMarks(int marks) {
	this.marks = marks;
}

public char getGrade() {
	return grade;
}

public void setGrade(char grade) {
	this.grade = grade;
}

public Student() {
	
}











public void displayDetails() {
	
	Student s1 = new Student();
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter roll no");
	s1.setRoll(scanner.nextInt());
	
	scanner.nextLine();
	
	System.out.println("Enter Name");
	s1.setName(scanner.nextLine());
	
	System.out.println("Enter Marks");
	s1.setMarks(scanner.nextInt());
	
	scanner.nextLine();

	int marks1 = s1.getMarks();
    calculateGrade(marks1);
	
	
	
}

private void calculateGrade(int m) {
}


public Student(int roll, String name, int marks, char grade) {
	super();
	this.roll = roll;
	this.name = name;
	this.marks = marks;
	this.grade = grade;
}
@Override
public String toString() {
	return "Student [roll=" + roll + ",;"
			+ " name=" + name + ", marks=" + marks + ", grade=" + grade + "]";
}
	
}


class Main{
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student();
		
	    s1.displayDetails();
	    System.out.println(s2);
	
	}
}
