package stackIterator;

import java.util.Iterator;

public class MyStackWithIterator<T> implements Iterable<T> {


    T[] myStack = (T[]) new Object[initialCapacity];

    private static final int initialCapacity = 5;
    private static final int capacityIncrease = 2;
    private static final int capacityReduce = 2;

    private int currentFillPosition;
    private int currentLength = initialCapacity;

    public void push(T data) {
        if (currentFillPosition == currentLength) {
            T[] newStack = (T[]) new Object[currentLength * capacityIncrease];
            for (int i = 0; i < currentLength; i++) {
                newStack[i] = myStack[i];

            }
            myStack = newStack;
            currentLength = currentLength * 2;
        }
        myStack[currentFillPosition] = data;
        currentFillPosition++;

    }

    public T pop() {
        if (currentFillPosition == 0) {
            return null;
        } else {
            T temporary = myStack[currentFillPosition - 1];
            currentFillPosition--;
            if (currentFillPosition < currentLength / 4) {
                int h = 0;
                h = currentLength / capacityReduce;
            }
            return temporary;
        }
    }

    public T pick() {
        if (currentFillPosition == 0) {
            return null;
        } else {
            return myStack[currentFillPosition - 1];
        }
    }

    public boolean isEmpty() {
        return currentFillPosition == 0;
    }


    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {

            int current = 0;

            @Override
            public boolean hasNext() {
              return currentFillPosition > current;
            }

            @Override
            public T next() {
                if (currentFillPosition > current) {
                    return myStack[current++];

                }
                return null;
            }
        };
    }


}
