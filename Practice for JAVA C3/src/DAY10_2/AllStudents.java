package DAY10_2;

import java.util.Scanner;

public class AllStudents {

	
	public static void main(String[] args) {
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter A Stream YOu Want to Choose");
		String stream  = scanner.nextLine();
		
		if(stream.equals("science")) {
			
			System.out.println("Enter Your Name");
		    String nameString =	scanner.nextLine();
		    
		    
		    
		    System.out.println("Enter Your Address");
		    String addresString = scanner.nextLine();
		    
		    
		    System.out.println("Enter Marks of Physics");
		    int p = scanner.nextInt();
		    
		    System.out.println("Enter Marks of Chemistry");
            int c = scanner.nextInt();
		    
		    System.out.println("Enter Marks of Maths ");
		    int m = scanner.nextInt();
		    
		    ScienceStudent s1ScienceStudent = new ScienceStudent(p,c,m);
		    
		    System.out.println("Name : "+nameString);
		    System.out.println("Address : "+addresString);
		    s1ScienceStudent.getPercentage();
		   
			
		}
		
		else if(stream.equals("history")) {
			
			System.out.println("Enter Your Name");
		    String nameString =	scanner.nextLine();
		    
		    
		    System.out.println("Enter Your Address");
		    String addresString = scanner.nextLine();
		    
		    System.out.println("Enter Marks of History");
		    int h = scanner.nextInt();
		    
		    System.out.println("Enter Mark of Civics");
		    int c = scanner.nextInt();
		    
		    
		    HistoryStrudent h1hisHistoryStrudent = new HistoryStrudent(h,c);
		    
		    System.out.println("Name : "+nameString);
		    System.out.println("Address : "+addresString);
		    h1hisHistoryStrudent.getPercentage();
		    
			
		}
		else {
			System.err.println("we have only two Streams rightnow history and science");
		}
		
	}
}
