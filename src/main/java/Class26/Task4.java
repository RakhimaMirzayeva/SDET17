package Class26;

import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {
        //Create an arrayList of words. Remove every word that ends with “e”.
        ArrayList<String> word = new ArrayList<>();
        word.add("Apple");
        word.add("Coffee");
        word.add("strawberry");
        word.add("Grape");
        word.add("Coffee");
        System.out.println(word);
        /*for (int i = 0; i < word.size(); i++) {//replacing whole word
            if(word.get(i).endsWith("e")){
                word.remove(i);
            }
        }
        System.out.println(word);
    }*/
        for (int i = word.size() - 1; i >= 0; i--) {//this one removes all the words that ends with e
            //String words = word.get(i);
            if (word.get(i).endsWith("e")) {
                word.remove(i);
            }
        }

        System.out.println(word);
    }
}
