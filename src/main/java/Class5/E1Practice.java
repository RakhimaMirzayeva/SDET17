package Class5;

import java.util.Scanner;

public class E1Practice {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your birth month");
        String month = input.nextLine();
        if (month.equals("Mar") || month.equals("Apr") || month.equals("May")) {
            System.out.println("You were is season Spring");

        } else if (month.equals("Jun") || month.equals("Jul") || month.equals("Aug")) {

            System.out.println("You were born in season Summer");

        } else if (month.equals("Sep") || month.equals("Oct") || month.equals("Nov")) {
            System.out.println("You were born in season Autumn");
        } else {
            System.out.println("You were born in season Winter");
        }
    }

}
//month.equalsIgnoreCase(anotherString:"January")--to ignore case sensitivity(Upper and lower case formatting)
//when we use equals method Java checks everything specifically need to be the same
