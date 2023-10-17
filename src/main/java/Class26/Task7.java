package Class26;

import java.util.ArrayList;

public class Task7 {
    public static void main(String[] args) {
        //Create an arrayList of even numbers from 1 to 500.
        // Remove any number that is divisible by 5 from that arrayList.
        ArrayList<Integer> number = new ArrayList<>();



        for (int i = 2; i < 500; i+=2) {//if you put 1 it will print all odd numbers
            //put 2 to print all even numbers

            number.add(i);

        }
        System.out.println(number);
//this is the second part of the problem  dividing by 5
        for (int i = 0; i < number.size(); i++) {
            if(number.get(i)%5==0){
                number.remove(i);
            }
        }
        System.out.println(number);
    }


}
