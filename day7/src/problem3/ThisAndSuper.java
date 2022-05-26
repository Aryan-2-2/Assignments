package problem3;



public class ThisAndSuper {

	
//What is this keyword?	
	
/*
 * Ans:- "This" Keyword is used to indicate the current
 * object in a method or a constructor. it eliminates the confusion
 * between class attributes(variables) and parameters with the same 
 * name.
 * 
 * one example is shown below;
 * 
 * So in the below method "setName" you can see that
 * there are two variables with the same name which are "name" and
 * This keyword is referring to a class variable that is in 
 * initialize in line no 21 and another "name" is a parameter of that 
 * method.
 * 
 *  so to differentiate or to not get confused we use
 *  this keyword.
 * */	

String name;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}


// What is the meaning of Super Keyword in Java?

/*
 * Ans;- "super" Keyword is used to invoke overridden methods of
 * superclass.
 * 
 * by using super we can access the data of parent class.
 * we can call the parent class methods.
 * 
 * one example is shown below;
 * */
}
class Parent{
	
	void says() {
		System.out.println("study hard");
	}
}

class Child extends Parent{
	
	
	@Override
	void says() {
		System.out.println("enjoy hard");
	}
	
	void whatSays() {
		says();
		super.says();
	}
}


class Main{
	public static void main(String[] args) {
		
		Child c1 = new Child();
		 
		c1.whatSays();
	}
	
}


