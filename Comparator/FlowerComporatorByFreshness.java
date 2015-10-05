package comparator;

import java.util.Comparator;


public class FlowerComporatorByFreshness implements Comparator<Flower> {

    @Override
    public int compare(Flower flower1, Flower flower2) {
        return flower1.freshnessLevel - flower2.freshnessLevel;
    }
}
