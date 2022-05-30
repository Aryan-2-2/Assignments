package question3;

public class OLA {
	public Car bookCar(int numberOfPassenger, int numberOfKMs) {
		
		HatchBack hatchBack = new HatchBack();
		Sedan sedan = new Sedan();
		
		if(numberOfPassenger<=3) {
			return hatchBack;
		}
		else {
			return sedan;
		}
	}
	

	
	public int calculateBill(int x) {
		
		Car c1 = new Car();
		HatchBack hatchBack = new HatchBack();
		Sedan sedan = new Sedan();
		
		if(x<=3) {
		int	a = (15*c1.getNumberOfKms());
			return a;
		}
		else {
		int	b = (20*c1.getNumberOfKms());
		return b;
		}
	
		
	}
}
