package Project2;

import java.util.ArrayList;

public class HW7 {
    public static void main(String[] args) {
        /*
    You have a list of strings and you want to keep only those that start
with “A” and you want to return them in lower case"
     */
        ArrayList<String> names=new ArrayList<>();
        names.add("Rakhima");
        names.add("Abdulla");
        names.add("Aydin");
        names.add("Ali");
        names.add("Halit");
        for(String str:names){
            if(str.startsWith("a")||str.startsWith("A")){
                System.out.println(str.toLowerCase());
            }
        }
    }

}
