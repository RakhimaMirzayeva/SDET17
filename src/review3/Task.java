package review3;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Are you going to the vacation?");
        boolean isVacation=scanner.nextBoolean();
        System.out.println("Are you going next week?");
        boolean nextWeek=scanner.nextBoolean();

        System.out.println("Have a safe trip");
    }
}
