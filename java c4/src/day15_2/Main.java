package day15_2;

public class Main {

	
	public static void main(String[] args) {
		
		
		Employee e1 = new Employee();
		
	try {
		System.out.println(e1.calculateBonus("22-0-2022"));
		
		
	} catch (InvalidAgeException e) {

	System.err.println(e.getMessage());
	}
	}
}
