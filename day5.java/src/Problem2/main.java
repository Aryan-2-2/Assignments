package Problem2;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Student s1 = new Student();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter TicketId:  ");
		s1.setTicketId(scanner.nextInt());
		
		System.out.println("Enter TIcket Price");
		s1.setTicketPrice(scanner.nextInt());
		
		System.out.println("Enter No of Tickets are Available");
		s1.setAvailableTickets(scanner.nextInt());
		
		System.out.println("Enter No of Tickets You Want");
	    s1.setNoOfTIcket(scanner.nextInt());
		
	   System.out.println("Your Ticket Id is: "+ s1.getTicketId());
	   System.out.println("Total Amount:"+s1.getNoOfTicket()*s1.getTicketPrice());
	    
	    
	    System.out.println("Tickets Left: "+(s1.getAvailableTickets()-s1.getNoOfTicket()));
}    
	
}
