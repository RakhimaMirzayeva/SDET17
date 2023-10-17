package Class27;

import java.util.TreeSet;

public class E4Sets {
    public static void main(String[] args) {
        //TreeSet will sort the data order. from lowest to greatest.
        TreeSet<Integer> number=new TreeSet<>();
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(10);
        number.add(15);
        number.add(5);
        System.out.println(number);
    }
}
