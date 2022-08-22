package day15;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class CheckAge {

	static LocalDate check(String dob) throws InvalidDateFormat {
		
		try {
			
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
				
				LocalDate ld = LocalDate.parse(dob,dtf);
				
				return ld;
				
			} catch (DateTimeParseException e) {

			throw new InvalidDateFormat("invalid format");
			}
	
		
	}
	
	public static void main(String[] args) {
		
		try {
			
			
		LocalDate ld= 	check("22-12-2200");
			
			LocalDate ls = LocalDate.now();
			
			Period period = Period.between(ld, ls);
			
		int exp = period.getYears();
		
		if(ld.isBefore(ls)) {
			
			System.out.println(exp);
		}
		else {
			System.out.println("future date");
		}
			
			
		} catch (InvalidDateFormat e) {
		
		System.out.println(e.getMessage());
	
		}
		
		
	}
}
