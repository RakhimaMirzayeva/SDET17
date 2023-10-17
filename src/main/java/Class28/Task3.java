package Class28;

import java.util.TreeMap;

public class Task3 {
    //Create a map of countries(5) with its capital that will store countries in alphabetical order.
    // Country names will be keys and capitals will be values
    //1)only print those countries which have more than 5 letters in their countries
    //2)Letters 'a' in their capital name
    public static void main(String[] args) {
        TreeMap<String, String> countries = new TreeMap<>();
        countries.put("Canada", "Ottawa");
        countries.put("USA", "Washington DC");
        countries.put("France", "Paris");
        countries.put("Germany", "Berlin");
        countries.put("Egypt", "Cairo");

        //countries.forEach((k, v) -> System.out.println(k + " " + v));

            countries.forEach((k, v) -> {
                if (k.length() > 5) {
                    System.out.println("First Task=>"+k + " " + v);
                }
            });
        System.out.println("***************");

        countries.forEach((x, y) -> {
            if ((x.length() > 5)&&(y.contains("a"))) {
                System.out.println("Second Task=>"+x+" "+y);
            }
        });
    }
    }



