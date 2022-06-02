package problem3;

import java.util.Scanner;

public class IPL {

	void homeTeamStadium(Stadium stadium) {

		if(stadium.equals(stadium.EDEN_GARDENS_STADIUM)) {
			
			System.out.println("This is Home Ground of KKR");
		}
		
		else if(stadium.equals(stadium.WANKHEDE_STADIUM)) {
			
			System.out.println("This is Home Ground of mumbai Indians");
		}
		
		else if(stadium.equals(stadium.CHIDAMBARAM_STADIUM)) {
			
			System.out.println("This is Home Ground of CSK");
		}
		else if(stadium.equals(stadium.M_CHINNASWAMY_STADIUM)) {
			
			System.out.println("This is Home Ground of RCB");
		}
		else {
			System.err.println("Invalid Stadium Name");
		}
		
		
		
		
		
		
		
	}
}


class Main{
	
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Enter The Name Of Stadium");
        String stadiumName = scanner.next();
		
        Stadium stadium = Stadium.valueOf(stadiumName);
        
        IPL ipl = new IPL();
      	
        ipl.homeTeamStadium(stadium);
		
	}
}