package com.student;

public class Student {

	
	int roll;
	String name;
	int age;
	int marks;
	
	 void zeroArgConstructor(){
		
		roll = 12;
		name = "Gaurav";
		age = 22;
		marks = 10;
		
	}
	
	void ParaConstructor(int roll, String name, int age, int marks){
		
		//System.out.println(roll);
	}
	public static void main(String[] args) {
		Student s1 = new Student();
		
		System.out.println(s1.roll);
	}
}
