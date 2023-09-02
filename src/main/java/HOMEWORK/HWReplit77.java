package HOMEWORK;

import java.util.Scanner;

public class HWReplit77 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//the numbers that we going to put
        //will be printed reversed
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("\nOutput:\n");
            for (int j=numbers.length-1; j >=0; j--) {
                System.out.println(numbers[j] + " ");
            }
        }
    }

