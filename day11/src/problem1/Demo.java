package problem1;

public class Demo {

	
	
	public static void main(String[] args) {
		
		ZImpl zImpl = new ZImpl();
		
		
		zImpl.funA();
		zImpl.fun1();
		zImpl.funB();
		
	   
		
	    //Static Method of funX And funY
	    X.funC();
	    Y.fun3();
	    
	    Y y1 = (Y)zImpl;
	    
	    //Default Method of funY
	    y1.fun2();
	}
}
