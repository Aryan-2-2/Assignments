package com.masai;

public class Student {

     int roll;
     String name;
     int marks;
     
     void displayStudentDetails(int roll, String name, int marks ) {
    	System.out.println("Roll No :"+ roll); 
    	System.out.println("Name is :"+ name); 
    	System.out.println("Marks is :"+ marks); 
    	System.out.println("=========================");
     }
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		s1.displayStudentDetails(12, "Suresh", 9);
		
		Student s2 = new Student();
		
		s2.displayStudentDetails(1, "Brijkishor",10);
		
		//now for garbage collector i am making this variable null;
		
		s1 = null;
		s2 = null;
		
		//System.out.println(s1.marks);
		//System.out.println(s2.name);
		
	}
}
