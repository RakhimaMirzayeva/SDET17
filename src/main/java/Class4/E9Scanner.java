package Class4;

import java.util.Scanner;

public class E9Scanner {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter your full name");
        String name=scanner.nextLine();// used to write a full sentences and paragraphs,
        // just to write a name
        //use just scanner.next();
        System.out.println("Your Full name is "+name);
    }
}
