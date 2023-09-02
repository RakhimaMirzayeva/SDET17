package review2;

import java.util.Scanner;

public class ReplitHomework {
    public static void main(String[] args) {

        int gender = 'M';
        int gender2 = 'F';
        Scanner scanner = new Scanner(System.in);
        int age = 25;
        System.out.println("Please enter your gender: M or F");
        int sex = scanner.next().charAt(0);
        System.out.println("Please enter your age");
        //Scanner scanner = scanner.nextLine();
        if (gender == 'M') {
            System.out.println("Woman");
        } else {
            System.out.println("Man");
            if (gender2 == 'F') {
                System.out.println("Woman");
            } else {
                System.out.println("Man");


                if (age <= 25) {
                    System.out.println("Girl");
                } else {
                    System.out.println("Boy");
                }
            }

        }
    }
}