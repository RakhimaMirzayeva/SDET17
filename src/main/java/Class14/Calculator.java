package Class14;

import java.util.Scanner;

public class Calculator {

        //void-is the keyword to create a method
        void subtract(){
            Scanner scanner=new Scanner(System.in);
            System.out.println("Please enter first number");
            int num1=scanner.nextInt();
            System.out.println("Please enter second number");
            int num2=scanner.nextInt();
            int sum=num1-num2;//we can put + to add
            System.out.println("sum of these numbers are "+sum);
        }
void multiply(int number1,int number2){//i can put any numbers

            int result=number1*number2;
    System.out.println(result);
}
void parameters(int num1,int num2){

            if(num1>num2){
                System.out.println("Bigger num "+num1);
            }else {
                System.out.println("Bigger than "+num2);
            }
}
    }

