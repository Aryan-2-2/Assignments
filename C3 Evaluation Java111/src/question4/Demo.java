package question4;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo {

	
	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter username ");
		String username = scanner.next();
		
		boolean validname =Pattern.matches("[a-zA-Z]{3,8}", username);
		
		System.out.println("Enter password ");
		String password = scanner.next();
		
		boolean validpass =Pattern.matches("[a-zA-Z][0-9]{3,8}", password);
		
		
		System.out.println("Enter Mobile Number ");
		String mobileNumber = scanner.next();
		
		boolean validnum =Pattern.matches("[6789]{1}[0-9]{9}", mobileNumber);
		
		
		System.out.println("Enter Email ");
		String email = scanner.next();
		
		boolean validemail =Pattern.matches("[^a-zA-Z0-9]", email);
		
		
		if(validname==true && validpass==true && validemail ==true || validnum ==true) {
			
			Customer c1 = new Customer();
			
			c1.setUsername(username);
			c1.setPassword(password);
			c1.setMobileNumber(mobileNumber);
			c1.setEmail(email);
			
			System.out.println(c1.getUsername());
			System.out.println(c1.getPassword());
			System.out.println(c1.getMobileNumber());
			System.out.println(c1.getEmail());
		}
	}	
		
	}
	
	
	
	

