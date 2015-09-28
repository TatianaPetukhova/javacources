package javaCourcesHomeworks;

public class Flower {

    public int freshnessLevel;
    public int cost;
    public int stemLength;

    public Flower(int freshnessLevel, int stemLength) {
        this.freshnessLevel = freshnessLevel;
        this.stemLength = stemLength;
    }

    public void water() {
        System.out.println("The flower was watering");
    }

    public void replant() {
        System.out.println("The flower was replanted");
    }

    public void cut() {
        System.out.println("The flower was cut");
    }

}
