package DAY10;



public class Main {

	public static void main(String[] args) {
		
		Demo demo = new Demo();
    	
	   Hotel hotel =	demo.provideFood(200);
	
	    hotel.chickenBiryani();
	    hotel.masalaDosa();
	    
	    if(hotel instanceof TajHotel) {
	    	
	    	((TajHotel) hotel).welcomeDrink();
	    }
	
	}
	
	
	
	
}
