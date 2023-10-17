package Class26;

import java.util.ArrayList;

public class E1ArrayList {
    public static void main(String[] args) {
        //dataType of this is ArrayList of String names
        ArrayList<String> names=new ArrayList<>();

        names.add("Rakhima");
        names.add("Abdulla");
        names.add("Aydin");
        names.add("Ali");
        names.add("Halit");
        names.add("Deepali");
        //names.remove(5);
        names.remove("Deepali");
        System.out.println(names);
        names.add(5,"Shafika");//adds new name and replace index number
        System.out.println(names);
        names.set(5,"Abdulla");//replaces names to a new name
        System.out.println(names);



    }
}
