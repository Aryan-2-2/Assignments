package problem2;

import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class AllStudents {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		

		ScienceStudent s1 = new ScienceStudent();
		
		HistoryStudent h1 = new HistoryStudent();
		
		Student student = new ScienceStudent();
		
		System.out.println("Select A Stream history or science");
		student.setStream(scanner.nextLine());
		
		String anString  = student.getStream();
		
		if(anString.equals("science")) {

			System.out.println("Enter your name ");
		String n = 	s1.name = scanner.nextLine();
			
			System.out.println("Enter your Address");
		String a =	s1.address = scanner.nextLine();
			
			System.out.println("Enter Marks of Physics");
		int p =    s1.phisicsMarks = scanner.nextInt();
			
		    System.out.println("Enter Marks of chemistry");
		   int c = s1.chemistryMarks = scanner.nextInt();
		    
		    System.out.println("Enter Marks of Maths");
		   int m =  s1.mathsMarks = scanner.nextInt();
			
			
			ScienceStudent s3 = new ScienceStudent(p,c,m);

			
			System.out.println("Name: "+n);
			System.out.println("Address: "+a);
		
			  s3.getPercentage();
		   
		}
		else if(anString.equals("history")) {
			 
			System.out.println("Enter your name ");
		String n=	s1.name = scanner.nextLine();
			
			System.out.println("Enter your Address");
		String a =	s1.address = scanner.nextLine();
			
			System.out.println("Enter  Marks of History");
			int history = h1.historyMarks = scanner.nextInt();
			
			
			System.out.println("Enter Marks of Civics");
			int civic = h1.civicsMarks = scanner.nextInt();
			
			HistoryStudent h4 = new HistoryStudent(history,civic);
		
			
			System.out.println("Name: "+n);
			System.out.println("Address: "+a);
		    h4.getPercentage();
		}
		else {
			System.err.println("please enter these two stream only which is history and science.");
		     System. err.println("Make sure You are Writing history not History and same for science.");
		     System.err.println("only small cases letter will be entertained.");
		}
		
		
	}
}
