package JAVAHomework;

import java.util.Scanner;

public class BabyGenderNAme {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter mother's first name");
        String momName=scanner.next();
        System.out.println("Enter father's first name");
        String dadName=scanner.next();
        System.out.println("Enter baby's gender");
        String babyGender=scanner.next();
        if(babyGender.equals("babyBoy")){
            String babyBoyName=dadName.substring(1,dadName.length()/2)+momName.substring(momName.length()/4);
            System.out.println(babyBoyName);
            System.out.println("Baby Boy");
        }else if(babyGender.equals("babyBoy")){
            String babyGirlName=dadName.substring(1,momName.length()/2)+dadName.substring(dadName.length()/2);
            System.out.println(babyGirlName);
            System.out.println("Baby Girl");
        }else{
            System.out.println("No such name");
        }
    }
}
