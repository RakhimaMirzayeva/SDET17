package Class5;

import java.util.Scanner;

public class E4Practice {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);//when question ask about asking the User;
        System.out.println("Please enter the number from 10-1000");
        double day=scanner.nextDouble();//you can use double too
        if(day<=1&&day>=10) {
            System.out.println("Small");
        }else if(day>=11&&day<=100){
            System.out.println("medium");
        }else if(day>=101&&day<=1000){
            System.out.println("Large");
        }else{
            System.out.println("Wrong number entered");
        }
    }
}
