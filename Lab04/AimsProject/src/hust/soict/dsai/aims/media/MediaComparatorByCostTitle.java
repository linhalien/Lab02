package hust.soict.dsai.aims.media;
import java.util.Comparator;
class MediaComparatorByCostTitle implements Comparator<Media> {
    @Override
    public int compare(Media m1, Media m2) {
        int costComparison = Double.compare(m2.getCost(), m1.getCost());
        if (costComparison != 0) {
            return costComparison;
        }
        // Sort by title if costs are the same
        return m1.getTitle().compareTo(m2.getTitle());
    }
}