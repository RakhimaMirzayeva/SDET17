package Class26;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        //Create an ArrayList that will store 5 names into it.
        //Find out whether the given ArrayList is empty or not?
        //Check whether the specific name is present in an ArrayList or not?
        //Find the size of your arrayList and print all values from that
        ArrayList<String> name=new ArrayList<>();
        name.add("Rakhima");
        name.add("Abdulla");
        name.add("Aydin");
        name.add("Ali");
        name.add("Halit");
        name.isEmpty();
       name.size();
        System.out.println(name);//to print all names
        System.out.println(name.contains("Rakhima"));//check if there is the specific name is present
        System.out.println(name.isEmpty());//to check if its empty
        for (int i = 0; i <name.size() ; i++) {
            System.out.println(name.get(i));

        }


    }
}
