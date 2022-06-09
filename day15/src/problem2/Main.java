package problem2;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		
		Scanner sccanScanner = new Scanner(System.in);
		
		System.out.println("Enter joining date");
		String dojString = sccanScanner.next();
		
		
		try {

			EmployeeBonus eBonus = new EmployeeBonus();
		
		    System.out.println(eBonus.bonusCheck(dojString));
		    
		}catch (InvalidAgeException e) {

		System.out.println(e.getMessage());
		}
	    
	
	}
}
