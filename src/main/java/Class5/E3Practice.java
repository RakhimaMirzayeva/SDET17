package Class5;

import java.util.Scanner;

public class E3Practice {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please input the number");
        int day=scanner.nextInt();
        if(day>=1||day>5){//we can also use && result
            System.out.println("Its a weekdays");
        }else if(day==6||day==7){
            System.out.println("Its a weekends");
        }else {
            System.out.println("Invalid day");
        }
    }
}
