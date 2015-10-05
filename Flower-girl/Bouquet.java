package flower-girl;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {
    public Flower[] flowers;

    public Bouquet(Flower... flowers) {
        this.flowers = flowers;
    }


    public Flower[] findFlowers(int a, int b) {
        Flower[] flowersWithLength;
        List<Flower> flowerList = new ArrayList<>();
        for (int k = 0; k < flowers.length; k++) {
            if (flowers[k].stemLength > a && flowers[k].stemLength < b) {
                flowerList.add(flowers[k]);
            }
        }

        flowersWithLength = flowerList.toArray(new Flower[flowerList.size()]);
        System.out.println("Flowers from bouquet with appropriate lengths between " + a + b + " were found, their lengths are: ");
        for (Flower fl : flowersWithLength) {
            System.out.print(fl.stemLength + " ");
        }
        return flowersWithLength;

    }

    public int findCost() {
        int sum = 0;
        for (Flower fl : flowers) {
            sum += fl.cost;
        }
        return sum;
    }
}