package question1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class IndexOutOfBound {

	public static void main(String[] args) {
		
		try {
			Scanner scanner = new Scanner(System.in);
			
			
			
			System.out.println("Enter the number of elements in the array ");
			int index = scanner.nextInt();
			
			int[] arr = new int[index];
			
			System.out.println("Enter the elements in the array");
		
			
		
			
			for(int i=0 ; i<index; i++) {
				arr[i] = scanner.nextInt();
			}
			System.out.println(Arrays.toString(arr));	
			
			System.out.println("Enter the element you want to access");
		    int userElement = scanner.nextInt();
		    
		    System.out.println("The array element at index: "+userElement+" " +arr[userElement]);
		    System.out.println("The array element successfully accessed");
		
		
		   }catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println(e.getMessage());
			
		   }catch (NumberFormatException nfe) {
			
			System.out.println(nfe.getMessage());
			
		}catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
	}
	
}
