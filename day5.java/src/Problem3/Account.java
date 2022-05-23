package Problem3;

public class Account {

	private int accountId;
	private String accountType;
	private int balance;
	
	//Getter method
	public int getAccountId() {
		return accountId;
	}
	
	public String getAccountType() {
		return accountType;
	}
	
	public int getBalance() {
		return balance;
	}
	
	//Setter method
	
	public void setAccountId(int id) {
		this.accountId = id;
	}
	
	public void setAccountType(String s) {
		this.accountType = s;
	}
	
	public void setBalance(int bal) {
		this.balance = bal;
	}
	
	public boolean withdraw(int w) {
		
		if(getBalance()<w) {
			System.err.println("Sorry !! No enough balance");
			
			return false;
		}
		else {
			System.out.println("Balance amount after withdraw "+(getBalance()-w));
           return true;
		}
	}
}
