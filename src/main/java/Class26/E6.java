package Class26;

import java.util.ArrayList;

public class E6 {
    public static void main(String[] args) {//Using Lambda
        ArrayList<String> word = new ArrayList<>();
        word.add("Apple");
        word.add("Coffee");
        word.add("strawberry");
        word.add("Grape");
        word.add("Coffee");
        for(String x:word){
            System.out.println(x);
        }
        System.out.println("*******************");
        //printing the element here
        word.forEach(x-> System.out.println(x));//The arrow symbol (->) separates the parameter list from the expression.
        System.out.println("*************");
        for (int i = 0; i < word.size(); i++) {
            if(word.get(i).contains("e")){
                word.remove(i);
            }
        }
        word.removeIf(y->y.contains("e"));//passing to lambda expression to perform
        //word.removeIf(word->word.contains("e")); can switch to any word

        //System.out.println(word);

    }
}
