package Class9;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double total=0;
        while(true){
            System.out.println("Please Enter the price of the item or -1 to terminate");
            double price=scanner.nextDouble();
            if(price==-1){//this is to control when to stop
                break;

            }else{
                total=total+price;
            }
            System.out.println("Your total bill is "+total);
        }
    }
}
