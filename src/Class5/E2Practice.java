package Class5;

import java.util.Scanner;

public class E2Practice {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your height in inches");//prompt theuser
        double height= scanner.nextDouble();//to enter person heights in inches

        if(height<60){
            System.out.println("short");
        }else if(height>=60&&height<=72) {//when you ask in between like 60-72use (=) sign;
            System.out.println("Medium");
        }else {
            System.out.println("Tall");
        }
    }
}
