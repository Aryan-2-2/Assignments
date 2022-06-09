package problem2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

public class EmployeeBonus {

	
  public static	double bonusCheck(String doj) throws InvalidAgeException {
		
	try {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate ld = LocalDate.now();
		LocalDate joinDate = LocalDate.parse(doj, dtf);
		
		
		if(joinDate.isAfter(ld)) {
			throw new InvalidAgeException();
		}

		
		Period period = Period.between(ld, joinDate);
		
		int experience = period.getYears();
		
		if(experience < 1) {
			return 5000;
		}
		else if(experience < 2) {
			return 8000;
		}
		else {
			return 10000;
		}
	
	
	}catch(DateTimeParseException dte) {
		
		throw new InvalidAgeException("please pass valid format");
		
	}catch (InvalidAgeException e) {
		
		throw new InvalidAgeException("Age should not be in future");	 
	}
	
	
		
		
	}
}
