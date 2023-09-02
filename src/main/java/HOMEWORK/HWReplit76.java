package HOMEWORK;

import java.util.Scanner;

public class HWReplit76 {
    public static void main(String[] args) {
        String[] day = new String[7];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 7; i++) {
            System.out.println("Please enter day " + i + " of the week");
            day[i] = scanner.next();

        }
        for (int i = 0; i < 7; i++) {
            System.out.println(day[i]);

        }
    }
}
