package hw11_boundedList;

/**
 * Created by tanki_000 on 11/5/2015.
 */
public class FullBoundedListException extends Exception {

    FullBoundedListException() {
        super("bounded list is full, max capacity = " + BoundedList.capacity);
    }
}
