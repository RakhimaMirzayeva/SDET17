package Class13;

public class Task2 {
    public static void main(String[] args) {
        /*
        If string has an odd number of character and has 3 or more
        characters. print the character in the middle of the String
         */

        String str="Hello";
        //if(!str.isEmpty()){//means if String is NOT Empty(We dont have to have that part
            if(str.length()%2!=0&&str.length()>=3){//%2! means not even
                int middle = str.length()/2;
                System.out.println(str.charAt(middle));
        }

        }

    }

