package Class5;

import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your country");
        String country=scanner.nextLine();

        switch(country) {
            case "Turkey":
                System.out.println("Turkish");
                break;
            case "Russia":
                System.out.println("Russian");
                break;
            case "USA":
                System.out.println("English");
                break;
            case "Italy":
                System.out.println("Spanish");
        }
    }
}
