package Class27;

import java.util.TreeSet;

public class Task3 {
    //Create a Set of cities in which you want to make sure that
    // insertion order is maintained. Then remove any city that starts with “A”;
    public static void main(String[] args) {
        TreeSet<String> country=new TreeSet<>();
        country.add("Turkey");
        country.add("Russia");
        country.add("Argentina");
        country.add("USA");
        country.add("India");
        country.add("China");
        country.add("Canada");
        country.add("Italy");
        country.add("Japan");
        country.add("Mexica");
        System.out.println(country);


        country.removeIf(x->x.toLowerCase().startsWith("A"));
        System.out.println(country);


    }
}
