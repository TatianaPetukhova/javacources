package hw11_boundedList;

/**
 * Created by tanki_000 on 11/5/2015.
 */
public class UseBoundedList {

    public static void main(String[] args) {

        BoundedList<String> myBoundedList = new BoundedList<>(3);


      try {
            myBoundedList.remove();
        } catch (EmptyBoundedListException e) {
            e.printStackTrace();
        }

        try {
            myBoundedList.add("one");
            myBoundedList.add("two");
            myBoundedList.add("three");
            myBoundedList.add("four");
        } catch (FullBoundedListException e) {
            e.printStackTrace();
        }

        System.out.println(myBoundedList.toString());


    }

}
