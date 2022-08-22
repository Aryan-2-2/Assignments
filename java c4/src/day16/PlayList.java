package day16;

import java.util.ArrayList;
import java.util.List;

public class PlayList {

	
	public List<Song> songs = new ArrayList<>();
	
	public void addSong(Song song) {
		
		int count =0 ;
		
		for(Song s:songs) {
			
			if(s.equals(song)) {
				
				System.out.println("Already added");
				count++;
			}
		}
		
		if(count == 0) {
			songs.add(song);
			System.out.println("added successfully");
			
		}
	}
}
