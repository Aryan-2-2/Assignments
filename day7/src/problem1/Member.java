package problem1;

public class Member {

	String name ;
	int age;
	String  phoneNumber;
	String  address;
	double salary;
	
 public	void printSalary() {
	
	  System.out.println("Salary: " + getSalary());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	 
	 
	
}

class Employee extends Member{
	
	String	Specialisation;
	String Department; 
}

class Manager extends Member{
	
	String	Specialisation;
	String Department; 
	
}

class Main{
	public static void main(String[] args) {
		
		Member  member =  new Member();
		Employee e1 = new Employee();	
		Manager m1 = new Manager();
		
		e1.setName("Gaurav Jaiswal");
		e1.setAge(22);
		e1.setPhoneNumber("7777777777");
		e1.setAddress("Uttar Pradesh");
		member.setSalary(12.0);
		
		System.out.println("Name:  " + e1.getName());
		System.out.println("Age:  " + e1.getAge());
		System.out.println("Phone Number:  " + e1.getPhoneNumber());
		System.out.println("Address:  " + e1.getAddress());
		member.printSalary();
		
		System.out.println("====================================");
		
		m1.setName("Abhishek");
		m1.setAge(24);
		m1.setPhoneNumber("989989898989");
		m1.setAddress("Kolkata");
		member.setSalary(13.0);
		
		
		System.out.println("Name:  " + m1.getName());
		System.out.println("Age:  " + m1.getAge());
		System.out.println("Phone Number:  " + m1.getPhoneNumber());
		System.out.println("Address:  " + m1.getAddress());
		member.printSalary();
		
	}
}
