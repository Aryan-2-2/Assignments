package DAY11;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		Scanner scnaScanner = new Scanner(System.in);
		
		System.out.println("Enter Stadium Name ");
		String stadiumName = scnaScanner.nextLine();
		
	    Stadium stadium = Stadium.valueOf(stadiumName);
	    
	    Ipl ipl = new Ipl();
	    
	    ipl.homeTeamStadium(stadium);
		
	}
}
