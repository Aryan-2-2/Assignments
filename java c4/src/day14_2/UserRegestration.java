package day14_2;

import java.util.Scanner;



public class UserRegestration {




public String registerUser(String userName, String userCountry)  throws InvalidCountryException{
		
		
  if(userCountry.equals("india")) {
	  System.out.println("indian");
	  return userCountry;
  }
  else {
	  
	  InvalidCountryException ice = new InvalidCountryException("nri");
	  throw ice;
  }
	   



}

}
