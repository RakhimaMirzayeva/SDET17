package Class26;

import java.util.ArrayList;

public class E4ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(100);
        System.out.println(number);
        int sum = 0;
        for (Integer n : number) {//int works here too
            if (n > 20) {
                sum += n;//shortcut for sum=sum+n
            }
            System.out.println(sum);


        }

    }
}

