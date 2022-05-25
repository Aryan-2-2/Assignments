package problem4;



public class CLA {

	
	public static void main(String[] args) {
		
		String value1 = args[0];
		int x = Integer.parseInt(value1);
		
		 String value2 =  args[1] ;
	     int y = Integer.parseInt(value2);
	     
	     
		if(args.length == 1) {
			
			
			int f = 1;
			
			for(int i =1 ; i<=x ; i++) {
				f = f*i;
			}
			System.out.println(f);
	}
		
		else if( args.length == 2 ) {
			
	
		
	    
	    int minus = x-y;
		int finalValue = Math.abs(minus);  
	
		
		int fact = 1;
		
		for(int i =1 ; i<=finalValue ; i++) {
			fact = fact*i;
		}
		System.out.println(fact);
		
		}
		
		else {
			System.err.println("Error!");
		}
		
	}
	
}
