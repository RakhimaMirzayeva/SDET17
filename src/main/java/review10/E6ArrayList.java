package review10;

import java.util.ArrayList;

public class E6ArrayList {
    public static void main(String[] args) {
        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Mango");
        fruit.add("Orange");
        fruit.add("Kiwi");
        fruit.add("Apple");

        //fruit.replaceAll(x->"water");//lambda expression, this will replace all to a water
        //System.out.println(fruit);
        fruit.replaceAll(x->{
            if(x.contains("a")){
                return "water";
            }else{
                return"Milk";
            }

        });
        System.out.println(fruit);

    }
}
