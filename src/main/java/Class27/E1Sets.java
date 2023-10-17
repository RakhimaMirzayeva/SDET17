package Class27;

import java.util.ArrayList;
import java.util.HashSet;

public class E1Sets {
    //A set is the
    public static void main(String[] args) {
        ArrayList<Integer> number=new ArrayList<>();
        //we can store duplicates in an ArrayList or LinkedList
        number.add(10);
        number.add(20);
        number.add(10);
        System.out.println(number);


        //the class name is HashSet, removes all duplicates, also changes the order of the elements (numbers).
        // doesn't maintain the insertion order(so it does not guarantee the order of elements)
        HashSet<Integer> uniqNumbers=new HashSet<>();
        uniqNumbers.add(10);
        uniqNumbers.add(20);
        uniqNumbers.add(10);
        uniqNumbers.add(10);
        System.out.println(uniqNumbers);

    }
}
