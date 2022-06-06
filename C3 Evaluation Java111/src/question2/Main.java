package question2;

public class Main {

	
	
	public static void main(String[] args) {
		
		
		Loan l1 = new Loan();
		
		PermanentEmployee p1 = new PermanentEmployee();
		TemporaryEmployee t1 = new TemporaryEmployee();
		
		l1.calculateLoanAmount(null);
		l1.calculateLoanAmount(p1);
		l1.calculateLoanAmount(t1);
	}
}
