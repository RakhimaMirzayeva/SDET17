package Class5;

import java.util.Scanner;

public class E1PracticeHomework {
    public static void main(String[] args) {

        Scanner scanner=new Scanner (System.in);
        System.out.println("What is the current time?");
        double time=scanner.nextDouble();

        if (time>=1 && time<=11){
            System.out.println("Morning");
        }else if (time>=12 && time<=15){
            System.out.println("Afternoon");
        }else if (time>=16 && time<=20){
            System.out.println("Evening");
        }else if (time>=21 && time<=24){
            System.out.println("Night");
        }else {
            System.out.println("NOT the Right Time");
        }
    }
}
