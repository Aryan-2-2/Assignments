package question2;

public class PermanentEmployee extends Employee {

private double	basicPay;

PermanentEmployee(){
	
}



public PermanentEmployee(double basicPay ,int employeeId, String employeeName) {
	
	
	
	this.basicPay = basicPay;
	
	this.employeeId = employeeId;
	
	this.employeeName = employeeName;
	
}




@Override
void calculateSalary() {

	PermanentEmployee e1 = new PermanentEmployee();
	
	double pf = basicPay*0.12;
 double finalSalary =	e1.salary = basicPay- pf;
	
	e1.setSalary(finalSalary);
}
	

}
