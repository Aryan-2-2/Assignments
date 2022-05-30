package question4;

public class Main {

	public static Person generatePerson(Person person) {
		
		
		Student s1 = new Student(111,"JAVA",50000);
		return s1;	
		
		
		
		
		
	}
	
	
	public static void main(String[] args) {

		
		
		Person p1 = new Person();
		
		Person newStudent = generatePerson(new Student());

		Person newTeacher = generatePerson(new Instructor());

		System.out.println(newStudent);
		
		p1.getAddress().setCity("kolkata");
		p1.getAddress().setState("West bengal");
		p1.getAddress().setPincode("70000");
		
		System.out.println(p1.getAddress().getCity());
		System.out.println(p1.getAddress().getPincode());
		System.out.println(p1.getAddress().getState());
		
		System.out.println(newTeacher);
		}
}
