package HOMEWORK;

import java.util.Scanner;

public class ReplitHW56 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = scanner.nextInt();
        //DO NOT CHANGE ABOVE CODE!  Write your code below


        if (num > 0) {
            System.out.println(num + " is positive");
        } else if (num < 0) {
            System.out.println(num + " is negative");
        } else {
            System.out.println("Entered number is equals to 0");
        }
    }
}