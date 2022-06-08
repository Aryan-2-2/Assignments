package problem1;

import java.util.Scanner;

public class AccountDemo {

    	
	
public static void main(String[] args) {
	
	Account a1 = new Account();
	

	try {
		a1.deposit(5000);
	
		System.out.println(	" Money left in your account : " +a1.withdraw(8000));
		
	}catch (InsufficientFundsException e) {
		System.out.println(e.getMessage());
	}
	
	System.out.println("end of main");
}

         	
     	
         		
         		
}
         	
		
         	
         	
         	
		

