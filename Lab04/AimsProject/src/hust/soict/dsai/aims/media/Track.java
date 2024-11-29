package hust.soict.dsai.aims.media;

public class Track implements Playable{
	private String title;
	private double length;
	
	public String getTitle() {
		return title;
	}

	public double getLength() {
		return length;
	}

	public Track(String title, int length) {
		this.title = title;
		this.length = length;
	}
	
	public void play() {
		 System.out.println("Playing DVD: " + this.getTitle());
		 System.out.println("DVD length: " + this.getLength());
	}
	
	public boolean equals(Object obj) {
        // Check if obj is null or not an instance of Track
        if (obj == null || !(obj instanceof Track)) {
            return false;
        }

        // Cast obj to Track and compare both title and length
        Track otherTrack = (Track) obj;
        return super.equals(otherTrack) && this.length == otherTrack.length;
    }
	
	public String toString() {
		return "Track : " + title +" Length " + length;
	}
}
