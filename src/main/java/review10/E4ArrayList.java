package review10;

import java.util.ArrayList;

public class E4ArrayList {
    public static void main(String[] args) {
        ArrayList<String> fruit=new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Mango");
        fruit.add("Orange");
        fruit.add("Kiwi");
        fruit.add("Apple");
        System.out.println(fruit);
        //fruit.forEach(x-> System.out.println(x));
        fruit.forEach(x->{
            if(x.contains("a")){
                System.out.println(x);
            }
        });
        fruit.set(2,"Grapes");
        System.out.println(fruit);


        System.out.println(fruit.indexOf("Mango"));//will print from top
        System.out.println(fruit.lastIndexOf("Apple"));//will print from the bottom
    }
}
