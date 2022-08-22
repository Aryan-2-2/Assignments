package problem1;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;


public class CheckAge  {

	
	
    static	LocalDate checkDob(String dob) throws InvalidDateFormat {
		
    	try {
    		
    		DateTimeFormatter dte = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    		
    		LocalDate ld =LocalDate.parse(dob,dte);
    		
    		return ld;
    		
    	}catch (DateTimeParseException e) {
			
    		throw new InvalidDateFormat("invalid format");
		}
	}
	
	
	
   
  public static void main(String[] args)  {

		
	   
	   Scanner scanner = new Scanner(System.in);
	   
	   System.out.println("Enter Your DOB in dd-MM-yyyy format only ");
	   String dob = scanner.next();
	   
      
	 try {
		  LocalDate lDate = checkDob(dob);
		  
		  
		  LocalDate d1 = LocalDate.now();
		  
		  Period period = Period.between(lDate, d1);
		  
		   int age = period.getYears();
		   int months = period.getMonths();
		   int days = period.getDays();
		   
		   
		  
		  
		  if(lDate.isBefore(d1)) {
		    	
			   if(age>=1) {
				   System.out.println("You are "+age+" years "+months+" months old");	
			   }
			   
			   else if(months>1 && months<12) {
				   System.out.println("You are "+months+" months "+ days+" days old");
			   }
			   else {
				   System.out.println("You are "+days+" days old");
			   }
		    }
		   else {
				System.out.println("Date should not be in Future");

		   }
		  
	} catch (InvalidDateFormat idf) {
      
		System.out.println(idf.getMessage());
	}
   
	
 
   
 
	   
	  
	
	      
	  
}
   
}
