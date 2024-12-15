package hust.soict.dsai.test.store;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        // Create a new store
        Store store = new Store();

        // Create new DVD objects
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", "John Musker", 90, 18.99f);

        // Test addDVD method
        store.addMedia(dvd1);
        store.addMedia(dvd2);
        store.addMedia(dvd3);

        // Print store content after adding DVDs
        store.printStore();

        // Test removeDVD method
        store.removeMedia(dvd2); // Remove an existing DVD
        store.removeMedia(dvd2); // Attempt to remove a non-existing DVD

        // Print store content after removing DVDs
        store.printStore();
    }
}

