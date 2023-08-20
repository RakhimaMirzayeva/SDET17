package Class11;

import java.util.Arrays;

public class E42DArrays {
    public static void main(String[] args) {



        int[][] numbers={{10,20,30,40},
                {100,200,300},
                {1,2,3,4}};
        int [] row=numbers[0];// this returns us a complete 1D array
        int number=numbers[0][1];// this return us one single element
        System.out.println(numbers[0][1]);
        System.out.println(Arrays.toString(numbers[1]));
    }
}
