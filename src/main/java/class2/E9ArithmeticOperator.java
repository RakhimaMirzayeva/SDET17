package class2;

import java.sql.SQLOutput;

public class E9ArithmeticOperator {
    public static void main(String[] args) {
        double num1=20;
        double num2=10;
        double addResult=num1+num2;
        double subResult=num1-num2;
        double divResult=num1/num2;
        double mulResult=num1*num2;

        System.out.println(num1+num2);
        System.out.println(num1-num2);
        System.out.println(num1*num2);
        System.out.println(num1/num2);
        System.out.println("The addition of 2 numbers " + num1 + " and " + num2 + " is equal to "+addResult);
        System.out.println("The subtraction of 2 numbers " +num1 + " and " +num2+ " is equal to "+ subResult);
        System.out.println("The division of 2 number " +num1 + " and " + num2+ " is equal to " + divResult);
        System.out.println("The multiplication of 2 numbers " + num1 + " and " + num2 +"is equal to " + mulResult);
        double value1=3.9;
        double squareIs=value1*value1;
        System.out.println("The square of the  " +value1 +  " is " + squareIs );
        System.out.println("a string " +(10+10) );

    }
}
