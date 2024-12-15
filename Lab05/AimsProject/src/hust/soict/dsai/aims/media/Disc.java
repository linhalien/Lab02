package hust.soict.dsai.aims.media;

public class Disc extends Media{
	
	private double length;
	protected String directory;
	
	public Disc(String title) {
		super(title);
	}
	
	public Disc(String title, String category, float cost) {
		super(title, category, cost);
	}
	
	public Disc(String title, String category, String director, float cost) {
		super(title, category, cost);
		this.directory = director;
	}
	
	public Disc(String title, String category, String director, int length, float cost) {
		super(title, category, cost);
		this.directory = director;
		this.length = length;
	}
	
	
	public double getLength() {
		return length;
	}

	public String getDirector() {
		return directory;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public void setDirectory(String directory) {
		this.directory = directory;
	}

}
