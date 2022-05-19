/*
 * What is the difference between the static and the non-static 
 * variables of a class?
 * 
 * Answer: Static variable is something which we can directly assess
 * it from any method and it is store in RAM directly.
 * 
 * 
 * And  Non-Static variables are those variables which 
 * stores in hard disk and we can't assess it directly in a
 * static method. so we can assess this type of variable
 * in two ways:- 
 * 
 *  First way:- we can directly write the "static" keyword on the 
 *  beginning of any variable. 
 *  
 *  example : static int x = 10;
 *  
 *  Second way:- we can create a object in order to make a non-static 
 *  variable to static variable.
 *  
 *  example Demo s1 = new Demo()
 *  
 *  here, Demo is the name of a class;
 *  s1 is a variable;
 *  and new keyword is creating space in heap to store the 
 *  data.
 *  
 * 
 * */

//DETAILED EXAMPLE;

package com. masai;

public class StaticVsNonStatic {
//x is a non-static variable;
	int x  = 10;
	
	public static void main(String[] args) {
	//we can't assess x directly here it will give us CE;
	//so in order to assess we can create a object here;
		StaticVsNonStatic NonStatic = new StaticVsNonStatic();
		 
		System.out.println(NonStatic.x);
	}
}
