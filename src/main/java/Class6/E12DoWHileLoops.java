package Class6;

import java.util.Scanner;

public class E12DoWHileLoops {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int input;
//you can switch to while by using the yellow bulb
            do {
                System.out.println("Please Enter a number and -1 to terminate");
                input = scanner.nextInt();
                System.out.println("You have entered " + input);
            } while (input != -1);
        }
        }



