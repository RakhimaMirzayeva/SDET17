package Class5;

import java.util.Scanner;

public class E3SwitchPractice {
    public static void main(String[] args) {
     Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your country");
        String country=scanner.nextLine();
        //country=country.toLowerCase(); To convert everything to lower case
        switch (country){
            case "US":
                System.out.println("English");
                break;
            case "Russia":
                System.out.println("Russian");
                break;
            case "Turkey":
                System.out.println("Turkish");
                break;
            case "Chine":
                System.out.println("Chinese");
                break;
            case "Hawaii":
                System.out.println("Hawaiian");
                break;
            default:
            System.out.println("No Such country");

        }
    }
}
