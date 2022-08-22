package day15_2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.zip.DataFormatException;

import day15.InvalidDateFormat;

public class Employee {

	
	static double calculateBonus(String jd) throws InvalidAgeException {
		
	
		try {
			
  DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
  
  LocalDate joinDate = LocalDate.parse(jd, dtf);
  
  LocalDate lDate = LocalDate.now();
  
  if(joinDate.isAfter(lDate)) {
	  
	  throw  new InvalidAgeException();
  }
  
  Period period  = Period.between(joinDate, lDate);
  
  int exp = period.getYears();
  
  if(exp<=1) {
	  return 5000;
  }
  else if(exp<2) {
	  return 8000;
  }
  else {
	  return 10000;
  }
  
		} catch (DateTimeParseException e) {

		throw new InvalidAgeException("pass correct format");
		
		
		}catch (InvalidAgeException e) {

		throw new InvalidAgeException("date ot in future");
			
		}
		
		
	}
	
	
}
