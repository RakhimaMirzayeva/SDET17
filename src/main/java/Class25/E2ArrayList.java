package Class25;

import java.util.ArrayList;

public class E2ArrayList {
    public static void main(String[] args) {
        //Array list is dynamic, you don't have to worry about the size, it will grow automatically.
        //and shrink, narrow automatically based on the need.
        ArrayList names=new ArrayList();
        names.add("Rakhima");
        names.add("Abdulla");
        names.add(10);
        names.add('H');
        names.remove(2);//it will remove 10
        System.out.println(names.size());//size of elements, how many words
        System.out.println(names);// by using .add method


    }
}
