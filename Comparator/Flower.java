package javaCourcesHomeworks.comparator;


import java.awt.*;

public class Flower implements Comparable<Flower> {

    public int freshnessLevel;
    public int cost;
    public int stemLength;
    public Color color;


    public static final FlowerComporatorByFreshness COMPORATOR_BY_FRESHNESS = new FlowerComporatorByFreshness();
    public static final FlowerComporatorByStemLength COMPORATOR_BY_STEM_LENGTH = new FlowerComporatorByStemLength();
    public static final FlowerComporatorByColor COMPORATOR_BY_COLOR = new FlowerComporatorByColor();

    private Flower() {
    }

    static Flower createFlower(int freshnessLevel, int cost, int stemLength, Color color) {

        Flower flower = new Flower();
        flower.freshnessLevel = freshnessLevel;
        flower.cost = cost;
        flower.stemLength = stemLength;
        flower.color = color;
        return flower;
    }

    public String toString() {
        String str;
        str = "FreshnesLevel: " + freshnessLevel + ", Cost: " + cost + ", StemLength: " + stemLength + "," +
                " color: (" + color.getRed() + ", " + color.getGreen() + ", " + color.getBlue() + ")";
        return str;
    }


    @Override
    public int compareTo(Flower other) {
        return this.cost - other.cost;
    }
}
