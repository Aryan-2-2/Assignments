package problem1;

public interface X {

	public abstract void funA();
	
	
     default void funB() {
    	System.out.println("inside funB of X");
	}
    
    
   static void funC(){
    	System.out.println("inside funC of X");
    }
}
