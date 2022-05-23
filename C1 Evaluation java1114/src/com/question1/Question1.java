package com.question1;

public class Question1 {
	// <1>   Why String is immutable in java?
	
	
		/*Strings are immutable in java because java uses the concept of 
		 * constant pool. you can't change the value of a string once you
		 * assign that. The main Advantage of immutability is java compiler 
		 * can save space in memory by sharing strings.  
		 * */
			
			
		// <2>what is the difference between String and String Builder?	
			
			
		/*Difference between String and String Builder is :- In String when 
		 * you assign a value, you can not change it but you can change it by
		 * using String Builder,String Builder is a Constructor.
		 * */	
			
		// <3> Write someof the methods of String class at least 5 
//			with example.	
			
		public static void main(String[] args) {
			
		// Ex 1 : concat();	
			String s1 = "masai";
			
			String s2 = "school";
			
			String s3 = s1.concat(s2);
			
		    System.out.println(s3);
			
			
		    //Ex 2 :equals()
		    
		    String s4 = "HEY";
		    String s5 = "HEY";
		    
		    Boolean s6 = s4.equals(s5);
		    System.out.println(s6);
		    		
			//Ex 3 : charAt;
		    
		    String s7 = "masai";
     		s7.charAt(0);
		    System.out.println(s7);
		  
		    
		    //Ex 4 :toUpperCase;
		    
		    String s8 = "coding is passion";
		  
		    String s9 =  s8.toUpperCase();
		    System.out.println(s9);
		    
		    //Ex 5 : toLowerCase
		    
		    String s10 = "CODING IS PASSION";
		    String s11 = s10.toLowerCase();
		    System.out.println(s11);
		    
		}
		
		
}
