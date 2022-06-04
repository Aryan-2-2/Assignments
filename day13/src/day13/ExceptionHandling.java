package day13;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
	  
		
		
	}catch (NullPointerException npl) {
	
		System.out.println("String Value is null");
	
	     System.out.println("Error happend because of: "+npl.getMessage());

	}
	
	catch (ArithmeticException ae) {
	     System.out.println("num2 should not be 0");
	     
	     System.out.println("Error happend because of: "+ae.getMessage());
		}
	
	catch (Exception e) {
		
		System.out.println("somthing is wrong please read the below line");
		System.out.println(e.getMessage());
	}
	
	System.out.println("end of main");
	}
	
	
}
