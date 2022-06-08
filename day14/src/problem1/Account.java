package problem1;

public class Account {

     String	accountNumber;
     double	Balance;
     
     Account(){
    	 
     }
     
     void deposit(double amount) {
    	
    	  Balance = amount;
    	 
     	 System.out.println(" Total Bank Balance : " +Balance);
	 
    }
    
     double withdraw(double amount) throws InsufficientFundsException {

 		if(amount<=Balance) {
 			
 			double finalAmount = Balance-amount;
 			return finalAmount;
 		}
 		else {
 			InsufficientFundsException ife = new InsufficientFundsException("Insufficient Fund In Your Account");
 			throw ife;
    	 
     }

	
     
     
}
}
