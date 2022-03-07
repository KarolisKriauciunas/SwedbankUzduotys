package Collections;

import java.util.Comparator;

public class PriceComparator implements Comparator<Games> {
    @Override
    public int compare(Games o1, Games o2) {
        return o1.getPrice().compareTo(o2.getPrice());
    }

}
