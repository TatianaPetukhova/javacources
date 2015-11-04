package hw11_boundedList;

/**
 * Created by tanki_000 on 11/5/2015.
 */
public class EmptyBoundedListException extends Exception {

    EmptyBoundedListException() {
        super("List is empty");
    }
}
