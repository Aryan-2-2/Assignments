package problem1;

public interface Y {

	public abstract void fun1();
	
	
    default	void fun2() {
   	System.out.println("inside fun2 of Y");
	}
   
   
  static void fun3(){
   	System.out.println("inside fun3 of Y");
   }



}
