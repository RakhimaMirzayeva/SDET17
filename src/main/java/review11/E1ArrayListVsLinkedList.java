package review11;

import java.util.ArrayList;
import java.util.LinkedList;

public class E1ArrayListVsLinkedList {
    public static void main(String[] args) {
        LinkedList<String> names=new LinkedList<>();
        names.add("Abdulla");
        names.add("Rakhima");
        names.add("Aydin");
        names.add("Ali");
        names.add("Halit");
        names.add(1,"Raima");//just adding another one
        System.out.println(names);

        ArrayList<String> names2=new ArrayList<>();
        names2.add("Jamel");
        names2.add("Deepali");
        names2.add("Ali");
        names2.add("John");
        names2.add("Adam");
        names2.add(1,"Nelson");//shifting will happen
        System.out.println(names2);


    }
}
