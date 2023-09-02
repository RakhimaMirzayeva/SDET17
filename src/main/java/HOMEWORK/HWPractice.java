package HOMEWORK;

public class HWPractice {
    public static void main(String[] args) {

        //String[] cars ={"Camaro", "Corvette", "Tesla", "BMW"};
        //cars[0]="Mustang";
       // System.out.println(cars[3]);

        String[] cars =new String[3];
        cars[0]="Camaro";
        cars[1]="Mustang";
        cars[2]="Tesla";
        for(int i=0; i<cars.length; i++)
        System.out.println(cars[i]);
        //System.out.println(cars[2); to print the single car at the time
    }
}
