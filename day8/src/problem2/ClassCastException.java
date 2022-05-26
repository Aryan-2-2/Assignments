package problem2;

/*Explain ClassCastException with the help of the example.
 * 
 * Ans: ClassCastException is a type of error it happens 
 * when we are trying to downcast two class
 *  which do not have "is a relationship" between each 
 *  other like you can see in below example.
 *  
 *  or when we are trying to downcast parent class to its
 *  child class type then also we got ClassCastException.
 * 
 * */


//below is the example of class cast exception;

public class ClassCastException {

	
	
}

class main{
	
	public static void main(String[] args) {
		ClassCastException c1 = new ClassCastException();
		
		main m1 = (main) c1;
	}
}