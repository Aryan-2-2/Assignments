package problem2;

import java.util.Scanner;

public class UserRegistration {

public String registerUser(String userName, String userCountry) throws InvalidCountryException {
		
		if(userCountry.equals("india") || userCountry.equals("India")) {
			System.out.println("User registration done successfully");
		
			return userCountry;
		}
		
		
		else {
			
			InvalidCountryException  ice = new InvalidCountryException("User Outside India cannot be registered");
			
			throw ice;
		}
	}


   public static void main(String[] args) {
	
	   UserRegistration u1 = new UserRegistration();
	   
	   Scanner scanner = new Scanner(System.in);
	   
	   System.out.println("Enter Name");
	   String nameString = scanner.next();
	   
	   System.out.println("Enter Country");
	   String country = scanner.next();
	   
	  try {
		  u1.registerUser(nameString, country);
	} catch (Exception e) {
		
		System.out.println(e.getMessage());
		
	}
	   
}

}


