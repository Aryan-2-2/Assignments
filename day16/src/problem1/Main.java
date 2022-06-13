package problem1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		

		
		ArrayList<Product> a1 = new ArrayList<>();
		
		
		a1.add(new Product(4,"B-shirt",2000));
		a1.add( new Product(3,"Ahirt",1000));
		
		Scanner scanner = new Scanner(System.in);
		
		int userInput = scanner.nextInt();
		
	    
	    
	    
	  Collections.sort(a1,new Comparator<Product>() {

		@Override
		public int compare(Product o1, Product o2) {
 
			Integer itInteger = o1.getProductId();
			Integer itInteger2 = o2.getProductId();

			
	return itInteger.compareTo(itInteger2);

		
		
		}
	});
	
	
		
	}
}
