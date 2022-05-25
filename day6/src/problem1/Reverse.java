package problem1;
import java.util.Scanner;

public class Reverse {

//class Main{
		
		public static String reverseString(String input){
		//write the logic

			String bagString = "";
			int length = input.length();
			
	for(int i= length-1; i>=0; i--) {
		bagString = bagString+input.charAt(i);
		}
		return bagString;
		
	}
//}

	
	public static void main(String[] args){
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter a String to reverse");
	
	String originalString = sc.nextLine();
	
	String result = reverseString(originalString);
	
	System.out.println("Original String is :"+ originalString);
	
	System.out.println("Reversed String is :"+ result);
	}
	
}





