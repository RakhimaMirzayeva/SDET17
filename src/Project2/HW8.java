package Project2;

public class HW8 {
    public static String Increment(String str){
        int num=Integer.valueOf(str);
        num++;
        return Integer.toString(num);
    }
    public static void main(String[] args) {
         /*
    Write a Java Function that increments a string,
It should take the string of unknown length. Don't use regular
expressions.
Examples:
123 -> 124
53456 -> 53457
29 -> 30
Function signature:
string Increment (string str)
     */
        String input1="123";
        String input2="53456";
        String input3="29";

        System.out.println(Increment(input1));
        System.out.println(Increment(input2));
        System.out.println(Increment(input3));




    }
}


