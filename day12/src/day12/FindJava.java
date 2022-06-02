package day12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindJava {

	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter 1 for Default Search, Enter 2 For Dynamic Search");
		int num = scanner.nextInt();
		
		int getNum = num;
		
		if(getNum == 1) {
			
			scanner.nextLine();
			
			System.out.println("Enter A Paragraph I Will Give you occurrence of java");
			String inputOfString = scanner.nextLine();
			
			
			int count = 0;
			
			Pattern p = Pattern.compile("java");
			Matcher m = p.matcher(inputOfString);


			while (m.find()) {
				
				count++;
			
				System.out.println(m.start() + "------" + m.end() + "------" + m.group());
			
			}
	        
			System.out.println("The no of occurrences: "+count);
		}
		
		
		else if(getNum == 2) {
			
			System.out.println("Enter the word you want to find ");
			String userSearch = scanner.next();
			
			scanner.nextLine();
			
			System.out.println("Enter A Paragraph I Will Give you JAVA");
			String inputOfString = scanner.nextLine();
			
			
			int count = 0;
			
			Pattern p = Pattern.compile(userSearch);
			Matcher m = p.matcher(inputOfString);


			while (m.find()) {
				
				count++;
			
				System.out.println(m.start() + "------" + m.end() + "------" + m.group());
			
			}
	        
			System.out.println("The no of occurrences: "+count);
			
		}
		
		else {
			System.err.println("Enter a Valid Number 1 or 2");
		}
	}
}
