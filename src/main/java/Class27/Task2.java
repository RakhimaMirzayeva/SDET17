package Class27;

import java.util.TreeSet;

public class Task2 {
    public static void main(String[] args) {
        //Create a Set in which you need to add names of the countries(10).
        // In this set we want all objects to be sorted in alphabetical order.
        // Using 2 different ways retrieve all elements from set.
        TreeSet<String> country=new TreeSet<>();
        country.add("Turkey");
        country.add("Russia");
        country.add("Brazil");
        country.add("USA");
        country.add("India");
        country.add("China");
        country.add("Canada");
        country.add("Italy");
        country.add("Japan");
        country.add("Mexica");

        System.out.println(country);
        country.forEach(x -> System.out.print(x + " "));
        System.out.println("*************");
        for(String c:country){
            System.out.println(c);
        }
        country.forEach(x -> System.out.print(x + " "));
    }
}
