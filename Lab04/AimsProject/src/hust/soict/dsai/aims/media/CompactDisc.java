package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Disc implements Playable{
    private String artist;
    private ArrayList<Track> tracks = new ArrayList<Track>();

    public CompactDisc() {
        super();
    }

    public CompactDisc(String title) {
		super(title);
	}
	
	public CompactDisc(String title,String category) {
		this(title);
		this.category = category;
	}
	
	public CompactDisc(String title, String category, String director) {
		this(title,category);
		this.directory = director;
	}
	
	public CompactDisc(String title, String category, String director, float cost) {
		this(title,category,director);
		this.cost = cost;
	}
	
	public CompactDisc( String title, String category, String director, int length, float cost) {
	    this(title, category,director,cost);
	    this.length = length;
	}
	
    public String getArtist() {
        return artist;
    }

    public void addTrack(Track track) {
        if (tracks == null) {
            tracks.add(track);
        } else if (!tracks.contains(track)) {
            tracks.add(track);
        } else {
            System.out.println("Track already exists in the list.");
        }
    }

    public void removeTrack(Track track) {
        if (tracks.remove(track)) {
            System.out.println("Track removed successfully.");
        } else {
            System.out.println("Track not found in the list.");
        }
    }

    public double getLength() {
        double totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }

    public void play() {
        for (Track track : tracks) {
        	System.out.println("Playing Compact Disc: " + getTitle());
            System.out.println("Artist: " + getArtist());
            System.out.println("Total Length: " + getLength());
        }
	}
    
    public String toString() {
        return "CD- " + title + "- " + category + "- " + directory + "- " + length + " mins: " + cost + " $";
    } 
}





