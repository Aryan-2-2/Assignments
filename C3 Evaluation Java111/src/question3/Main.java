package question3;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		
	try {
	Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter The Month");
		String userMonth = scanner.next();
		
		Demo demo = new Demo();
		
		Months months = Months.valueOf(userMonth);
		
		demo.showDetails(months);
	}catch (IllegalArgumentException iae) {
		
		System.out.println("Invalid Month Name");
		
		
	}
		
		
	}
}
