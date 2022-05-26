package problem4;

import java.util.Scanner;

public class Bank {

	
   String	branchName;
   String	ifscCode;
   
   
   void displayDetails() {
	   branchName = "bob";
	   ifscCode = "101";
	   
	   System.out.println(branchName);
	   System.out.println(ifscCode);
	   
   }
}

class AxisBank extends Bank{
	double rateOfInterest;
	
	@Override
	   void displayDetails() {
		   branchName = "Axis Bank branch";
		   ifscCode = "201";
		   rateOfInterest = 8.5;
		  
		   System.out.println("Branch name: "+branchName);
		   System.out.println( "IFSC code: "+ifscCode);
		   System.out.println("Rate of interest: "+rateOfInterest);
	   }
	
   void	getCreditCard(){
	System.out.println("Get the Credit Card from the Axis bank");	
	}
}

class ICICIBank extends Bank{
	double rateOfInterest;
	
	@Override
	   void displayDetails() {
		   branchName = "ICICI Bank branch";
		   ifscCode = "301";
		   rateOfInterest = 8.0;
		    
		   System.out.println("Branch name: "+branchName);
		   System.out.println( "IFSC code: "+ifscCode);
		   System.out.println("Rate of interest: "+rateOfInterest);
	   
	   }
}

class Demo{

	
	public static Bank getBank(String bank) {
		
		if(bank.equals("axis")) {
			
		AxisBank a1 = new AxisBank();
	
		
		return a1;
		}
		
		else if(bank.equals("icici")) {
			
			ICICIBank i1 = new ICICIBank();
			
			return i1;
		}
		
		else {
			return null;
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter the bank name: => ");
	    String input = s1.nextLine();
		
        Bank bank =  getBank(input);
        
        bank.displayDetails();  
         
    
	

	
	}
}