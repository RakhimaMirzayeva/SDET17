package HOMEWORK;

import java.util.Scanner;

public class TaskDOWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = 0;
        int sum = 0;
        do {

            System.out.print("Please enter the price of the item or -1 to terminate");
            x += scanner.nextInt();
            if (x != -1) {
                sum = sum + x;}
                System.out.println("Your total bill is " + sum);
            }while (x != -1) ;



        }
    }