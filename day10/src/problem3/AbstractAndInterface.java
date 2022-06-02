package problem3;

public class AbstractAndInterface {

// Explain abstract class and interface with an example.

/*Overview:
 * 
 * From abstract class and interface we reach the abstraction
 * which is hiding the implementation and showing the results.
 * from the abstract class we achieve 0 to 100% of 
 * abstraction whereas from interface we achieve 100% of 
 * abstraction.
 *
 *
 * Abstract classes: abstract classes are those which start
 * from abstract keyword and it has to extend by any class
 * otherwise it will be meaningless, An abstract class may
 * or may not have an abstract method and it should not have 
 * anybody the body of abstract method provided by the child 
 * class and we cannot make the object of an abstract class
 * Directly. 
 * 
 * You can see an example below:
 * */
}

abstract class Parent{
	
 //abstract classes also have a non-abstract method.
	
	void funA() {
		System.out.println("I am not a Abstract method");
	}
	
	public abstract void fun1();
}

class Child extends Parent{

// we have to override the abstract parent class abstract
//method in child class.
	
	@Override
	public void fun1() {
		
		System.out.println("I am a Abstract method");
		
	}
	
	public static void main(String[] args) {
		
		/* I cannot make an object of parent class like:
		 * 
		 * Parent parent = new Parent();
		 * 
		 * it will give compile time exception
		 * */
		
		Parent parent = new Child();
		
		parent.fun1();
	}
	
}

/*Interface:
 * 
 * In the interface all the methods are abstract whether you
 * define or not it is by default. we can define an interface
 * by using interface keyword. we can also achieve Is-A
 * Relationship by implementing interface.
 * 
 Below there is  one Interface example: 
 * */

interface Animal{
	
	/*you can define the interface method in both the way
	 * by giving abstract keyword or without.
	 * */
	
      void fun8();
      
      public abstract void fun9();
	
}

class Kite implements Animal {

	/*and in interface too we have to  override the method 
	 * of parent class.
	 * */
	
	@Override
	public void fun8() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fun9() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		Animal a1 = new Kite();
	}
}
