package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cart {
	private static final int MAX_NUMBERS_ORDERED = 20;
	private ObservableList<Media> itemsOrdered = 
			FXCollections.observableArrayList();
	
	public ObservableList<Media> getItemsOrdered() {
		return itemsOrdered;
	}
	
	public void addMedia(Media media) {
	        itemsOrdered.add(media);
	    }
	public void removeMedia(Media media) {
	        itemsOrdered.remove(media);
	    }
	
	public void clear() {
		this.itemsOrdered.clear();
	}

	public float totalCost() {
		float total = 0;
        for (Media media : itemsOrdered) {
            total += media.getCost();
        }
        return total;
    }
	
	public void printCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        double totalCost = 0.0;
        int count = 1;

        for (Media dvd : itemsOrdered) {
        	if (dvd != null) {
                System.out.println(count + ". " + dvd.toString());
                totalCost += dvd.getCost();
                count++;
        	}
        }

        System.out.println("Total cost: " + totalCost + " $");
        System.out.println("***************************************************");
    }

    public void searchById(int id) {
        boolean found = false;
        for (Media dvd : itemsOrdered) {
            if (dvd.getId() == id) {
                System.out.println("Found: " + dvd.toString());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No DVD found with ID: " + id);
        }
    }

    public void searchByTitle(String title) {
        boolean found = false;
        for (Media dvd : itemsOrdered) {
            if (dvd.isMatch(title)) {
                System.out.println("Found: " + dvd.toString());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No DVD found with title: \"" + title + "\"");
        }
    }
    
    public void sortByTitle() {
		Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
	}
	
	public void sortByCost() {
		Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
	}
}
