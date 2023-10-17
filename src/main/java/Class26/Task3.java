package Class26;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        //Create an arrayList of drinks call it. If any drink has letter “a”
        //or “e” replace the whole word with water.


        ArrayList<String> drink = new ArrayList<>();
        drink.add("Milk");
        drink.add("Soda");
        drink.add("Fizzy Drink");
        drink.add("Mineral Water");
        drink.add("Mojito");
        System.out.println(drink);
        System.out.println("***************");
        for (int i = 0; i <drink.size() ; i++) {//replacing whole word
            String drinks=drink.get(i);

            if(drink.get(i).contains("a")||drink.get(i).contains("e")){
                drink.set(i,"Water");//drinks that have these letters will be replaced with Water word.
            }

        }
        System.out.println(drink);

        }
    }

