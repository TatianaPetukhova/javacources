package brainStates;

public class Dog {

    BrainState brainState = new BadMood();

    public void feed() {
        System.out.println("--> feed dog");
        brainState.feed(this);
    }

    public void stroke() {
        System.out.println("--> stroke dog");
        brainState.stroke(this);
    }


    void bite() {
        System.out.println("bites");
    }

    void bark() {
        System.out.println("barks");
    }

    void eat() {
        System.out.println("eats");
    }

    void wag() {
        System.out.println("wags");
    }


}
