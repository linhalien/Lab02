package hust.soict.dsai.aims.media;

import java.util.Comparator;

public abstract class Media {
    protected int id;
    protected String title;
    protected String category;
    protected float cost;
 
    public Media() {
    	//
    }
    
    public Media(String title) {
		this.title = title;
		
	}
	public Media(String title, String category) {
		this(title);
		this.category = category;
		
	}
	public Media(String title, String category, float cost) {
		this(title,category);
		this.cost = cost;
		
	} 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
    
    public boolean isMatch(String searchTitle) {
        return title.equalsIgnoreCase(searchTitle);
    }
    
    public boolean equals(Object obj) {
        // Check if obj is null or not an instance of Media
        if (obj == null || !(obj instanceof Media)) {
            return false;
        }

        // Cast obj to Media and compare the titles
        Media otherMedia = (Media) obj;
        return this.title != null && this.title.equals(otherMedia.title);
    }
    
    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

}
