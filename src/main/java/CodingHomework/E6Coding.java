package CodingHomework;

import java.util.Scanner;

public class E6Coding {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number  ");
        int number=scanner.nextInt();

        boolean isPrime=isPrimeNum(number);
        if(isPrime){
            System.out.println(number+" is a Prime number.");
        }else{
            System.out.println(number+" is not a Prime number.");
        }
    }
    public static boolean isPrimeNum(int num){
        if(num<=1){
            return false;
        }
        if(num<=3){
            return true;
        }
        if(num%2==0||num%3==0){
            return false;
        }
        for (int i = 5; i*i <=num ; i+=6) {
            if(num%i==0||num%(i+2)==0){
                return false;
            }
        }
        return true;
    }
}
