package problem3;

public class Prime {

	
		public int[] findAndReturnPrimeNumbers(int[] inputArray){
		//write the logic to iterate through the supplied inputArray and
		//determine each element whether it is prime or not
		//create a second array of int
		//if any number is prime inside the inputArray then add that number inside the second
		//array
		//and return the second array
		//if no prime number is found then return the empty array.
			
			
			int length = inputArray.length;
			int[] newArr = new int[50];
			
			int count =0;
			for(int i=2 ; i<length; i++) {
				if(length%i==0) {
					count++;
				}
			}
			if(count == 2 ) {

      for(int j = 0 ; j<length; j++) {
	      newArr[j] = inputArray[j];
	     System.out.println(newArr);
    }
      return newArr;
      }
			else {
				 int[] e = new int[5];
				 return e;
			}
			
		}
		public static void main(String[] args){
		//Create the object of Main class
		//on the object of Main class call the findAndReturnPrimeNumbers method
		//by supplying the following array as the parameter
		int[] arr = {10,12,5,50,11,14,13};
		//print each element from the returned array of findAndReturnPrimeNumbers method
		//if findAndReturnPrimeNumbers method returns an empty array then print the following
		//message:
		// "Prime number not found in the supplied Array"
		
		Prime p1 = new Prime();
		
		
	   p1.findAndReturnPrimeNumbers(arr);
		
	   
		}
		}
	
	

