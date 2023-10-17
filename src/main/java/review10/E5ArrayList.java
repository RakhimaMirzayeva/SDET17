package review10;

import java.util.ArrayList;

public class E5ArrayList {
    public static void main(String[] args) {


        ArrayList<String> fruit = new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Mango");
        fruit.add("Orange");
        fruit.add("Kiwi");
        fruit.add("Apple");

        //ArrayList<String> vegetables=new ArrayList<>(fruit);//add both constructors(adding elements to the previous list)
        ArrayList<String> vegetables=new ArrayList<>();
        vegetables.add("Potato");
        vegetables.add("Carrot");
        vegetables.add("Cucumber");
        System.out.println(vegetables);
        vegetables.addAll(fruit);//will add all elements from old list to the new list
        System.out.println(vegetables);
       vegetables.removeAll(fruit);//will remove all fruits
        System.out.println(vegetables);





    }
}
