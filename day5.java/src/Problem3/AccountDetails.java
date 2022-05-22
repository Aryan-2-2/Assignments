

package Problem3;

import java.util.Scanner;

public class AccountDetails {

	
	public static Account getAccountDetails() {
	
	Account a1 = new Account();
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter Your Id");
	a1.setAccountId(scanner.nextInt());
	
	System.out.println("Enter Your Account Type");
	a1.setAccountType(scanner.nextLine());
	
	scanner.nextLine();
	int balance;
	
	do {
		System.out.println("Enter your balance");
		a1.setBalance(scanner.nextInt());
		
		balance=a1.getBalance();
		
		if(balance<=0) {
			System.err.println("Balance Should be positive");
		}
		
	}
	while(balance<=0);
	return a1;
	 }
	 
	 public static int getWithdrawAmount() {
		 Scanner scanner = new Scanner(System.in);
		 
		 int w;
		 do {
			 System.out.println("Enter a amount you want to withdraw");
			 w = scanner.nextInt();
			 if(w<=0) {
				System.err.println("Amount should be positive");
		 }
		 }
		 while(w<=0);
		 return w;
			  
	 }
	 
	 public static void main(String[] args) {
		Account a = new Account();
		
		a = getAccountDetails();
		int c  = getWithdrawAmount();
		a.withdraw(c);
	}
}

