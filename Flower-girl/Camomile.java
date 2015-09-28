package javaCourcesHomeworks;

public class Camomile extends Flower {


    public Camomile(int freshnessLevel, int stemLength) {
        super(freshnessLevel, stemLength);
        this.cost = 80;
    }

    @Override
    public void cut() {
        super.cut();
        if (stemLength > 12) {
            stemLength -= 7;
        }
    }
}
