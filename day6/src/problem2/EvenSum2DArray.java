package problem2;

public class EvenSum2DArray {

public static void main(String[] args) {
	
	
	
	
	int[][] array = {
			{1,2,3},
			{4,5,6},
			{7,8,9},
			
	};
	
	
	
	for(int c=0 ; c<array.length ;c++) {
		
		int sum = 0;	
		
		for(int r=0 ; r<array.length ; r++ ) {
			
			if(array[r][c]%2==0) {
				
				sum = sum + array[r][c];
			}
			
		}
		System.out.println(sum);	
	}
}
	
}

