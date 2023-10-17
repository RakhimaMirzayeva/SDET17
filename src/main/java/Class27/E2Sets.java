package Class27;

import java.util.HashSet;

public class E2Sets {
    //Sets
    public static void main(String[] args) {
        HashSet<String> fruit=new HashSet<>();
        fruit.add("Mango");
        fruit.add("banana");
        fruit.add("apple");
        fruit.add("kiwi");
        fruit.add("banana");
        System.out.println(fruit);
        System.out.println("***********");
        fruit.forEach(x-> System.out.println(x));
        System.out.println("****************");
        for(String f:fruit){
            System.out.println(f);
        }
    }
}
