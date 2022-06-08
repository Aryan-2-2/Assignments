package day13;
import java.util.InputMismatchException;
import java.util.Scanner;


public class ExceptionHandling {


	public static void main(String args[]) {
		
		
	System.out.println("start of main..");
	
	
	try {
		Scanner sc = new Scanner(System.in);
		
	   
			 
				
		
		System.out.println("Enter num1");
		int num1 = sc.nextInt();
		
		
		System.out.println("Enter num2");
		int num2 = sc.nextInt();
		
	
	   
	  
	   String message = null;
		
		int num3 = num1 / num2;
		
		if(num3 > 10){
		message = "Welcome to Exception Handling ";
		}
		
		System.out.println("Message is :"+message.toUpperCase());
	  
		
		
	}catch(InputMismatchException str) {
		System.out.println("Please enter a valid number");
		System.out.println(str.getMessage());
	}
	catch (NullPointerException npl) {
	
		System.out.println("String Value is null");
	
	     System.out.println("Error happend because of: "+npl.getMessage());

	}
	
	
	catch (ArithmeticException ae) {
	     System.out.println("num2 should not be 0");
	     
	     System.out.println("Error happend because of: "+ae.getMessage());
		}
	
	
	
	System.out.println("end of main");
	}
	
	
}
