package HOMEWORK;

import java.util.Scanner;

public class Replit25 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a number");
        int num=scanner.nextInt();

        if (num>1) {
            System.out.println("In: "+ num+" is positive");
        }else if(num<1) {
            System.out.println("In: "+ num+" is negative");
        }else if(num>=0) {
            System.out.println("In: Entered number is equals to ");
        }

    }
}
