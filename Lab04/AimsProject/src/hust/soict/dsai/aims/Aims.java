package hust.soict.dsai.aims;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.store.Store;
import hust.soict.dsai.aims.media.*;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class Aims {
	private static Store store = new Store();
	private static Cart anOrder = new Cart();
	
	public static void main(String[] args) {
		// create a new dvd object and add them to ther cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion king", "Animation", "Roger Allers", 87, 19.95f);
		anOrder.addMedia(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		anOrder.addMedia(dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		anOrder.addMedia(dvd3);
		
		//print total cost of the items in the cart
		//System.out.println("Total cost is: ");
		//System.out.println(anOrder.totalCost());
		
		//anOrder.removeMedia(dvd1);
		//System.out.println("Total cost is: ");
		//System.out.println(anOrder.totalCost());
		CompactDisc cd1 = new CompactDisc("Bật nó lên","Music","SOOBIN");				
		CompactDisc cd2 = new CompactDisc("Let It Be", "Music", "The Beatles");
		CompactDisc cd3 = new CompactDisc("Hotel California", "Music", "Eagles");
		CompactDisc cd4 = new CompactDisc("Thriller", "Music", "Michael Jackson");
		CompactDisc cd5 = new CompactDisc("The Dark Side of the Moon", "Music", "Pink Floyd");
		CompactDisc cd6 = new CompactDisc("Abbey Road", "Music", "The Beatles");
		CompactDisc cd7 = new CompactDisc("Born in the USA", "Music", "Bruce Springsteen");
		
		Book book1 = new Book("To Kill a Mockingbird", "Fiction", 9.99f);
		Book book2 = new Book("1984", "Dystopian", 8.99f);
		Book book3 = new Book("Pride and Prejudice", "Classic", 7.99f);
		Book book4 = new Book("The Great Gatsby", "Fiction", 9.99f);
		Book book5 = new Book("The Catcher in the Rye", "Coming-of-age", 8.99f);
		
		store.addMedia(dvd1);
		store.addMedia(dvd2);
		store.addMedia(dvd3);
		store.addMedia(cd1);
		store.addMedia(cd2);
		store.addMedia(cd3);
		store.addMedia(cd4);
		store.addMedia(cd5);
		store.addMedia(cd6);
		store.addMedia(cd7);
		store.addMedia(book1);
		store.addMedia(book2);
		store.addMedia(book3);
		store.addMedia(book4);
		store.addMedia(book5);
		
		store.printStore();
	}
}
