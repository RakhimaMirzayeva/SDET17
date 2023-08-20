package review2;

import java.util.Scanner;

public class E3IfElseScanner {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the price of the item3654");
        double price=scanner.nextDouble();
       if(price>10000) {
           System.out.println("I can not buy this item");

       }else {
           System.out.println("Lets buy it");
       }

    }
}
