package question2;

public class TemporaryEmployee  extends Employee{


	
	private int hoursWorked;
	private int hoursWages;

	
	
	
	
	public int getHoursWorked() {
		return hoursWorked;
	}


	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}


	public int getHoursWages() {
		return hoursWages;
	}


	public void setHoursWages(int hoursWages) {
		this.hoursWages = hoursWages;
	}


	TemporaryEmployee(){
		
	}


	public TemporaryEmployee(int hoursWorked, int hoursWages,int employeeId, String employeeName) {
		super();
		this.hoursWorked = hoursWorked;
		this.hoursWages = hoursWages;
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}
	
	@Override
	void calculateSalary() {
  
		TemporaryEmployee   t1 = new TemporaryEmployee();
 
	double finalSalary =	t1.salary = hoursWages*hoursWorked;
 
	t1.setSalary(finalSalary);
	}


	public double getSalary() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
