package myStack;

/**
 * Created by tanki_000 on 10/4/2015.
 */
public class MyStack<T> {

    Node<T> head;

    public void push(T data) {
        Node<T> node = new Node<>();
        node.data = data;
        node.next = head;
        head = node;

    }

    public void pop() {
        if (head != null) {
            head = head.next;
        }
    }

    public T peek() {
        if (head != null) {
            return head.data;
        } else {
            return null;
        }
    }

    @Override
    public String toString() {

        String s = "[";

        Node temp = head;

        while (temp != null) {
            s += temp.data;
            s += ", ";
            temp = temp.next;
        }

        return s + "]";
    }
}
