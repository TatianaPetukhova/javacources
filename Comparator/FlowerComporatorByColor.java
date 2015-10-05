package comparator;

import java.util.Comparator;

public class FlowerComporatorByColor implements Comparator<Flower> {
    @Override
    public int compare(Flower flower1, Flower flower2) {
        int red = flower1.color.getRed() - flower2.color.getRed();
        int green = flower1.color.getGreen() - flower2.color.getGreen();
        int blue = flower1.color.getBlue() - flower2.color.getBlue();
        return red + green + blue;
    }
}
