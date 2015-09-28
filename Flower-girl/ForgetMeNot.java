package javaCourcesHomeworks;

public class ForgetMeNot extends Flower {

    public ForgetMeNot(int freshnessLevel, int stemLength) {
        super(freshnessLevel, stemLength);
        this.cost = 50;
    }

    @Override
    public void cut() {
        super.cut();
        if (stemLength > 10) {
            stemLength -= 5;
        }
    }

}
