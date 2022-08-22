package problem3;

public class FinallyVsFinal {

	
	//Explain Finally and Final Keyword with an Example?
	
	
	/*finally is a block we use this block  along with try 
	 * and catch finally assure that weather your try 
	 * executes or not, whether your catch block executes or 
	 * not finally will execute.
	 * 
	 * 
	 * Finally block will not get into the picture in 
	 * following conditions:-
	 * 	
	 * if you write System.exit in your program.
	 * if your system shut down.
	 * if Stack overflow etc. 
	 * 
	 * 
	 * There is one example of finally below:-
	 * */

}

class Finally{
	
	public static void main(String[] args) {
		
		System.out.println("start of main");
		
		try {
			
			System.out.println(200/0);
			
		} catch (ArithmeticException e) {
		
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("inside finally block");
		}
		System.out.println("end of main");

	}
}

class Final{
	
	
	//Final keyword
	
	
	/*final keyword is a keyword that we use to finalize
	 * the value of a variable as well as method.
	 * 
	 * once you add the keyword final before a method or
	 * a variable then you won't able to change that variable 
	 * in the future and we cannot override that final method.
	 * 
	 * there is one example of final keyword below:-
	 * 
	 * 
	 * */
	
      final	void finalExample() {
		
    	  System.out.println("inside the finalExample of final");
	}
	
	final int x  = 10;
	
	public static void main(String[] args) {
		
		//I won't able to override the above method here and.
		// won't able to reinitialize too.
		//it will throw error
		
		Final final1 = new Final();
	/*
	 * @Override
		 final	void finalExample() {
			
	    	  System.out.println("inside the finalExample of final");
		}
		*/
		
		//final1.x =20;
		
		
	}
	
}
