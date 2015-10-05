package inheritanceForms;

public class SpecializationExample {
    public class HomeAppliances {
        public boolean isWorkingNow;
        public boolean isClean;

        public void clean() {
            if (isClean == true) {
                System.out.println("Appliance has been cleaned already");
            } else {
                isClean = true;
                System.out.println("Appliance has been successfully cleaned");
            }
        }

        public void switchOff() {
                isWorkingNow = false;
        }

        public void switchOn() {
                isWorkingNow = true;
        }
    }

    public class Fridge extends HomeAppliances {
        public int coldDegree;
        public boolean hasFood;

        public void putFoodStuffs() {
            if (hasFood == true) {
                System.out.println("The fridge is already full");
            } else {
                hasFood = true;
                System.out.println("The fridge is full now");
            }
        }

        public void removeFoodStuffs() {
            hasFood = false;
            System.out.println("The fridge is empty");
        }

        @Override
        public void clean() {
            removeFoodStuffs();
            clean();
        }

    }
}
