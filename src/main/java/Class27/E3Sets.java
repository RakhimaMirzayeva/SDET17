package Class27;

import java.util.LinkedHashSet;

public class E3Sets {
    public static void main(String[] args) {
        LinkedHashSet<Integer> uniqueNum=new LinkedHashSet<>();
        uniqueNum.add(10);
        uniqueNum.add(20);
        uniqueNum.add(30);
        uniqueNum.add(40);
        uniqueNum.add(10);
        System.out.println(uniqueNum);
        //no duplicates. and keeps the order(linked)
    }
}
