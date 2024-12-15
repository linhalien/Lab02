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
		if (obj == null)
			return false;
		try {
			Media media = (Media) obj;
			return media.getTitle().equals(title);
		}
		catch(Exception e) {
			return false;
		}
	}
    
    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

    public boolean isFilteredById (String id) {
		return id == "" || this.isMatchById(id) ;
	}
	
	public boolean isMatchById(String id) {
		String s1 = Integer.toString(this.id);
		String s2 = id;
		for (int i = 0; i < s1.length(); ++i)
			for (int j = 0; j < s2.length(); ++j)
				if (s1.charAt(i) == s2.charAt(j))
					return true;
		return false;
	}
	
	public boolean isFilteredByTitle (String title) {
		return title == "" || this.isMatchByTitle(title) ;
	}
	
	public boolean isMatchByTitle(String title) {
		String s1 = title.toLowerCase();
		String s2 = getTitle().toLowerCase();
		for (int i = 0; i < s1.length(); ++i)
			for (int j = 0; j < s2.length(); ++j)
				if (s1.charAt(i) == s2.charAt(j))
					return true;
		return false;
	}
	

}
