package question3;

import java.util.Scanner;

public class Main {

 public static void main(String[] args) {
	
	 Scanner scanner = new Scanner(System.in);
	 
	 Car car = new Car();
	 
	 System.out.println("Enter the number of passengers");
	car.setNumberOfPassenger(scanner.nextInt());
	 
	 System.out.println("Enter the no of killo meters");
	 car.setNumberOfKms(scanner.nextInt());
	 
	 OLA myOla = new OLA();
	 
	 Car myCar = myOla.bookCar(car.getNumberOfKms(),car.getNumberOfPassenger());
	 int res = myOla.calculateBill(car.getNumberOfKms());

	 System.out.println("The total fare amount is"+ res);
	 
}
}
