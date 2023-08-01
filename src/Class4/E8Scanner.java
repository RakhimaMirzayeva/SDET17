package Class4;

import java.util.Scanner;

public class E8Scanner {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter your Gender F=female M=male");
        char gender=scanner.next().charAt(0);//Rakhima char(0)means show first letter
        System.out.println("Your Gender is "+gender);
    }
}
