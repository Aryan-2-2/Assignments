package question3;

public class OLA {
	public Car bookCar(int numberOfPassenger, int numberOfKMs) {
		
		
		
		
		if(numberOfPassenger<=3) {
			HatchBack hatchBack = new HatchBack();
			hatchBack.setNumberOfPassenger(numberOfPassenger);
			hatchBack.setNumberOfKms(numberOfKMs);
			return hatchBack;
		}
		else {
			Sedan sedan = new Sedan();
			sedan.setNumberOfKms(numberOfKMs);
			sedan.setNumberOfPassenger(numberOfPassenger);
			return sedan;
		}
	}
	

	
	public int calculateBill(Car car) {
		
	
	     if(car instanceof HatchBack) {
	    	 HatchBack h1 = (HatchBack)car;
		  
		  int kms = h1.getNumberOfKms();
		  int fare = h1.farePerKm;
		  
		  return kms*fare;
	  }
	  else {
		  Sedan s1 = (Sedan)car;
		 
		 int kms = s1.getNumberOfKms();
		 int fare = s1.farePerKm;
		 
		 return kms*fare;
	  }
		
	
	
		
	}
}
