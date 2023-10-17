package Class28;

import java.util.TreeMap;

public class Task2 {
    public static void main(String[] args) {
        //Create a map of countries(5) with its capital that will store countries in alphabetical order. Country names will be keys and capitals will be values
        //Print all keys and values from a country map using for each loop or Lambda.
        //Print all values from a country map using for each loop or Lambda

        TreeMap<String,String> countries= new TreeMap<>();//because we want in alphabetical order
        countries.put("Canada","Ottawa");
        countries.put("USA","Washington DC");
        countries.put("France","Paris");
        countries.put("Germany","Berlin");
        countries.put("Egypt","Cairo");

        countries.forEach((k,v)-> System.out.println(k+" "+v));
        System.out.println("********");
        countries.forEach((k,v)-> System.out.println(v));
    }
}






