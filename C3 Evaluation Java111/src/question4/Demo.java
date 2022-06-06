package question4;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Demo {

	
	public boolean checkValidOrNot(String username,String password,String mobileNumber,String email) {
		
		if(Pattern.matches("[a-zA-Z]{3,8}",username) &&
				Pattern.matches("[0-9]{3,8}",password)&&
				Pattern.matches("[6789]{1}[0-9]{9}", mobileNumber)&&
				Pattern.matches("[a-zA-Z]",email)) {
			
			System.out.println(username);
			
			System.out.println(password);
			
			System.out.println(mobileNumber);
			
			System.out.println(email);
			
			return true;
		
		}
		else {
			System.out.println("err");
			return false;
		}
	
	}
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
	
		
	Demo demo = new Demo();
		
	    demo.checkValidOrNot("kajak","5666","6038473989","Gaurav");
	

	
	}
	
	
}
