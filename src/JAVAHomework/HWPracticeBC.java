package JAVAHomework;

import java.util.Scanner;

public class HWPracticeBC {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n;
        while(true){
            System.out.println("enter a number between 1 and 10: ");
            n=scanner.nextInt();
            if(n<1||n>10)
                continue;
            System.out.println(n+" is between 1 and 10. ");

        }
    }
}
