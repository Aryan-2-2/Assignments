package DAY11;

public class Ipl {

	
	void homeTeamStadium(Stadium stadium) {
		
		if(stadium.equals(stadium.EDEN_GARDENS_STADIUM)) {
			System.out.println("This is the home ground of KKR");
		}
		
		else if(stadium.equals(stadium.CHIDAMBARAM_STADIUM)) {
			System.out.println("This is the home ground of CSK");	

		}
		
		else if(stadium.equals(stadium.M_CHINNASWAMY_STADIUM)) {
		System.out.println("This is the home ground of RCB");	

		}
		
		else if(stadium.equals(stadium.WANKHEDE_STADIUM)) {
			System.out.println("This is the home ground of Mumbai Indians");	

		}
		else {
			System.err.println("This Stadium is Not in the Enum List");
		}
		
	}
	
}
