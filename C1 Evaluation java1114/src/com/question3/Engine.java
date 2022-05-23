package com.question3;



public class Engine {

  private	int rmp;
  private	int Power;
  private	String manufacturer;
  private	Boolean hasTurbo;
  
  
  Boolean enableTurbo(String t) {
	  if(t=="yes") {
		  return true;
	  }
	  else {
		  return false;
	  }
  }
  
  void parameterised(int rmp,int power,String manufacturer,Boolean hasTurbo){
	  
	  System.out.println("Car rmp" + rmp);
	  System.out.println("Car power" + power);
	  System.out.println("Car manufacturer" + manufacturer);
	  System.out.println("Car has turbo" +hasTurbo);

  }
  void zero() {
	  Car c1 = new Car();
	
	  System.out.println("Car Model : Harrier");
	  System.out.println("Car companyName : Tata");
	  System.out.println("Car color : black");
  }
  
  public static void main(String[] args) {
	
	 
	  
	  Engine c2 = new Engine();
	  c2.zero(); 
	  c2.parameterised(10000,500,"tata",true);
}
}
