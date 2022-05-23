package com.question5;

public class Shapes {

	
 public	void area(int radius) {
		System.out.println("circle radius:"+ radius);
	}
 public void area(int lenght, int breadth) {
		System.out.println("rectengle lenght:"+ lenght+"  breadth: " +breadth);
 }

 public void area(double side) {
	System.out.println("squre side :"+side);
 }
 
 public static void main(String[] args) {
	Shapes s1 = new Shapes();
	
	
	
	s1.area(10);
    s1.area(5,12);
	s1.area(4);
	
	//With the help of this explain static polymorphism.
	
/*Method overloading is a example of polymorphism which you can see in this 
 * above problem. the speed of static polymorphism is very high compare 
 * to dynamic polymorphism. static polymorphism collect the
 *  information to call a method during compile time.
 *  here, it will automaticlly chossing the correct method by itself.
 *
 * 
 * */
	
}
}
