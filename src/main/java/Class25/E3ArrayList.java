package Class25;

import java.util.ArrayList;
import java.util.Scanner;

public class E3ArrayList {
    public static void main(String[] args) {
        ArrayList arr=new ArrayList();
        String str="Rakhima";
        arr.add(str);
        Integer i=new Integer(12);
        arr.add(i);
        arr.add(new Scanner(System.in));
        arr.add(str);
        checkPrint(arr);
    }
   static void checkPrint(ArrayList aa){
        for(Object d:aa){
            String str=(String)d;
            System.out.println(str.length());
        }

    }
}
