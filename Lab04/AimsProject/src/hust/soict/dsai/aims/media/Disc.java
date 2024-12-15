package hust.soict.dsai.aims.media;

public class Disc extends Media {
	protected double length;
	protected String directory;
	
	public Disc() {
		super();         
    }
 
	public Disc(String title) {
		super();
		this.title = title;
	} 
	
	public Disc(String title, String category) {
		this(title);
		this.category = category;
	}
	public Disc(String title, String category, String directory) {
		this(title,category);
		this.directory = directory;
	}
	public Disc(String title, String category, float cost) {
        this(title, category);
        this.cost = cost;
    }
	public Disc(String title, String category, float cost, int length, String directory) {
        this(title, category, cost); // Invoke the constructor of the Media class
        this.length = length;
        this.directory = directory;
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
