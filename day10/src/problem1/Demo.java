package problem1;

import java.util.Scanner;

public class Demo {

	public Hotel provideFood(int amount) {
		
	
				
	     if(amount>=1000) {
			Hotel tajHotel = new TajHotel();
			return tajHotel;
		}
		else if(amount>=200 && amount<1000 ) {
			RoadSideHotel rodeHotel = new RoadSideHotel();
			return rodeHotel; 
		}
		else {
			return null;
		}
	}


	public static void main(String[] args) {
		
	     Demo demo = new Demo();
	          
	     Scanner scanner = new Scanner(System.in);
	     
	     System.out.println("Enter the Amount you have");
	     int Money = scanner.nextInt();
	     
	  if(Money < 200) {
		  System.err.println("You must have Atleast 200Rs");
	  }
	  else {
		   Hotel hotel =  demo.provideFood(Money);
		      
		      hotel.chickenBiryani();
		      hotel.masalaDosa();
		      
		     if(hotel instanceof TajHotel) {
		    	 
		    	 TajHotel tajHotel = new TajHotel();
		    	 tajHotel.welcomeDrink();
		     }
	  }
		
	}
}
