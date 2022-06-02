package problem2;

import java.util.Scanner;

public class Parent {


	int n = getNumber();
	
	final int number = n;
	

	
 public int getNumber() {
		return number;
	}

 

	void method1(int n) {
		
		if(n<=1 && n>=10) {
			System.out.println("inside method1 of parent");
			System.out.println(number);
		}
		else {
			System.err.println("Invalid Number");
		}

	}
	
	final  void method2() {
		System.out.println("inside method2 of parent");
	}

    void method3() {
		System.out.println("inside method3 of parent");

    }
}

 class Child extends Parent{
	
  @Override
  void method1(int n) {
	  
		System.out.println("inside method1 of child");

  }
	 
	public static void main(String[] args) {
		
     Scanner scanner = new Scanner(System.in);
     
     System.out.println("Enter a Number between 1 to 10");
     int num = scanner.nextInt();
		
     Parent parent = new Child();
     
    parent.method1(num);
     
	}
   
}