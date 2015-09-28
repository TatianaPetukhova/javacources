package javaCourcesHomeworks;

public class MainFlorist {

    public static void main(String[] args) {

        Bouquet bouquet =  new Bouquet(new Rose(4,30), new Rose(2,35), new Camomile(1,24), new ForgetMeNot(3,14), new Camomile(1,20));
        bouquet.flowers[1].cut();
        System.out.println("The cost of the bouquet is " + bouquet.findCost());
        bouquet.findFlowers(5,30);

    }
}
