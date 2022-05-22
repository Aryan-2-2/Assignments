package com.masai;


public class MultipleOfTen {

	public void WholeNumber(int n) {
		
		 if(n % 2 != 0 & n >0) {
			 System.out.println(n);
		 }
		 else if (n < 0) {
			 System.out.println("Error!");
		 }
		 
		 else {
				int x  = (n+ (10-n %10));
				 System.out.println(x);
			 }
	}
	
 public static void main(String[] args) {
	
	 MultipleOfTen n1 = new MultipleOfTen();
	 
	 n1.WholeNumber(-9);
	
}
	
	
}
