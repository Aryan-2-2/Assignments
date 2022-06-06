package DAY10;

public class Demo {

	
	public Hotel provideFood(int amount) {
		
		if(amount > 1000) {
			
			TajHotel tajHotel = new TajHotel();
			
			return tajHotel;
			
		}
		
		else if (amount>=200 && amount<1000) {
			
			RoadSideHotel roadSideHotel = new RoadSideHotel();
			
			return roadSideHotel;
		}
		else {
			return null;
		}	
	}
}
