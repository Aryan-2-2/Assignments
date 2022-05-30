package question4;

public class Main {

	public static Person generatePerson(Person person) {
		
		

		return person;	
		
		
		
		
		
	}
	
	
	public static void main(String[] args) {

		
		
		Person p1 = new Person();
		
	     p1.setAddress(new Address());
	
	 	p1.getAddress().setCity("kolkata");
		p1.getAddress().setState("West bengal");
		p1.getAddress().setPincode("70000");
		
		
		
		
	     
		Person newStudent = generatePerson(new Student(1,"java",5000));

		Person newTeacher = generatePerson(new Instructor(104,8000000));

		System.out.println(newStudent + p1.getAddress().getCity()+p1.getAddress().getPincode()+p1.getAddress().getState());
		System.out.println(newTeacher + p1.getAddress().getCity()+p1.getAddress().getPincode()+p1.getAddress().getState());
		
	
		}
}
