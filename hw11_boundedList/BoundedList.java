package hw11_boundedList;

/**
 * 11) (05.10.2015) сделать копию MyList в виде bounded list с обработкой Exceptions
 */
public class BoundedList<T> {

    static int capacity;
    int currentLength;

    public BoundedList(int capacity) {
        this.capacity = capacity;
    }

    private class Node {
        T data;
        Node next;

    }

    Node first;

    public void add(T newData) throws FullBoundedListException {

        if (currentLength == capacity) {
            throw new FullBoundedListException();
        }

        Node newNode = new Node();
        newNode.data = newData;
        newNode.next = first;
        first = newNode;
        currentLength++;
    }

    public T remove() throws EmptyBoundedListException {

        if (null == first) {
            throw new EmptyBoundedListException();
        }

        T tmp = first.data;
        first = first.next;
        currentLength--;
        return tmp;

    }

    public String toString() {

        String s = "[";

        Node temp = first;

        while (temp != null) {
            s += temp.data;
            s += ", ";
            temp = temp.next;
        }

        return s + "]";
    }


}
