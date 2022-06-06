package day12;

import java.util.regex.Pattern;

public class Demo {

		
	public boolean validate(String name, String mobileNum, String aadharCard) {
		

		if(Pattern.matches("[a-zA-Z]{3,8}", name)&&
		   Pattern.matches("[6789]{1}[0-9]{9}", mobileNum) &&
		   Pattern.matches("[0-9]{12}", aadharCard)){
	
			System.out.println(name);
			System.out.println(mobileNum);
			System.out.println(aadharCard);
			
			
			return true;
		}
		else {
			System.err.println("Invalid Entrie");
			return false;
		}
		
	}
	
	public static void main(String[] args) {
	
	Demo demo = new Demo();
		
	demo.validate("Gaurav","9953038949","888888888588");


	
	}
}
