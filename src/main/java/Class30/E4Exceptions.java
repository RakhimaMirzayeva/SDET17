package Class30;

import java.util.Scanner;

public class E4Exceptions {
    public static void main(String[] args) {
        System.out.println("1");
        System.out.println("1");
        System.out.println("1");
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the number");
        try{
            //Plan A
            int size=scanner.nextInt();
            int[]arr=new int[size];
        }catch (Exception e){
            //Plan B
            System.out.println("User must only enter a positive integer number");
        }
        int[] arr=new int[-5];
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
    }
}
