package flower-girl;

public class Rose extends Flower {


    public Rose(int freshnessLevel, int stemLength) {
        super(freshnessLevel, stemLength);
        this.cost = 100;
    }

    @Override
    public void cut() {
        super.cut();
        if (stemLength > 20) {
            stemLength -= 10;
        }
    }
}
