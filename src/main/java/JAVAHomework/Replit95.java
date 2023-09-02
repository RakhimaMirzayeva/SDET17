package JAVAHomework;

import java.util.Scanner;

public class Replit95 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(("Enter a string: "));
        String input=scanner.nextLine();
        if(input.length()>=3){
            String firstThreeLetter=input.substring(0,3);
            System.out.println("The first 3 letters of "+input+" is "+firstThreeLetter);
        }else{
            System.out.println("The input string is too short.");
        }

    }
}
