package HOMEWORK;

import java.util.Scanner;

public class SwitchWithForLoop {
    public static void main(String[] args) {

        for (int i = 0; i < 4; i++) {
            System.out.println("Hello World");
            Scanner scanner=new Scanner(System.in);
            System.out.println("Please Enter the name of the fruit");
            String fruit=scanner.nextLine();
            switch (fruit){
                case "Orange":
                    System.out.println("It is usually orange");
                    break;
                case "Yellow":
                    System.out.println("Its a banana");
                    break;
                case "Red":
                    System.out.println("Its usually a strawberry");
                    break;
                case "Pink":
                    System.out.println("Its usually raspberries");
                    break;
                case "Blue":
                    System.out.println("Its usually blueberries");
                    break;
                default:
                    System.out.println("That is not a fruit");
            }
        }

    }
}
