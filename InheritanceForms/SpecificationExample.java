package inheritanceForms;


public class SpecificationExample {
    public abstract class HomeAppliances {
        public boolean stateOnOff;

        public abstract void clean();

        public abstract void switchOn();

        public abstract void switchOff();
    }

    public class WashingMachine extends HomeAppliances {
        public int washingMode;
        public boolean empty;

        @Override
        public void clean() {
            switchOff();
            removeClothes();
            System.out.println("The washing machine is clean now");
        }

        @Override
        public void switchOn() {
            stateOnOff = true;
            setWashingMode(2);
            System.out.println("The washing machine is on");
        }

        @Override
        public void switchOff() {
            stateOnOff = false;
            setWashingMode(0);
            System.out.println("The washing machine is off");
        }

        public void removeClothes() {
            empty = true;
        }

        public void setWashingMode(int x) {
            washingMode = x;
        }
    }
}
