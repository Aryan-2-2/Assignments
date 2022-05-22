package com.masai;

public class Demo {

	String s;
	int i;
	float f;
	
	
	
	public Demo() {
	
		System.out.println("inside zero argument Demo");
	}
	
	public Demo(String s){
		this.s = s;
		System.out.println("inside String argument"+" " +s);
	}
	
     public Demo(int i){
    	 this.i = i;
			 System.out.println("inside integer argument"+" " +i);
	}
     
     public Demo(float f) {
    	 this.f = f;
    	 System.out.println("inside float argument"+" " +f); 
     }
     
	public static void main(String[] args) {
			 Demo d1 = new Demo();
			// Demo d1 = new Demo("hello");
			//Demo d1 = new Demo(10);
			//Demo d1 = new Demo(10.99f);
	}
	
	
}



