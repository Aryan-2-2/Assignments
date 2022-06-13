
package day16;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		
		PlayList p1 = new PlayList(); 
		
		for(int i=0 ; i<4 ; i++) {
			
			System.out.println("Song name");
			String sname = scanner.next();
			
			System.out.println("movie name");
			String mname = scanner.next();
			
			Song s1 = new Song(sname,mname);
		    p1.addSong(s1); 	
		
		    for(Song s:p1.songs) {
		    	
		    	s.play();
		    }
		}
	}
}
