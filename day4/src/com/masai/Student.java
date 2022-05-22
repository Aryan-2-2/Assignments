package com.masai;

public class Student {

	int roll;
	String name;
	String address;
	String collegeName;
	
	public static boolean getStudent(boolean isFromNIT) {
		
		return isFromNIT;
	}

	public String getName(){
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
	
		boolean x  = getStudent(true);
		
		if(x == true) {
			Student s1 = new Student();
			s1.roll = 22;
			s1.name = "Suresh";
			s1.address = "Gujrat";
			s1.setName("NIT");
			
			System.out.println(s1.getName());
			
		
		}
		else {
			
		}
		
	}
}
