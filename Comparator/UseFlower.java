package comparator;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UseFlower {

    public static void main(String[] args) {

        List<Flower> flowerList = new ArrayList<Flower>();

        flowerList.add(Flower.createFlower(3, 100, 50, new Color(200,4,123)));
        flowerList.add(Flower.createFlower(4, 190, 55, new Color(200,86,255)));
        flowerList.add(Flower.createFlower(1, 200, 60, new Color(100,4,200)));
        flowerList.add(Flower.createFlower(1, 140, 70, new Color(255,100,45)));
        flowerList.add(Flower.createFlower(3, 70, 35, new Color(240,240,140)));
        flowerList.add(Flower.createFlower(5, 105, 65, new Color(200,38, 120)));
        flowerList.add(Flower.createFlower(4, 100, 50, new Color(255,100,255)));
        flowerList.add(Flower.createFlower(2, 300, 70, new Color(240,20,100)));

        System.out.println("Unsorted");
        for (Flower flower : flowerList) {
            System.out.println(flower.toString());
        }

        Collections.sort(flowerList);
        System.out.println("\nSorted by natural order");
        for (Flower flower : flowerList) {
            System.out.println(flower.toString());
        }

        Collections.sort(flowerList, Flower.COMPORATOR_BY_FRESHNESS);
        System.out.println("\nSorted by freshness level");
        for (Flower flower : flowerList) {
            System.out.println(flower.toString());
        }

        Collections.sort(flowerList, Flower.COMPORATOR_BY_STEM_LENGTH);
        System.out.println("\nSorted by stem length");
        for (Flower flower : flowerList) {
            System.out.println(flower.toString());
        }

        Collections.sort(flowerList, Flower.COMPORATOR_BY_COLOR);
        System.out.println("\nSorted by color");
        for (Flower flower : flowerList) {
            System.out.println(flower.toString());
        }
    }

}
