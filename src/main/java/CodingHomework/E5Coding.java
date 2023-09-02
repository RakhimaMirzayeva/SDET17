package CodingHomework;

public class E5Coding {
    public static void main(String[] args) {
        int num1=32;
        int num2=35;
        int diff=num1-num2;
        System.out.println("num1= "+num1);
        System.out.println("num2= "+num2);
        num1=num1-diff;
        num2=num2+diff;
        System.out.println("\n"+"The numbers are swapped:");
        System.out.println("num1= "+num1);
        System.out.println("num2= "+num2);
    }
}
