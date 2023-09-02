package Class14;

import java.util.Scanner;

public class E1Methods {
    public static void main(String[] args) {
        //we are creating the object of Scanner class
        //prints information retrived from user
        //using the scanner object we are calling the nextInt Method.
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your name");
       String name=scanner.nextLine();
        System.out.println("Please Enter your age");
        int age=scanner.nextInt();
        System.out.println("Your name is  "+name+" and your age is "+age);

    }
    static void takeUserInput(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your name");
        String name=scanner.nextLine();
        System.out.println("Please Enter your age");
        int age=scanner.nextInt();
        System.out.println("Your name is  "+name+" and your age is "+age);
//
    }
}
