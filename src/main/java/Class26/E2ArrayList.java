package Class26;

import java.util.ArrayList;

public class E2ArrayList {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Rakhima");
        names.add("Abdulla");
        names.add("Aydin");
        names.add("Ali");
        names.add("Halit");

        for (int i = 0; i <names.size() ; i++) {
            System.out.println(names.get(i));
        }
            System.out.println("************************");
            //enhanced for loops
            for(String n:names){
                System.out.println(n);
            }
            System.out.println("**********************");
            int i=0;
            while(i<names.size()){
                System.out.println(names.get(i));
                i++;
            }
        }


    }

