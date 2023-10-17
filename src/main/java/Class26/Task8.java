package Class26;

import java.util.ArrayList;

public class Task8 {
    public static void main(String[] args) {
        //Crete an arraylist of fruit then remove all the fruit which contains
        //the letter a or ends with the letter e
        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("strawberry");
        fruit.add("Grape");
        fruit.add("Blueberry");
        System.out.println(fruit);

        fruit.removeIf(x->x.contains("a")||x.endsWith("e"));
        System.out.println(fruit);


    }
}
