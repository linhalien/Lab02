package hust.soict.dsai.aims.media;

import java.util.Comparator;

//Comparator to sort by title, then cost (higher cost first if titles are the same)
class MediaComparatorByTitleCost implements Comparator<Media> {
 @Override
 public int compare(Media m1, Media m2) {
     int titleComparison = m1.getTitle().compareTo(m2.getTitle());
     if (titleComparison != 0) {
         return titleComparison;
     }
     // Sort by cost in descending order if titles are the same
     return Double.compare(m2.getCost(), m1.getCost());
 }
}