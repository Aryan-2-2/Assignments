package question3;

import java.util.Scanner;

public class Main {

 public static void main(String[] args) {
	
	 Scanner scanner = new Scanner(System.in);
	 
	 Car car = new Car();
	 
	 System.out.println("Enter the number of passengers");
	 car.setNumberOfPassenger(scanner.nextInt());
	 int p = car.getNumberOfPassenger();
	 
	 
	 System.out.println("Enter the no of killo meters");
	 car.setNumberOfKms(scanner.nextInt());
	 int kms = car.getNumberOfKms();
	 
	 
	 OLA myOla = new OLA();
	 Car myCar = myOla.bookCar(p,kms);
	 int res = myOla.calculateBill(myCar);

	 System.out.println("The total fare amount is"+ res);
	 
}
}
