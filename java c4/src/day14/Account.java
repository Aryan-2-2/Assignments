package day14;

public class Account {

	String accountNumber;
	double balance;
	
	void deposit(double amount) {
		
	balance =	amount;
	}
	
	double withdraw(double amount) throws InsufficientFundsException {
		
		if(amount<=balance) {
			
			return balance - amount;
			
		}
		else {
			
			InsufficientFundsException 	ife = new InsufficientFundsException("no money");
			
			throw ife;
		}
			
	}
	
	
}
