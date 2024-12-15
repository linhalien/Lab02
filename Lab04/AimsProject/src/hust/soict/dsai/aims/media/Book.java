package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
    //private int id;
    private String title;
    private String category;
    private float cost;
    public Book(String title, String category) {
		this.title = title;
		this.category = category;
	}

	public Book(String title) {
		this.title = title;
	}

	public Book(String title, String category, float cost) {
		this.title = title;
		this.category = category;
		this.cost = cost;
	}

	private List<String> authors = new ArrayList<>();

    

	// Method to add an author
    public void addAuthor(String authorName) {
        if (!authors.contains(authorName)) {
            authors.add(authorName);
        } else {
            System.out.println("Author already exists.");
        }
    }

    // Method to remove an author
    public void removeAuthor(String authorName) {
        if (authors.contains(authorName)) {
            authors.remove(authorName);
        } else {
            System.out.println("Author not found.");
        }
    }
    
    public List<String> getAuthors() {
        return authors;
    }
    
    public String toString() {
        return "BOOK- " + title + "- " + category + "- " + "- " + cost + " $";
    }
}
