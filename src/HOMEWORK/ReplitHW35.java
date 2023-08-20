package HOMEWORK;

import java.util.Scanner;

public class ReplitHW35 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Do you need a loan? Enter true or false");
        boolean loan=scanner.nextBoolean();
        String eligibility="";


        if(loan){
            System.out.println("What is your credit score?");
            int creditScore=scanner.nextInt();
            if(creditScore<=600) {
                eligibility="Not eligible";

            }else if(creditScore>=600 && creditScore<=700){
                eligibility="Maybe eligible";
            }else if(creditScore>=701&&creditScore<=800){
                eligibility="Eligible";
            }else if(creditScore>800) {
                eligibility="Definitely eligible";
            }
            System.out.println("The eligibility "+eligibility);
        }else {
            System.out.println("Unknown");
        }



    }
}


