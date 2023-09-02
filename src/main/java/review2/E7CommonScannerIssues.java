package review2;

import java.util.Scanner;

public class E7CommonScannerIssues {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your FullName");
        String fName=scanner.nextLine(); //when you dont put nextLine java just skips the asking the question.
        System.out.println("Please enter your City");
        //scanner.nextLine();//to consume the enter press
        String city=scanner.nextLine();
        System.out.println(fName+" "+city);

    }
}
