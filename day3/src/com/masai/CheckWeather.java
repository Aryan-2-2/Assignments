package com.masai;

public class CheckWeather {

public static void main(String[] args) {
	boolean IsSnowing = true;
	boolean IsRaining = true;
	double Temperature = 40.0;
	
if(IsSnowing == true  & IsRaining == true & Temperature<50) {
		
	System.out.println("Let�s stay home");
}

else {
	System.out.println("Let�s go out!");
}
	
}	
	
	
}
