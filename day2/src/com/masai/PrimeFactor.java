package com.masai;

public class PrimeFactor {

public static void main(String[] args) {
	
	int num = 12;
	
	if(num >= 2 && num<=200) {
		String bag ="";
		for(int i=1 ; i<=num ; i++) {
			  if(num%i==0) {
				bag = bag + i + " ";
				
			  }
			  
		}
		System.out.println(bag);  	
	} 
	else {
		System.out.println("Invalid number");
	}
	}
}
