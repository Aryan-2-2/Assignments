package question2;

public class Loan {

	



	public double calculateLoanAmount(Employee employeeObj) {
		
		
		if(employeeObj instanceof PermanentEmployee) {
			
			PermanentEmployee p = new PermanentEmployee();
			
			double loan = p.getSalary()*15/100;
			
			return loan;
		}

		else {
			
     TemporaryEmployee t1 = new TemporaryEmployee();
			
			double loantwo = t1.getSalary()*10/100;
			
			return loantwo;
		}
			
			
			
			
		
	
		
		
	}
}
