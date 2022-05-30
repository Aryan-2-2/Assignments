package question1;

public class IsAAndHasARelationship {

	
//Explain the difference between IS-A and Has-A relationship 
//with the help of an	example and explain about 
//access modifiers and their accessibility?

	
	
/*ANS: IS-A relationship:
 * 
 * 
 * IS-A relationship occurs when a class
 *is extended another class, which means there is a parent 
 *and child relationship, inheriting the properties of
 *parent.
 *
 *below is an example of an IS-A relationship:
 * */		
}

class Animal{
	
	void speak() {
	    System.out.println("I can Speak");	
	}
}

class Lion extends Animal{
	
	@Override
	void speak() {
	    System.out.println("I can Roar");	
	}
	
	
	/*
	 * so here as you can see there "the lion is an Animal"
	 * lion inherits the properties of animal and it can
	 * be anything like a dog is an animal, the cat is 
	 * an animal hence it is an IS-A Relationship.
	 * 
	 * */
}

// *Has-A relationship:

/*Has-A relationship can be formed by two classes if any
 * instance variable of class referring to another class.
 * it means Has-A relationship. 
 * */

class Engine{
	
	
	void power() {
		System.out.println("I have Power in my Engine");
	}
	
}

class Car{
	
    public Engine engine;
    
	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	void wantPower() {
		engine.power();
	}
}


// Access modifiers:

/*There are Four Types of access modifiers in java.
 * 
 * 1>Public
 * 2>Default
 * 3>protected
 * 4>private
 * 
 * 1>Public  access modifiers are those which we can access
 * anywhere inside the package and as well as outside the 
 * package.
 * 
 * 2>Default access modifier mostly act like public
 * which we can access anywhere in the package in any of
 *  classes but we can't access it outside the package.
 * 
 * 3>Protected  access modifiers are those which we can't
 * access outside the package in order to do so we have 
 * to inheritate it.
 * 
 * 4>private  access modifiers we can't access this in another
 * class it is a private properties of that class in
 * which it is defined in order to access this we have to
 * set getters and setters method.
 * 
 * 
 * 
 * 
 * 
 * */

