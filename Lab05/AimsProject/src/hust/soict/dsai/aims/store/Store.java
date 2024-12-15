package hust.soict.dsai.aims.store;

import java.util.ArrayList;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

public class Store {
	private ArrayList<Media> itemsInStore = new ArrayList<Media>();
    private int numItems;

    public void addMedia(Media media) {
    	itemsInStore.add(media);
    }

    public void removeMedia(Media media) {
    	itemsInStore.remove(media);    
    }

    public void printStore() {
        System.out.println("*************** STORE ***************");
        for (Media dvd : itemsInStore) {
        	if (dvd != null) {
                System.out.println(dvd.toString());
        	}
        }
        System.out.println("*************************************");
    }
    
    public ArrayList<Media> getItemsInStore() {
    	return itemsInStore;
    }
}
