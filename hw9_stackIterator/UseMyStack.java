package stackIterator;

import java.util.Iterator;

public class UseMyStack {

    public static void main(String[] args) {

        MyStackWithIterator<String> newStack = new MyStackWithIterator<>();


        newStack.pop();
        newStack.pick();
        newStack.push("first");
        newStack.push("second");
        newStack.push("third");
        newStack.push("four");
        newStack.push("five");
        newStack.push("six");
        newStack.push("seven");
        newStack.push("eight");
        newStack.pop();

        Iterator<String> iterator = newStack.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        newStack.pick();


        Iterator<String> iterator2 = newStack.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }

        newStack.pop();
        newStack.pop();
        newStack.pop();
        newStack.pop();
        newStack.pop();
        newStack.pop();

        Iterator<String> iterator3 = newStack.iterator();
        while (iterator3.hasNext()) {
            System.out.println(iterator3.next());
        }
    }


}
