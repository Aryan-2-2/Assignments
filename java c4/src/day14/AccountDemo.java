package day14;

public class AccountDemo {

	
	
	public static void main(String[] args) {
		
		
		
		try {
			
			Account a1 = new Account();
			
			a1.deposit(50000);
			
			a1.withdraw(100000);
			
		} catch (InsufficientFundsException e) {

		System.out.println(e.getMessage());
		}
	}
}
