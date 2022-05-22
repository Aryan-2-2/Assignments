package Problem2;

public class Student {
	
  private int ticketId;
  private int noOfTicket;
  private int ticketPrice;
  private static int availableTickets;

  
  //getter method
  
  public int getTicketId() {
	  return ticketId;
  }
	
  public int getTicketPrice() {
	  return ticketPrice;
  }
  
  public int getAvailableTickets() {
	  return availableTickets;
  }
  
  public int getNoOfTicket() {
	  return noOfTicket;
  }
  
  //setter Method
  
  public void setTicketId(int t) {
	   this.ticketId = t;  
  }
  
  public void setTicketPrice(int p) {
	  this.ticketPrice = p;
  }
  
  public void setAvailableTickets(int a) {
	 if(a<=0) {
		 System.err.println("Enter a vaild Ticket Avaiblity");
	 }
	 else {
		 this.availableTickets = a;
	 }
  }
  
  public void setNoOfTIcket(int n) {
	  this.noOfTicket = n;
  }
  
  public int calculateTicketLeft(int nooftickets) {
	  
	  return -1;
  }
  

  
}
