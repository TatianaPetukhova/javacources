package myStack;

/**
 * Created by tanki_000 on 10/4/2015.
 */
public class UseStack {

    public static void main(String[] args) {

        MyStack<String> myStack = new MyStack<>();

        myStack.peek();
        myStack.pop();
        myStack.push("One");
        myStack.pop();
        myStack.pop();
        myStack.push("two");
        myStack.push("three");
        myStack.push("four");
        myStack.push("five");
        myStack.pop();

        System.out.println(myStack.toString());
        System.out.println(myStack.peek());

    }
}
