package Class27;

import java.util.ArrayList;

public class E2ArrayList {
    public static void main(String[] args) {
        //for each element from this number i want to specify the number
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(20);
        numbers.add(30);
        numbers.add(55);
        numbers.add(15);
        numbers.add(12);
        numbers.forEach(x-> System.out.println(x));
    }

}
