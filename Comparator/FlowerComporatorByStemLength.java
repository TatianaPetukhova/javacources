package javaCourcesHomeworks.comparator;

import java.util.Comparator;


public class FlowerComporatorByStemLength implements Comparator<Flower> {

    @Override
    public int compare(Flower flower1, Flower flower2) {
        return flower1.stemLength - flower2.stemLength;
    }
}
