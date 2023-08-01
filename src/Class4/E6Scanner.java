package Class4;

import java.util.Scanner;

public class E6Scanner {
    public static void main(String[] args) {
        System.out.println("Please Enter your name");
        //creating the object of the Scanner class so that we can reuse the logic
        //from this class which is already written for us by java developers
       Scanner input=new Scanner(System.in);
       //taking an input from the user and storing in int a name variable
      String name= input.next();
        System.out.println("Hello "+name);
        if(name.equals("Asghar")){

        }else{
            System.out.println("I don't Know you");

        }

    }
}
