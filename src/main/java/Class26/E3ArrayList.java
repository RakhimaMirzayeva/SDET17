package Class26;

import java.util.ArrayList;

public class E3ArrayList {
    public static void main(String[] args) {
        //Collection Frameworks doesn't work on the primitive dataTypes
       // ArrayList<int> number=new ArrayList<int>();
        //Integer is a class.
        ArrayList<Integer> number=new ArrayList<Integer>();//This is teh way int can be used
        Integer num1=new Integer(10);
        Integer num2=new Integer(20);
        System.out.println(num1+num2);
        String s="Rakhima";
        String d=new String("Abdulla");
        System.out.println(d);
        Integer num3=45;
        Integer num4=50;
        System.out.println(num3+num4);



    }
}
