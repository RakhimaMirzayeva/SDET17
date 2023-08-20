package HOMEWORK;

import java.util.Scanner;

public class Replit78 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();

            System.out.println("Output " );
            for (int number : numbers) {
                System.out.println(number * 10);
            }
        }
    }
}
