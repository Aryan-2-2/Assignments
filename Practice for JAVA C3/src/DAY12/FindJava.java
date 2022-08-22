package DAY12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindJava {

	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter A Keyword You want to Search");
		String user = scanner.nextLine();
		
		
		System.out.println("Enter The Paragraph");
		String input = scanner.nextLine();
		
		
		
		int count = 0; 
		
		Pattern pattern = Pattern.compile(user);
		
		Matcher matcher = pattern.matcher(input);
		
		while(matcher.find()) {
			
			count++;
			
			System.out.println(matcher.start()+"-----"+matcher.end()+"----"+matcher.group());
			
			
		}
		System.out.println("No of occurrence : "+ count);
	}
	
}
