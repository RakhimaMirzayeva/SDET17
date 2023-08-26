package Class13;

public class Task4 {
    public static void main(String[] args) {
        /*
        create a String and print it in reverse order(Sunday)
         */
        //Very famose interview question
        //we have an 2 options below

        String str="Sunday";
      String reversed="";// this is a second option
        for (int  i = str.length()-1; i>=0; i--) {//(option1)we will get index out of bound
            reversed=reversed+str.charAt(i);
            //System.out.print(str.charAt(i));//option 1

        }
        System.out.println(reversed);
    }
    }

