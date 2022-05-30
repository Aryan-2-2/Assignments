package question2;

import java.util.Scanner;



public class Demo {
    

	
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Student s1 = new Student();
		
		System.out.println("How Many Student Object you want to create");
	    int number = scanner.nextInt();
	    
	    Student [] students = new Student[number];
	   
	    int j = 0;
	   students[j++] = new Student();
	    
	    for(int i=0 ; i<number ; i++) {
	    	
	    	System.out.println("Enter  the Student roll no");
	    	s1.setRoll(scanner.nextInt());
	    	
	    	scanner.nextLine();
	    	
	    	System.out.println("Enter the Student name");
	    	s1.setName(scanner.nextLine());
	    	
	    	System.out.println("Enter the address");
	    	s1.setAddress(scanner.nextLine());
	    	
	    	System.out.println("Enter the Marks Of Hindi");
	    	s1.setHindi(scanner.nextInt());
	    	
	    	System.out.println("Enter the Marks Of English");
	    	s1.setEnglish(scanner.nextInt());
	    	
	    	
	    	System.out.println("Roll no: "+ s1.getRoll());
	    	System.out.println("Name: "+ s1.getName());
	    	System.out.println("Address: "+ s1.getAddress());
	    	System.out.println("Average Marks is: "+s1.calculationOfAverage());
	      
	    }
	}



}