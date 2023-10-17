package Class26;

import java.util.ArrayList;

public class Task6 {
    public static void main(String[] args) {
        ArrayList<String> word = new ArrayList<>();
        word.add("Apple");
        word.add("Coffee");
        word.add("strawberry");
        word.add("Grape");
        word.add("Coffee");
        System.out.println(word);
        //word.removeIf((String x)->{//this is requires the logic to perform an action
           /* if(x.endsWith("e")){
                return true;
            }else {
                return  false;
            }
        });*/
            word.removeIf((x->x.endsWith("e")));


            System.out.println(word);
    }
    }


