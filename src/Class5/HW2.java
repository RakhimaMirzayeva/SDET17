package Class5;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your quiz score");
        double quizScore=scanner.nextDouble();
        System.out.println("Please enter your mid term score");
        double midtermScore=scanner.nextDouble();
        System.out.println("Please enter your final score");
        double finalScore=scanner.nextDouble();
        double averScore=(quizScore+midtermScore+finalScore) / 3;

        if(averScore>=90) {
            System.out.println("Grade A");
        }else if (averScore>=70&&averScore<=90) {
            System.out.println("Grade B");
        }else if(averScore>=50&&averScore<=70) {
            System.out.println("Grade C");
        }else if (averScore<=50) {
            System.out.println("Grade F");
        }

    }
}
